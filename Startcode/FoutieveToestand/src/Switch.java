import processing.core.PApplet;

public abstract class Switch extends Knop {

	private boolean isAan;
	
	public Switch(PApplet app, float x, float y, float breedte, float hoogte) {
		super(app, x, y, breedte, hoogte);
		isAan = false;
	}

	@Override
	public final void handelInteractieAf() {
		isAan = !isAan;
		doeKnopActie();
	}
	
	@Override
	public void tekenKnop() {
		tekenBasis();
		tekenSchuif();
	}
	
	private void tekenBasis() {
		int rand = 0;
		app.noStroke();
		app.fill(0);
		app.rect(x + rand, y + rand, breedte - 2 * rand, hoogte - 2 * rand);
		
		rand += 1;
		app.fill(95);
		app.rect(x + rand, y + rand, breedte - 2 * rand, hoogte - 2 * rand);
		
		rand += 2;
		app.fill(0);
		app.rect(x + rand, y + rand, breedte - 2 * rand, hoogte - 2 * rand);
		
		rand += 2;
		if (isAan) {
			app.fill(0xFFA4C739);
		}
		else {
			app.fill(0);
		}
		app.rect(x + rand, y + rand, breedte - 2 * rand, hoogte - 2 * rand);
	}
	
	private void tekenSchuif() {
		app.noStroke();
		float schuifBreedte = breedte / 2;
		float greepBreedte = schuifBreedte - 2;
		
		if (isAan) {
			app.fill(0);
			app.rect(x + breedte - schuifBreedte, y, schuifBreedte, hoogte);
			app.fill(255);
			app.rect(x + breedte - greepBreedte, y, greepBreedte, hoogte);
		}
		else {
			app.fill(0);
			app.rect(x, y, schuifBreedte, hoogte);
			app.fill(255);
			app.rect(x, y, greepBreedte, hoogte);
		}
	}
}
