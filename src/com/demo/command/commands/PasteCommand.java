package com.demo.command.commands;

import com.demo.command.reciever.TextPaster;

public class PasteCommand implements Command {
	TextPaster tPaste = new TextPaster();
	
	@Override
	public void execute() {
		tPaste.paste();
	}

}
