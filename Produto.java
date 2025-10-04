public class Produto
{
    String nome;
    Double valor;
    int qtd;

    public void atribuirDados(String nNome, double nValor, int nQtd)
    {
        this.nome = nNome;
        this.valor = nValor;
        this.qtd = nQtd;
    }
    // apenas teste

    public double calcularValorTotal()
    {
        double vTotal = 0;
        vTotal = this.valor * this.qtd;
        return vTotal;
    }

    public void alterarQuantidade(int nQtd)
    {
        this.qtd = nQtd;

        System.out.println("A nova quantidade é: "+this.qtd);
    }
}