Teller minutenTeller;

void setup() {
  //minutenTeller = new Teller(60);

  //println(minutenTeller.waarde);
  //println(minutenTeller.maximum);

  //minutenTeller.tik();
  //println(minutenTeller.waarde);
  //minutenTeller.waarde = 30;
  //minutenTeller.tik();
  //println(minutenTeller.waarde);
  //minutenTeller.waarde = minutenTeller.maximum - 1;
  //minutenTeller.tik();
  //println(minutenTeller.waarde);

  background(255);
  size(400,300);
  minutenTeller = new Teller(60, 250, 100, 100, 75);
  minutenTeller.waarde = 10;
  minutenTeller.tekenTeller();
}
