package org.migue.learning.struts.service;

public class TutorialFinderService {

	public String getBestTutorialSite(String language) {
		if (language.equalsIgnoreCase("java"))
			return "Java Brains";
		else
			return "Language not supported yet!";
	}
}
