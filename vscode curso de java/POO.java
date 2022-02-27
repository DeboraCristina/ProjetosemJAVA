class OrientacaoAObjetos {
    public static void main(String[] args) {
        System.out.println("Olá Mundo!");
        Conta conta = new Conta();
        conta.numero = 111;
        conta.saldo = 1000;
        System.out.println("Número da conta: " + conta.numero); 
        System.out.println("Saldo da conta: " + conta.saldo); 
    }
}