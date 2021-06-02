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
	
	//force optional title getter:
	abstract Optional<String> getOptTitle();
	
	//force title getter:
	//abstract String getViewTitle();
	
	
	
	/*
	//-------------1st plan:
	static Optional<String>getOptTitle(View view){
		return view.getOptTitle();
	}
	
	//------------better plan:
	static void getViewTitle2(View view){
		//////////FrameController.getFrameCtrlr().
	}*/
	
	//==============
	
	//abstract View getView();
	
	/*static Parent getRootTEST() {
		return Rootable.getRoot(this, path)getView().
	}*/
	
	
	//============
	
	
	
	
	
	
	
}