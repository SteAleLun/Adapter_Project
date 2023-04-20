package org.example;

import calculator.Calculator;

/*Создайте класс IntsCalculator, укажите что он имплементирует интерфейс Ints, реализуйте его методы
 через обращение к объекту класса Calculator.Calculator:
 */
public class IntsCalculator implements Ints {
    protected final Calculator target;

    public IntsCalculator() {
        this.target = new Calculator();
    }

    @Override
    public int sum(int arg0, int arg1) {
        return (int) target.newFormula()
                .addOperand(arg0).addOperand(arg1)
                .calculate(Calculator.Operation.SUM)
                .result();
    }

    @Override
    public int mult(int arg0, int arg1) {
        return (int) target.newFormula()
                .addOperand(arg0).addOperand(arg1)
                .calculate(Calculator.Operation.MULT)
                .result();
    }

    @Override
    public int pow(int a, int b) {
        return (int) target.newFormula()
                .addOperand(a).addOperand(b)
                .calculate(Calculator.Operation.POW)
                .result();
    }
}

