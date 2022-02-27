class LacosDeRepeticao {
    public static void main(String[] args) {
        
        // while
        System.out.println("While"); 
        int i = 0;
        while (i < 5){
            System.out.print("ola mundo!"); 
            i += 1;
        }

        // for
        System.out.println(""); 
        System.out.println("For"); 
        for (int f = 0; f < 5; f++){
            System.out.print("ola mundo!");
        }

        System.out.println(""); 
        // testes 
        for (int f = 0 ; f <= 10; f++){
            if(f % 2 == 0){
                System.out.println("número: " + f); 
            }
        }

        System.out.println(""); 

        // break
        for (int f = 0 ; f <= 10; f++){
            System.out.println("número: " + f); 
            if(f % 2 == 0 && f != 0){
                break;
            }
        }
        System.out.println("");

        // continue
        for (int f = 0 ; f <= 10; f++){
            System.out.println("item: " + f); 
            if(f % 2 == 0 && f != 0){
                continue; // se true volta do inicio
            }
            System.out.println("número Impar: " + f); 
        }
        System.out.println("");
        System.out.println("Olá Mundo!");
    }
}