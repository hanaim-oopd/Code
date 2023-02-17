package les13.ifelsenaarinterface;

public class Rechthoek extends Figuur {
    private float breedte, hoogte;

    public Rechthoek(float x, float y, float breedte, float hoogte) {
        super(x, y);
        this.breedte = breedte;
        this.hoogte = hoogte;
    }

    @Override
    public void teken(TekenApp app) {
        app.rect(x, y, breedte, hoogte);
    }

    @Override
    public boolean isMuisBinnen(float x, float y, TekenApp app) {
        return (app.mouseX >= this.x && app.mouseX < this.x + breedte && app.mouseY >= this.y && app.mouseY < this.y + hoogte);
    }
}
