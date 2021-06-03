package controller;

import java.util.Arrays;
import java.util.Optional;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXDialog;
import com.jfoenix.controls.JFXDialogLayout;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

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
    }
    
    
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
			
		/////blankFieldDlog.getChildren().add(arg0) ++Maybe add a child here
		
		//show blank field dialog on frame's stack pane:
		//blankFieldDlog.show(FrameController.getFrameCtrlr().getDialogSP());
		
		JFXDialogLayout layout = new JFXDialogLayout();
        layout.setHeading(new Label("yo"));
        layout.setBody(new Label("there"));
        
        JFXDialog dialog = new JFXDialog(
        		FrameController.getFrameCtrlr().getDialogSP(), 
        		layout, JFXDialog.DialogTransition.CENTER);
       // dialog.show();
        
        JFXDialogLayout layout2 = new JFXDialogLayout();
        layout2.setHeading(new Label("layout2"));
        
       dialog.setContent(layout2);
        
        //dialog.show();
       //blankFieldDlog.setContent(layout2);
       //blankFieldDlog.show(FrameController.getFrameCtrlr().getDialogSP());
       
       
       //=================
       
       DialogContentController DialogContentCtrlr = new DialogContentController();
       //////////blankFieldDlog.setContent(DialogContentCtrlr.getRoot());
       
       System.out.println(DialogContentCtrlr.getRoot());
       
       //blankFieldDlog.show(FrameController.getFrameCtrlr().getDialogSP());
       //blankFieldDlog.show(DialogContentCtrlr.getSP());
       //===================
       
        
        //blankFieldDlog.show(FrameController.getFrameCtrlr().getDialogSP());
       
       //======================
       /*
       JFXDialog dialog2 = new JFXDialog(
       		FrameController.getFrameCtrlr().getDialogSP(), 
       		new DialogContentController().getRoot(), JFXDialog.DialogTransition.CENTER);
       dialog2.show();
       
       System.out.println(new DialogContentController().getRoot());
       */
       
       
       //============================
       
       
       DialogController dialogCtrlr = new DialogController();
       dialogCtrlr.getDialog().show(FrameController.getFrameCtrlr().getDialogSP());
       
			
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
