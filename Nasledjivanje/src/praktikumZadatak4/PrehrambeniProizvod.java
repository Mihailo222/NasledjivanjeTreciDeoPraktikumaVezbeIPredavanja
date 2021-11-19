package praktikumZadatak4;

import java.util.GregorianCalendar;

public class PrehrambeniProizvod extends Proizvod {
	GregorianCalendar rokTrajanja;
	
	public PrehrambeniProizvod() {
		super();                      //NASLEDJIVANJE OD PRAZNOG KONSTRUJTORA; NASLEDI CEO PRZAN KONSTRUKTOR PRETHODNE KLASE
		this.rokTrajanja=new GregorianCalendar();//sadasnji datum
		}
	
	
	
	
	
	
	public PrehrambeniProizvod(String naziv, double cena, GregorianCalendar rokTrajanja) {
		  super(naziv, cena);      // NASLEDI PONASANJA SA PARAMETRIMA NAZIV, CENA
		  if(rokTrajanja!=null && rokTrajanja.after(new GregorianCalendar())) {
			  this.rokTrajanja=rokTrajanja;
		  }else {
			  System.out.println("Error");
			  this.naziv="nepoznat";
			  this.cena=0.0;
			  this.rokTrajanja=new GregorianCalendar();
		  }
		}
	
	
	
	
	
	
	
	
	

	
	
	
	
}
