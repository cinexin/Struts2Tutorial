package org.migue.learning.struts.action;

import org.migue.learning.struts.service.TutorialFinderService;

public class TutorialAction {
	private String bestTutorialSite ;
	private String language;
	
	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String execute() {
		TutorialFinderService tutorialFinderService = new TutorialFinderService();
		setBestTutorialSite(tutorialFinderService.getBestTutorialSite(getLanguage()));
		System.out.println("Language requested: " + getLanguage());
		System.out.println("Best tutorial site: " + bestTutorialSite);
		return "success";
	}

	public String addTutorial() {
		System.out.println("addTutorial method called");
		return "success";
	}
	
	public String getTutorial() {
		System.out.println("getTutorial method executed");
		return "success";
	}
	
	public String getBestTutorialSite() {
		return bestTutorialSite;
	}

	public void setBestTutorialSite(String bestTutorialSite) {
		this.bestTutorialSite = bestTutorialSite;
	}
}
