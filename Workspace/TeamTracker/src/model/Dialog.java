package model;

import java.util.ArrayList;
import java.util.List;

import controller.FrameController;

public interface Dialog {
	
	List<String>headings;//  = new ArrayList<String>(); //
	List<String>bodies;
	List<String>actions; // - these are buttons, with PATHS & images
	//dialog resource OR configs(look this up!) folder:
		//dialog buttons properties file:
			
	/**
	 * headingImgage - image
	 * bodyText
	 * actionButtons - (image, path)
	 * 
	 * these are then put into heading, body & actions by controller (which pulls these fropm this class). 		
	 */
	
	/*
	private static class ConfirmDialog { //+++++++Make this a mutable class. IE is only constructed when tickled! 
		
		private static ConfirmDialog confirmDialog = null;
		
		private ConfirmDialog(){
			headings.add
		}
	}*/
	
	/*
	class ErrorDialog {
		
		private static ErrorDialog errorDialog = null;
		
		private ErrorDialog(){
			headings = new ArrayList<String>(); 
			headings.add("from error");
		}
		
		public static ErrorDialog getErrorDialog() {
			//create singleton if necessary:
	        if (errorDialog == null) { errorDialog = new ErrorDialog(); }
	        return errorDialog; 
		}
		
		public List<String> showHeadings() {
			//headings.add("from error");
			return headings;
		}
		
	}
	
	
	static class ConfirmDialog extends Dialog{
		
		private static ConfirmDialog confirmDialog = null;
		
		private ConfirmDialog(){
			//headings = new ArrayList<String>(); 
			headings.add("from confirm");
		}
		
		public static ConfirmDialog getConfirmDialog() {
			//create singleton if necessary:
	        if (confirmDialog == null) { confirmDialog = new ConfirmDialog(); }
	        return confirmDialog; 
		}
		
		public List<String> showHeadings() {
			//headings.add("from confirm");
			return headings;
		}
	
	}*/
	
	
}


class ErrorDialog extends Dialog{
	
	private static ErrorDialog errorDialog = null;
	
	private ErrorDialog(){
		headings = new ArrayList<String>(); 
		headings.add("from error");
	}
	
	public static ErrorDialog getErrorDialog() {
		//create singleton if necessary:
        if (errorDialog == null) { errorDialog = new ErrorDialog(); }
        return errorDialog; 
	}
	
	public List<String> showHeadings() {
		//headings.add("from error");
		return headings;
	}
	
}


class ConfirmDialog extends Dialog{
	
	private static ConfirmDialog confirmDialog = null;
	
	private ConfirmDialog(){
		headings = new ArrayList<String>(); 
		headings.add("from confirm");
	}
	
	public static ConfirmDialog getConfirmDialog() {
		//create singleton if necessary:
        if (confirmDialog == null) { confirmDialog = new ConfirmDialog(); }
        return confirmDialog; 
	}
	
	public List<String> showHeadings() {
		//headings.add("from confirm");
		return headings;
	}
	
}

*/


