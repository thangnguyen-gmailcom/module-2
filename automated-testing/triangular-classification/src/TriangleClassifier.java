public class TriangleClassifier {
    public static String checkTriangle(int a, int b, int c) {
        if (isInvalidTriangle(a, b, c))
            return "khong la tam giac";

        if (isEquilateralTriangle(a, b, c))
            return "tam giac deu";

        if (isIsoscelesTriangle(a, b, c))
            return "tam giac can";

        return "tam giac thuong";
    }

    private static boolean isIsoscelesTriangle(int a, int b, int c) {
        return (a == b) || (a == c) || (b == c);
    }

    private static boolean isEquilateralTriangle(int a, int b, int c) {
        return a == b && a == c;
    }

    private static boolean isInvalidTriangle(int a, int b, int c) {
        return !isEdgeGreaterThan0(a, b, c) || (a + b <= c) || (a + c <= b) || (b + c <= a);
    }

    private static boolean isEdgeGreaterThan0(int a, int b, int c) {
        return a > 0 && b > 0 && c > 0;
    }
}
