
void setup() {
   size(500,500);
   fill(#EDC986);
 ellipse(250,250,300,300);
 fill(#F7340C);
 ellipse(250,250,250,250);
 fill(#F3F70C);
 ellipse(250,250,200,200);
}
void draw() {
 
 PImage pepperoni= loadImage("pepperoni.jpg");
 pepperoni.resize(20,20);
 image(pepperoni,250,250);
 image(pepperoni,200,200);
 if(mousePressed){
 image(pepperoni,mouseX,mouseY);
 }
}
