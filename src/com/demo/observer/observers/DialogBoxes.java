package com.demo.observer.observers;

public class DialogBoxes implements IObserver {

	@Override
	public void onNotify(String event) {
		if("click".equals(event)){
			openDialog(event);
		}
	}

	private void openDialog(String event) {
		System.out.println("Dialog opened for " + event + " event");
	}

}
