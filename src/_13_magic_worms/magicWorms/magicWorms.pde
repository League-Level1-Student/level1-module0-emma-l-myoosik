int maxValue = 600;

void setup() {
  size(600, 600);
  background(222, 164, 208);
  
}

void draw() {
  makeMagical();
  
  for (int i = 0; i <= 300; i++) {
    float x = getWormX(i);
    float y = getWormY(i);
    fill(180, 164, 222);
    ellipse(x,y, 10, 15);
  }
}
float frequency = .001;
float noiseInterval = PI;

void makeMagical() {
     fill( 0, 0, 0, 10 );
     rect(0, 0, width, height);
     noStroke();
}

float getWormX(int i) {
     return map(noise(i*noiseInterval + frameCount * frequency), 0, 1, 0, width);
}

float getWormY(int i) {
     return map(noise(i*noiseInterval+1 + frameCount * frequency), 0, 1, 0, height);
}
