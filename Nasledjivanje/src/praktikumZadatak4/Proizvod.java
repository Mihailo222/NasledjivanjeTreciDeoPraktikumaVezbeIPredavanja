package praktikumZadatak4;

public class Proizvod {
	String naziv;
	double cena;
	
	
	public Proizvod() {
		naziv="nepoznat";
		cena=0.0;
	this.naziv=naziv;
		this.cena=cena;
	}
 
	
	public Proizvod(String naziv, double cena) {
		if(naziv!=null && !naziv.isEmpty()) {
			this.naziv=naziv;
			this.cena=cena;
		}else {
			System.out.println("Error");
			this.naziv="nepoznat";
			this.cena=0.0;
		}
	}
	
  public String getNaziv() {
	  return naziv;
  }
  
  public void setNaziv(String naziv) {
	  if(naziv!=null)    this.naziv=naziv;
	  else     System.out.println("Error");
  }
  
  
  public double getCena() {
	  return cena;
  }
  
  public void setCena(double cena) {
	  if(cena>0)   this.cena=cena;
	  else  System.out.println("Error");
  }
  
  
  
  
  
  
  
  
	
	
	

}
