import java.util.Scanner;

public class Main
{
    public static void main (String[] args)
    {
        Scanner tec = new Scanner(System.in);

        int op = 0;
        String nome;
        double valor;
        int qtd;

        Produto produto = new Produto();

        produto.nome = "Compiuter gueimer ultima geração 3000";
        produto.valor = 3949.99;
        produto.qtd = 2;

        do
        {
            System.out.println("MENU");
            System.out.println("1 - Escrever dados");
            System.out.println("2 - Atribuir dados");
            System.out.println("3 - Calcular valor total");
            System.out.println("4 - Alterar quantidade");
            System.out.println("5 - Sair");

            op = tec.nextInt();

            if (op == 1)
            {
                System.out.println("O nome do produto é: "+produto.nome);
                System.out.println("O valor do produto é: R$"+produto.valor);
                System.out.println("A quantidade em estoque é: "+produto.qtd);
            }

            else if (op == 2)
            {
                System.out.println("Digite o nome do produto: ");
                
                nome = tec.nextLine();
                tec.next();
                System.out.println("Digite o valor (em R$): ");
                valor = tec.nextDouble();
                System.out.println("Digite a quantidade: ");
                qtd = tec.nextInt();

                produto.atribuirDados(nome, valor, qtd);
            }

            else if (op == 3)
            {
                System.out.println("O valor total é: R$"+produto.calcularValorTotal());
            }

            else if (op == 4)
            {
                System.out.println("Escreva a nova quantidade: ");
                int aux = tec.nextInt();
                produto.alterarQuantidade(aux);
            }

            else if (op == 5)
            {
                break;
            }

            else
            {
                System.out.println("Operação inválida!");
            }
        } while (op != 5);
    }
}
