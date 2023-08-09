package fr.doranco.factory.implémentation;

import fr.doranco.factory.disk.CDFactory;
import fr.doranco.factory.disk.DVDFactory;
import fr.doranco.factory.disk.Disk;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CDFactory cd = new CDFactory();
		Disk c1 = cd.createDisk( 8 ,2 , 5 , false);

		DVDFactory  dvd = new DVDFactory();
		Disk c2 = dvd.createDisk(64, 30, 4 ,true);
		
		System.out.println(c1);
		System.out.println(c2);
		

	}

}
