Vierkant eenVierkant;

class Vierkant{
  int x, y, grootte, kleur;
}

void setup() {
  size(400, 300);
  eenVierkant = new Vierkant();
  eenVierkant.grootte = int(random(10, 40));
  eenVierkant.x = int(random(eenVierkant.grootte, width - eenVierkant.grootte));
  eenVierkant.y = int(random(eenVierkant.grootte, height - eenVierkant.grootte));
  eenVierkant.kleur = #E8E5FF;
}

void draw() {
  background(0);
  tekenVierkant(eenVierkant.x, eenVierkant.y, eenVierkant.grootte, eenVierkant.kleur);
}

void mouseClicked(){
  eenVierkant.kleur = #E8E5FF;
  if (isMuisInVierkant(eenVierkant.x, eenVierkant.y, eenVierkant.grootte)){
    eenVierkant.kleur = #4B5BFF;
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
