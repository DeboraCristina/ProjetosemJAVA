class CondicionaisIfElse {
    public static void main(String[] args) {
        double preco = 15;

        if(preco < 10) {
            System.out.println("Produto barato."); 
        } else {
            System.out.println("Produto caro."); 
        }

        // ou 

        if (preco > 0){
            System.out.println("produto cadastrado."); 
        }

        // exemplo
        double nota = 11;

        if(nota > 10){
            System.out.println("Ta de hack. Reprovado."); 
        } else if (nota >= 7){
            System.out.println("Aprovado"); 
        } else if(nota >= 5 && nota < 7){
            System.out.println("Em recuperação.");
        } else{
            System.out.println("Reprovado."); 
        }
    }
}