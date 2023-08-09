package fr.doranco.abstratfactory;

public abstract  class Disk extends  Produit {
	
	
	private String typeDisk;
	private int vitesseLecture;
	private int  vitesseEcriture;
	private int capacite;
	private boolean isWritable;
	
	
	
	public Disk(String typeDisk, int vitesseLecture, int vitesseEcriture, int capacite, boolean isWritable) {
		
		this.typeDisk = typeDisk;
		this.vitesseLecture = vitesseLecture;
		this.vitesseEcriture = vitesseEcriture;
		this.capacite = capacite;
		this.isWritable = isWritable;
	}



	@Override
	public String toString() {
		return "Disk [typeDisk=" + typeDisk + ", vitesseLecture=" + vitesseLecture + ", vitesseEcriture="
				+ vitesseEcriture + ", capacite=" + capacite + ", isWritable=" + isWritable + "]";
	}
	
	
	
	
	
	
	

}
