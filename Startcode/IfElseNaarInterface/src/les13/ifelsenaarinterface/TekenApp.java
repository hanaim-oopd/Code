package les13.ifelsenaarinterface;

import java.util.ArrayList;

import processing.core.PApplet;

@SuppressWarnings("serial")
public class TekenApp extends PApplet {

	public static void main(String[] args) {
		PApplet.main("les13.ifelsenaarinterface.TekenApp");
	}

	private ArrayList<Figuur> figurenLijst = new ArrayList<>();
	private String huidigGereedschap = "selecteer";	
	
	public void settings() {
		size(400, 400);
	}

	public void draw() {
		background(0);
		for (Figuur figuur : figurenLijst) {
			figuur.teken(this);
		}
	}
	
	public void mousePressed() {
		switch (huidigGereedschap) {
			case "selecteer":
				System.out.println("s");
				break;
			case "rechthoek":
				Rechthoek r = new Rechthoek( mouseX, mouseY, 50, 50);
				figurenLijst.add(r);
				break;
			case "cirkel":
				Cirkel c = new Cirkel(mouseX, mouseY, 50);
				figurenLijst.add(c);
				break;
			case "gum":
				for (int i = figurenLijst.size() - 1; i >= 0; i--) {
					Figuur fig = figurenLijst.get(i);
					if (fig.isMuisBinnen(mouseX, mouseY, this)) {
						figurenLijst.remove(i);
					}
				}
				break;
		}
	}
	
	public void keyReleased() {
		switch (key) {
			case 's':
				huidigGereedschap = "selecteer";
				break;
			case 'r':
				huidigGereedschap = "rechthoek";
				break;
			case 'c':
				huidigGereedschap = "cirkel";
				break;
			case 'g':
				huidigGereedschap = "gum";
				break;
		}
	}	
}
