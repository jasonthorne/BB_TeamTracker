package controller;

import com.jfoenix.controls.JFXDialog;
import com.jfoenix.controls.JFXDialogLayout;

import javafx.fxml.FXML;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
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
    	//contentDL.setHeading(new ImageView(new Image("controller/testImg.png")));
    	contentDL.setHeading(new StackPane(new ImageView(new Image("controller/testImg.png"))));
    	
    	//contentDL.setBody(new Label("Dialog body"));
    	contentDL.setBody(new StackPane(new Label("my new body!!!")));
		//contentDL.getHeading().add(new Label("this works, yeah??"));
    	
    	Button btn = new Button("yo, dawg!");
    	btn.setOnAction(event -> rootDialog.close());
    	
    	//StackPane sp = new StackPane();
    	//sp.getChildren().addAll(btn);
    	contentDL.setActions(new StackPane(btn));
    	
    	//contentDL.setAlignment(Pos.CENTER);
		
    	
    	
    	rootDialog.setOverlayClose(false); //stop dialog closing on click
    	
    	
		rootDialog.setContent(contentDL);
		
		
    }
    
    DialogController() {
    		System.out.println(Dialog.Type.ERROR.getImgPath());
    		System.out.println(Dialog.Type.CONFIRMATION.getImgPath());
    }
    
    //root fxml: 
    Parent root = Rootable.getRoot(this, View.DIALOG.getPath());
    
    JFXDialog getDialog() {
    	return rootDialog;
    }

}
