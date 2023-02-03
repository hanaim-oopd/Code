class Teller{
  int maximum;
  int waarde;
  float x, y, hoogte, breedte;
  
  
 Teller(int maximum, float x, float y, float breedte, float hoogte){
   this.maximum = maximum;
   waarde = 0;
   this.x = x;
   this.y = y;
   this.breedte = breedte;
   this.hoogte = hoogte;
   
 }
 
 void tik(){
   waarde = (waarde + 1) % maximum;
 }
 
 void tekenTeller(){
   rectMode(CENTER);
   noStroke();
   fill(0);
   rect(x, y, breedte, hoogte);
   
   fill(255, 0 , 0);
   textSize(hoogte);
   textAlign(CENTER);
   float verschuiving = (textAscent() - textDescent())/2;
   text(geefTijdNotatie(), x, y + verschuiving);
 }
 
 String geefTijdNotatie(){
   if (waarde < 10){
     return "0" + str(waarde);
   } else {
     return str(waarde);
   }
 }
 
}
