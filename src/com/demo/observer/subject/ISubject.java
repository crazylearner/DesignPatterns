package com.demo.observer.subject;

import com.demo.observer.observers.IObserver;

public interface ISubject {
	public void attach(IObserver obs, String event);
	public void detach(IObserver obs, String event);
	public void notifyObservers(String event);
}
