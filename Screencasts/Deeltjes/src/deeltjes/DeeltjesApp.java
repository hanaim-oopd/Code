package deeltjes;

import processing.core.PApplet;

import java.util.ArrayList;

public class DeeltjesApp extends PApplet {
    public static void main(String[] args) {
        PApplet.main("deeltjes.DeeltjesApp");
    }

    private final float G = 0.2f;
    Deeltje d1;

    public void settings() {
        size(400, 400);
    }

    public void setup() {

        background(0);
        d1 = new Deeltje(this, width / 2, height / 2, 0.5f, -5, 0, G);
    }

    public void draw() {
        background(0);
        d1.zetStap();
        d1.tekenDeeltje();
    }

    public void mousePressed() {
        d1 = new Deeltje(this, mouseX, mouseY, random(-2, 2), -5, 0, G);
    }
}
