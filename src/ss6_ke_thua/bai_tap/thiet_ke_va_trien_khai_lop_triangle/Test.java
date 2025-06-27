package ss6_ke_thua.bai_tap.thiet_ke_va_trien_khai_lop_triangle;

public class Test {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        System.out.println(triangle);
        System.out.println(triangle.getArea());
        System.out.println(triangle.getPerimeter());

        Triangle triangle2 = new Triangle(3,4,5);
        System.out.println(triangle2);
        System.out.println(triangle2.getArea());
        System.out.println(triangle2.getPerimeter());
    }
}
