package controller;

import java.util.Arrays;
import java.util.Optional;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXDialog;
import com.jfoenix.controls.JFXDialogLayout;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import model.Dialog.ButtonText;
import view.View;

public class LoginController implements Rootable, Frameable{
	
	//root fxml element & children:
	@FXML private AnchorPane rootAP;
    @FXML private JFXTextField nameTxtFld;
    @FXML private JFXPasswordField pswrdTxtFld;
    @FXML private JFXButton loginBtn;
    ///////////////////@FXML private JFXDialog blankFieldDlog;
    
    /*
    blankFieldDlog
    loginErrorDlog
    connectErrorDlog
    */

    @FXML
    void initialize() {
    	//set btn actions:
		loginBtn.setOnAction(event -> loginUser());
		
		 
	      //btn.setOnAction(event -> DialogController.close());
    }
    
    JFXButton btn = new JFXButton();
    
    
  	//constructor:
  	LoginController() { /////??????????needed?????
 
  	}
  	
  	private void loginUser() { /** +++++++++++++Database timeout/lack of connection needs caught here too! - maybe make a custom exception ofr that, showing a dialog box too! */
  		
	  	//trim name & password fields:
		String name = nameTxtFld.getText().trim();
		String password = pswrdTxtFld.getText().trim();
		
		//if fields aren't empty: 
		if(!name.equals("") && !password.equals("")) {
			
		}else { //a field was blank:
			
			
	      JFXButton btn2 = new JFXButton("button2");
	      btn2.addEventHandler(ActionEvent.ACTION, event -> System.out.println("btn2 clicked!"));
	      
	      JFXButton btn3 = new JFXButton("button3");
	      btn3.addEventHandler(ActionEvent.ACTION, event -> System.out.println("btn3 clicked!"));
	      
	       new DialogController(
	    		  /* new Pane(new Label("Error")),*/
	    		   new Pane(new Label("Enter Username and Password")),
				   //new HBox (btn2),
	    		   ButtonText.OK
				   /*, btn2 , btn3*/).show();
		 
		} 
       
       
       
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
