package com.driver;

public class Main {
    //creating class a
    public static class A{
        public String meth(){
            return "Invoking method from class A";
        }
    }
    public static class B extends A{
        @Override
        public String meth(){
            return "Invoking method from class B";
        }
    }
    public static void main(String[] args) {
        B obj = new B();
        //method from class A is invoked
        System.out.println(obj.meth());
        //now method From class B
        System.out.println(obj.meth());

    }
}