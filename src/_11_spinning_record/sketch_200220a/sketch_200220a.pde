import ddf.minim.*;

int angle = 0;
Minim minim;
AudioPlayer song;

PImage pictureOfRecord; 
void setup(){
  size(600,600); 
  pictureOfRecord= loadImage("record.jpg");
  pictureOfRecord.resize(width, height);
  minim = new Minim(this);
  song = minim.loadFile("Tinkle-Lisa_Redfern-1916445296.wav", 512);
}

void draw(){
  image(pictureOfRecord, 0, 0);
  int x = 0;
  while (x <= 360) {
    x++;
    rotateImage(pictureOfRecord, x);
    image(pictureOfRecord, 0, 0);
  }
  if (mousePressed) {
    rotateImage(pictureOfRecord, angle);
    image(pictureOfRecord, 0, 0);
    angle += 90;
    
    song.play();
  }
  else {
    song.pause();
  }
}

void rotateImage(PImage image, int amountToRotate) {
  translate(width/2, height/2);
  rotate(amountToRotate*TWO_PI/360);
  translate(-image.width/2, -image.height/2);
}
