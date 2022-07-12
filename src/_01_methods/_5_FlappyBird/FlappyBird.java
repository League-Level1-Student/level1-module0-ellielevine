package _01_methods._5_FlappyBird;

import java.util.Random;

import processing.core.PApplet;

public class FlappyBird extends PApplet {
    static final int WIDTH = 800;
    static final int HEIGHT = 600;
int birdX = 25;
int birdY = 300;
int pipeX = 800;
int pipeWidth = 100;
int birdYVelocity = -50;
int gravity = 1;
Random ran = new Random();
int upperPipeHeight = ran.nextInt(301) + 100;

boolean intersectsPipes() { 
    if (birdY < upperPipeHeight && birdX > pipeX && birdX < (pipeX+pipeWidth)){
       return true; }
   else { return false; }
}
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
    	background(141, 230, 255);
    	fill(90, 100, 215);
    	stroke(90, 100, 215);
    	ellipse(birdX, birdY, 25, 25);
    	birdY += gravity;
    	fill(138, 192, 72);
    
    	rect(pipeX, upperPipeHeight, pipeWidth, 600);
    	pipeX -=5;
    	  if (pipeX<=0) {
    		  pipeX = 800;
    		  upperPipeHeight = ran.nextInt(301) + 100;
    	  }
    	
    }
    
    @Override
    public void mousePressed() {
    	birdY += birdYVelocity + gravity;
    	
    }
    
    
    public void teleportPipes() {

  }
    
    
    static public void main(String[] args) {
        PApplet.main(FlappyBird.class.getName());
    }
}
