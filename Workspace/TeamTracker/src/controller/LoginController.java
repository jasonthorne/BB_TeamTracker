package controller;

import java.util.Optional;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;

import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.layout.AnchorPane;
import view.View;

public class LoginController implements Rootable, Frameable{
	
	//root fxml element & children:
	@FXML private AnchorPane rootAP;
    @FXML private JFXTextField nameTxtFld;
    @FXML private JFXPasswordField pswrdTxtFld;
    @FXML private JFXButton loginBtn;
    
    @FXML
    void initialize() {
    }
    
    
  	//constructor:
  	LoginController() {
  		
  	}

  	/** from Frameable: */
  	@Override
  	public Parent getRoot() {
  		//return root fxml element of view, with this set as it's controller:
  		return Rootable.getRoot(this, View.LOGIN_FXML.getPath()); //get root
  	}
  	
	@Override
	public Optional<String> getOptTitle() {
		return View.LOGIN_FXML.getOptTitle(); //return optional view title
	}
	
}
