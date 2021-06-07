package application;

import controller.FrameController;
import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) {
		
		//get frame controller:
		FrameController frameCtrlr = FrameController.getFrameCtrlr();
		//show it's stage:
    	frameCtrlr.showStage();
	}

}

//https://material.io/resources/color/#!/?view.left=0&view.right=0&primary.color=FF9E80&secondary.color=E0E0E0