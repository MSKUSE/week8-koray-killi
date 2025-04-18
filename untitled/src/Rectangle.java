import org.w3c.dom.css.Rect;

public class Rectangle extends Shape {

    private int sideA = 0;
    private int sideB = 0;

    public Rectangle() {

    }
    public Rectangle(int sideB, int sideA) {
        this.sideB = sideB;
        this.sideA = sideA;
    }

    public Rectangle(String color, int sideB, int sideA) {
        super(color);
        this.sideB = sideB;
        this.sideA = sideA;
    }

    public int getSideA() {
        return sideA;
    }

    public void setSideA(int sideA) {
        this.sideA = sideA;
    }

    public int getSideB() {
        return sideB;
    }

    public void setSideB(int sideB) {
        this.sideB = sideB;
    }

    @Override
    public void describe(){
        super.describe();
        System.out.println("Side A " + sideA+ ", Side B "+ sideB);
    }

    @Override
    public boolean equals(Object obj) {
        Rectangle rectangle = (Rectangle) obj;
        if (this.sideA == rectangle.sideA
        && this.sideB == rectangle.sideB
        && this.getColor().equals(rectangle.getColor())){
            return true;
        } else {
            return false;
        }
    }
}
