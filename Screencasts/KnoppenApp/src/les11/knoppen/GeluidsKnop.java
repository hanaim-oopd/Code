package les11.knoppen;

import processing.core.PApplet;

public class GeluidsKnop extends Knop {

    private Geluid geluid;

    public GeluidsKnop(PApplet app, Geluid geluid, float x, float y, float breedte, float hoogte) {
        super(app, x, y, breedte,  hoogte);
        this.geluid = geluid;
    }

    public void doeKnopActie() {
        geluid.schakelGeluid();
    }
}
