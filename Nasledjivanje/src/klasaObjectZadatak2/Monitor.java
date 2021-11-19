package klasaObjectZadatak2;

public class Monitor {

String marka;
String model;

double velicinaEkrana;

public void setMarka(String marka) {
	if(marka!=null)
		this.marka=marka;
	else
		System.out.println("Error");
}
	
	
	
public void setModel(String model) {
	if(model!=null)
		this.model=model;
	else
		System.out.println("Error");
}	


public void setVelicinaEkrana(double velicinaEkrana) {
	if(velicinaEkrana<12 && velicinaEkrana>0)
		this.velicinaEkrana=velicinaEkrana;
	else
		System.out.println("Error");
}



public String getMarka() {
	return marka;
}
	
	
	

public String getModel() {
	return model;
}




public double getVelicinaEkrana() {
	return velicinaEkrana;
}


public String toString() {
	return "["+"marka: "+ marka + " model: "+model+" velicina ekrana: "+velicinaEkrana + "]";
}

//redefinisanje metode wquals
public boolean equals(Object o) {

	if(o instanceof Monitor) {  //instanceod proverava da li parametar o zaista jeste klase Monitor
		Monitor m=(Monitor) (o);
	if(marka.equals(m.getMarka()) && model.equals(m.getModel())  && velicinaEkrana==m.getVelicinaEkrana())//poredimo stringove i doublove
		return true;
	else
		return false;
	}
	else {
		System.out.println("Error");
	return false;
	}
		
}

	//napravi test



		
	
	
	
	
	
	
	
	
	
	
}
