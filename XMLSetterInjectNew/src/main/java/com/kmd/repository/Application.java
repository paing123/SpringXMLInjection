package com.kmd.repository;

public class Application {

	private ApplicationUser applicationUser2;

	public Application() {
	}

	/*
	 * public Application(ApplicationUser applicationUser2) {
	 * System.out.println("This is constructor injection"); this.applicationUser =
	 * applicationUser2; }
	 */
	
	public void setApplicationUser(ApplicationUser applicationUser) {
		System.out.println("This is in Setter Injection");
		this.applicationUser2 = applicationUser;
	}

	@Override
	public String toString() {
		return "Application [applicationUser=" + applicationUser2 + "]";
	}
}