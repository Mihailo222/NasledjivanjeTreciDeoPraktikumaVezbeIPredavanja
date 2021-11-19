package praktikumZadatak2;

public class Djak extends Osoba{
	double prosecnaOcena;
	
	
	public Djak(String ime, String prezime, String jmbg, double prosecnaOcena) {
		if(ime!=null && prezime!=null &&jmbg!=null && prosecnaOcena>=1.0 && prosecnaOcena<=5.0){
			this.ime=ime;
			this.prezime=prezime;
			this.jmbg=jmbg;
			this.prosecnaOcena=prosecnaOcena;
			}else
				System.out.println("Error");
	
	}
	
	public Djak() {
		}
	
	
	
	
	
	public void ispisi() {
		System.out.println("ime:"+ime);
		System.out.println("prezime:"+prezime);
		System.out.println("jmbg:"+jmbg);
		System.out.println("prosecna ocena:"+prosecnaOcena);
	}
	
	
	
	

}
