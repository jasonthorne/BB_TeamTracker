package controller;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import view.View;

/** serves controller classes in need of fxml root elements */

public interface Rootable {

	static Parent getRoot(Rootable rootable, View path) { //+++++++++++++HAVE THIS TAKE IN STRING INSTEAD OF VIEW :P
		//create loader:
		FXMLLoader loader = new FXMLLoader(rootable.getClass().getResource(path.getPath())); 
		loader.setController(rootable); //set this class as the controller
		try {
			loader.load(); //load fxml tree
		} catch (IOException e) { e.printStackTrace(); }
		
		return loader.getRoot(); //return fxml root element
	}
}