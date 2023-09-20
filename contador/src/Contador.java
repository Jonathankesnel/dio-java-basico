import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
         Scanner terminal = new Scanner(System.in);

         System.out.println("Digite o primeiro parâmetro: ");

         int parametroUm = terminal.nextInt();

          System.out.println("Digite o segundo parâmetro: ");
         int parametroDois = terminal.nextInt();
         

         try {
            //chamando o método contendo a lógica da contagem
            contar(parametroUm, parametroDois);
            
            
         } catch ( IllegalArgumentException exception) {
            //imprimir a mensagem: O segundo parametro deve ser maior e o primeiro
            System.out.println("Ocorreu um erro! O segundo parametro deve ser maior que o primeiro");
         }

         
    }
    static void contar(int parametroUm, int parametroDois) throws IllegalArgumentException {
        //validar se parametroUm é MAIOR que o parametroDois e lançar a exceção
        if(parametroUm > parametroDois){
            throw new IllegalArgumentException();
        }
        else {
            int contagem = parametroDois - parametroUm;
        //realizar o for para imprimir os números com base na variável contagem
        for(int i = 1; i <= contagem; i++){
            System.out.println("Imprimindo o número " + i);
        }
    }
        
    }  

}
