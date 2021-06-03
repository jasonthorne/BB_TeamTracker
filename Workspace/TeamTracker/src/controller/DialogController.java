package controller;

import com.jfoenix.controls.JFXDialog;
import com.jfoenix.controls.JFXDialogLayout;

import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.control.Label;

public class DialogController implements Rootable{
	
	
	@FXML
    private JFXDialog rootDialog;

    @FXML
    private JFXDialogLayout contentDL;

    @FXML
    void initialize() {
    	
    	//add stuff to layout content
    	contentDL.setHeading(new Label("Dialog Heading"));
    	contentDL.setBody(new Label("Dialog body"));
		System.out.println(contentDL.getChildren());
		System.out.println("hullo!");
		
		rootDialog.setContent(contentDL);
		
      
    }
    
    
    Parent root = Rootable.getRoot(this, "/view/dialog.fxml");
    
    JFXDialog getDialog() {
    	return rootDialog;
    }

}
