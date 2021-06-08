package controller;

import java.util.Optional;

import animation.Fadeable;
import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import view.View;

public class LeaguesController implements Rootable, Frameable{

	 //root fxml element & children:
	@FXML private AnchorPane rootAP;

    @FXML
    private Label testLbl;

    @FXML
    void initialize() {
     
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
