package ss7_abstract_and_interface.bai_tap.trien_khai_lop_resizeable_cho_cac_hinh_hoc;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle();
        shapes[1] = new Rectangle();
        shapes[2] = new Circle();
        System.out.println("Các hình trước khi resize: ");
        for (Shape shape : shapes) {
            System.out.println(shape);
            if (shape instanceof Circle circle) {
                System.out.println(circle.getArea());
            }
            else if (shape instanceof Rectangle rectangle) {
                System.out.println(rectangle.getArea());
            }
        }

        System.out.println("Các hình sau khi resize là: ");
        for (Shape shape : shapes) {
            if (shape instanceof Circle circle) {
                circle.resize((double)50/100);
                System.out.println(circle);
                System.out.println(circle.getArea());
            }
            else if (shape instanceof Rectangle rectangle) {
                rectangle.resize((double)50/100);
                System.out.println(rectangle);
                System.out.println(rectangle.getArea());
            }
        }
    }
}
