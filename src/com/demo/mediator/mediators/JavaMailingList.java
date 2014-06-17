package com.demo.mediator.mediators;

import com.demo.mediator.colleaugues.MailUser;

public class JavaMailingList extends MailingListMediator {
	private final String mailingListId = "java";
	
	@Override
	public String subscribe(MailUser mailUser) {	
		mailingList.add(mailUser);
		return mailingListId;
	}
}
