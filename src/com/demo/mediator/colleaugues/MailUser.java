package com.demo.mediator.colleaugues;

import com.demo.mediator.mediators.MailingListMediator;

public abstract class MailUser {
	protected final String emailID; 
	
	public MailUser(String emailID) {
		this.emailID = emailID;
	}

	public String getMailId() {
		if(emailID != null){
			return emailID;
		}else{
			return "Login First";
		}
	}
	
	public abstract void login();
	public abstract void sendMailToMailingList(MailingListMediator mailingList, String message);
}
