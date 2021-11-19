package Vezbe6Zadatak1.proba;

import Vezbe6Zadatak1.KucniAparat1;
import Vezbe6Zadatak1.Televizor1;

//moramo importovati da bi bilo vidljivo u ovom potpaketu

public class ProbaKucniAparat1 {
public static void main(String[] args) {
	KucniAparat1 aparat1;
	aparat1=new KucniAparat1(true, "Laptop Acer A315");
	
	KucniAparat1 aparat2;
	aparat2=new KucniAparat1(true, "Laptop Acer A315");
	
	
	//-----------------------------------------------------------
	           
	              //PRIMENA EQUALS METODE//
	
	
	if(aparat1.equals(aparat2))
		System.out.println("Jednaki aparati");
	else
		System.out.println("Nisu jednaki");
	//-----------------------------------------------------------
	System.out.println("                        ");
	
	
	aparat1.ukljuciIskljuci();
	aparat2.ukljuciIskljuci();
	
	aparat1.prikazi();
	System.out.println("        ");
	aparat2.prikazi();
	System.out.println("        ");
	
	//--------------------------------------------------------------------
	      
	       //NAPRAVI REFERENCU KLASE KucniAparat I DODELI JOJ televizor
	/*
	Televizor1 tv;//=new Televizor1(true, )
	tv=new Televizor1(true, "Samsung UE40", 1);
	*/
	
	KucniAparat1 tv=new Televizor1(false, "Samsung UE40", 2);
	//kreirali smo objekat televizor koji smo dodelili 
	//promenljivoj tipa KucniAparat
	//imamo problem sa programom, jer KucniAparat1 nema taj atribut; sve ostalo radi
	//custom
	((Televizor1)tv).promeniProgram(5);
	//***********************************************************************
	//proba 
	System.out.println("        ");
	System.out.println("        ");
	System.out.println("        ");
	Televizor1 tv2=(Televizor1)tv;
	if(tv2==tv) System.out.println("tv2 i tv su isti objekat u memoriji");
	else System.out.println("Objekti nisu isti");
	System.out.println("        ");
	System.out.println("        ");
	System.out.println("        ");
	
	
	//-----------------------------------------------------------------------
	tv.ukljuciIskljuci();
	//tv.promeniProgram(35); //ne radi
	tv.prikazi();//ali za tv imamo i program-redefinisimo ovu metodu
	//stampa mi i program: 1--> to nam je iz parametra gore; ovo se onosi na tv
	//pozvali smo prikazi od kucnog aparata, ali je java pametna pa je 
	//pozvala od televizora 
	
	System.out.println("   ");
	//TO STRING(OBJECTS)
	System.out.println(aparat1);//Vezbe6Zadatak1.KucniAparat28424...
	//redefinisimo metodu toString u klasi KUcniAParat1
	//System.out.println(aparat1.toString());
	// u System.out.println je implementirana toString metoda
	System.out.println("   ");
	System.out.println(tv);//fali nam program -redef. u klasi Televizor1
	
	
	
	
	
	
	
	
	
	
	
	
}
}
