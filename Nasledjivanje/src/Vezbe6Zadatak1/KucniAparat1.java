package Vezbe6Zadatak1;

public class KucniAparat1 {
	protected boolean ukljucen;
	
	//menja se iz private u protected, vidljiv za klase koje nasledjuju ovu klasu
	//znaci-vidjen je u klasama koje nasledjuju protected atribut
	private String markaIModel;
	
	
	public KucniAparat1(boolean ukljucen, String markaIModel) {
		this.ukljucen=ukljucen;
		this.markaIModel=markaIModel;
		//parametre zovemo isto kao atribute-dobra praksa
	}
	/*public KucniAparat1() {
		
	}*/
	
	public void ukljuciIskljuci() {
		if(ukljucen==false)
			ukljucen=true;
		else
			ukljucen=false;
	}
	
	
	public void prikazi() {
		System.out.println("Aparat ukljucen: "+ukljucen);
		System.out.println("Marka i model"+markaIModel);
	}
    
	
	public String toString() {
		return "MARKA I MODEL: " + markaIModel + " UKLJUCEN: "+ukljucen;
	}
	//redefinisati javnu metodu equals da ona prvo proverava da li je
	//dati objekat klase KucniAparat1, pa onda vraca true ako su isti marka i model, a false ako
	//nisu isti
	public boolean equals(Object obj) {
		if(!(obj instanceof KucniAparat1)) return false;
		//ako objekat nije instanca/pripadnik klase KucniAparat1
		//vrati mi false
		//else
	KucniAparat1 drugiAparat =(KucniAparat1)obj; 
	//custom-u zagradu stavi tip objekta i predvaras referencu obj(neki objekat Klase Objects)
	//znaci:pretvaramo ga u objekat klase Objects zato sto hocemo da pretvorimo referncu
	//tj objekat klase Object u obj klase KucniAparat1 zato sto hocemo da pristupimo njegovim 
	//atributima
	
	if(markaIModel.equals(drugiAparat.markaIModel)) return true;//ovo obavezno radi sa equals
	else return false;
	}
	
	//ako primenimo == na objektu, mi proveravamo da li 2 reference 
	//koje pokazuju na neke vrednosti pokazuju na iste objekte
	
	
	//ali zato sa equals poredimo vrednosti objekata
	
	
	
	
}
