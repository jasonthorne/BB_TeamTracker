package view;

/** provides paths & titles for the stated fxml view files within this classe's package */

public enum View {
	
	FRAME_FXML("frame.fxml"),
	LOGIN_FXML("login.fxml", "Login");
	
	private final String path; 
	private String title = "";
	
	private View(String fileName, String title) {
		this(fileName);
		this.title = title; //set title
	}
	
	private View(String fileName) { 
		this.path = "/" + this.getClass().getPackage().getName() + "/" + fileName; //set path
	}
	
	public String getPath() { return path; } //return path
	public String getTitle() { return title; } //return title //++++++++++++DEAL WITH WHEN NO TITLE! 

}

//+++++++++++make test to ensure that all enteries contain .fxml