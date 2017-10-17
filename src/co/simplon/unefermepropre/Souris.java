package co.simplon.unefermepropre;

public class Souris {
	private boolean vivant = true;
	private Zone zone;
	private int numeroSouris;
	
	public Souris(Zone zone, int numeroSouris) {
		super();
		this.zone = zone;
		this.numeroSouris = numeroSouris;
	}

	public boolean isVivant() {
		return vivant;
	}

	public void setVivant(boolean vivant) {
		this.vivant = vivant;
	}

	public Zone getZone() {
		return zone;
	}

	public void setZone(Zone zone) {
		this.zone = zone;
	}

	public int getNumeroSouris() {
		return numeroSouris;
	}

	public void setNumeroSouris(int numeroSouris) {
		this.numeroSouris = numeroSouris;
	}
}
