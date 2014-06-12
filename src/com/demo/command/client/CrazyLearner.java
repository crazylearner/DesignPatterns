package com.demo.command.client;

import com.demo.command.commands.Command;
import com.demo.command.commands.CutCommand;
import com.demo.command.commands.PasteCommand;
import com.demo.command.invoker.TextEditor;

public class CrazyLearner {
	
	public static void main(String[] args){
		TextEditor te;
		Command cutCommand = new CutCommand();
		
		te = new TextEditor(cutCommand);
		te.performAction();
		
		Command pasteCommand = new PasteCommand();
		te = new TextEditor(pasteCommand);
		te.performAction();
	}

}
