package animation;

import javafx.animation.FadeTransition;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.layout.StackPane;
import javafx.util.Duration;

/** fades nodes in/out of view */

public interface Fadeable {
	
	enum FadeOption {
		
		//fade options:
		FADE_IN(0.0, 1.0),
		FADE_OUT(1.0, 0.0);
		
		//opacity transition values:
		private double fromVal;
		private double toVal;
		
		//constructor sets transition values:
		private FadeOption(double fromVal, double toVal) {
			this.fromVal = fromVal;
			this.toVal = toVal;
		}
	}
	
	static void fade(Node node, FadeOption fadeOption) {
		//add node to fade transition of 300ms:
		FadeTransition ft = new FadeTransition(Duration.millis(300), node);
		ft.setFromValue(fadeOption.fromVal); //set starting opacity value
		ft.setToValue(fadeOption.toVal); //set end opacity value
		ft.setCycleCount(1); //how many times the animation should happen (cycle)
		ft.setAutoReverse(false); //whether animation reverses on alternating cycles
		ft.play(); //play transition
	}
	
	
	//look at executor servicxes etc for multi fading of this method when necessary (title and page for example! ++++++++++++++++++++++++++)
	static void fadeOutToNew(/*Node currNode, Node newNode,*/ Thread thread) {
		//add node to fade transition of 300ms:
		FadeTransition ft = new FadeTransition(Duration.millis(300), new StackPane());
		/*FadeTransition ft = new FadeTransition(Duration.millis(300), currNode);
		ft.setFromValue(1.0); //set starting opacity value
		ft.setToValue(0.0); //set end opacity value
		ft.setCycleCount(1); //how many times the animation should happen (cycle)
		ft.setAutoReverse(false); //whether animation reverses on alternating cycles*/
		
		ft.setOnFinished(new EventHandler<ActionEvent>(){
			@Override
			public void handle(ActionEvent arg0) {
				thread.start();
			}
		});
		
		ft.play(); //play transition
	}
}
