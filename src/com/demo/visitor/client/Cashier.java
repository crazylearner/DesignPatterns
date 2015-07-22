package com.demo.visitor.client;

import java.util.HashMap;
import java.util.Map;

import com.demo.visitor.visitable.GroceryBill;
import com.demo.visitor.visitors.IVisitor;
import com.demo.visitor.visitors.MoneyVisitor;
import com.demo.visitor.visitors.SodexoVisitor;

public class Cashier {
	public static void main(String[] args) {
		Map<String, Float> billMap = new HashMap<String, Float>();
		billMap.put("Biscuit1", 10.90F);
		billMap.put("Biscuit2", 11.10F);
		
		GroceryBill bill = new GroceryBill(billMap);
		IVisitor sVisitor = new SodexoVisitor();
		bill.accept(sVisitor);
		System.out.println("For Sodexo Visitor: " + sVisitor.getBillAmount());
		
		GroceryBill bill2 = new GroceryBill(billMap);
		IVisitor sVisitor2 = new MoneyVisitor();
		bill2.accept(sVisitor2);
		System.out.println("For Money Visitor: " + sVisitor2.getBillAmount());
	}

}
