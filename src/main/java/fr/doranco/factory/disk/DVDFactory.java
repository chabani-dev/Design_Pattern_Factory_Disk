package fr.doranco.factory.disk;

public class DVDFactory  extends DiskFactory{

	@Override
	public Disk createDisk(int  vitesseLecture, int vitesseEcriture, int capacite, boolean isWritable) {
		// TODO Auto-generated method stub
		return new DVD (vitesseLecture, vitesseEcriture,capacite,isWritable);
	}

	

}
