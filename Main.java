public class Main{
		
	public static void main(String[] args){
		
		Teilnehmer teilnehmer = new Teilnehmer("Charles Darwin", "evoli@yahoo.com", "Mitglied");
		Referent referent = new Referent("Neo", "neo@matrix.jp", "Nebukadnezar");
		Workshop workshop = new Workshop(117, "Matrix-Tutorial", "29.05.15", referent);
		Rahmenprogramm rahmenprogramm = new Rahmenprogramm("König der Löwen", "25.05.15", "18:00", "Schauspielhaus Hamburg");
	
		System.out.println(teilnehmer.toString() + "\n\nBesucht folgende Veranstaltungen:\n" + workshop.toString()
				+ "\n\nUnd besucht folgende Rahmenprogramme:" + rahmenprogramm.toString());
	
	}
}