package com.demo.observer.client;

import com.demo.observer.observers.DialogBoxes;
import com.demo.observer.observers.Notifications;
import com.demo.observer.subject.Button;

public class UserInterface {

	public static void main(String[] args) {
		Button bt = new Button();
		bt.attach(new Notifications(), "click");
		DialogBoxes db = new DialogBoxes();
		bt.attach(db , "click");
		
	//	bt.detach(db, "click");
		bt.click();
	}

}
