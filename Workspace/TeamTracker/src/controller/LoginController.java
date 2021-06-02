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
    
    //fxml root node:
  	private Parent root;
  	
  	//constructor:
  	LoginController() {
  		//setRoot(); //set root node
  		this.root = Rootable.getRoot(this, View.LOGIN_FXML.getPath());
  	}

  	/** from Frameable: */
	///@Override
	///public void setRoot() {this.root = Rootable.getRoot(this, View.LOGIN_FXML.getPath());} //set root
	//@Override
	//public Parent getRoot() {return root;} //get root
	///@Override
	///public String getViewTitle() {
		//return View.LOGIN_FXML.getOptTitle().orElse("");
		//return View.LOGIN_FXML.getOptTitle();
	//}
  	
  	@Override
  	public Parent getRoot() {
  		//return root fxml element of view, with this set as it's controller:
  		return /*root;*/ Rootable.getRoot(this, View.LOGIN_FXML.getPath()); //get root
  	}
  	
  	/*
	@Override
	public View getView() {
		return View.LOGIN_FXML;
	}*/

	@Override
	public Optional<String> getOptTitle() {
		return View.LOGIN_FXML.getOptTitle(); //return optional view title
	}
	
	

}
