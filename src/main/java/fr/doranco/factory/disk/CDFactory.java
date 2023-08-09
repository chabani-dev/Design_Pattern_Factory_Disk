
package fr.doranco.factory.disk;

public class CDFactory extends DiskFactory {

	@Override
	public Disk createDisk(int vitesseLecture, int vitesseEcriture, int capacite, boolean isWritable) {
	
		return new CD (vitesseLecture,vitesseEcriture,capacite,isWritable   );
	}

	
	

}
