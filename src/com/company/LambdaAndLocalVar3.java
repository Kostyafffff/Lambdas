package com.company;

public class LambdaAndLocalVar3 {

    static int x = -2;
    static int y = 4;

    public static void main(String[] args) {
        /*
            Лямбда-выражение может использовать переменные,
            которые объявлены во вне в более общей области видимости - на уровне класса или метода,
            в котором лямбда-выражение определено. Однако в зависимости от того, как и где определены переменные,
            могут различаться способы их использования в лямбдах.
        */
        Operation op = ()->{
            x = 30;
            return x + y;
        };
        System.out.println(op.calculate()); // 34
        System.out.println(x); // 30 - значение x изменилось
    }
    interface Operation{
        int calculate();
    }
}
