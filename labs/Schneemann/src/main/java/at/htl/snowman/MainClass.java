package at.htl.snowman;

import processing.core.PApplet;

public class MainClass extends PApplet {

    final int WINDOWS_HEIGHT = 800;
    final int WINDOWS_WIDTH = 500;

    public static void main(String[] args) {
        PApplet.main("at.htl.snowman.MainClass", args);
    }

    public void settings() {
        size(WINDOWS_WIDTH, WINDOWS_HEIGHT);
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

        int anzahlKugeln = 5;

        // 1. Kugel
        fill(255);
        int durchmesser = 200;
        int y = WINDOWS_HEIGHT - durchmesser / 2;

        circle(WINDOWS_WIDTH / 2, y, durchmesser);


        for (int i = 0; i < anzahlKugeln; i++) {
            if (i % 2 == 0) {
                fill(200);
            } else {
                fill(255);
            }
            durchmesser = durchmesser * 2 / 3;
            y = drawCircle(durchmesser, y);
        }
    }

    public int drawCircle(int durchmesser, int y) {
        int vorherigerDurchmesser = durchmesser * 3 / 2;
        y = y - vorherigerDurchmesser / 2 - durchmesser / 2;
        circle(WINDOWS_WIDTH / 2, y, durchmesser);
        return y;
    }

    public void circle(int x, int y, int durchmesser) {
        ellipse(x, y, durchmesser, durchmesser);
    }
}
