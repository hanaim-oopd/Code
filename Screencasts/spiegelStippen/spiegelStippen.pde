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

void tekenStippen(int[] stippenX, int[] stippenY, int stipGrootte, int stipKleur) {
  for (int i = 0; i < stippenX.length; i++) {
    tekenStip(stippenX[i], stippenY[i], stipGrootte, stipKleur);
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

int[] spiegel(int[] x, int xSpiegel) {
  
  for (int i = 0; i < stippenX.length; i++) {
      x[i] = xSpiegel + (xSpiegel - x[i]);
  }

  return x;
}
