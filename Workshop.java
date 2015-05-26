public class Workshop{
		
	int nummer;
	String bezeichnung;
	String datum;
	Referent referent;
		
	public Workshop(int nummer, String bezeichnung, String datum, Referent referent){
			this.nummer = nummer;
			this.bezeichnung = bezeichnung;
			this.datum = datum;
			this.referent = referent;
	}
		
	public String toString(){
			return "Nummer: \t" + nummer + "\nBezeichnung:\t" + bezeichnung + "\nDatum:\t\t" + datum + "\n\nVon:\n" + referent.toString();
	}
}