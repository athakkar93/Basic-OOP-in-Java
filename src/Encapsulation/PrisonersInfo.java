package Encapsulation;

public class PrisonersInfo {

	public static void main(String[] args) {
		Prisoners p1 = new Prisoners();
		p1.setPrisonerId(666);
		p1.setPrisonerName("Cersei Lannister");
		p1.setPrisonerOffense("Genocide");
		p1.setLengthOfSentence("Forever and then some!");
	
		System.out.println(p1.getPrisonerId() + " " + p1.getPrisonerName() + " " + p1.getPrisonerOffense() + " " + p1.getLengthOfSentence());

		Prisoners p2 = new Prisoners();
		p2.setPrisonerId(111);
		p2.setPrisonerName("Petyr Baelish");
		p2.setPrisonerOffense("Being a creep");
		
		System.out.println("Prisoner ID is " + p2.getPrisonerId() + " His name is " + p2.getPrisonerName() + " He is in jail for " + p2.getPrisonerOffense() + " The lenght of his sentence is " + p2.getLengthOfSentence());
		
		
	}

}
