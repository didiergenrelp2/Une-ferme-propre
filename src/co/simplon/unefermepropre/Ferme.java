package co.simplon.unefermepropre;

import java.util.ArrayList;

import co.simplon.ferme.Animal;

public class Ferme {
	
	// Déclaration des Attributs FERME
	private static int nombreSouris;
	private int nombreJours = 0;
	//public Zone zone1 ;
	
	private void initialiserMaferme() {
		
		ArrayList<Zone>terrain = new ArrayList<Zone>();
	}
	
	public static void main(String[] args) {
		
		Fermier monFermier = new Fermier();
		Zone zone1 = new Zone("Zone A",1);
		monFermier.setZone1(zone1);
		Zone zone2 = new Zone("Zone B",2);
		Zone zone3 = new Zone("Zone C",3);
		Zone zone4 = new Zone("Zone D",4);
		Chat chat1 = new Chat("Nemo", 5, 1);
		Chat chat2 = new Chat("Garfield", 1, 2);
		Chat chat3 = new Chat("Fripouille", 15, 3);
		Chat chat4 = new Chat("Princesse", 2, 4);
		Chat chat5 = new Chat("Mimine", 7, 5);
		for(int i=1; i <= 15; i++) {
			Souris souris = new Souris(zoneA, i);
			nombreSouris = nombreSouris + 1;
			//System.out.println(souris.getNumeroSouris());
			
			
		}
		System.out.println(monFermier.verifierNombreSouris());
	}


	public static int getNombreSouris() {
		return nombreSouris;
	}


	public static void setNombreSouris(int nombreSouris) {
		Ferme.nombreSouris = nombreSouris;
	}


	public int getNombreJours() {
		return nombreJours;
	}


	public void setNombreJours(int nombreJours) {
		this.nombreJours = nombreJours;
	}

}
