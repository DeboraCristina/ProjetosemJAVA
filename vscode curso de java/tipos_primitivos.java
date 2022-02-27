class Variaveis {
    public static void main(String[] args) {
        // camel case
        /*
        variavel - nomeDaVariavel
        */

        // inteiros
        int idade;
        idade = 18;
        System.out.println("Idade: " + idade);
        /* long é um inteiro com maior armazenamento */
        long quantidade = 27;
        System.out.println("Quantidade: " + quantidade);

        // reais
        /* não pode -:> double salário; */
        double salario = 1500.54;
        System.out.println("Salário: " + salario);
        /* float tbm armazena números flutuantes. mas tem menos capacidade e precisão. 
        Pois o java tenta converter double pra float.
        Pra um float se comportar como float basta colocar um 'f'*/
        float aumento = 500.89f;
        System.out.println("Aumento de: " + aumento);

        // testes
        int quantidadeDoProduto = 100;
        double valorDoProduto = 4.99;

        // o resultado da operação vai ser sempre o maior tipo. (vulgo double)
        double resultado = quantidadeDoProduto * valorDoProduto;

        System.out.println("Valor total: " + resultado);

        // booleano
        boolean permissao = true;
        System.out.println("É permitido?  " + permissao);

        // charactares
        char letra = 'd';
        System.out.println("Letra " + letra + " de Débora");

        // atribição de variaveis
        int tipoInteiro = 10;
        float tipoFloat = 15.6f;

        System.out.println("inteiro: " + tipoInteiro + " flutuante: " + tipoFloat); 

        tipoInteiro = (int)tipoFloat; //casting - força a conversão
        System.out.println("resultado: " + tipoInteiro); 

    }
}