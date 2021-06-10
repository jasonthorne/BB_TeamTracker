package controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;

import animation.Fade;
import dialog.Dialog;
import view.View;
import javafx.animation.FadeTransition;
import javafx.animation.ParallelTransition;
import javafx.animation.SequentialTransition;
import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public final class LoginController implements Rootable {
	
	//root fxml element & children:
	@FXML private AnchorPane rootAP;
    @FXML private JFXTextField nameTxtFld;
    @FXML private JFXPasswordField passwordFld;
    @FXML private JFXButton loginBtn;
    @FXML private JFXButton signupBtn;
    //stack pane for dialogs:
    @FXML private StackPane dialogSP;

    @FXML
    void initialize() {
    	//set button actions:
		loginBtn.setOnAction(event -> moveToFrameView());
		signupBtn.setOnAction(event -> signupUser());
    }
    
  	private final Stage stage = new Stage(); //stage
  	
  	//login.fxml controller singleton:
  	private static LoginController singleLoginCtrlr = null;
  	
  	//frame.fxml controller:
  	private final FrameController frameCtrlr = FrameController.getFrameCtrlr();
  	
  	//private constructor for singleton:
    private LoginController(){
    	Scene scene = new Scene(Rootable.getRoot(this, View.LOGIN.getPath())); //add root to scene
    	stage.setScene(scene); //add scene to stage
    }
  	
  	//get login controller singleton:
    public static LoginController getLoginCtrlr() {
    	//create singleton if necessary:
        if (singleLoginCtrlr == null) { singleLoginCtrlr = new LoginController(); }
        return singleLoginCtrlr; 
    }
  	
    //show stage (if not):
    public void showStage() {
    	if(!stage.isShowing()){stage.showAndWait();}
    }
    
  	private void moveToFrameView(){ 
  		
  		//fade out transition, adding frame view scene to stage on finish:
  		FadeTransition fadeOut = Fade.getFadeTransition(dialogSP, Fade.FadeOption.FADE_OUT, 200);
  		fadeOut.setOnFinished(event -> {
  			
  	  		Parent frameRoot = Rootable.getRoot(frameCtrlr, View.FRAME.getPath()); //get frame root
  			stage.setScene(new Scene(frameRoot)); //add new scene with root to stage
  			Fade.getFadeTransition(frameRoot, Fade.FadeOption.FADE_IN, 200).play(); //fade in view
  			
  		});
  		fadeOut.play(); //play transition
  	}
  	
  	
  	//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
  	//https://stackoverflow.com/questions/60049990/how-do-i-show-contents-from-the-password-field-in-javafx-using-checkbox
  	
  	private void loginUser() { /** +++++++++++++Database timeout/lack of connection needs caught here too! - maybe make a custom exception ofr that, showing a dialog box too! */
  		
	  	//trim name & password fields:
		String name = nameTxtFld.getText().trim();
		String password = passwordFld.getText().trim();
  		
		//if fields aren't empty: 
		if(!name.equals("") && !password.equals("")) {
			
		}else{ //name and-or password was empty:
			showAddNameAndPswd(); //inform user
		} 
  	}
  	
  	private void signupUser() {
  		
	  	//trim name & password fields:
		String name = nameTxtFld.getText().trim();
		String password = passwordFld.getText().trim();
		
		//if fields aren't empty: 
		if(!name.equals("") && !password.equals("")) {
			
		}else{ //name and-or password was empty:
			showAddNameAndPswd(); //inform user
		}
  	}
  	
  	//dialog to add name & password:
  	private void showAddNameAndPswd() {
		new DialogController(
				new Pane(new Label(Dialog.BodyText.EMPTY_NAME_OR_PSWD.toString())),
				false/*, 
				Dialog.ButtonText.OK*/).show(dialogSP);
  	}
  	
}
