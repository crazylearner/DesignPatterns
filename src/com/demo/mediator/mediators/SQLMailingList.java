package com.demo.mediator.mediators;

import com.demo.mediator.colleaugues.MailUser;

public class SQLMailingList extends MailingListMediator {

	private final String mailingListId = "sql";
	
	@Override
	public String subscribe(MailUser mailUser) {	
	 mailingList.add(mailUser);
	 return mailingListId;
	}

}

