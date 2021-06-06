package model;

public abstract class Dialog {
	
	//+++++++++++++++DialogButtonText
	public enum ButtonText {
		
		CLOSE("Close"),
		OK("OK");
		
		private final String buttonText;
		ButtonText(String buttonText){
			this.buttonText = buttonText;
		}
		@Override
		public String toString() {
			return buttonText;
		}
	}
}
