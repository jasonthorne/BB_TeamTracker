package controller;

import java.util.Arrays;
import java.util.Optional;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXDialog;
import com.jfoenix.controls.JFXDialogLayout;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;

import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import view.View;

public class LoginController implements Rootable, Frameable{
	
	//root fxml element & children:
	@FXML private AnchorPane rootAP;
    @FXML private JFXTextField nameTxtFld;
    @FXML private JFXPasswordField pswrdTxtFld;
    @FXML private JFXButton loginBtn;
    
    @FXML
    private JFXDialog dialogTEST;

   // @FXML
   // private JFXDialogLayout dialogLayoutTEST;

   // @FXML
   // private Label dialogLblTEST;

    
    @FXML
    void initialize() {
    	//set btn actions:
		loginBtn.setOnAction(event -> loginUser());
		
    }
    
    
  	//constructor:
  	LoginController() { /////??????????needed?????
 
  	}
  	
  	private void loginUser() {
  		
	  	//trim name & password fields:
		String name = nameTxtFld.getText().trim();
		String password = pswrdTxtFld.getText().trim();
		
		//if fields aren't empty: 
		if(!name.equals("") && !password.equals("")) {
			
		}else { // a field was blank:
			System.out.println("no dice, punk!");
			//FrameController.getFrameCtrlr().showDialog("Warning", "Username or Password was blank");
			/*
			JFXDialogLayout layout = new JFXDialogLayout();
	        layout.setHeading(new Label("woo"));
	        layout.setBody(new Label("hoo"));
	        JFXDialog dialog = new JFXDialog(
	        		FrameController.getFrameCtrlr().getDialogSP(), 
	        		layout, JFXDialog.DialogTransition.CENTER);
	        dialog.show();
	        */
	        //https://stackoverflow.com/questions/42443971/javafx-creating-custom-dialogs-using-fxml
	        
	        //https://icons8.com/icons/set/warning
	        
	        //https://www.youtube.com/watch?v=9C-kHuo_BrQ
			//dialogTEST.setTransitionType(JFXDialog.DialogTransition.CENTER);
			//dialogTEST.setDialogContainer(FrameController.getFrameCtrlr().getDialogSP());
			dialogTEST.show(FrameController.getFrameCtrlr().getDialogSP());
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
