int vierkantX, vierkantY, vierkantGrootte, vierkantKleur;

void setup() {
  size(400, 300);
  vierkantGrootte = int(random(10, 40));
  vierkantX = int(random(vierkantGrootte, width - vierkantGrootte));
  vierkantY = int(random(vierkantGrootte, height - vierkantGrootte));
  vierkantKleur = #E8E5FF;
}

void draw() {
  background(0);
  tekenVierkant(vierkantX, vierkantY, vierkantGrootte, vierkantKleur);
}

void mouseClicked(){
  vierkantKleur = #E8E5FF;
  if (isMuisInVierkant(vierkantX, vierkantY, vierkantGrootte)){
    vierkantKleur = #4B5BFF;
  }
}

boolean isMuisInVierkant(int x, int y, int grootte){
  return (mouseX >= x && mouseX < x + grootte &&
          mouseY >= y && mouseY < y + grootte);
}

void tekenVierkant(int x, int y, int grootte, int kleur){
 noStroke();
 fill(kleur);
 rect(x, y, grootte, grootte);
}
