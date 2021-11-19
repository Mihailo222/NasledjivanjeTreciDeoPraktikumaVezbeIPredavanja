package praktikumZadatak3;

public class Televizor extends KucniAparat {
	int program;
	
	
	public Televizor(String marka, String model, boolean ukljucen, int program) {
		if(marka!=null && model!=null && program>=1 && program<=40) {
			 setMarka(marka); //ja namerno stavio privae da vidim da li klasa nasledjuje atribute
		     setModel(model);
		     this.program=program;
		}else {
			System.out.println("Error");
		}
		}
	
	
	public void promeniNavise() {
		if(program>=1 && program<40)
		      program++;
		if(program==40)
			program=1;
	}
	
	
	public void promeniNanize() {
		if(program>1 && program<=40)
			program--;
		if(program==1)
			program=40;
	}
	
	
	public void ispisi() {
		System.out.println("Marka:"+getMarka());
		System.out.println("Marka:"+getModel());
		System.out.println("Program:"+program);
	}
	
	
	
	
	
	

}
