package br.com.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class CalculatorTest {

    private Calculator calculator = new Calculator();

    @Test
    public void deveSomarDoisNumerosInteiros() {
        Assert.assertEquals(20, calculator.somar(12, 8));
    }

    @Test
    public void deveSomarDoisNumerosDecimais() {
        Assert.assertEquals(32.2F, calculator.somar(21.1F, 11.1F));
    }

    @Test
    public void deveSomarUmNumeroInteiroEUmNumeroDecimal() {
        Assert.assertEquals(6.51, calculator.somar(4, 2.51F));
    }

    @Test
    public void deveSubtrairDoisNumerosInteiros() {
        Assert.assertEquals(-19, calculator.subtrair(30, 49));
    }

    @Test
    public void deveSubtrairDoisNumerosDecimais() {
        Assert.assertEquals(1.13, calculator.subtrair(2.3F, 1.17F));
    }

    @Test
    public void deveSubstrairUmNumeroInteiroEUmNumeroDecimal() {
        Assert.assertEquals(5.6, calculator.subtrair(10, 4.4F));
    }

    @Test
    public void deveMultiplicarDoisNumerosInteiros() {
        Assert.assertEquals(144, calculator.multiplicar(12, 12));
    }

    @Test
    public void deveMultiplicarDoisNumerosDecimais() {
        Assert.assertEquals(12.72, calculator.multiplicar(5.3F, 2.4F));
    }

    @Test
    public void deveMultiplicarUmNumeroInteiroEUmNumeroDecimal() {
        Assert.assertEquals(23.6, calculator.multiplicar(9, 2.6F));
    }

    @Test(expected = ArithmeticException.class)
    public void naoDeveDividirUmNumeroInteiroPorZero() {
        calculator.dividir(12, 0);
    }

    @Test
    public void deveDividirDoisNumerosInteiros() {
        Assert.assertEquals(3.5, calculator.dividir(7, 2));
    }

}
