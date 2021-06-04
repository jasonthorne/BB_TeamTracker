package controller;

import com.jfoenix.controls.JFXDialog;
import com.jfoenix.controls.JFXDialogLayout;

import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import model.Dialog;
import model.DialogFactory;
import view.View;

public class DialogController implements Rootable{
	
	
	@FXML
    private JFXDialog rootDialog;

    @FXML
    private JFXDialogLayout contentDL;

    @FXML
    void initialize() {
    	
    	//add stuff to layout content
    	contentDL.setHeading(new Label("Dialog Heading"));
    	//contentDL.setBody(new Label("Dialog body"));
    	contentDL.getBody().add(new Label("my new body!!!"));
		//contentDL.getHeading().add(new Label("this works, yeah??"));
    	
    	Button btn = new Button("yo, dawg!");
    	btn.setOnAction(event -> rootDialog.close());
    	
    	contentDL.getActions().add(btn);
		
		rootDialog.setContent(contentDL);
    }
    
    DialogController() {
    		System.out.println(Dialog.Type.ERROR.getImgPath());
    }
    
    //root fxml: 
    Parent root = Rootable.getRoot(this, View.DIALOG.getPath());
    
    JFXDialog getDialog() {
    	return rootDialog;
    }

}
