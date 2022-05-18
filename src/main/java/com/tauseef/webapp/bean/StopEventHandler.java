package com.tauseef.webapp.bean;


//Event raised when an ApplicationContext is stopped.
public class StopEventHandler implements ApplicationListener<ContextStoppedEvent>{

	public void onApplicationEvent(ContextStoppedEvent event) {
		System.out.println("Application Context stoped event is received !");		
	}
}
