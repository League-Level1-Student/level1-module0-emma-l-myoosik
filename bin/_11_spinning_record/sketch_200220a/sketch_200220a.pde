PImage pictureOfRecord; 
void setup(){
  size(600,600); 
  pictureOfRecord= loadImage("record.jpg");
  pictureOfRecord.resize(width, height);
}

void draw(){
  image(pictureOfRecord, 0, 0);
  int x = 0;
  while (x <= 360) {
    x++;
    rotateImage(pictureOfRecord, x);
    image(pictureOfRecord, 0, 0);
  }
}

void rotateImage(PImage image, int amountToRotate) {
  translate(width/2, height/2);
  rotate(amountToRotate*TWO_PI/360);
  translate(-image.width/2, -image.height/2);
}
