package fr.doranco.factory.disk;

public abstract class DiskFactory {
	
	
	public abstract Disk createDisk(int vitesseLecture, int vitesseEcriture, int capacite, boolean isWritable);

}

