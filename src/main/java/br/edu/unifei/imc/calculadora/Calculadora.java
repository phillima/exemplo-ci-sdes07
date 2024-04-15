package br.edu.unifei.imc.calculadora;

public class Calculadora {

    public int somar(int x, int y)
    {
        return x + y;
    }

    public int subtrair(int x, int y)
    {
        return x - y;
    }

    public double dividir(double x, double y)
    {
        if(y == 0)
            throw new RuntimeException();
        return x/y;
    }
}