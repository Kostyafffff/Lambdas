package com.company;

public class TerminalLambdas2 {
    public static void main(String[] args) {

        //лямбды не возрващающие значения, аналог void

        Printable printer = System.out::println;
        printer.print("Hello Java!");
    }

    interface Printable{
        void print(String s);
    }
}
