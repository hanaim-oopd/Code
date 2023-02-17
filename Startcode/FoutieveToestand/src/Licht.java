import processing.core.PApplet;

public class Licht {
	private PApplet app;
	private int kleur;
	
	
	public Licht(PApplet app) {
		this.app = app;
		kleur = 0;
	}
	
	void schakelLicht() {
		if (kleur == 0) {
			kleur = 0xFFA4C739;
		}
		else {
			kleur = 0;
		}
	}
	
	public void tekenLicht() {
		app.background(kleur);
	}
}