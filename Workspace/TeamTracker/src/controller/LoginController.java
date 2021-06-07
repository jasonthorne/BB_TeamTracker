package controller;

import java.util.Arrays;
import java.util.Optional;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXDialog;
import com.jfoenix.controls.JFXDialogLayout;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;

import dialog.Dialog;
import view.View;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;

public final class LoginController implements Rootable, Frameable{
	
	//root fxml element & children:
	@FXML private AnchorPane rootAP;
    @FXML private JFXTextField nameTxtFld;
    @FXML private JFXPasswordField pswdTxtFld;
    @FXML private JFXButton loginBtn;
    @FXML private JFXButton signupBtn;

    @FXML
    void initialize() {
    	//set button actions:
		loginBtn.setOnAction(event -> loginUser());
		signupBtn.setOnAction(event -> signupUser());
    }
    
  	//constructor:
  	LoginController() { /////??????????needed?????
 
  	}
  	
  	private void loginUser() { /** +++++++++++++Database timeout/lack of connection needs caught here too! - maybe make a custom exception ofr that, showing a dialog box too! */
  		
	  	//trim name & password fields:
		String name = nameTxtFld.getText().trim();
		String password = pswdTxtFld.getText().trim();
  		
		//if fields aren't empty: 
		if(!name.equals("") && !password.equals("")) {
			
		}else { //name and/or password was empty:
			showAddNameAndPswd(); //inform user
		} 
  	}
  	
  	private void signupUser() {
  		
	  	//trim name & password fields:
		String name = nameTxtFld.getText().trim();
		String password = pswdTxtFld.getText().trim();
		
		//if fields aren't empty: 
		if(!name.equals("") && !password.equals("")) {
			
		}else { //name and/or password was empty:
			showAddNameAndPswd(); //inform user
		}
  		
  	}
  	
  	//dialog telling user to add name & password:
  	private void showAddNameAndPswd() {
		new DialogController(
				new Pane(new Label(Dialog.BodyText.EMPTY_NAME_OR_PSWD.toString())), 
				Dialog.ButtonText.OK).show();
  	}
  	
  	/** from Frameable: */
  	@Override
  	public Parent getRoot() {
  		//return root fxml element of view, with this set as it's controller:
  		return Rootable.getRoot(this, View.LOGIN.getPath()); //get root
  	}
  	
	@Override
	public Optional<String> getOptTitle() {
		return View.LOGIN.getOptTitle(); //return optional view title
	}
	
}
