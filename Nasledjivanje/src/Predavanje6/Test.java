package Predavanje6;

public class Test {

	public static void main(String[] args) {
		Osoba nekaOsoba=new Osoba("Ana", "Persic", "Jove Ilica, 154");
		nekaOsoba.ispisi();//ime, prez, adresa
		//Student nekiStudent;
		//nekiStudent=new Student("Ana", "Persic", "Jove Ilica, 154");
		Student nekiStudent;
		nekiStudent=new Student();
		nekiStudent.postaviIme("Mika");
		nekiStudent.postaviPrezime("Mikic");
		nekiStudent.postaviAdresu("Vojvode Dobrnjca");
		nekiStudent.postaviFakultet("FON");
		nekiStudent.postaviProsek(9.15);
		
		System.out.println(nekiStudent);//Osoba [ime=Mika, prezime=Mikic, adresa=Vojvode Dobrjca ]Fakultet: FON Prosek; 9.15]
		//OBJEKAT KLASE OSOBA= OBJEKAT NJENE POTKLASE
		Osoba nekaOsobaKojaJeStudent=nekiStudent;
		System.out.println(nekaOsobaKojaJeStudent);//Osoba [ime=Mika, prezime=Mikic, adresa=Vojvode Dobrjca ]Fakultet: FON Prosek; 9.15]
		
		
		//-----------------------------------------------------------------------------------------
		
		Osoba o = new Osoba();
		o.postaviIme("Pera");
		o.postaviPrezime("Peric");
		o.postaviAdresu("Jove Ilica 154 Beograd");
		
		Student s= new Student();
		s.postaviIme("Mika");
		s.postaviPrezime("Mikic");
		s.postaviAdresu("Vojvode Stepe 112");
		s.postaviFakultet("FON");
		s.postaviProsek(8.5);
		//s.ispisi(); //ISPISUJE IZ OSOBE
		//redefinisanje metoda - ista metoda se zamenjuje za drugu klasu
		//s.ispisi();
		
		//svaka klasa moze imati samo 1 nadklasu tj. 1 roditeljsku tj. klasa student ne moze da nasledjuje od neke 2 klasa ili vise
		System.out.println(s.toString());//ISTO
		System.out.println(s);//ISTO KAO OVO GORE; IMPLEMENTIRANA TOSTRING METODA
		
		
		//----------------------------------------------------------------------------------------------------------------------------------
		
		Osoba o2=new Student();
		//promenljiva tipa Osoba u klasi Student() -moguce jer se
		//klase nasledjuju
		o2.postaviIme("Zika");
		o2.postaviPrezime("Zikic");
		o2.postaviAdresu("Krunska 112");
		// da je bilo =new Osoba() isto ne bi moglo da se poziva iz Studenta
		//ne mogu da se pozovu metode klase Student, vec samo od Osobe   //OSOBA-SIRA/ STUDENT-UZA
		//iako je o2 objekat klase student, ovim objektom se mogu 
		//pozvati samo one metode koje student nasledjuje od object, 
		//a ne specificne metode klase student
		System.out.println(o2); //Osoba [ime=Zika, prezime=Zikic, adresa=Krunska 112]Fakultet: null Prosek; 0.0]
		//ovde poziva toString metodu iz podklase, zato i ispisuje i prosek 0.0
		
		
		//-------------------------------------------------------------------------------------------------------------------------------------
		
		
		     //OBJEKAT S2 SADA SADRZI I ATRIBUTE OD O2; O2 SE PRIDRUZUJE S2
		Student s2 = (Student) o2; //objekat klase student se pridruzuje promenljivoj s2
		
		//novom objektu s2 (KLASE STUDENT) pridruziti atribute objekta O2(KLASE OSOBA)
	
		s2.postaviProsek(9.2);
		s2.postaviFakultet("ETF");
		System.out.println(s2);  //Osoba [ime=Zika, prezime=Zikic, adresa=Krunska 112]Fakultet: ETF Prosek; 9.2]
	//----------------------------------------------------------------------------------------------------------------------------------------
		  
		//POREDJENJE OBJEKATA
		 
		Osoba o3 = new Osoba();
		o3.postaviIme("Pera");
		o3.postaviPrezime("Peric");
		System.out.println(o3.equals(o)); //ispisuje true ili false
	
		if(o.equals(o3))
			System.out.println("Ista osoba!");
		else
			System.out.println("Nije ista osoba!");
	
	

	}

}
