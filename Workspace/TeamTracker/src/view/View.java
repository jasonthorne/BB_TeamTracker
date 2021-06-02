package view;

import java.util.Optional;

/** provides paths & titles for the stated fxml view files within this classe's package */

public enum View {
	
	FRAME_FXML("frame.fxml"),
	LOGIN_FXML("login.fxml", "Login");
	
	private String path = "/".concat(this.getClass().getPackage().getName()).concat("/"); //package path
	private String title;
	private Optional<String>optTitle = Optional.empty(); //optional title
	
	private View(String fileName, String title) {
		this(fileName);
		///////////////////////this.title = title; //set title
		this.optTitle = Optional.of(title); //set title
	}
	
	private View(String fileName) { 
		//this.path = "/" + this.getClass().getPackage().getName() + "/" + fileName; //set path
		this.path = path.concat(fileName); //add file name to path
	}
	
	public String getPath() { return path; } //return path
	//public String gettitle() { return title; } //return path
	public Optional<String> getOptTitle() { return optTitle; } //return optional title
	
}

//+++++++++++make test to ensure that all enteries contain .fxml