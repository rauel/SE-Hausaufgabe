public class Referent{
		
	String name;
	String email;
	String firma;
		
	public Referent(String name, String email, String firma){
			this.name = name;
			this.email = email;
			this.firma = firma;
	}
		
	public String toString(){
			return "Name: \t\t" + name + "\nE-Mail:\t\t" + email + "\nFirma:\t\t" + firma;
	}
	
	
	
	
	
	public static void main(String[] args) {
		
		Referent referent = new Referent("Neo", "neo@matrix.jp", "Nebukadnezar");
		referent.toString();
	}
}