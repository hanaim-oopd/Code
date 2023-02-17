package les13.meerderedoelwitten;

import processing.core.PApplet;


public class Licht implements IDoelwit{
	
	private PApplet app;
	private int kleur;
	
	public Licht(PApplet app) {
		this.app = app;
		kleur = 0;
	}
		
	@Override
	public void schakel() {
		
		if (kleur == 0) {
			kleur = 0xFFA4C739;
		}
		else {
			kleur = 0;
		}
	}
	
	@Override
	public void teken() {
		app.background(kleur);
	}
}
