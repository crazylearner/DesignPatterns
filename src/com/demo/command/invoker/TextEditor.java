package com.demo.command.invoker;

import com.demo.command.commands.Command;

public class TextEditor {
	Command command;
	
	public TextEditor(Command command) {
		this.command = command;
	}
	public void performAction(){
		command.execute();
	}
}
