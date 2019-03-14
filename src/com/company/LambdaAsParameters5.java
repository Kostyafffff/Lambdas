package com.company;

public class LambdaAsParameters5 {
    public static void main(String[] args) {

        //их можно передавать в качестве параметров в методы

        Expression func = (n)-> n % 2 != 0;
        int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        System.out.println(sum(nums, func));
    }
    /*Функциональный интерфейс Expression определяет метод isEqual(),
    который возвращает true, если в отношении числа n действует какое-нибудь равенство.
    */

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
}

interface Expression{
    boolean isEqual(int n);
}
