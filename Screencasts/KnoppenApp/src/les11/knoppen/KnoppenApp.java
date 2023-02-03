package les11.knoppen;

import processing.core.PApplet;

import java.util.ArrayList;

public class KnoppenApp extends PApplet {

    public static void main(String[] args) {
        PApplet.main(new String[] {"les10.knoppen.KnoppenApp"});
    }

    private Licht licht;
    private Geluid geluid;

    private LichtKnop lichtKnop;
    private GeluidsKnop geluidsKnop;

    public void settings() {
        size(400, 400);
    }

    public void setup() {
        licht = new Licht(this);
        geluid = new Geluid("banjo.wav");

        lichtKnop = new LichtKnop(this, licht, 20, 20, 50, 50);
        geluidsKnop = new GeluidsKnop(this, geluid, 100, 20, 50, 50);
    }

    public void draw() {
        licht.tekenLicht();
        lichtKnop.tekenKnop();
        geluidsKnop.tekenKnop();
    }

    public void mousePressed() {
        if (lichtKnop.isMuisOverKnop()) {
            lichtKnop.doeKnopActie();
        }

        if (geluidsKnop.isMuisOverKnop()) {
            geluidsKnop.doeKnopActie();
        }

    }
}
