package praktikumZadatak4;

import java.util.GregorianCalendar;

public class TestProizvod {
public static void main(String[] args) {
	
	GregorianCalendar datum = new GregorianCalendar();
	datum.set(2007, 11, 15);
	
	PrehrambeniProizvod pp1;
	pp1=new PrehrambeniProizvod("hleb", 37.0, datum);
	
	PrehrambeniProizvod pp2;
	pp2=new PrehrambeniProizvod();
	
	pp2.setCena(120.0);
	pp2.setNaziv("senf");
	
	
	pp1.setCena(37.0);
	pp2.setCena(120.5);
	
	pp1.setNaziv("hleb");
	 pp1.setNaziv("senf");
	 
	 
	
	System.out.println("PROIZVOD 1: " + "NAZIV "+pp1.getNaziv() + " CENA "+pp1.getCena());
	
	System.out.println("PROIZVOD 2: " + "NAZIV "+pp2.getNaziv() + " CENA "+pp2.getCena());
	
}
}
