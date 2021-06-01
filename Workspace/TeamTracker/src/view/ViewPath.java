package view;

/** provides paths for the stated fxml files within this classe's package */

public enum ViewPath {
	
	FRAME_FXML("frame.fxml"); 
	
	private final String path; 
	private ViewPath(String fileName) { //constructor sets path
		this.path = "/" + this.getClass().getPackage().getName() + "/" + fileName;
	} 
	@Override 
	public String toString() { return path; } //return path

}
