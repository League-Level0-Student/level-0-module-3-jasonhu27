
void setup() {
  size(1000, 1000);
  // set the size of your sketch
}
void draw() {
  for (int i=0; i<8; i++) {
    //Starting with the largest ellipse, use a for loop to draw a bullseye with ellipses.
    //Use an if statement and modulo to alternate the color of your rings.

    if (i % 2 == 0) {
      fill(#FF0303);

      ellipse(500, 500, 700-(i*100), 700-(i*100));
    }

    if (i % 2 == 1) {
      fill(#121212);

      ellipse(500, 500, 700-(i*100), 700-(i*100));
    }
  }
}
