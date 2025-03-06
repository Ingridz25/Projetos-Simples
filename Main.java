import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] bebidas = {"Cerveja","Vodka", "Whisky", "Tequilla", "Vinho",
                "Coca-cola", "Sprite", "Fanta-uva", "Guarana-Antartica", "Guarana-Jesus"};
        System.out.println("Qual a sua idade?");
        int idade = scanner.nextInt();

        if(idade<16){
            System.out.println("Você nao pode entrar na festa pois é menor de 16 anos");
            return;

        }else if(idade<18){
            System.out.println("Voce entrou na festa mas não pode beber bebidas alcoolicas");

        } else{

            System.out.println("Voce entrou na festa, pode beber bebidas alcoolicas");
        }
        for(int i =0; i< bebidas.length; i++){
            System.out.println((i+1) + "-" + bebidas[i] );
        }
        int escolha =-1;
        while (escolha<1 || escolha> bebidas.length){
            System.out.println("Digite o numero da bebida desejada: ");
            escolha = scanner.nextInt();

            if(escolha<1 || escolha> bebidas.length){
                System.out.println("Opção inválida, escolha um numero entre 1 e " +bebidas.length);
            }
        }
        if(idade<18 && escolha<=5){
            System.out.println("Voce escolheu uma bebida alcoolica e foi expulso da festa!");
            return;
        }

        System.out.println("Voce escolheu " + bebidas[escolha-1] + " Aproveite sua bebida!");
        System.out.println("Voce bebeu e foi para casa!");
        scanner.close();
    }
}
