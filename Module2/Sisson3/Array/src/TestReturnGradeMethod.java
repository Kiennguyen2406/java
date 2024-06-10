public class TestReturnGradeMethod {
    public static void main(String[] args) {
        char a=getGrade(80.5);
        System.out.println("Điểm của bạn xếp là: "+a);
    }
    public static char getGrade(double score) {
        if (score >= 90) {
            return 'A';
        }else if (score >= 80) {
            return 'B';
        }else if (score >= 70) {
            return 'C';
        }else if (score >= 60) {
            return 'D';
        }else {
            return 'F';
        }
    }
}
