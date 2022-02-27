import javax.swing.JOptionPane;

class MeuPrimeiroPrograma {
    public static void main(String[] args) {
        /*
        int idade;
        String aux;
        aux = JOptionPane.showInputDialog("Qual a sua idade? ");
        idade = Integer.parseInt(aux);
        if (idade >= 18){
            JOptionPane.showMessageDialog(null, "maior de idade");
        }else{
            JOptionPane.showMessageDialog(null, "menor de idade");
        }
        */
        int op;
        String strOption;
        strOption = JOptionPane.showInputDialog("Escolha um lanche de 1-7: ");
        op = Integer.parseInt(strOption);
        switch (op){
            case 1:
                JOptionPane.showMessageDialog(null, "Vocês escolheu o X-Bacon");
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "Vocês escolheu o Dogão");
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "Vocês escolheu o X-Salada");
                break;
            case 4:
                JOptionPane.showMessageDialog(null, "Vocês escolheu a Coxinha");
                break;
            case 5:
                JOptionPane.showMessageDialog(null, "Vocês escolheu o Crossant");
                break;
            case 6:
                JOptionPane.showMessageDialog(null, "Vocês escolheu o Lanchão");
                break;
            case 7:
                JOptionPane.showMessageDialog(null, "Vocês escolheu o Lanchinho");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Número inválido!");
                break;
        }

    }
}
