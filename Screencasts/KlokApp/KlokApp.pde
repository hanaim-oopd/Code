Klok klok;

void setup(){
  size(400,300);
  background(255);
  
  klok = new Klok(150, 100, 100);
  klok.setTijd(22, 58);
  klok.tik();
  klok.tik();
  klok.tekenKlok();
}

void draw(){
  klok.tik();
  klok.tekenKlok();
}
