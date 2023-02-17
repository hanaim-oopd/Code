package les13.radioknopStartcode;

public class Keuzeoptie implements IDoelwit {

	private String keuze;
	
	public Keuzeoptie(String keuze) {
		this.keuze = keuze;
	}
	
	@Override
	public void schakel() {
		System.out.println("Optie: " + keuze + "  gekozen.");
	}

}
