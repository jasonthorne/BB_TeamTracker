package model;

import com.jfoenix.controls.JFXDialogLayout;

import javafx.scene.Node;

public abstract class Dialog {
	
	private JFXDialogLayout layout;
	
	Dialog(Node[] headingNodes, Node[] bodyNodes, Node[] actionNodes) {
		layout.setHeading(headingNodes);
		layout.setBody(bodyNodes);
		layout.setActions(actionNodes);
	}
		
	public static Dialog getDialog(){
		return null; //new JFXDialog();	
		
	}
	
}


