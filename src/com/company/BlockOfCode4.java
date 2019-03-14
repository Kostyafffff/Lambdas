package com.company;

public class BlockOfCode4 {
    public static void main(String[] args) {

        /*однострочное выражение и блок кода.
        Примеры однострочных выражений демонстрировались выше.
        Блочные выражения обрамляются фигурными скобками.
        Вблочных лямбда-выражениях можно использовать внутренние
        вложенные блоки, циклы, конструкции if, switch, создавать переменные и т.д. Если блочное лямбда-выражение должно возвращать значение, то явным образом применяется оператор return
        */

        Main1.Operationable operation = (int x, int y)-> {

            if( y==0 )
                return 0;
            else
                return x/y;
        };

        System.out.println(operation.calc(100, 10)); //10
        System.out.println(operation.calc(20, 0)); //0
    }
}
