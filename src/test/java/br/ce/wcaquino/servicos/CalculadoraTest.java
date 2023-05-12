package br.ce.wcaquino.servicos;

import br.ce.wcaquino.exceptions.LocadoraException;
import br.ce.wcaquino.exceptions.NaoPodeDividirPorZeroException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.OrderWith;

public class CalculadoraTest {
    private Calculadora calc;

    @Before
    public void setup() {
        calc = new Calculadora();
    }
    @Test
    public void deveSomarDoisValores() {
        //Cenario
        int a = 5;
        int b = 3;

        //acao
        int resultado = calc.somar(a, b);

        //verificacao
        Assert.assertEquals(8, resultado);
    }

    @Test
    public void deveSubtrairDoisValores() {
        //Cenario
        int a = 5;
        int b = 3;
        //acao
        int resultado = calc.subtrair(a,b);

        //verificacao
        Assert.assertEquals(2, resultado);
    }

    @Test
    public void deveDividirDoisValores() throws NaoPodeDividirPorZeroException {
        //Cenario
        int a = 4;
        int b = 2;
        //acao
        int resultado = calc.dividir(a,b);

        //verificacao
        Assert.assertEquals(2, resultado);
    }

    @Test(expected = NaoPodeDividirPorZeroException.class)
    public void DeveLancarExcecaoAoDividirPorZero() throws NaoPodeDividirPorZeroException{
        //Cenario
        int a = 4;
        int b = 0;

        //acao
        calc.dividir(a,b);
    }
}
