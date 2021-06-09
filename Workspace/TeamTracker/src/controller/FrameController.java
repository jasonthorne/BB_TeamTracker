package controller;

import java.util.Optional;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXDialog;
import com.jfoenix.controls.JFXDialogLayout;

import animation.Fadeable;
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

public final class FrameController implements Rootable, Fadeable {
	
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
    	//Fadeable.fadeOutToNew(new Thread(() -> System.out.println(a)));
    	
    	Fadeable.fadeOutToNew(new Thread(() -> System.out.println(a)));
    	
    	
    	
    	
    	
    	
    	//------------
    	
    }
    
    
    void transitionTEST() {
    	
    	System.out.println("fgfgfg");
    	
    	//frwrd
    	FadeTransition FRWRD = new FadeTransition(Duration.millis(300), fwrdBtn);
    	FRWRD.setFromValue(1); //set starting opacity value
    	FRWRD.setToValue(0); //set end opacity value
    	FRWRD.setCycleCount(1); //how many times the animation should happen (cycle)
    	FRWRD.setAutoReverse(false); //whether animation reverses on alternating cycles
    	
    	//back
    	FadeTransition BACK = new FadeTransition(Duration.millis(300), backBtn);
    	BACK.setFromValue(1); //set starting opacity value
    	BACK.setToValue(0); //set end opacity value
    	BACK.setCycleCount(1); //how many times the animation should happen (cycle)
    	BACK.setAutoReverse(false); //whether animation reverses on alternating cycles
    	
    	ParallelTransition pt = new ParallelTransition(FRWRD, BACK);
    	//pt.setCycleCount(1);
    	//pt.play();
    	
    	
    	//frwrd
    	FadeTransition FRWRD2 = new FadeTransition(Duration.millis(300), fwrdBtn);
    	FRWRD2.setFromValue(0); //set starting opacity value
    	FRWRD2.setToValue(1); //set end opacity value
    	FRWRD2.setCycleCount(1); //how many times the animation should happen (cycle)
    	FRWRD2.setAutoReverse(false); //whether animation reverses on alternating cycles
    	
    	//back
    	FadeTransition BACK2 = new FadeTransition(Duration.millis(300), backBtn);
    	BACK2.setFromValue(0); //set starting opacity value
    	BACK2.setToValue(1); //set end opacity value
    	BACK2.setCycleCount(1); //how many times the animation should happen (cycle)
    	BACK2.setAutoReverse(false); //whether animation reverses on alternating cycles
    	
    	ParallelTransition pt2 = new ParallelTransition(FRWRD2, BACK2);
    	//pt.setCycleCount(1);
    	
    	SequentialTransition st = new SequentialTransition(pt, pt2);
    	//st.setCycleCount(1);
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
