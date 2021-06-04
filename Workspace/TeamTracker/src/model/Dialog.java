package model;

public class Dialog {
	
	public enum Type {
		ERROR, //warning icon
		CONFIRMATION; //question mark icon
	
		public String getImgPath() {
			
			//her we dig into properties file for path
			return Type.this.toString();
		}
		
		
		//Error : image path.
		
		/*
		ImagePaths - folder
		Dialogs- folder
		Types - folder
		Error= pathToImage
		*/
		
		
		/*
		 * Images - folder
		 * Dialogs - folder
		 * Types - folder
		 * error.png
		 */
	}
	
	
	public enum Error {
		BLANK_USER_OR_PSWRD;
	}
	
	public enum Confirmation {
		CREATE_ACCOUNT,
		DELETE_ACCOUNT;
	}
	

	//buttons are TYPES:
	//close, cancel, accept
	
}




