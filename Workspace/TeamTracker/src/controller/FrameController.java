package controller;

import com.jfoenix.controls.JFXButton;

import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import view.ViewPath;

public class FrameController implements Rootable {
	
	//root fxml element & children:
    @FXML private BorderPane rootBP;
    @FXML private AnchorPane headerAP;
    @FXML private Label viewLbl;
    @FXML private JFXButton notifyBtn;
    @FXML private StackPane bodySP;
    @FXML private AnchorPane bodyAP;
    @FXML private AnchorPane footerAP;
    @FXML private JFXButton backBtn;
    @FXML private JFXButton fwrdBtn;
    
    @FXML
    void initialize() {
    
    }
    
    private final Stage stage = new Stage(); //stage
    private final Scene scene; //scene
    
    //frame.fxml controller singleton reference:
  	private static FrameController singleFrameCtrlr = null;
  	
    //private constructor for singleton reference:
    private FrameController(){
    	///////loginCtrlr = new LoginController(); //instantiate login controller
    	scene = new Scene(Rootable.getRoot(this, ViewPath.FRAME_FXML)); //add root to scene
    	stage.setScene(scene); //add scene to stage
    }
    
  	//get frame controller singleton:
    public static FrameController getFrameCtrlr() {
    	//create singleton if necessary:
        if (singleFrameCtrlr == null) { singleFrameCtrlr = new FrameController(); }
        return singleFrameCtrlr; 
    }
  	
    //show stage:
    public void showStage() { stage.showAndWait(); }
    
    
}
