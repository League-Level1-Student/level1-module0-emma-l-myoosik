int Y = 0;
int width = 600;
int height = 600;

int bucketWidth = 50;

int score = 0;

int randomNumber = (int) random(width);

void setup(){
  size(600, 600);
  
}

void draw(){
  background(212, 228, 255);
  
  fill(0, 0, 0);
  textSize(16);
  text("Score: " + score, 20, 20);
    
  fill(119, 99, 255);
  stroke(17, 8, 77);
  ellipse(randomNumber, Y, 8, 14);
  Y += 1;
  
  fill(237, 0, 182);
  rect(mouseX, height-65, bucketWidth, 65);
  
  if (Y == height-65) {
    checkCatch(randomNumber);

    randomNumber = (int) random(width);
    Y = 0;
  }
  
}

void checkCatch(int x){
     if (x > mouseX && x < mouseX+bucketWidth)
          score++;
     else if (score > 0)
          score--;
     println("Your score is now: " + score); 
}
