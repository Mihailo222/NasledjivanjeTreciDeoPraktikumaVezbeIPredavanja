package Predavanje6;

public class Student extends Osoba{
	//zbog extends-nasledjuje metode, atribute... od klase Osoba

	/*public Student(String ime, String prezime, String adresa) {
		super(ime, prezime, adresa);
		// TODO Auto-generated constructor stub
	}*/

   public Student() {
	   
   }

	//rezerviana rec extends!
	private String fakultet;
	private double prosek;
	
	public void postaviFakultet(String fakultet) {
		if(fakultet!=null && !fakultet.trim().isEmpty())
			this.fakultet=fakultet;
		else
			System.out.println("Error");
	}
	
	public void postaviProsek(double prosek) {
		if(prosek>=6 && prosek<=10)
		this.prosek=prosek;
		else
			System.out.println("Greska");
	}
	
	public String vratiFakultet() {
		return fakultet;
	}
	
	public double vratiProsek() {
		return prosek;
	}
	
	
	void prikazi() {
		System.out.println("Ime:"+vratiIme()); //ne moras ni kao static metodu, ni preko objekta, 
		                                       // ni nista, vec je samo pozoves kao da pozivas u metodii Osoba
		
		System.out.println("Prezime:"+vratiPrezime());
		System.out.println("Adresa:"+vratiAdresu());
		System.out.println("Prosek"+prosek);
		System.out.println("Fakultet:"+fakultet);
			}

	
	
	//hocemo i metodu toString da redefinisemo i da je spojimo sa Studentom
	/*
	@Override
	public String toString() {
		return "Student [fakultet=" + fakultet + ", prosek=" + prosek + "]";
	}   */
	//metoda toStirng klase Student ne obuhvata parametre klase Osoba
    
	public String toString() {
		return super.toString()+"Fakultet: "+vratiFakultet()+" Prosek; "+vratiProsek() +"]";
		//isto stavljam vratiFakultet() i vratiProsek() za svaki slucaj, jer su u pitanju private Stringovi
   //super znaci da nasledjuje toString metodu iz svoje nadklase	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
