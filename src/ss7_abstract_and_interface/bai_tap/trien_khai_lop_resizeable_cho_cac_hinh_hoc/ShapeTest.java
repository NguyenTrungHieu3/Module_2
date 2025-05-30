package ss7_abstract_and_interface.bai_tap.trien_khai_lop_resizeable_cho_cac_hinh_hoc;

public class ShapeTest {

    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println(shape);

        shape = new Shape("red", false);
        System.out.println(shape);
    }
}
