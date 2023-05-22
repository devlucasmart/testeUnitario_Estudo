package br.ce.wcaquino.servicos;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.*;

public class CalculadoraMockTest {

    @Mock
    private Calculadora calcMock;
    @Spy
    private Calculadora calcSpy;
    @Mock
    private EmailService email;
    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void devoMostrarDiferençaEntreMockSpy(){
        Mockito.when(calcMock.somar(1,2)).thenReturn(5);
//        Mockito.when(calcSpy.somar(1,2)).thenReturn(5);
        Mockito.doReturn(5).when(calcSpy).somar(1,2);
        Mockito.doNothing().when(calcSpy).imprime();


        System.out.println("Mock:" + calcMock.somar(1, 2));
        System.out.println("Spy:" + calcSpy.somar(1, 2));

        System.out.println("Mock");
        calcMock.imprime();
        System.out.println("Spy");
        calcSpy.imprime();

    }

    @Test
    public void teste() {
        Calculadora calc = Mockito.mock(Calculadora.class);

        ArgumentCaptor<Integer> argCapt = ArgumentCaptor.forClass(Integer.class);
        Mockito.when(calc.somar(argCapt.capture(), argCapt.capture())).thenReturn(5);

        Assert.assertEquals(5, calc.somar(4567, -7839));
//        System.out.println(argCapt.getAllValues());
    }
}
