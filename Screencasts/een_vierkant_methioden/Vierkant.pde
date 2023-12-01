class Vierkant {
  int x, y, grootte, kleur;

  Vierkant() {
    grootte = int(random(10, 40));
    x = int(random(grootte, width - grootte));
    y = int(random(grootte, height - grootte));
    kleur = #E8E5FF;
  }
  
  Vierkant(int x, int y, int grootte, int kleur){
    this.x = x;
    this.y = y;
    this.grootte = grootte;
    this.kleur = kleur;
  }
}
