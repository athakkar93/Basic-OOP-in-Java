package Abstraction;

public class TestDroid {

	public static void main(String[] args) {
		MobilePhone mobilePhone = new Android();
		mobilePhone.call();
		mobilePhone.text();
		
		RazrGeneration razrGeneration = new Android();
		razrGeneration.games();
		razrGeneration.internet();
		
		Android galaxy = new Android();
		galaxy.fourG();
		galaxy.anAppForEverything();
		galaxy.socialMedia();

	}

}
