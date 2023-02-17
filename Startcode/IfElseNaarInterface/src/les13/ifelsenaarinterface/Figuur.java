package les13.ifelsenaarinterface;

public abstract class Figuur {
    protected float x, y;

    public Figuur(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public abstract void teken(TekenApp app);

    public abstract boolean isMuisBinnen(float x, float y, TekenApp app);
}
