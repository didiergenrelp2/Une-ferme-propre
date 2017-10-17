package co.simplon.unefermepropre;

public class Chat {
	private String nom;
	private int age;
	private Zone zone;
	private int numeroChat;
	
	public Chat(String nom, int age, int numeroChat) {
		super();
		this.nom = nom;
		this.age = age;
		this.numeroChat = numeroChat;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Zone getZone() {
		return zone;
	}

	public void setZone(Zone zone) {
		this.zone = zone;
	}

	public int getNumeroChat() {
		return numeroChat;
	}

	public void setNumeroChat(int numeroChat) {
		this.numeroChat = numeroChat;
	}
}
