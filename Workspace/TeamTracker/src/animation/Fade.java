package animation;

import javafx.animation.FadeTransition;
import javafx.animation.ParallelTransition;
import javafx.animation.SequentialTransition;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.layout.StackPane;
import javafx.util.Duration;

/** fades nodes in/out of view */

public interface Fade {
	
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
	
	//return fade transition of given values:
	static FadeTransition getFadeTransition(Node node, FadeOption fadeOption, int millis) {
		//add node to fade transition of x milliseconds:
		FadeTransition ft = new FadeTransition(Duration.millis(millis), node);
		ft.setFromValue(fadeOption.fromVal); //set starting opacity value
		ft.setToValue(fadeOption.toVal); //set end opacity value
		return ft;
	}
}
