package com.company;

public class Main {

    //функция быстрого возведения в степень
    //Пусть m=(mkmk−1...m1m0)2 — двоичное представление степени n
    //Тогда n=mk⋅2k+mk−1⋅2k−1+...+m1⋅2+m0, где mk=1,mi∈{0,1} и xn=x^((...((mk⋅2+mk−1)⋅2+mk−2)⋅2+...)⋅2+m1)⋅2+m0
    public static int fastPower(int value, int pow){
        int valueTemp = value;
        int powTemp = pow;
        int toReturn = 1;

        while(powTemp > 0){
            if (powTemp % 2 == 1){
                toReturn *= valueTemp;
            }

            valueTemp *= valueTemp;
            powTemp /= 2;
        }

        return toReturn;
    }

    //расширенный алгоритм Евклида для вычисления НОД
    //умножение чисел всегда быстрее, чем разложение результата на простые множители
    public static int extEuclid(){

    }

    public static int fi(int p, int q){
        int toReturn = (p - 1) * (q - 1);
        return toReturn;

    }

    public static void main(String[] args) {
	// write your code here
    }
}
