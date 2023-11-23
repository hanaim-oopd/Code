int stipX = 100;
int stipY = 50;
int stipGrootte = 20;
int stipKleur = #99FFEA;

int spiegelX = 140;

void setup(){
  smooth();
  size(400, 300);
  background(0);
  
  int gespiegeldeX = spiegel(stipX, spiegelX);
  
  tekenStip(stipX, stipY, stipGrootte, stipKleur);
  tekenSpiegel(spiegelX);
  tekenStip(gespiegeldeX, stipY, stipGrootte, stipKleur);
}

void tekenStip(int x, int y, int grootte, int kleur){
  noStroke();
  fill(kleur);
  ellipse(x, y, grootte, grootte);
}

void tekenSpiegel(int x){
  stroke(255);
  line(x, 0, x, height);
}

int spiegel(int x, int xSpiegel){
  x = xSpiegel + (xSpiegel - x);
  return x;
}
