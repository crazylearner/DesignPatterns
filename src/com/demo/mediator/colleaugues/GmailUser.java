package com.demo.mediator.colleaugues;

import com.demo.mediator.mediators.MailingListMediator;

public class GmailUser extends MailUser {
	public GmailUser(String emailID) {
		super(emailID);
	}

	@Override
	public void login() {
		System.out.println(emailID + " logged in using gmail ID!");
	}

	@Override
	public void sendMailToMailingList(MailingListMediator mailingList, String message) {
		System.out.println("Gmail user sending mail to mailing list users");
		mailingList.sendMail(message);
	}
}
