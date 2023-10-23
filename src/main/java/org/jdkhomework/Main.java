package org.jdkhomework;

import org.jdkhomework.Calc.Calculator;

public class Main {
    public static void main(String[] args) {
        //Задание № 1
        System.out.println(Calculator.sum(4, 5.5));
        System.out.println(Calculator.multiply(10.7, 4.8));
        System.out.println(Calculator.divide(4, 0));
        System.out.println(Calculator.subtract(17.7, 3.7));
        System.out.println();
        //Задание № 2
        String[] array1= {"d","f","3"};
        String[] array2= {"d","f","3"};
        Integer[] array3= {2,4,3};
        System.out.println(GeneralizedMethod.compareArrays(array1,array2));
        System.out.println(GeneralizedMethod.compareArrays(array1,array3));
        System.out.println(GeneralizedMethod.compareArrays(array2,array3));

        //Задание № 3
        Pair<String,Integer> pair= new Pair<>("Привет",1);
        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());
        System.out.println(pair);
    }

}