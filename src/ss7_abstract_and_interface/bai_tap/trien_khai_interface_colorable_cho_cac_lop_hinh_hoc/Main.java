package ss7_abstract_and_interface.bai_tap.trien_khai_interface_colorable_cho_cac_lop_hinh_hoc;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle();
        shapes[1] = new Rectangle();
        shapes[2] = new Square();
        for (Shape shape : shapes) {
            System.out.println(shape);
            if (shape instanceof Circle circle) {
                System.out.println(circle.getArea());
            }
            else if (shape instanceof Rectangle rectangle) {
                System.out.println(rectangle.getArea());
            }
            else if (shape instanceof Square square) {
                System.out.println(square.getArea());
            }
            if (shape instanceof IColorable) {
                ((IColorable) shape).howToColor();
            }
        }
    }
}
