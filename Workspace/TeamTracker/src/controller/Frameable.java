package controller;

import java.util.Optional;

import javafx.scene.Parent;
import view.View;

/** serves controller classes who's views are displayed by adding their root nodes to frame.fxml */

public interface Frameable {
	
	//change to another view:
	static void changeView(Parent thisRoot, Frameable nextFrameable) {
		///////////////Fadeable.fade(thisRoot, FadeOption.FADE_OUT); //fade out this root
		////////////FrameController.getFrameCtrlr().moveFwrd(nextFrameable); //move to nextFrameable
	}
	
	//force root getter/setter:
	//////abstract void setRoot(); needed?????????
	abstract Parent getRoot();
	
	//force title getter:
	abstract Optional<String> getOptTitle();
	
	/*
	 * this mighjt be better!! Just pass the view into this :P
	static Optional<String> getOptTitle() {
		return View.LOGIN.getOptTitle(); //return optional view title
	}*/
	
}