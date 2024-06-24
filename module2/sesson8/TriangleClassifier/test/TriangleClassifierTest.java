import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleClassifierTest {
    @Test
    public void testTriangleWithEdgeAIsZero() {
        int a = 0;
        int b = 1;
        int c = 1;

        String expected = "không phải là tam giác";


        String actual = TriangleClassifier.checkTriangle(a, b, c);
        assertEquals(expected, actual);

    }

    @Test
    public void testTriangleWithEquilateralTriangle() {
        int a = 2;
        int b = 2;
        int c = 2;

        String expected = "Tam giác đều";


        String actual = TriangleClassifier.checkTriangle(a, b, c);
        assertEquals(expected, actual);

    }

    @Test
    public void testTriangleWithIsoscelesTriangle() {
        int a = 2;
        int b = 2;
        int c = 3;

        String expected = "Tam giác cân";


        String actual = TriangleClassifier.checkTriangle(a, b, c);
        assertEquals(expected, actual);

    }

    @Test
    public void testTriangleWithRegularTriangle() {
        int a = 3;
        int b = 4;
        int c = 5;

        String expected = "Tam giác thường";


        String actual = TriangleClassifier.checkTriangle(a, b, c);
        assertEquals(expected, actual);

    }

    @Test
    public void testTriangleWithEdgeAIsSoBig() {
        int a = 8;
        int b = 2;
        int c = 3;

        String expected = "không phải là tam giác";


        String actual = TriangleClassifier.checkTriangle(a, b, c);
        assertEquals(expected, actual);

    }

    public void testTriangleWithEdgeAIsNegative() {
        int a = -1;
        int b = 2;
        int c = 1;

        String expected = "không phải là tam giác";


        String actual = TriangleClassifier.checkTriangle(a, b, c);
        assertEquals(expected, actual);

    }
}