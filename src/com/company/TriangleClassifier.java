package com.company;

public class TriangleClassifier {

    public static final String IS_NOT_A_TRIANGLE = "Is not a triangle";
    public static final String IS_ISOSCELES_TRIANGLE = "Is isosceles triangle";
    public static final String IS_RIGHT_TRIANGLE = "Is right triangle";
    public static final String IS_RIGHT_ISOSCELES_TRIANGLE = "Is right isosceles triangle";
    public static final String IS_EQUILATERAL_TRIANGLE = "Is equilateral triangle";
    public static final String IS_NORMAL_TRIANGLE = "Is normal triangle";

    public static String triangle(double edge1, double edge2, double edge3) {
        boolean isTriangle = (edge1 + edge2 > edge3) && (edge1 + edge3 > edge2) && (edge2 + edge3 > edge1);

//        Không phải tam giác
        if (!isTriangle)
            return IS_NOT_A_TRIANGLE;

//        Điều kiện tam giác cân
        boolean isIsoscelesTriangle = (edge1 == edge2 || edge2 == edge3 || edge1 == edge3);

//        Điều kiện tam giác vuông
        boolean isRightTriangle = (edge1 * edge1 + edge2 * edge2 == edge3 * edge3) ||
                (edge1 * edge1 + edge3 * edge3 == edge2 * edge2) ||
                (edge2 * edge2 + edge3 * edge3 == edge1 * edge1);

//        Điều kiện tam giác đều
        boolean isEqualateralTriangle = (edge1 == edge2 && edge2 == edge3);

//        Tam giác vuông cân
        if (isRightTriangle && isIsoscelesTriangle)
            return IS_RIGHT_ISOSCELES_TRIANGLE;

//        Tam giác đều
        if (isEqualateralTriangle)
            return IS_EQUILATERAL_TRIANGLE;

//        Tam giác vuông
        if (isRightTriangle)
            return IS_RIGHT_TRIANGLE;

//        Tam giác cân
        if (isIsoscelesTriangle)
            return IS_ISOSCELES_TRIANGLE;

//        Tam giác thường
        return IS_NORMAL_TRIANGLE;
    }
}
