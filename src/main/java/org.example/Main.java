package org.example;

/*Создайте класс Main, продемонстрируйте использование и возможности вашего
  класса (например, как выше в условии), обращайтесь к нему как к объекту интерфейса Ints.
   */
public class Main {
    public static void main(String[] args) {
        Ints intsCalc = new IntsCalculator();
        System.out.println(intsCalc.sum(2, 2));
        System.out.println(intsCalc.mult(10, 22));
        System.out.println(intsCalc.pow(2, 6));
    }

}
