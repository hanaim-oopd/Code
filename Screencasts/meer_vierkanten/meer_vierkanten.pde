int[] vierkantenX, vierkantenY, vierkantenGroottes, vierkantenKleuren;
int aantalVierkanten;

void setup() {
  size(400, 300);
  aantalVierkanten = 5;

  vierkantenX = new int[aantalVierkanten];
  vierkantenY = new int[aantalVierkanten];
  vierkantenGroottes = new int[aantalVierkanten];
  vierkantenKleuren = new int[aantalVierkanten];

  for (int i = 0; i < vierkantenX.length; i++) {
    vierkantenGroottes[i] = int(random(10, 40));
    vierkantenX[i] = int(random(vierkantenGroottes[i], width - vierkantenGroottes[i]));
    vierkantenY[i] = int(random(vierkantenGroottes[i], height - vierkantenGroottes[i]));
    vierkantenKleuren[i] = #E8E5FF;
  }
}

void draw() {
  background(0);
  for (int i = 0; i < vierkantenX.length; i++) {
    tekenVierkant(vierkantenX[i], vierkantenY[i], vierkantenGroottes[i], vierkantenKleuren[i]);
  }
}

void mouseClicked() {

  for (int i = 0; i < vierkantenX.length; i++) {
    vierkantenKleuren[i] = #E8E5FF;
    if (isMuisInVierkant(vierkantenX[i], vierkantenY[i], vierkantenGroottes[i])) {
      vierkantenKleuren[i] = #4B5BFF;
    }
  }
}

boolean isMuisInVierkant(int x, int y, int grootte) {
  return (mouseX >= x && mouseX < x + grootte &&
    mouseY >= y && mouseY < y + grootte);
}

void tekenVierkant(int x, int y, int grootte, int kleur) {
  noStroke();
  fill(kleur);
  rect(x, y, grootte, grootte);
}
