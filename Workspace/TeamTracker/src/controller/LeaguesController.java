package controller;

import java.util.Optional;

import com.jfoenix.controls.JFXButton;

import animation.Fade;
import dialog.Dialog;
import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import view.View;

public class LeaguesController implements Rootable, Frameable{

	 //root fxml element & children:
	@FXML private AnchorPane rootAP;

    @FXML
    private Label testLbl;
    
    @FXML
    private JFXButton testBtn;

    @FXML
    void initialize() {
    	
    	testBtn.setOnAction(event -> testShowDialog());
     
    }
    
    void testShowDialog() {
    	FrameController.getFrameCtrlr().ShowDialog(new DialogController(
    			new Pane(new Label(Dialog.BodyText.EMPTY_NAME_OR_PSWD.toString())), 
				Dialog.ButtonText.OK));
    }
    
    /** from Frameable: */
  	@Override
  	public Parent getRoot() {
  		//return root fxml element of view, with this set as it's controller:
  		return Rootable.getRoot(this, View.LEAGUES.getPath()); //get root
  	}
  	
	@Override
	public Optional<String> getOptTitle() {
		return View.LEAGUES.getOptTitle(); //return optional view title
	}
    
}
