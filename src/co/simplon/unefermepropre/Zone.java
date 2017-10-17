package co.simplon.unefermepropre;

public class Zone {
	private String nom;
	private int nombreSouris;
	private int numeroZone;
	
	public Zone(String nom, int numeroZone) {
		super();
		this.nom = nom;
		this.numeroZone = numeroZone;
	}
	
	public Zone() {
		
	}
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getNombreSouris() {
		return nombreSouris;
	}

	public void setNombreSouris(int nombreSouris) {
		this.nombreSouris = nombreSouris;
	}

	public int getNumeroZone() {
		return numeroZone;
	}

	public void setNumeroZone(int numeroZone) {
		this.numeroZone = numeroZone;
	}
}
