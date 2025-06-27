package ss6_ke_thua.bai_tap.lop_point_va_moveablepoint;

public class TestMoveablePoint {
    public static void main(String[] args) {
        MoveablePoint moveablePoint = new MoveablePoint();
        moveablePoint.setX(10);
        moveablePoint.setY(20);
        moveablePoint.setXSpeed(500);
        moveablePoint.setYSpeed(500);
        MoveablePoint newMoveablePoint =  moveablePoint.move();
        System.out.println(newMoveablePoint);
    }
}
