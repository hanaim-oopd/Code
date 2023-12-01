Vierkant eenVierkant;

void setup() {
  size(400, 300);
  //eenVierkant = new Vierkant();
  eenVierkant = new Vierkant(40, 90, 30, #A02323);
}

void draw() {
  background(0);
  eenVierkant.tekenVierkant();
}

void mouseClicked() {
  eenVierkant.muisKlik();
}
