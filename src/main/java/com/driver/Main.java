package com.driver;

public class Main {


    public static class Product {
        public int product(int x, int y) {
            return 1;
        }
        public int product(int x, int y, int z) {
            return 2;
        }
        public double product(double x, double y) {
            return 3.0;
        }
    }

    public static void main(String args[]){
        Product p = new Product();
        p.product(5,6);
        p.product(5,6,7);
        p.product(5.0,6.1);
        //System.out.println(a+"-"+b+"-"+c);
    }


}