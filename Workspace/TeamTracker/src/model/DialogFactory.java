package model;

public class DialogFactory {
	
	public DialogFactory(){
		
		
	}
	
	public void test() {
		System.out.println(ErrorDialog.getErrorDialog().showHeadings());
		System.out.println(ConfirmDialog.getConfirmDialog().showHeadings());
		////// fixed!! :PSystem.out.println("uh oh! " + ConfirmDialog.getConfirmDialog().);
	}

}
