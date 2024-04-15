package teste;

import br.edu.unifei.imc.calculadora.Calculadora;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TesteCalculadora {

    private Calculadora c;

    @Before
    public void init()
    {
        c = new Calculadora();
    }

    @Test
    public void testeSomar()
    {
        var realidade = c.somar(10,2);
        Assert.assertEquals(12,realidade);
    }

    @Test
    public void testeSubtrair()
    {
        var realidade = c.subtrair(3,4);
        Assert.assertEquals(-1,realidade);
    }

    @Test
    public void testeDivisao()
    {
        var realidade = c.dividir(10,4);
        Assert.assertEquals(2.5,realidade,0.01);
    }

    @Test(expected = RuntimeException.class)
    public void testeDivisaoPorZero()
    {
        var realidade = c.dividir(10,0);
    }

}