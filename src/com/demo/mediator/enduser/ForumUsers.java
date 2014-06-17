package com.demo.mediator.enduser;

import com.demo.mediator.colleaugues.GmailUser;
import com.demo.mediator.colleaugues.MailUser;
import com.demo.mediator.colleaugues.YahooUser;
import com.demo.mediator.mediators.JavaMailingList;
import com.demo.mediator.mediators.MailingListMediator;

public class ForumUsers{

	public static void main(String[] args) {
		MailingListMediator javaMailingList = new JavaMailingList();
		//User 1
		MailUser gmail = new GmailUser("iamgmail@gmail.com");
		gmail.login();
		javaMailingList.subscribe(gmail); // He subscribes
		
		//User 2
		MailUser yahoo = new YahooUser("iamyahoo@yahoo.com");
		yahoo.login();
		javaMailingList.subscribe(yahoo); // He subscribes
		
		
		//gmail user sends a question to the Java Mailing List
		gmail.sendMailToMailingList(javaMailingList, "How to excel in Java??!!");
	}

}
