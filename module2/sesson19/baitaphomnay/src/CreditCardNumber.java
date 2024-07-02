import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CreditCardNumber {
    public static void main(String[] args) {
        String cardCode = "1233-5857-5757-5754" ;
        IsCreditCardNumber(cardCode);
        System.out.println(IsCreditCardNumber(cardCode));
    }
    private static boolean IsCreditCardNumber(String cardCode) {
        //b1:4 chu so tu 0 den 9 [0-9]{4}
        //b2:sau 4 chu so là dấu -.
        //b3:4 chu so tu 0 den 9 [0-9]{4}
        //b4:sau 4 chu so là dấu -.
        //b5:4 chu so tu 0 den 9 [0-9]{4}
        //b6:sau 4 chu so là dấu -.
        //b7:4 chu so tu 0 den 9 [0-9]{4}
        String creditCardNumber = "^[0-9]{4}-[0-9]{4}-[0-9]{4}-[0-9]{4}$";
        Pattern pattern = Pattern.compile(creditCardNumber);
        Matcher matcher = pattern.matcher(cardCode);
        return matcher.matches();
    }
}
