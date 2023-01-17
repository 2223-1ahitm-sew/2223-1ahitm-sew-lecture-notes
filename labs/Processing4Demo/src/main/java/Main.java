import processing.core.PApplet;

public class Main extends PApplet {

    // eine globale Konstante
    final int X = 250;
    final int WINDOW_HEIGHT = 600;
    final int WINDOW_WIDTH = 500;

    public static void main(String[] args) {
        PApplet.main("Main", args);
    }

    public void settings() {
        size( WINDOW_WIDTH, WINDOW_HEIGHT);
    }

    public void setup() {
    }

    public void draw() {
//        if (mousePressed) {
//            fill(0);
//        } else {
//            fill(255);
//        }
//        ellipse(mouseX, mouseY, 80, 80);


        int maxCircles = 5;

        int radius = 200;
        int y = WINDOW_HEIGHT - radius / 2;
        fill(255);

        drawCircle( y, radius);

        int previousRadius = radius;
        radius = radius * 2 / 3;
        y = y - previousRadius / 2 - radius / 2;
        drawCircle( y, radius);

        previousRadius = radius;
        radius = radius * 2 / 3;
        y = y - previousRadius / 2 - radius / 2;
        drawCircle( y, radius);

        for (int i = 0; i < maxCircles; i++) {
            previousRadius = radius;
            radius = radius * 2 / 3;
            y = y - previousRadius / 2 - radius / 2;
            fill(185);
            drawCircle( y, radius);
        }


    }

    public void drawCircle(int y, int radius) {
        ellipse(X, y, radius, radius);
    }

}