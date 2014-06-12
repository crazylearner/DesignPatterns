package com.demo.command.commands;

import com.demo.command.reciever.TextCutter;

public class CutCommand implements Command {
	TextCutter tCut = new TextCutter();
	
	@Override
	public void execute() {
		tCut.cut();
	}

}
