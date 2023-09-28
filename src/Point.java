public class Point {
    private int x;
    private int y;

    public Point(int a, int b) {
        this.x = a;
        this.y = b;
    }
    public Point(int a) {
        this.x = a;
        this.y = a;
    }
    public Point() {
        this.x = 0;
        this.y = 0;
    }
    public int getX() {
        return this.x;
    }
    public int getY() {
        return this.y;
    }
    public int setX(int a) {
        x = a;
        return x;
    }
    public int setY(int b) {
        y = b;
        return y;
    }
    public String coordinate() {
        return "(" + x + ", " + y + ")";
    }
    public String quadrant() {
        if (y > 0 && x > 0) {
            return "Quadrant I";
        }else if(y < 0 && x > 0) {
            return "Quadrant IV";
        }else if (y > 0 && x < 0) {
            return "Quadrant II";
        }else if (y < 0 && x < 0){
            return "Quadrant III";
        }else if (y == 0 && x == 0) {
            return "Origin";
        }else if (y != 0 && x == 0) {
            return "On the Y axis";
        }else {
            return "On the X axis";
        }

    }


}
