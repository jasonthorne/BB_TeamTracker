package model;

public abstract class DialogTEST {
	
	//every dialog has:
	/*
	 * heading - icon
	 * body - text
	 * actions - list of buttons
	 * 
	 * ################
	 * 
	 * 3 types:  (classes)
	 * Error
	 * 
	 * 	icon path; //get this from properties fiel. call this in costructor
	 * 	
	 * 	enum Type
	 * 		BLANK_USER_OR_PSWRD;
	 * 
	 * 		String getText() //get this from properties file. call this in constructor using selected type
	 * 		
	 * 
	 *  
	 * 	
	 * 
	 * 
	 * confirmation
	 * 
	 * 
	 * Notification
	 */

	
	public enum Type {
		ERROR, //warning icon
		CONFIRMATION, //question mark icon
		NOTIFICATION; //bell icon
	
		public String getImgPath() {
			
			//her we dig into properties file for path
			return Type.this.toString();
		}
		
		
		//each one of these grab their respective texts
		public enum Error {
			BLANK_USER_OR_PSWRD; //these give path to single button image
		}
		
		
		
		//Error : image path.
		
		/*
		ImagePaths - folder
			Dialogs- folder
				Types - folder
					Error= pathToImage
				Buttons - folder //~++++++++++++++++++++maybe this sohuld be it's own imgPath folder! since a lot of these will be shared!.
					Error = pathToImage
		
		
		
		*/
		
		
		/*
		 * Images - folder
		 * 		Dialogs - folder
		 * 			Types - folder
		 * 				error.png, confirmation.png
		 * 			
		 */
	}
	
	
	
	public enum Confirmation { //these get yes, no button image paths AND paths to 
		CREATE_ACCOUNT,
		DELETE_ACCOUNT;
	}
	
	public enum Notification {
		JOINED_LEAGUE,
		NEW_PAIRING; //....
	}

	//buttons are TYPES:
	//close, cancel, accept - these dictate the action of the button???
	//(save and delete??)
	
	
	//=======================
	/*
	 * to make a dialog object: 
	 * 
	 * DialogTEST(Type type, ){
	 * 
	 */
	
}




