package controller;

import com.jfoenix.controls.JFXDialog;
import com.jfoenix.controls.JFXDialogLayout;

import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.layout.Pane;
import view.View;

public class DialogController implements Rootable {
	
	
	//dialog and layout content:
	@FXML private JFXDialog rootDialog;
    @FXML  private JFXDialogLayout contentDL;
   

    @FXML
    void initialize() {
   
    	//set contentDL as content:
    	rootDialog.setContent(contentDL);
    }
    
    //root fxml: 
    Parent root = Rootable.getRoot(this, View.DIALOG.getPath());
	 
	DialogController(Pane headingPane, Pane bodyPane, Pane actionsPane, boolean hasOverlayClose){
		this(bodyPane, actionsPane, hasOverlayClose);
		contentDL.setHeading(headingPane); //add headings pane
	}
	
	DialogController(Pane bodyPane, Pane actionsPane, boolean hasOverlayClose){
		this(bodyPane);
		contentDL.setActions(actionsPane); //add actions pane
		rootDialog.setOverlayClose(hasOverlayClose); //set if close on outer click
	}
	
	DialogController(Pane bodyPane){
		contentDL.setBody(bodyPane); //add body pane
	}
	
	DialogController(){
		
	}

	void show() {
		//show dialog on frame controller's stack pane:
		rootDialog.show(FrameController.getFrameCtrlr().getDialogSP());
	}
	
	/*
	static void close() {
		rootDialog.close();
	}*/
	
}
