import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Tranning {
    private static final String ACCOUNT_REGEX ="^_?\\w{6}_?$";
    public static final String[] validAccount = new String[]{"123abc_", "_abc123", "______", "123456", "abcdefgh"};
    public static final String[] invalidAccount = new String[]{".@", "12345", "1234_", "abcde"};

    public static void main(String[] args) {
            Pattern p= Pattern.compile(ACCOUNT_REGEX);
            Matcher m=p.matcher("abc124_");
            Matcher i=p.matcher("_abc123");
            System.out.println(m.matches());
            System.out.println(i.matches());

            for (int k=0;k<validAccount.length;k++) {
                Pattern q =Pattern.compile(ACCOUNT_REGEX);
                Matcher w=q.matcher(validAccount[k]);
                System.out.println("Account is "+validAccount[k]+" is valid: "+w.matches());
            }


    }
}
