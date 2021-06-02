package application;

import controller.FrameController;
import javafx.application.Application;
import javafx.stage.Stage;
import view.View;

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
