int[] stippenX = {40, 30, 60};
int[] stippenY = {50, 100, 150};
int stipGrootte = 20;
int stipKleur = #99FFEA;

int spiegelX = 140;

void setup() {
  smooth();
  size(400, 300);
  background(0);

  int[] gespiegeldeXen = spiegel(stippenX, spiegelX);

  tekenStippen(stippenX, stippenY, stipGrootte, stipKleur);
  tekenSpiegel(spiegelX);
  tekenStippen(gespiegeldeXen, stippenY, stipGrootte, stipKleur);
}

void tekenStippen(int[] xCoordinaten, int[] yCoordinaten, int grootte, int kleur) {
  for (int i = 0; i < xCoordinaten.length; i++) {
    tekenStip(xCoordinaten[i], yCoordinaten[i], grootte, kleur);
  }
}

void tekenStip(int x, int y, int grootte, int kleur) {
  noStroke();
  fill(kleur);
  ellipse(x, y, grootte, grootte);
}

void tekenSpiegel(int x) {
  stroke(255);
  line(x, 0, x, height);
}

int[] spiegel(int[] xCoordinaten, int xSpiegel) {
  
  for (int i = 0; i < xCoordinaten.length; i++) {
      xCoordinaten[i] = xSpiegel + (xSpiegel - xCoordinaten[i]);
  }

  return xCoordinaten;
}
