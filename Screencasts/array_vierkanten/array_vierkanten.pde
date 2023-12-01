Vierkant[] vierkanten;

void setup() {
  size(400, 300);
  vierkanten = new Vierkant[5];
  for (int i = 0; i < vierkanten.length; i++) {
    vierkanten[i] = new Vierkant();
  }
}

void draw() {
  background(0);
  for (int i = 0; i < vierkanten.length; i++) {
    vierkanten[i].tekenVierkant();
  }
}

void mouseClicked() {
  for (int i = 0; i < vierkanten.length; i++) {
    vierkanten[i].muisKlik();
  }
}
