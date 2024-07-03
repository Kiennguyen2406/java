import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DateFormat {
    public static void main(String[] args) {
        String currentDate = "24/12/2024";
        isDateFormat(currentDate);
        System.out.println(isDateFormat(currentDate));
    }

    private static boolean isDateFormat(String day) {
        //b1: Điền 2 chữ so thể hiện ngày chay tu 01 den 31.[1-2][0-9]|(3)[0-1]||(0)[1-9]
        //b2:dien 2 chu so the hien tháng tu .(0)[1-9]|(1)[0-2]
//        b3;Điền 4 chữ so thể hiện ngày. [0-9]{4}$

        String dateFormat="^([1-2][0-9]|(3)[0-1]|(0)[1-9])/((0)[1-9]|(1)[0-2])/([0-9]{4})$";
        Pattern pattern=Pattern.compile(dateFormat);
        Matcher matcher=pattern.matcher(day);
        return  matcher.matches();
    }
}
