package model;

import com.jfoenix.controls.JFXDialogLayout;

import javafx.scene.Node;

public abstract class Dialog {
	
	private JFXDialogLayout layout;
	
	private class Layout {
		
		Layout(Node[] headingNodes, Node[] bodyNodes, Node[] actionNodes){
			layout.setHeading(headingNodes);
			layout.setBody(bodyNodes);
			layout.setActions(actionNodes);
		}
	}

}


