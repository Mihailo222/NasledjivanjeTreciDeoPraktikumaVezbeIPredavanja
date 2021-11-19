package praktikumZadatak2;

public class Test {
	public static void main(String[] args) {
		
		Osoba o;
		Djak dj;
		Penzioner p;
		o=new Osoba("Pera", "Peric","1212007710567");
		dj=new Djak("Mika", "Lazic", "1010000710078",5.0);
		p=new Penzioner("Zika", "Zikic", "0909944710078", 23400.0);
		
		//SVE SU ISTE METODE ZA SVE I ZA DJAKA I ZA PENZIONERA KAO I ZA OSOBU, 
		//SAMO SE RAZLIKUJU VFEDNOSTI
		
		
		o.ispisi();
		dj.ispisi();
		p.ispisi();
		
		
		
		
		
		
		
	}

}
