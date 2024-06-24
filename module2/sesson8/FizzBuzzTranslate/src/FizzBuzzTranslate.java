
public class FizzBuzzTranslate {
    public static String checkFizzBuzz(int number) {
        if (number % 3 == 0 && number % 5 == 0) {
            return "FizzBuzz";
        }
        else if (number % 3 == 0) {
            return "Fizz";
        }
        else if (number % 5 == 0) {
            return "Buzz";
        }

        else if (number % 3 != 0 && number % 5 != 0) {
            return String.valueOf(number);
        }else {
            convertNumberToWord(number);
        }
        return "";
    }

    private static String convertNumberToWord(int number) {
        String[] ones = {"", "một", "hai", "ba", "bốn", "năm", "sáu", "bảy", "tám", "chín"};
        String[] tens = {"", "mười", "hai mươi", "ba mươi", "bốn mươi", "năm mươi", "sáu mươi", "bảy mươi", "tám mươi", "chín mươi"};

        if (number < 10) {
            return ones[number];
        } else if (number % 10 == 0) {
            return tens[number / 10];
        } else {
            return tens[number / 10] + " " + ones[number % 10];
        }
    }
}