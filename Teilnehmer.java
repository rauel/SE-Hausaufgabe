public class Teilnehmer{
		
	String name;
	String email;
	String status;
		
	public Teilnehmer(String name, String email, String status){
			this.name = name;
			this.email = email;
			this.status = status;
	}
		
	public String toString(){
			return "Name: \t\t" + name + "\nE-Mail:\t\t" + email + "\nStatus:\t\t" + status;
	}

}