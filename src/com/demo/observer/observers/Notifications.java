package com.demo.observer.observers;

public class Notifications implements IObserver {
	String source;
	
	@Override
	public void onNotify(String event) {
		if("click".equals(event)){
			showNotification(event);
		}
	}

	private void showNotification(String event) {
		System.out.println("Notification thrown for "+ event + " event!");
	}

}
