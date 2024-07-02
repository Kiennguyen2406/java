import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidHours {
    public static void main(String[] args) {
        String h = "20:30";

        System.out.println(isValidHours(h));
    }

    private static boolean isValidHours(String hours) {
        //b1: Điền 2 chữ so thể hiện gio chay tu 00->24.[0-1][0-9]|(2)[0-3]
        //b2:Dien 2 chu so the hien phut 00->60.[0-5][0-9]|(60)

        String validHours = "^([0-1][0-9]|(2)[0-3]):([0-5][0-9]|(60))$";
        Pattern pattern = Pattern.compile(validHours);
        Matcher matcher = pattern.matcher(hours);

        return matcher.matches();
    }
}
