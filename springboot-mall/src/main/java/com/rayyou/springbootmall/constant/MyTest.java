package com.rayyou.springbootmall.constant;

public class MyTest {
    public static void main(String[] args) {
        ProductCategory productCategory = ProductCategory.FOOD;
        String s = productCategory.name();
        System.out.println(s);

        String s2 = "CAR";
        ProductCategory productCategory1 = productCategory.valueOf(s2);
        System.out.println(productCategory1);
    }
}
