package view;

import java.util.Optional;

/** provides paths & titles for the stated fxml views within this classe's package */

public enum View {
	
	DIALOG("dialog.fxml"),
	FRAME("frame.fxml"),
	LOGIN("login.fxml", "Login");
	
	private String path = "/".concat(this.getClass().getPackage().getName()).concat("/"); //path 
	private Optional<String>optTitle = Optional.empty(); //optional title
	
	private View(String fileName, String title) {
		this(fileName);
		this.optTitle = Optional.of(title); //set title
	}
	
	private View(String fileName) { 
		this.path = path.concat(fileName); //add file name to path
	}
	
	public String getPath() { return path; } //return path
	public Optional<String> getOptTitle() { return optTitle; } //return title
}

//+++++++++++make test to ensure that all enteries contain .fxml