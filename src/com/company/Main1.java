package com.company;

import jdk.dynalink.Operation;

public class Main1 {
  /*
    План:
    1) Что такое лямбда
    2) Зачем необходимо использовать
   */
    public static void main(String[] args) {
// Определяем ссылки на интерфейс
    Operationable operation;
    Operationable operationMult;
    Operationable operationDivide;

    //создание выражения
        operation = (x, y) -> x - y;
        operationMult = (x, y) -> x * y;
        operationDivide = (x, y) -> x / y;

        //использование в виде вызова метода интерфейса
        int result = operation.calc(5, 7);
        System.out.println(result);

        //тип данных можно не указывать
        int multResult = operationMult.calc(-2, -3);
        System.out.println(result);


        /*
            Пример терминально лямбда выражения, которое не возвращает значения
       */
        Printable printer = s-> System.out.println(s);
        printer.print("Hello Java!");

        /*
        Лямбда-выражение представляет собой блок кода,
        который можно передать в другое место,
        поэтому он может быть выполнен позже, один или несколько раз.
         */

        /*
        Также могу использовать переменные,
         которые объявлены на уровне класса или метода,
         использования переменных уровня класса
         */

    }

    interface Operationable{
        int calc(int x, int y);
    }


    interface Printable{
        void print(String s);
    }
}
