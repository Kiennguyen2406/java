import java.util.regex.Matcher;
import java.util.regex.Pattern;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String ACCOUNT_REGEX="\\(84\\)-\\(0[0-9]{9}\\)";
        String validAccount="(84)-(0978489648)";
        String[]invalidAccount=new String[] {"(a8)-(22222222)","(84)-(22b22222)","(84)-(9978489648)"};

        Pattern pattern=Pattern.compile(ACCOUNT_REGEX);
        Matcher matcher=pattern.matcher(validAccount);
        System.out.println(matcher.matches());
    }
}