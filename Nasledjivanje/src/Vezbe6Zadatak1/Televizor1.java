package Vezbe6Zadatak1;

public class Televizor1 extends KucniAparat1 {

	private int program;
	
	
	public Televizor1(boolean ukljucen, String markaIModel, int program) {
		super(ukljucen, markaIModel);//znaci kao da sam pozvao konstruktor od
		                             //KucnogAparata1
	//	this.ukljucen=ukljucen;
		//ne mora, jer nasledjuje
		if(program<1 ||program>40) {
			this.program=1;
		    System.out.println("Error");
				}else
					this.program=program;
		// java trzaila da pozove konstruktor superklase i da ga inicijalizujemo
	   //mi dodali program	
	}
	
	
	public void promeniProgram(int noviProgram) {
		if(program>=1 && program<40) {
		    this.program=noviProgram;
		}else
			System.out.println("Error");
		}
	
	public void prikazi() {
		super.prikazi();//nasledi atribute iz klase KucniAparat1, 
		                // jer ne mozes da pristupis private atributima
		System.out.println("Program: "+program);
	}
	
	public String toString() {
		return super.toString() + " PROGRAM: " + program;
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
}