package ss15_xu_ly_ngoai_le_debug.bai_tap.su_dung_lop_illegal_triangle_exception;

public class IllegalTriangleException extends Exception{
    public IllegalTriangleException(){
        super("Illegal triangle");
    }
    public IllegalTriangleException(String message){
        super(message);
    }
}
