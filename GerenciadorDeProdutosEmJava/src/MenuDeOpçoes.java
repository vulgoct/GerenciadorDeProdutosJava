import java.util.ArrayList;
import java.util.Scanner;

public class MenuDeOpçoes {
    public static void main(String[] args) {
        int opcao = 5;
        Scanner menu = new Scanner(System.in);
        ArrayList<String> produtos = new ArrayList<String>();

        do {
            System.out.println("_________________________");
            System.out.println("1 - Cadastro de Produtos");
            System.out.println("2 - Listagem de Produtos");
            System.out.println("3 - Exclusão de Produtos");
            System.out.println("4 - Alteração de Produtos");
            System.out.println("5 - Sair do Menu");
            System.out.println("_________________________");

            System.out.print("Digite a Opção desejada: ");
            opcao = menu.nextInt();
            menu.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("_________________________");
                    System.out.println("Cadastro de Produtos");
                    System.out.println("_________________________");

                    System.out.print("Digite Seu Novo Produto: ");
                    String produto = menu.nextLine();
                    produtos.add(produto);
                    break;

                case 2:
                    System.out.println("_________________________");
                    System.out.println("Listagem de Produtos");
                    System.out.println("_________________________");

                    for (int i = 0; i < produtos.size(); i++){
                        int index = i + 1;
                        System.out.println(index + " - " + produtos.get(i));
                    }
                    break;

                case 3:
                    System.out.println("_________________________");
                    System.out.println("Exclusão de Produtos");
                    System.out.println("_________________________");

                    System.out.print("Digite o numero do produto que você deseja remover: ");
                    int index = menu.nextInt();
                    index = index - 1;
                    System.out.println(produtos.remove(index));
                    break;
                    
                case 4:
                    System.out.println("_________________________");
                    System.out.println("Alteração de Produtos");
                    System.out.println("_________________________");
                    break;
                case 5:
                    System.out.println("_________________________");
                    System.out.println("Saindo do menu");
                    System.out.println("_________________________");
                    break;
                default:
                    System.out.println("_________________________");
                    System.out.println("Essa Opção não é valida");
                    System.out.println("_________________________");
                    break;
            }
        } while (opcao != 5);
        menu.close();
        System.out.println("Finalizado");
    }
}