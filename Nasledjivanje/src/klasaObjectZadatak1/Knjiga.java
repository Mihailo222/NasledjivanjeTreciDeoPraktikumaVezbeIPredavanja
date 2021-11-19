package klasaObjectZadatak1;

public class Knjiga {
	String naslov;
	String autor;
	String ISBN;
	
	public String getNaslov() {
		return naslov;
	}
	
	public String getAutor() {
		return autor;
	}
	
	public String getISBN() {
		return ISBN;
	}
	
	
	public void setNaslov(String naslov) {
		this.naslov=naslov;
	}
	
	
	public void setAutor(String autor) {
		this.autor=autor;
	}
	
	
	public void setISBN(String ISBN) {
		this.ISBN=ISBN;
	}
	
	//redefinisanje toString metode
	public String toString() {
		return "["+ "Naslov: "+naslov + " Autor: "+ autor + "ISBN: "+ ISBN +"]";
	}
	
	//redefinisati metodu equals
	
	public boolean equals(Object o) {
		//kreirajmo objekat klase knjiga i konvertujmo ga  iz Object u Knjiga 
		
		//konvertovanje je moguce  samo ako se unese objekat klase knjiga
		
		
		Knjiga k=(Knjiga) (o); 
		
		if(ISBN.equals(k.getISBN())) return true;
		else return false;
		}
	}







