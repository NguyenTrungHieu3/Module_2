package ss19_string.thuc_hanh;

import java.util.regex.Pattern;

public class TemplateRegex {
    //*
    // . Khớp với bất kỳ ký tự nào
    // ^ Khớp tại điểm bắt đầu
    // $ Khớp tại điểm kết thúc
    // [abc] Khớp a hoặc b hoặc c
    // [abc][vz] Khớp a hoặc b hoặc c và theo sau là v hoặc z
    // [^abc] Khớp bất kỳ ký tự nào ngoại trừ a hoặc b hoặc c
    // [a-d1-7] Phù hợp với chuỗi từ a-d và con số từ 1-7
    // X|Z Tìm X hoặc Z
    // XZ Tìm X và theo sau là Z
    // \d Số bất kỳ, viết tắt của [0-9]
    // \D Không phải số, viết tắt của [^0-9]
    // \s Ký tự khoảng trắng, viết tắt của [\t\n\x0b\r\f]
    // \S Không phải ký tự khoảng trắng, viết ngắn gọn của [^s]
    // \w Ký tự chữ, viết ngắn gọn của [a-zA-z_0-9]
    // \W Ký tự không phải chữ, viết ngắn gọn của [^w]
    // \S+ Một ký tự không phải khoảng trắng (Một hoặc nhiều)
    // \b Ký tự thuộc a-zA-z_0-9 ví dụ //bjava//b => hello java, java is cool, Xjavascript
    // * Xuất hiện 0 hoặc nhiều lần, viết gọn của {0,}
    // + Xuất hiện 1 hoặc nhiều lần, viết gọn của {1,}
    // ? Xuất hiện 0 hoặc 1 lần, viết gọn của {0,1}
    // {X} Xuất hiện X lần
    // {X,Y} Xuất hiện trong khoảng X đến Y lần
    // *? * Có nghĩa là xuất hiện 0 hoặc nhiều lần, thêm ? phía sau là tìm khớp nhỏ nhất
    // *//

    // Validate tên class
//    public static boolean checkClasName(String className){
//        String regexClasName = "^C((0[1-9])|(1[0-2]))\\d{2}[GL][1-9]-JV10[13]$";
//        return  className.matches(regexClasName);
//    }

    // validate email
//    private static final String EMAIL_REGEX = "^[A-Za-z0-9.%+-]+@[A-Za-z0-9.-]+(\\.[A-Za-z]{2,})+$";

    // validate ngày
//    pattern = Pattern.compile("^\\d{1,2}[-|/]\\d{1,2}[-|/]\\d{4}$");

    // Validate nhập số nguyên dương lớn hơn 1 số
//    Scanner scanner = new Scanner(System.in);
//    int minValue = 100;
//    int number;
//
//        while (true) {
//        System.out.print("Nhập số nguyên dương > " + minValue + ": ");
//        String input = scanner.nextLine();
//
//        // Kiểm tra input có phải là số nguyên (không chứa dấu chấm)
//        if (input.matches("\\d+")) {
//            number = Integer.parseInt(input);
//            if (number > minValue) {
//                System.out.println("✅ Hợp lệ: " + number);
//                break;
//            } else {
//                System.out.println("❌ Số phải lớn hơn " + minValue);
//            }
//        } else {
//            System.out.println("❌ Không hợp lệ. Không được nhập số thực, chữ, hay ký tự đặc biệt.");
//        }
//    }

    // validate ngày lớn hơn ngày hiện tại
//    Scanner scanner = new Scanner(System.in);
//    LocalDate inputDate = null;
//    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//
//        while (true) {
//        System.out.print("Nhập ngày (định dạng dd/MM/yyyy): ");
//        String input = scanner.nextLine();
//
//        try {
//            inputDate = LocalDate.parse(input, formatter);
//            LocalDate today = LocalDate.now();
//
//            if (inputDate.isAfter(today)) {
//                System.out.println("✅ Ngày hợp lệ: lớn hơn ngày hiện tại.");
//                break;
//            } else {
//                System.out.println("❌ Ngày phải lớn hơn hôm nay (" + today.format(formatter) + ").");
//            }
//        } catch (DateTimeParseException e) {
//            System.out.println("❌ Sai định dạng ngày. Hãy nhập đúng kiểu dd/MM/yyyy.");
//        }
//    }
}
