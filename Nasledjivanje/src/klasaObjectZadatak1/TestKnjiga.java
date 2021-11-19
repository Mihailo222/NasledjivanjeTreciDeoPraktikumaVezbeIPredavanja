package klasaObjectZadatak1;

public class TestKnjiga {

	public static void main(String[] args) {
		Knjiga o1;
		o1=new Knjiga();
		
		o1.setNaslov("Istorija lepote");
		o1.setAutor("Umbreto Eko");
		o1.setISBN("0-234-567");
		
		Knjiga o2;
		o2=new Knjiga();
		
		
		o2.setNaslov("Istorija ruznoce");
		o2.setAutor("Umbreto Eko");
		o2.setISBN("0-567-890");
		
		
		
		if(o1.equals(o2)) System.out.println("Knjige su iste");
		else System.out.println("Knjige se razlikuju");
		
		
		System.out.println("KNJIGA 1:   NAZIV:"+o1.getNaslov()+" AUTOR: "+o1.getAutor()+" ISBN: "+o1.getISBN());
		System.out.println("KNJIGA 2:   NAZIV:"+o2.getNaslov()+" AUTOR: "+o2.getAutor()+" ISBN: "+o2.getISBN());
		
		//isto:
		
		System.out.println(o1.toString());
		System.out.println(o2.toString());
		
		
		System.out.println(o1);
		System.out.println(o2);
		
		
		
		
		
		
		

	}

}
