package ss19_string.thuc_hanh;

public class ExampleUseStringBuilder {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Welcome");
        stringBuilder.append(" ");
        stringBuilder.append("to");
        stringBuilder.append(" ");
        stringBuilder.append("Java");
        System.out.println(stringBuilder);
        stringBuilder.insert(11, "HTML and ");
        System.out.println(stringBuilder);
        stringBuilder.delete(8, 11);
        System.out.println(stringBuilder);
        stringBuilder.deleteCharAt(8);
        System.out.println(stringBuilder);
        stringBuilder.reverse();
        System.out.println(stringBuilder);
        stringBuilder.replace(11, 15, "Hello everyone");
        System.out.println(stringBuilder);
        stringBuilder.setCharAt(0, 'H');
        System.out.println(stringBuilder);
    }
}
