import java.util.regex.Matcher;
import java.util.regex.Pattern;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String ACCOUNT_REGEX="^[C|A|P]+[0-9]{4}[G|H|I|K]$";
        String[]validAccount=new String[] {"C0223G","A0323K"};
        String[]invalidAccount=new String[] {"M0318G","P0323A"};

        Pattern pattern=Pattern.compile(ACCOUNT_REGEX);
        for (int i=0;i<validAccount.length;i++) {
            Matcher matcher = pattern.matcher( validAccount[i]);
            System.out.println("ten lop :"+validAccount[i] +" "+ "hop le"+" "+ matcher.matches() );
        }
        for (int i=0;i<invalidAccount.length;i++) {
            Matcher matcher = pattern.matcher( invalidAccount[i]);
            System.out.println("ten lop :"+invalidAccount[i] +" "+ "ko hop le"+" "+ matcher.matches() );
        }
    }
}