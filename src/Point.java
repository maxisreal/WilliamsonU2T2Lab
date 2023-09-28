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
    public void getX() {
        return this.x;
    }
    public void getY() {
        return this.y;
    }
    public void setX(int a) {
        x = a;
        return x;
    }
    public void setY(int b) {
        y = b;
        return y;
    }
    public void coordinate() {
        return "(" + x + ", " + y + ")";
    }
    public void quadrant() {
        if (y > 0 && x > 0) {
            return "Quadrant I";
        }else if(y < 0 && x > 0) {
            return "Quadrant IV";
        }else if (y > 0 && x < 0) {
            return "Quadrant II";
        }else if (y < 0 && x < 0){
            return "Quadrant III";
        }else if (y = 0 && x = 0) {
            return "Origin";
        }else if (y != 0 && x = 0) {
            return "On the Y axis";
        }else {
            return "On the X axis";
        }

    }


}
