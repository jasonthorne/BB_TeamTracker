package application;

import controller.FrameController;
import controller.LoginController;
import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) {
		
		//get frame controller:
		/////FrameController frameCtrlr = FrameController.getFrameCtrlr();
		//show it's stage:
    	///////frameCtrlr.showStage();
    	
    	
    	
    	//get frame controller:
		LoginController loginCtrlr = LoginController.getLoginCtrlr();
		//show it's stage:
		loginCtrlr.showStage();
	}

}

//https://material.io/resources/color/#!/?view.left=0&view.right=0&primary.color=FF9E80&secondary.color=E0E0E0