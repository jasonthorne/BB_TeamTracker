package application;

import controller.LoginController;
import controller.PreloaderController;
import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) {
    	
		
		//get login controller:
		LoginController loginCtrlr = LoginController.getLoginCtrlr();
		//show its stage:
		loginCtrlr.showStage();
		
		
		//get login controller:
		/////PreloaderController splashCtrlr = PreloaderController.getSplashCtrlr();
		//show its stage:
		/////splashCtrlr.showStage();
	}
}

//https://material.io/resources/color/#!/?view.left=0&view.right=0&primary.color=FF9E80&secondary.color=E0E0E0