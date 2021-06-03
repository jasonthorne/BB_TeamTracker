package controller;

import com.jfoenix.controls.JFXDialog;
import com.jfoenix.controls.JFXDialogLayout;

import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;

public class DialogContentController implements Rootable {
	
	@FXML
    private StackPane testSP;
	@FXML
	private JFXDialogLayout rootDL;
	
	@FXML
	void initialize() {
	  
		rootDL.setHeading(new Label("rootDL Heading"));
		rootDL.setBody(new Label("rootDL body"));
		System.out.println(rootDL.getChildren());
		System.out.println("hullo!");
	}
  
	  /*
	  void setLabelTest(String string){
		  testLbl.setText(string);
	  }*/
	  
	  /** ++++++++++++++ this will hold an instance of whatever type of Dialog it needs to,
	   *  and popultate it's heading and bosy etc from that! 
	   * @return
	   */
	  
	  Parent root = Rootable.getRoot(this, "/view/dialogContent.fxml");
	  
	  DialogContentController(){
		 // rootDL.setHeading(new Label("rootDL Heading"));
		  // rootDL.setBody(new Label("rootDL body"));
		  System.out.println("hulloooooo");
	      
	  }
  
  
	  JFXDialogLayout getRoot() {
		  return rootDL;
	  }
	  
	  StackPane getSP() {
		  return testSP;
	  }

}
