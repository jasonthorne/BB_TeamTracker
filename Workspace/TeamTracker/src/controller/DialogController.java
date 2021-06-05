package controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXDialog;
import com.jfoenix.controls.JFXDialogLayout;

import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import model.Dialog.CloseButtonText;
import view.View;

public class DialogController implements Rootable {
	
	
	
	//dialog and layout content:
	@FXML private JFXDialog rootDialog;
	@FXML private JFXDialogLayout contentDL;
   

    @FXML
    void initialize() {
   
    	//set contentDL as content:
    	rootDialog.setContent(contentDL);
    	
    	//set closeBtn to close dialog:
    	closeBtn.setOnAction(event-> rootDialog.close());
    }
    
    //root fxml: 
    Parent root = Rootable.getRoot(this, View.DIALOG.getPath());
    
    private JFXButton closeBtn = new JFXButton();
	
    /*
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
	*/
    
    
   
   	DialogController(
   			Pane headingPane, Pane bodyPane, HBox actionsHB, CloseButtonText closeBtnTxt, boolean hasOverlayClose){
   		this(bodyPane, actionsHB, closeBtnTxt, hasOverlayClose);
   		contentDL.setHeading(headingPane); //add headings pane
   	}
   	
   	DialogController(Pane bodyPane, HBox actionsHB, CloseButtonText closeBtnTxt, boolean hasOverlayClose){
   		this(bodyPane);
   		closeBtn.setText(closeBtnTxt.toString());
   		actionsHB.getChildren().add(closeBtn);
   		contentDL.setActions(actionsHB); //add actions pane
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
	
	
	JFXButton getCloseBtn() {
		JFXButton btn = new JFXButton();
		btn.setOnAction(event -> rootDialog.close());
		return btn;
	}
		
	
}
