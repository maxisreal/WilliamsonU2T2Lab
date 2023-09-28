public class RectangleRunner {
    public static void main(String[] args) {
        Rectangle recty = new Rectangle(150, 200);
            recty.setWidth(75);
        Rectangle rectory = new Rectangle(125);
            rectory.setWidth(75);
            rectory.setLength(75);
        Rectangle rector = new Rectangle();
            rector.setWidth(75);

            int lazy = rectory.calculateArea() + rector.calculateArea() + recty.calculateArea();
            System.out.println("These three plots cover " + lazy + " acres for planting seed.");
    }
}


