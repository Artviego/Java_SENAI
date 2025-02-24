public class Calculadora
{
    // Define os atributos
    public int primeiroNum;
    public int segundoNum;

    // Cria um constructor da classe
    public Calculadora(int primeiroNum, int segundoNum)
    {
        this.primeiroNum = primeiroNum;
        this.segundoNum = segundoNum;
    }

    public int Soma()
    {
        return primeiroNum + segundoNum;
    }

    public int Subtracao()
    {
        return primeiroNum - segundoNum;
    }

    public int Multiplicacao()
    {
        return primeiroNum * segundoNum;
    }

    public int Divisao()
    {
        return primeiroNum/segundoNum;
    }
}