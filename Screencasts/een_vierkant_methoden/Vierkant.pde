class Vierkant {
  int x, y, grootte, kleur, origineleKleur;

  Vierkant() {
    grootte = int(random(10, 40));
    x = int(random(grootte, width - grootte));
    y = int(random(grootte, height - grootte));
    kleur = #E8E5FF;
    origineleKleur = kleur;
  }

  Vierkant(int x, int y, int grootte, int kleur) {
    this.x = x;
    this.y = y;
    this.grootte = grootte;
    this.kleur = kleur;
    this.origineleKleur = kleur;
  }

  void tekenVierkant() {
    noStroke();
    fill(kleur);
    rect(x, y, grootte, grootte);
  }

  boolean isMuisInVierkant() {
    return (mouseX >= x && mouseX < x + grootte &&
      mouseY >= y && mouseY < y + grootte);
  }

  void muisKlik() {
    kleur = origineleKleur;
    if (isMuisInVierkant()) {
      kleur = #4B5BFF;
    }
  }
}
