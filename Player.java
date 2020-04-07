/*
 * Class: CSE 1321L
 * Section: 06
 * Term: Spring 2020
 * Instructor: Devi Samyuktha S
 * Name: Jabari Norris
 * Assignment 6
 */
package A6;

public class Player {
    private int x;
    private int y;
    public static int maxX = 10;
    public static int maxY = 10;

    public Player(int x, int y) {
        if (x >= 0 && x < maxX && y >= 0 && y < maxY) {
            this.x = x;
            this.y = y;
        } else {
            this.x = 0;
            this.y = 0;
        }

    }


    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void move(char dir) {
        if (dir == 'U') {
            y--;
            if (y < 0) {
                y = maxY - 1;
            }
        } else if (dir == 'D') {
            y++;
            if (y >= maxY) {
                y = 0;
            }
        } else if (dir == 'L') {
            x--;
            if (x < 0) {
                x = maxX - 1;
            }
        } else if (dir == 'R') {
            x++;
            if (x >= maxX) {
                x = 0;
            }
        }
    }

    public String ToString() {
        return "Current location – X: " + x + " Y: " + y;
    }
}


    
    
