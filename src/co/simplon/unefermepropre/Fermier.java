package co.simplon.unefermepropre;

public class Fermier {

	private Zone zone1;
	
	public int verifierNombreSouris() {
		return Ferme.getNombreSouris();
	}

	public Zone attribuerZoneChat() {
		//Zone result ;// new Zone();
		int randomZone = (int)(Math.random() * 4);

		switch (randomZone) {
		case 1:
			return zone1;
			break;
		case 2:
			result = Ferme.zone2;
			break;
		case 3:
			result = zone3;
			break;
		case 4:
			result = zone4;
			break;

		}
		return result;

	}

	public Zone getZone1() {
		return zone1;
	}

	public void setZone1(Zone zone1) {
		this.zone1 = zone1;
	}
}
