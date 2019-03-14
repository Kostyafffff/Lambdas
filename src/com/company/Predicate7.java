package com.company;

import java.util.Scanner;
import java.util.function.*;

public class Predicate7 {
    /*Функциональный интерфейс
    Predicate<T> проверяет соблюдение
    некоторого условия. Если оно соблюдается, то возвращается значение true.
    В качестве параметра лямбда-выражение принимает объект типа T
     */
    public void main(String[] args) {

        Predicate<Integer> isNegative = x -> x < 0;

        System.out.println(isNegative.test(5)); // false
        System.out.println(isNegative.test(-7)); // true


/*
BinaryOperator<T>
принимает в качестве параметра два объекта типа T,
выполняет над ними бинарную операцию и возвращает ее
результат также в виде объекта типа T:
 */
        BinaryOperator<Integer> multiply = (x, y) -> x * y;

        System.out.println(multiply.apply(3, 5)); // 15
        System.out.println(multiply.apply(10, -2)); // -20

/*
принимает в качестве параметра объект типа T,
выполняет над ними операции и возвращает результат операций в виде объекта типа T:
 */
        UnaryOperator<Integer> square = x -> x * x;
        System.out.println(square.apply(7)); // 49

        //представляет функцию перехода от объекта типа T к объекту типа R
        Function<Integer, String> convert = x-> String.valueOf(x) + " EURO";
        System.out.println(convert.apply(5));


        //ыполняет некоторое действие над объектом типа T, при этом ничего не возвращая

        Consumer<Integer> printer = x -> System.out.printf("%d долларов \n", x);
        printer.accept(600); // 600 долларов

        //Supplier<T> не принимает никаких аргументов, но должен возвращать объект типа T:
        Supplier<User> userFactory = ()->{

            Scanner in = new Scanner(System.in);
            System.out.println("Введите имя: ");
            String name = in.nextLine();
            return new User(name);
        };

        User user1 = userFactory.get();
        User user2 = userFactory.get();

        System.out.println("Имя user1: " + user1.getName());
        System.out.println("Имя user2: " + user2.getName());
    }
    class User{

        private String name;
        String getName(){
            return name;
        }

        User(String n){
            this.name = n;
        }
    }
}
