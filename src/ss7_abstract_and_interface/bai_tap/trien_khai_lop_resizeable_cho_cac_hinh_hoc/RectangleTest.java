package ss7_abstract_and_interface.bai_tap.trien_khai_lop_resizeable_cho_cac_hinh_hoc;

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);

        rectangle = new Rectangle(2.3, 5.8);
        System.out.println(rectangle);

        rectangle = new Rectangle(2.5, 3.8, "orange", true);
        System.out.println(rectangle);

        rectangle.resize((double) 50/100);
        System.out.println(rectangle);
    }
}
