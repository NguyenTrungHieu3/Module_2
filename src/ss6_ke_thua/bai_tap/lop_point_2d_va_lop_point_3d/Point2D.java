package ss6_ke_thua.bai_tap.lop_point_2d_va_lop_point_3d;

import java.util.Arrays;

public class Point2D {
    private float x;
    private float y;

    public Point2D() {
        x = 0.0f;
        y = 0.0f;
    }

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float[] getXY() {
        return new float[] {x, y};
    }

    @Override
    public String toString() {
        return "Point2D [x=" + x + ", y=" + y + ", [x,y]" + Arrays.toString(getXY()) + "]";
    }
}
