package controller;

import java.util.Optional;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXDialog;
import com.jfoenix.controls.JFXDialogLayout;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;

import animation.Fadeable;
import dialog.Dialog;
import view.View;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public final class LoginController implements Rootable /*, Frameable*/{
	
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
		loginBtn.setOnAction(event -> showFrameTEST());
		signupBtn.setOnAction(event -> signupUser());
    }
    
    
    
  	//constructor:
  	/*LoginController() { /////??????????needed?????
 
  	}*/
  	
  	//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
  	
  	private final Stage stage = new Stage(); //stage
    private final Scene scene; //scene
  	
  	//login.fxml controller singleton reference:
  	private static LoginController singleLoginCtrlr = null;
  	//frame.fxml controller:
    private final FrameController frameCtrlr;
  	
  	//private constructor for singleton reference:
    private LoginController(){
    	frameCtrlr = FrameController.getFrameCtrlr(); //get frame controller
    	scene = new Scene(Rootable.getRoot(this, View.LOGIN.getPath())); //add root to scene
    	stage.setScene(scene); //add scene to stage
    }
  	
  	//get frame controller singleton:
    public static LoginController getLoginCtrlr() {
    	//create singleton if necessary:
        if (singleLoginCtrlr == null) { singleLoginCtrlr = new LoginController(); }
        return singleLoginCtrlr; 
    }
  	
    //show stage (if not):
    public void showStage() {
    	if(!stage.isShowing()){stage.showAndWait();}
    }
    
  	
  	
    //=================================================
  	private void showFrameTEST(){ //THIS IS LOGIN METHOD :P 
  		
  		Scene scene = new Scene(Rootable.getRoot(frameCtrlr, View.FRAME.getPath())); //add root to scene
  		stage.setScene(scene); //add scene to stage
  		//System.out.println("yo");
  		//rootSP.getChildren().setAll(Rootable.getRoot(frameCtrlr, View.FRAME.getPath()));
  		System.out.println(nameTxtFld.getText());
  	}
  	
  	
  	
  	
  	
  	
  	
  	
  	
  	
  	
  	
  	
  	//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
  	//https://stackoverflow.com/questions/60049990/how-do-i-show-contents-from-the-password-field-in-javafx-using-checkbox
  	
  	private void loginUser() { /** +++++++++++++Database timeout/lack of connection needs caught here too! - maybe make a custom exception ofr that, showing a dialog box too! */
  		
	  	//trim name & password fields:
		String name = nameTxtFld.getText().trim();
		String password = passwordFld.getText().trim();
  		
		//if fields aren't empty: 
		if(!name.equals("") && !password.equals("")) {
			
		}else { //name and-or password was empty:
			showAddNameAndPswd(); //inform user
		} 
  	}
  	
  	private void signupUser() {
  		
	  	//trim name & password fields:
		String name = nameTxtFld.getText().trim();
		String password = passwordFld.getText().trim();
		
		//if fields aren't empty: 
		if(!name.equals("") && !password.equals("")) {
			
		}else { //name and-or password was empty:
			showAddNameAndPswd(); //inform user
		}
  	}
  	
  	//dialog telling user to add name & password:
  	private void showAddNameAndPswd() {
		new DialogController(
				new Pane(new Label(Dialog.BodyText.EMPTY_NAME_OR_PSWD.toString())), 
				Dialog.ButtonText.OK).show(dialogSP);
  	}
  	
  	
  	/** from Frameable: */
  	/*
  	@Override
  	public Parent getRoot() {
  		//return root fxml element of view, with this set as it's controller:
  		return Rootable.getRoot(this, View.LOGIN.getPath()); //get root
  	}
  	
	@Override
	public Optional<String> getOptTitle() {
		return View.LOGIN.getOptTitle(); //return optional view title
	}*/
	
}
