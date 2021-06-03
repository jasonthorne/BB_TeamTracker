package controller;

import java.util.Optional;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXDialog;
import com.jfoenix.controls.JFXDialogLayout;

import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import view.View;

public final class FrameController implements Rootable {
	
	//root fxml element & children:
    @FXML private BorderPane rootBP;
    @FXML private AnchorPane headerAP;
    @FXML private Label titleLbl;
    @FXML private JFXButton notifyBtn;
    @FXML private AnchorPane bodyAP;
    @FXML private AnchorPane footerAP;
    @FXML private JFXButton backBtn;
    @FXML private JFXButton fwrdBtn;
    //stack pane for dialogs:
    @FXML private StackPane dialogSP;
    
    @FXML
    void initialize() {
    	
    	//show login view:
    	showFrameable(loginCtrlr);
    }
    
    private final Stage stage = new Stage(); //stage
    private final Scene scene; //scene
    
    //frame.fxml controller singleton reference:
  	private static FrameController singleFrameCtrlr = null;
  	//login.fxml controller:
    private final LoginController loginCtrlr;
  	
    //private constructor for singleton reference:
    private FrameController(){
    	loginCtrlr = new LoginController(); //instantiate login controller
    	scene = new Scene(Rootable.getRoot(this, View.FRAME.getPath())); //add root to scene
    	stage.setScene(scene); //add scene to stage
    }
    
  	//get frame controller singleton:
    public static FrameController getFrameCtrlr() {
    	//create singleton if necessary:
        if (singleFrameCtrlr == null) { singleFrameCtrlr = new FrameController(); }
        return singleFrameCtrlr; 
    }
  	
    //show stage (if not):
    public void showStage() {
    	if(!stage.isShowing()){stage.showAndWait();}
    }
    
    //show frameable's view:
    private void showFrameable(Frameable frameable) {
    	
    	//set label with frameable's title if present:
    	if(frameable.getOptTitle().isPresent()) {
    		titleLbl.setText(frameable.getOptTitle().get());}
    	
    	//replace bodyAP's children with framable's root:
    	bodyAP.getChildren().setAll(frameable.getRoot());
    }
    
    /*
    void showDialog(String heading, String message) {
    	
    	JFXDialogLayout layout = new JFXDialogLayout();
        layout.setHeading(new Label(heading));
        layout.setBody(new Label(message));
        JFXDialog dialog = new JFXDialog(dialogSP, layout, JFXDialog.DialogTransition.CENTER);
        dialog.show();
    }*/
    
    //return stack pane for adding dialog:
    StackPane getDialogSP() {
    	return dialogSP; 
    }
    
}

