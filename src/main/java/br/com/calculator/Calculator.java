package br.com.calculator;

public class Calculator {

    public int somar(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public double somar(int firstNumber, double secondNumber) {
        return firstNumber + secondNumber;
    }

    public double somar(double firstNumber, double secondNumber) {
        return firstNumber + secondNumber;
    }

    public int subtrair(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }

    public double subtrair(int firstNumber, double secondNumber) {
        return firstNumber - secondNumber;
    }

    public double subtrair(double firstNumber, double secondNumber) {
        return firstNumber - secondNumber;
    }

    public int multiplicar(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    public double multiplicar(int firstNumber, double secondNumber) {
        return firstNumber * secondNumber;
    }

    public double multiplicar(double firstNumber, double secondNumber) {
        return firstNumber * secondNumber;
    }

    public String dividir(int firstNumber, int secondNumber) {
        try {
            String result = "" + firstNumber / secondNumber;
            return result;
        } catch (ArithmeticException e) {
            throw new ArithmeticException("Não é possível fazer esta divisão por 0!");
        }
    }
}
