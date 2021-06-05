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
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import model.DialogTEST;
import view.View;

public class DialogControllerTEST implements Rootable{
	
	
	@FXML
    private JFXDialog rootDialog;

    @FXML
    private JFXDialogLayout contentDL;

    @FXML
    void initialize() {
    	
    	rootDialog.setContent(contentDL);
    	//add stuff to layout content
    	//contentDL.setHeading(new Label("Heading here"));
    	//contentDL.setHeading(new StackPane(new ImageView(new Image("controller/testImg.png"))));
    	
    	Button btn = new Button("yo, dawg!");
    	btn.setOnAction(event -> rootDialog.close());
    	
    	
    	//StackPane sp = new StackPane();
    	//sp.getChildren().addAll(new Label("here be text!"), btn);
    	//sp.setAlignment(Pos.BOTTOM_CENTER);
    	
    	HBox hbTest = new HBox();
    	hbTest.setAlignment(Pos.CENTER);
    	hbTest.getChildren().addAll(btn, new Button("b2"));
    	
    	VBox layoutVB = new VBox();
    	layoutVB.setSpacing(25.0);
    	layoutVB.getChildren().addAll(new ImageView(new Image("controller/testImg9.png")), ////////////like 9 the best! 36dp
    			new Label("Enter Username and Password"), hbTest);
    	layoutVB.setAlignment(Pos.CENTER);
    	
    	
    	/*
    	StackPane sp = new StackPane();
    	sp.getChildren().addAll(vb);
    	sp.setAlignment(Pos.CENTER);
    	*/
    	
    	contentDL.setBody(layoutVB);
    	
    	//contentDL.setBody(sp);
    	//contentDL.setBody(new StackPane(new Label("my new body!!!")));
    	
    	
		//contentDL.getHeading().add(new Label("this works, yeah??"));
    	
    	
    	
    	
    	
    	/*
    	
    	
    	contentDL.setActions(sp);
    	
    	*/
    	
    	//contentDL.setAlignment(Pos.CENTER);
		
    	
    	
    	rootDialog.setOverlayClose(false); //stop dialog closing on click
    	
    	
		
		
    }
    
    //root fxml: 
    ////////Parent root = Rootable.getRoot(this, View.DIALOG.getPath());
    
    DialogControllerTEST() {
    		//System.out.println(DialogTEST.Type.ERROR.getImgPath());
 
    }
    
    
    
    JFXDialog getDialog() {
    	return rootDialog;
    }

}
