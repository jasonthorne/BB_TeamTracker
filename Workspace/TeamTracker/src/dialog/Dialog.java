package dialog;

public interface Dialog {
	
	public enum HeadingText {
			
		CLOSE("Close"),
		OK("OK");
		
		private final String text;
		private HeadingText(String text) {this.text = text;} //set text
		@Override public String toString() {return text;} //return text
	}	
	
	
	public enum BodyText {
		
		EMPTY_NAME_OR_PSWD("Enter Username and Password"),
		OK("OK");
		
		private final String text;
		private BodyText(String text) {this.text = text;} //set text
		@Override public String toString() {return text;} //return text
	}	
	
	
	public enum ButtonText {
		
		CLOSE("Close"),
		OK("OK");
		
		private final String text;
		private ButtonText(String text) {this.text = text;} //set text
		@Override public String toString() {return text;} //return text
	}
}
