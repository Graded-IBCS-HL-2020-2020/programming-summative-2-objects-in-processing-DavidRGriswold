
import processing.core.PApplet;

public class Sketch extends PApplet {

    /*
     * SUMMATIVE REQUIRED Generate at least four balls, four snowflakes, and four
     * bubbles. At least one ball must use the default constructor (passing only
     * *this* as a parameter) I have made the first ball for you.
     * 
     * SUMMATIVE OPTIONAL Use *arrays* to store the elements, rather than individual
     * variables.
     */

    Ball b1 = new Ball(this); // default

    public void settings() {
        size(500, 500);
    }

    public void setup() {
    }

    public void draw() {
        // paint the background gray
        background(100);

        /*
         * SUMMATIVE REQUIRED Draw and move all balls, snowflakes, and bubbles
         */
        b1.drawBall();
        b1.moveBall();
    }

    /*
     * SUMMATIVE OPTIONAL Add a method called mousePressed() that stops some or all
     * of the balls from moving when you click the mouse.
     * 
     * EXTRA CHALLENGE - can you make it so that only the ball you actually CLICKED
     * stops? (this is a major challenge - you can use the variable mouseX and
     * mouseY to see where the mouse was clicked.)
     */

    public static void main(String[] args) {
        PApplet.main("Sketch");
    }
}
