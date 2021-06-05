package model;

public abstract class Dialog {
	
	
	public enum CloseButtonText {
		CLOSE_BUTTON ("Close");
		
		private final String buttonText;
		CloseButtonText(String buttonText){
			this.buttonText = buttonText;
		}
		@Override
		public String toString() {
			return buttonText;
		}
	}
}
