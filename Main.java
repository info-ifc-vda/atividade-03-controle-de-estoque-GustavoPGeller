public class Main
{
    public static void main(String[] args)
    {
        Produto p1 = new Produto("Notebook", 3499.00, 10, 2);

        p1.mostrarDados();

        p1.vender(9, 10);

        p1.reporQuantidade(3);

        p1.setPreco(4000.0);

        p1.mostrarDados();
    }
}
