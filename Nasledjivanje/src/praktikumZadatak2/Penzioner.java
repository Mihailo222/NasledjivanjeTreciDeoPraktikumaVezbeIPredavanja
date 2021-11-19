package praktikumZadatak2;

public class Penzioner extends Osoba {
	double penzija;
	
	
	public Penzioner(String ime, String prezime, String jmbg, double penzija) {
		if(ime!=null && prezime!=null && jmbg!=null && penzija>0) {
			this.ime=ime;
			this.prezime=prezime;
			this.jmbg=jmbg;
			this.penzija=penzija;
		}else
			System.out.println("Error");
	}
	
	public Penzioner() {
		
	}
	
	public void ispisi() {
		System.out.println("ime:"+ime);
		System.out.println("prezime:"+prezime);
		System.out.println("jmbg:"+jmbg);
		System.out.println("penzija:"+penzija);
	}

}
