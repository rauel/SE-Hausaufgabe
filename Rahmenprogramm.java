public class Rahmenprogramm{
		
	
	String bezeichnung;
	String datum;
	String zeit;
	String ort;
		
	public Rahmenprogramm(String bezeichnung, String datum, String zeit, String ort){
			
			this.bezeichnung = bezeichnung;
			this.datum = datum;
			this.zeit = zeit;
			this.ort = ort;
	}
		
	public String toString(){
			return "\nBezeichnung:\t" + bezeichnung + "\nDatum:\t\t" + datum + "\nUhrzeit:\t" + zeit + "\nOrt:\t\t" + ort;
	}
}