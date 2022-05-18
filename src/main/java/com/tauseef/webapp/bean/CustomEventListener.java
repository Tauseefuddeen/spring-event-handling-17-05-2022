package com.tauseef.webapp.bean;

public class CustomEventListener implements ApplicationListener<ApplicationEvent> {

	public void onApplicationEvent(ApplicationEvent event) {
		// handling logic
		System.out.println("Event was handled !");
		System.out.println("Event :: " + event.toString());
	}
}
