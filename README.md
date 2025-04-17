
# Gerenciador de Produtos em Java

Esse gerenciador cria uma lista de produtos, adiciona, remove e altera eles.

# Menu de Opçoes:
Essa parte do codigo que entrega ao usuario um menu para que ele visualize as opçoes que tem disponivel. 

# Cadastro de Produtos:
Essa parte do codigo nos ajuda a adicionar itens dentro da nossa lista.

# Listagem de Produtos:
Essa parte do codigo nos mostra a lista de produtos que adicionamos anteriormente.

# Exclusão de Produtos:
Essa parte do codigo realiza exclusão de itens dentro da lista.

# Alteração de Produtos:
Essa parte do codigo da a opção do usuario selecionar o produto e alterar ele.

# Sair do Menu:
Essa parte do codigo da a opção do usuario sair do menu caso não precise realizar mais nenhuma mudança.

# Do: 
O Do entrega ao usuario as opçoes do menu e o menu.nextLine() com a variavel opçoes pede para que ele digite a opção que deseja acessar.

# Inicio do Switch/case:
Switch recebe a variavel opção e os cases entregam o que cada numero que o usuario digita faz, 

# case 1 - Cadastro de Produtos:
Primeiro sout - System.out.print("Digite Seu Novo Produto: "); | Entrega a mensagem ao usuario.

Primeira variavel String + função nextLine - String produto = menu.nextLine(); | Recebe o numero que o usuario digitou.

Função add - produtos.add(produto); break; | Adiciona o produto digitado ao Array

# case 2 - Listagem de Produtos:
O For - for (int i = 0; i < produtos.size(); i++){ | Ele percorree o Arraylist e te entrega o tamanho dela. 

A Variavel - int index = i + 1; | ela faz com que o usuario não enxergue a lista iniciando do 0 e sim do 1 o Index.

O sout - System.out.println(index + " - " + produtos.get(i));
} | Ele printa para o usuario o nome do produto e a função get o adiciona dentro do Arraylist.

# case 3 - Exclusão de Produtos:
A Variavel - int index = menu.nextInt();
index = index - 1; | Criasse uma variavel index para simbolizar o primeiro numero da lista a ela é reduzido 1 pois estamos diminuindo o Arraylist.

O Sout - System.out.println(produtos.remove(index));
break; | Remove o index que o usuario digitou no teclado.

# case 4 - Alteração de Produtos:
O Sout - System.out.print("Digite o numero do produto que você deseja alterar: "); | 
Solicita ao usuario o numero do indice que ele deseja alterar.
A Variavel - int alt = menu.nextInt(); | permite que o usuario digite o numero indice do produto que ele deseja alterar.
Comando para não bugar o cód - menu.nextLine();

alt = alt - 1;

O sout - System.out.print("Digite o novo nome do produto: "); | Solicita que o usuario digite o novo nome do produto.
A Variavel - String novonome = menu.nextLine(); | Permite que o usuario digite o novo nome do produto.
A função - produtos.set(alt, novonome); | altera o produto do Arraylist.

# case 5 - Sair do menu:
Printa a saida do menu ao usuario selecionar o numero 5 -
System.out.println("_________________________");
System.out.println("Saindo do menu");
System.out.println("_________________________");
break;
# default:
Para quando o usuario selecionar um numero invalido -
System.out.println("_________________________");
System.out.println("Essa Opção não é valida");
System.out.println("_________________________");
break;

# While:
O While - while (opcao != 5); | Fecha o nosso código e entrega o numero de opções disponiveis
A função - menu.close(); | Fecha o nosso código.
O sout - System.out.println("Finalizado"); | Printa a mensagem quando o programa por finalizado.
