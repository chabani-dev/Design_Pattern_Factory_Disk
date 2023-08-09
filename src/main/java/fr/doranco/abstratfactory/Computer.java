package fr.doranco.abstratfactory;

public  abstract class Computer extends  Produit{

	
	private String typeComputer;
	private String ram;
	private String hdd;
	private String cpu;
	
	
	
	public Computer(String typeComputer, String ram, String hdd, String cpu) {
	   this.typeComputer = typeComputer;
		this.ram = ram;
		this.hdd = hdd;
		this.cpu = cpu;
	}



	@Override
	public String toString() {
		return "Computer [typeComputer=" + typeComputer + ", ram=" + ram + ", hdd=" + hdd + ", cpu=" + cpu + "]";
	}
	
	
	
	
	
	
	
}
