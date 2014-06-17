package com.demo.mediator.colleaugues;

import com.demo.mediator.mediators.MailingListMediator;

public class YahooUser extends MailUser {
	public YahooUser(String emailID) {
		super(emailID);
	}

	@Override
	public void login() {
		System.out.println(emailID + " logged in using Yahoo! ID.");
	}

	@Override
	public void sendMailToMailingList(MailingListMediator mailingList, String message) {
		System.out.println("Yahoo user sending mail to mailing list users");
		mailingList.sendMail(message);	
	}
}
