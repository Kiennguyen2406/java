public class TriangleClassifier {
    public static String checkTriangle(int a, int b, int c) {
        if (a == 0 && b >= 0 && c >= 0) {
            return "không phải là tam giác";
        }
        if (a == b && a == c && b == c) {
            return "Tam giác đều";
        }
        if (a == b || a == c || b == c) {
            return "Tam giác cân";
        }
        if (a != b && a != c && c != b && a<b+c) {
            return "Tam giác thường";
        }
        if (a + b <= c || a + c <= b || c + b <= a) {
            return "không phải là tam giác";
        }
        if (a < -1 && b > 0 && c > 0) {
            return "không phải là tam giác";
        }
        return "";
    }

}
