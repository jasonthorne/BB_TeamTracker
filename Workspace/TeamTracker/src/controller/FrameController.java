package controller;

import java.util.Optional;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXDialog;
import com.jfoenix.controls.JFXDialogLayout;

import animation.Fade;
import javafx.animation.FadeTransition;
import javafx.animation.ParallelTransition;
import javafx.animation.SequentialTransition;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.util.Duration;
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
    	//show leagues view:
    	showFrameable(leaguesCtrlr);
    	
    	notifyBtn.setOnAction(event -> transitionTEST());
    	
    }
    
    //frame.fxml controller singleton:
  	private static FrameController singleFrameCtrlr = null;
    //leagues.fxml controller:
    private final LeaguesController leaguesCtrlr = new LeaguesController();
    
    //private constructor for singleton:
    private FrameController(){ //++++++++++++++++++++++++++++++++MIGHT NOT BE NEEDED. MIGHT BER TO KEEP IT PRIVATE THOUGH!! 
    	
    	//------------
    	
    	int a = 5;
    	///Thread thread = new Thread(() -> System.out.println("Running"));
    	//Fade.fadeOutToNew(new Thread(() -> System.out.println(a)));
    	
    	//Fade.fadeOutToNew(new Thread(() -> System.out.println(a)));
    	
    	
    	
    	
    	
    	
    	//------------
    	
    }
    
    
    void transitionTEST() {
    	
  
    	ParallelTransition pt3 = new ParallelTransition(                                          
				Fade.getFadeTransition(fwrdBtn, Fade.FadeOption.FADE_OUT, 300),
				Fade.getFadeTransition(backBtn, Fade.FadeOption.FADE_OUT, 300));
    	
    	pt3.setOnFinished(event -> notifyBtn.setStyle("fx-background-color: #FFF"));
    
    	ParallelTransition pt4 = new ParallelTransition(                                          
    			Fade.getFadeTransition(fwrdBtn, Fade.FadeOption.FADE_IN, 300),
				Fade.getFadeTransition(backBtn, Fade.FadeOption.FADE_IN, 300));
    	
    	SequentialTransition st = new SequentialTransition(pt3, pt4);
    	st.play();
    	
    }
    
    
    
    
    
    
    
    
  	//get frame controller singleton:
    public static FrameController getFrameCtrlr() {
    	//create singleton if necessary:
        if (singleFrameCtrlr == null) { singleFrameCtrlr = new FrameController(); }
        return singleFrameCtrlr; 
    }
  	
    //show frameable's view:
    private void showFrameable(Frameable frameable) {
    	
    	//set label with frameable's title if present:
    	if(frameable.getOptTitle().isPresent()) {
    		titleLbl.setText(frameable.getOptTitle().get());}
    	
    	//replace bodyAP's children with framable's root:
    	bodyAP.getChildren().setAll(frameable.getRoot());
    }
    
    //show dialog on frame's stack pane:
    void ShowDialog(DialogController dialogCtrlr) {
    	dialogCtrlr.show(dialogSP);
    }
    
}
