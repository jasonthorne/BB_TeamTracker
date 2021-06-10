package controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXDialog;
import com.jfoenix.controls.JFXDialogLayout;

import dialog.Dialog.ButtonText;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import view.View;

public class DialogController implements Rootable {
	
	@FXML private JFXDialog rootDialog; //dialog
	@FXML private JFXDialogLayout contentDL; //layout content
	@FXML private JFXButton closeBtn; //close button
   
    @FXML
    void initialize() {
    	rootDialog.setContent(contentDL); //set contentDL as content
    	closeBtn.setOnAction(event-> rootDialog.close()); //set closeBtn to close dialog
    }
    
    //root fxml: 
    Parent root = Rootable.getRoot(this, View.DIALOG.getPath());
    
    //----------------------------constructors:----------------------
    
   	DialogController(Pane headingP, Pane bodyP, boolean isFullScreen, ButtonText closeBtnTxt, JFXButton ...btns){
   		this(bodyP, isFullScreen, closeBtnTxt, btns);
   		contentDL.setHeading(headingP); //add headings pane
   	}
   	
   	DialogController(Pane bodyP, boolean isFullScreen, ButtonText closeBtnTxt, JFXButton ...btns){
   		this(bodyP, isFullScreen);
   		closeBtn.setText(closeBtnTxt.toString()); //set close button text
   		
   		HBox hBox = new HBox(closeBtn); //make HBox with close button
		for(JFXButton btn : btns) {
			//add close dialog event to button:
			btn.addEventHandler(ActionEvent.ACTION, event-> rootDialog.close());
			hBox.getChildren().add(btn); //add button to HBox
		}
		
   		contentDL.setActions(hBox); //add HBox to content
   		rootDialog.setOverlayClose(false); //prevent close on outer click
   	}
   	
   	DialogController(Pane bodyP, boolean isFullScreen){
   		contentDL.setBody(bodyP); //add body pane
   		if(isFullScreen){ //if full screen, set size of content to dialog:
   			contentDL.setPrefSize(rootDialog.getPrefWidth(),rootDialog.getPrefHeight());
		}
   	}
   	
   	//---------------------------------------------------------------
   	
	void show(StackPane stackPane) {
		rootDialog.show(stackPane); //show dialog on stack pane
	}
	
}
