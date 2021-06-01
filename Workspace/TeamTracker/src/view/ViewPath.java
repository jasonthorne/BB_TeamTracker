package view;

/** provides paths for the stated fxml view files within this classe's package */

public enum ViewPath {
	
	FRAME_FXML("frame.fxml"),
	LOGIN_FXML("login.fxml");
	
	private final String path; 
	private ViewPath(String fileName) { //constructor sets path
		this.path = "/" + this.getClass().getPackage().getName() + "/" + fileName;
	} 
	@Override 
	public String toString() { return path; } //return path

}

//+++++++++++make test to ensure that all enteries contain .fxml