package com.company;

// класс, в котором определены методы
class ExpressionHelper{

    static boolean isEven(int n){

        return n % 2 == 0;
    }

    static boolean isPositive(int n){

        return n > 0;
    }
}
public class LinkOnMethods5 {
    public static void main(String[] args) {

        /*
        Здесь также определен функциональный интерфейс Expression,
        который имеет один метод. Кроме того, определен класс ExpressionHelper,
         который содержит два статических метода. В принципе их можно было определить
         и в основном классе программы, но я вынес их в отдельный класс.

В основном классе программы LambdaApp определен метод sum(), который возвращает сумму элементов массива, соответствующих некоторому условию. Условие передается в виде объекта функционального интерфейса Expression.
         */
        int[] nums = { -5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5};
        System.out.println(sum(nums, ExpressionHelper::isEven));

        Expression expr = ExpressionHelper::isPositive;
        System.out.println(sum(nums, expr));
    }

    private static int sum (int[] numbers, Expression func)
    {
        int result = 0;
        for(int i : numbers)
        {
            if (func.isEqual(i))
                result += i;
        }
        return result;
    }


    // функциональный интерфейс
    interface Expression{
        boolean isEqual(int n);
    }
}
