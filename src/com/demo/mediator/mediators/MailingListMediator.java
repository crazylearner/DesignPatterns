package com.demo.mediator.mediators;

import java.util.ArrayList;
import java.util.List;

import com.demo.mediator.colleaugues.MailUser;

public abstract class MailingListMediator {
	
	protected List<MailUser> mailingList;
	
	public MailingListMediator() {
		this.mailingList = new ArrayList<MailUser>();
	}
	
	public void sendMail(String message){
		for(MailUser mUser:mailingList){
			System.out.println("Mail message: '"+message+"' sent to "+ mUser.getMailId());
		}
	}
	public abstract String subscribe(MailUser mailUser);

}
