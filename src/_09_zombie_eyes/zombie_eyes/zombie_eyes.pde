
void setup() {
  size(500,500);
  PImage face=loadImage("angryoldman.jpg");
  face.resize(500,500);
  image(face,0,0); 

}
void draw() {
  fill(mouseX,mouseY,mouseX);
ellipse(190,190,100,100);
 ellipse(290,190,100,100);
fill(#0A0101);
 ellipse(190,190,20,20);
 ellipse(290,190,20,20);
 

 
}
