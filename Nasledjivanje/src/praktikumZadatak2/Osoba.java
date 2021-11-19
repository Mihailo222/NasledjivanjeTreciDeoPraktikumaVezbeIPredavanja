package praktikumZadatak2;

public class Osoba {
String ime="N";
String prezime="N";
String jmbg;

public Osoba(String ime, String prezime, String jmbg) {
	if(ime!=null && prezime!=null && jmbg!=null) {
	this.ime=ime;
	this.prezime=prezime;
	this.jmbg=jmbg;
	}else
		System.out.println("Error");
}


public Osoba() {
	
}
//moras napraviti prazan konstruktor za poziv u druge klase i konstruktore


void ispisi() {
	System.out.println("Ime: "+ime);
	System.out.println("Prezime: "+prezime);
	System.out.println("Jmbg: "+jmbg);
}


//SVUDA MOZES ICI I KOD KONSTRUKTORA SVE ISPIES PARAMETRE 
//OND super();
//onda ono sto ti fali
//to i kod metode ispisi moze


}
