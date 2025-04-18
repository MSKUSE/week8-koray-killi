public class TestShape {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle("blue",3,4);
        Rectangle r2 = new Rectangle("blue",3,4);
        System.out.println(r1.equals(r2));
    }
}