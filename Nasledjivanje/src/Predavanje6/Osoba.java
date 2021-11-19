package Predavanje6;

import java.util.Objects;

public class Osoba {
	
	private String ime="nepoznato";
	private String prezime="nepoznato";
    private String adresa="nepoznato";
    
    
    //konstruktor
    
    public Osoba(String ime, String prezime, String adresa) {
    	this.ime=ime;
    	this.prezime=prezime;
    	this.adresa=adresa;
    }
    public Osoba() {
    	
    }
	
    
    public void postaviIme(String ime) {
    	
    	if(ime!=null && !ime.trim().isEmpty())
    		this.ime = ime;
    	else
    		System.out.println("Error");
    }
    
    public void postaviPrezime(String prezime) {
    	if(prezime!=null && !prezime.isEmpty())
    		this.prezime=prezime;
    	else
    		System.out.println("Error");
    }
    
    public void postaviAdresu(String adresa) {
    	if(adresa!=null && !adresa.trim().isEmpty())
    		this.adresa=adresa;
    	else
    		System.out.println("Error");
    		}
    
    
    public String vratiIme() {
    	return ime;
    }
    
    public String vratiPrezime() {
    	return prezime;
    }
    
    
    public void ispisi() {
    System.out.println("Ime osobe je:"+ime);
    System.out.println("Prezime osobe je:"+prezime);
    System.out.println("Adresa osobe je:"+adresa);
    }
    
    
    
    
public String vratiAdresu() {
    	return adresa;
    }
    
        //METODE KLASE OBJECTS-TOSTRING I EQUALS
    
    
    
    //redefinisana toString metoda
	@Override
	public String toString() {
		return "Osoba [ime=" + vratiIme() + ", prezime=" + vratiPrezime() + ", adresa=" + vratiAdresu() + "]";
		//od ime, prezime i adresa za svaki slucaj vracam metode jer su u pitanju private Stringovi(a generisano mi je bilo samo ime, prezime, adresa)
		
	}



	@Override
	public boolean equals(Object obj) {// class Objects, znaci da svi obj. iz svih klasa mogu biti u ovoj metodi, jer je par. objekat klase Objects
		if (this == obj) //poredi adrese 2 objekta
			return true;//ako su jednake, isti je objekta i vrati true
		if (obj == null)
			return false;// ako nisu, vrati false
		if (getClass() != obj.getClass())//poredimo klasu preko metode getClass()
			return false;
		Osoba other = (Osoba) obj;//2. objekat se pretvara u objekat klase Osoba
		//sada se porede pojedinacni atributi objekta
		return Objects.equals(adresa, other.adresa) && Objects.equals(ime, other.ime)
				&& Objects.equals(prezime, other.prezime);
	}
    
	//izgeneristai ovo ako ne kaze nista posebno
	//moze doci i da pisemo sami neku specificnu proveru
	
	
	
	
	
    
    
    

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

}
