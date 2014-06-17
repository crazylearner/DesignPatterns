package com.demo.observer.subject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import com.demo.observer.observers.IObserver;

public class Button implements ISubject{

	Map<String, List<IObserver>> observersMap = new HashMap<String, List<IObserver>>();
	
	
	@Override
	public void attach(IObserver obs, String event) {
		List<IObserver> observerList;
		observerList = observersMap.get(event);
		if(observerList == null){
			observerList = new ArrayList<>();
		}
		observerList.add(obs);
		observersMap.put(event, observerList);
	}

	@Override
	public void detach(IObserver obs, String event) {
		List<IObserver> observerList = observersMap.get(event);
		if(observerList!=null && observerList.contains(obs)){
			observerList.remove(obs);
		}
	}

	@Override
	public void notifyObservers(String event) {
		Iterator<IObserver> iterator = observersMap.get(event).iterator();
		IObserver observer;
		while(iterator.hasNext()){
			observer = iterator.next();
			observer.onNotify(event);
		}
	}
	
	public void click(){
		System.out.println("Button Clicked");
		notifyObservers("click");
	}
	

}
