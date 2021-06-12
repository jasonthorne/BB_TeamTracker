package controller;

import com.jfoenix.controls.JFXButton;

import animation.Fade;
import javafx.animation.FadeTransition;
import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import view.View;

public class SplashController implements Rootable {
	
	@FXML private AnchorPane rootAP;
    @FXML private Label testLbl;
    @FXML private JFXButton testBtn;

    @FXML
    void initialize() {
    	testBtn.setOnAction(event -> moveToLoginView());
    }
    
  	private final Stage stage = new Stage(); //stage
  	
  	//splash.fxml controller singleton:
  	private static SplashController singleSplashCtrlr = null;
  	
  	//login.fxml controller:
  	private final LoginController loginCtrlr = LoginController.getLoginCtrlr();
  	
  	//private constructor for singleton:
    private SplashController(){
    	Scene scene = new Scene(Rootable.getRoot(this, View.SPLASH.getPath())); //add root to scene
    	stage.setScene(scene); //add scene to stage
    }
  	
  	//get splash controller singleton:
    public static SplashController getSplashCtrlr() {
    	//create singleton if necessary:
        if (singleSplashCtrlr == null) { singleSplashCtrlr = new SplashController(); }
        return singleSplashCtrlr; 
    }
  	
    //show stage (if not):
    public void showStage() {
    	if(!stage.isShowing()){stage.showAndWait();}
    }
    
  	private void moveToLoginView(){ 
  		
  		//fade out transition, adding frame view scene to stage on finish:
  		FadeTransition fadeOut = Fade.getFadeTransition(rootAP, Fade.FadeOption.FADE_OUT, 200);
  		fadeOut.setOnFinished(event -> {
  			
  	  		Parent loginRoot = Rootable.getRoot(loginCtrlr, View.LOGIN.getPath()); //get login root
  			stage.setScene(new Scene(loginRoot)); //add new scene with root to stage
  			Fade.getFadeTransition(loginRoot, Fade.FadeOption.FADE_IN, 200).play(); //fade in view
  			
  		});
  		fadeOut.play(); //play transition
  	}
    
    

}
