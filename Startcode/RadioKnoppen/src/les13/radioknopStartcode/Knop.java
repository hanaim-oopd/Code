package les13.radioknopStartcode;
import java.util.ArrayList;

import processing.core.PApplet;

public abstract class Knop {
	
	protected PApplet app;

	protected float x, y, breedte, hoogte;
	protected ArrayList<IDoelwit> doelwitten;

	public Knop(PApplet app, float x, float y, float breedte, float hoogte) {
		doelwitten = new ArrayList<IDoelwit>();
		this.app = app;
		this.x = x;
		this.y = y;
		this.breedte = breedte;
		this.hoogte = hoogte;
	}

	public boolean isMuisOverKnop() {
		if (app.mouseX >= x && app.mouseX < x + breedte &&
				app.mouseY >= y && app.mouseY < y + hoogte) {
			return true;
		}
		else {
			return false;
		}
	}

	public abstract void tekenKnop();
	
	public void handelInteractieAf() {
		doeKnopActie();
	}

	public void doeKnopActie() {
		for (IDoelwit doelwit : doelwitten) {
			doelwit.schakel();
		}
	}
	
	public void voegDoelwitToe(IDoelwit doelwit) {
		doelwitten.add(doelwit);
	}
}
