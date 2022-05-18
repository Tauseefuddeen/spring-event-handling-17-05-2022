package com.tauseef.webapp.bean;

	public class CustomEvent extends ApplicationEvent{

		private static final long serialVersionUID = 1L;

		public CustomEvent(Object source) {
			super(source);
		}

		public String toString() {
			return "--- This is a custom event ---";
		}
}
