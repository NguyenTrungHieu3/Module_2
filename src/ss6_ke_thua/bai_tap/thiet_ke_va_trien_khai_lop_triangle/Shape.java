package ss6_ke_thua.bai_tap.thiet_ke_va_trien_khai_lop_triangle;

public abstract class Shape {
    private String color;

    public Shape() {
        this.color = "black";
    }

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "A shape with color of " + color;
    }
}
