package les13.radioknopStartcode;
import processing.core.PApplet;

public class Radioknop extends Switch implements IDoelwit {

	public Radioknop(PApplet app, float x, float y, float breedte, float hoogte) {
		super(app, x, y, breedte, hoogte);
	}

	@Override
	public void schakel() {
		//TO DO. 
		// Let op een radioknop gedraagt zich iets anders dan een 
		// switch. Ze opereren altjd in een groep en er kan er maar 1 aan staan.
		// uitzetten kan alleen door een ANDERE radioknop aan te zetten.
	}

	@Override
	public void handelInteractieAf() {
		//TO DO. zie ook opmerking bij schakel()
		doeKnopActie();
	}
	
	@Override
	public void tekenKnop() {
		app.ellipseMode(PApplet.CENTER);
		app.noStroke();
		app.fill(255);
		app.ellipse(x, y, breedte, hoogte);
		if (isAan) {
			app.fill(0);
			app.ellipse(x, y, breedte - breedte/4, hoogte - hoogte/4);
		}
	}
	
	@Override 
	public boolean isMuisOverKnop() {
		if (PApplet.dist(app.mouseX, app.mouseY, x, y) < breedte/2) {
			return true;
		}
		else {
			return false;
		}
	}

}
