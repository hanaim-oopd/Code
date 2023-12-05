import processing.core.PApplet;

public class ProcessingProgramma extends PApplet {

    public static void main(String[] args) {

        PApplet.main(new String[]{"ProcessingProgramma"});
    }

    public void settings() {
        size(400, 200);
    }

    public void setup() {
        background(0);
        fill(255);
        rect(10, 10, 50, 50);
    }
}