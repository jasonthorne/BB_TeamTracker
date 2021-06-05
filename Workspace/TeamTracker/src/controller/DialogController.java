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
		
	}
	
	DialogController(Pane bodyPane, Pane actionsPane, boolean hasOverlayClose){
		this(bodyPane);
			
	}
	
	DialogController(Pane bodyPane){
		contentDL.setBody(bodyPane); //add body pane to body
	}

	
	void show() {
		//show dialog on frame controller's stack pane:
		rootDialog.show(FrameController.getFrameCtrlr().getDialogSP());
	}
	
	
	

}
