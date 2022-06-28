package _01_methods._5_FlappyBird;

import processing.core.PApplet;

public class FlappyBird extends PApplet {
    static final int WIDTH = 800;
    static final int HEIGHT = 600;
int x = 25;
int y= 300;
int birdYVelocity = -10;
int gravity = 1;
    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
        size(width, height);
    }

    @Override
    public void draw() {
    	background(200, 200, 200);
    	fill(90, 100, 215);
    	stroke(90, 100, 215);
    	ellipse(x, y, 25, 25);
    }
    
    @Override
    public void mousePressed() {
    	
    }

    static public void main(String[] args) {
        PApplet.main(FlappyBird.class.getName());
    }
}
