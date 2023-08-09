package fr.doranco.factory.disk;

public class CD extends Disk{

	protected CD(int vitesseLecture, int vitesseEcriture, int capacite, boolean isWritable) {
		super("CD" ,vitesseLecture, vitesseEcriture, capacite, isWritable);
	

	}	
}
