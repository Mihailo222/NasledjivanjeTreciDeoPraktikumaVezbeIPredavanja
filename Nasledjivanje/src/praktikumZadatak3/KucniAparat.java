package praktikumZadatak3;

public class KucniAparat {
	private String marka;
	private String model;
	boolean ukljucen;
	
	public KucniAparat(String marka, String model, boolean ukljucen) {
		if(marka!=null && model!=null) {
			this.marka=marka;
			this.model=model;
			this.ukljucen=ukljucen;
		}
		else
			System.out.println("Error");
		
	}
	
	public KucniAparat() {
		
	}
	
	
	public String getMarka() {
		return marka;
	}
	
	public void  setMarka(String nazivProizvodjaca) {
		this.marka=nazivProizvodjaca;
	}
	
	public String getModel() {
		return model;
	}
	
	public void setModel(String model) {
		
		if(model==null)
	       this.model=model;
		else
			System.out.println("Error");
	}
	
	
	
	public void ukljuci() {
		ukljucen=true;
	}
	
	public void iskljuci() {
		ukljucen=false;
	}
	
	public void ispisi() {
		System.out.println("Marka:"+marka);
		System.out.println("Mode"+model);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
