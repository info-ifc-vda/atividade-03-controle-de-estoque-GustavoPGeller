import java.util.Random;

public class Produto
{
    private String nome;
    private double preco;
    private int codigo;
    private int qtdEstoque;
    private int estoqueMin;

    public Produto(String nome, double preco, int qtdEstoque, int estoqueMin)
    {
        this.nome = nome;
        this.codigo = gerarCodigo();
        this.qtdEstoque = qtdEstoque;
        this.estoqueMin = estoqueMin;

        if(preco < 0)
        {
            this.preco = 0;
            System.out.println("O preço está inválido, favor alterar!");
        }
        else
        {
            this.preco = preco;
        }
    }

    private int gerarCodigo()
    {
        Random r = new Random();
        int cod = r.nextInt(100, 999);

        return cod;
    }

    public void vender(int quantidade, int porcentoDesconto)
    {
        if(quantidade > qtdEstoque)
        {
            System.out.println("Não foi possível vender!");
        }
        else
        {
            System.out.println("O produto foi venido com o preço de R$ "+(quantidade * (preco - aplicarDesconto(porcentoDesconto))));

            qtdEstoque -= quantidade;
            if(verificaEstoqueBaixo())
            {
                System.out.println("O estoque está baixo!");
            }
            
            System.out.println("Estoque pós venda: "+qtdEstoque);
        }
    }

    public void reporQuantidade(int quantidade)
    {
        if(quantidade < 0)
        {
            System.out.println("Não foi possível repor!");
        }
        else
        {
            System.out.println("A quantidade foi adicionada ao estoque!");
            qtdEstoque += quantidade;
            System.out.println("Estoque atualizado: "+qtdEstoque);
        }
    }
    
    private double aplicarDesconto(double porcento)
    {
        double desconto = preco * (porcento/100);
        return desconto;
    }

    private boolean verificaEstoqueBaixo()
    {
        if(qtdEstoque < estoqueMin)
        {
            return true;
        }
        return false;
    }

    public void mostrarDados()
    {
        System.out.println("Nome: "+this.nome+"\nPreço: R$"+this.preco+"\nCódigo: "+this.codigo+"\nQuantidade de estoque disponível: "+this.qtdEstoque);
    }

    public void setPreco(double preco)
    {
        this.preco = preco;
    }
}