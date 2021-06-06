package controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXDialog;
import com.jfoenix.controls.JFXDialogLayout;

import javafx.event.ActionEvent;
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
	
	//dialog close button:
	@FXML private JFXButton closeBtn;
   
    @FXML
    void initialize() {
   
    	rootDialog.setContent(contentDL); //set contentDL as content
    	closeBtn.setOnAction(event-> rootDialog.close()); //set closeBtn to close dialog
    }
    
    //root fxml: 
    Parent root = Rootable.getRoot(this, View.DIALOG.getPath());
    
    //----------------------------constructors:----------------------
    
   	DialogController(Pane headingP, Pane bodyP, HBox actionsHB, CloseButtonText closeBtnTxt){
   		this(bodyP, actionsHB, closeBtnTxt);
   		contentDL.setHeading(headingP); //add headings pane
   	}
   	
   	DialogController(Pane bodyP, HBox actionsHB, CloseButtonText closeBtnTxt){
   		this(bodyP);
   		closeBtn.setText(closeBtnTxt.toString()); //set close button text
   	
   		actionsHB.getChildren().forEach(action -> { //add dialog close event to each action
   			action.addEventHandler(ActionEvent.ACTION, event -> rootDialog.close());
   		});
   		
   		actionsHB.getChildren().add(0, closeBtn); //add close button as first option
   		contentDL.setActions(actionsHB); //add actions to content
   		rootDialog.setOverlayClose(false); //prevent close on outer click
   	}
   	
   	DialogController(Pane bodyP){
   		contentDL.setBody(bodyP); //add body pane
   	}
   	//---------------------------------------------------------------
   	
	void show() {
		//show dialog on frame controller's stack pane:
		rootDialog.show(FrameController.getFrameCtrlr().getDialogSP());
	}
}
