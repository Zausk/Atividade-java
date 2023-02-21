import java.util.Scanner;

/*
 * Informacao marca, modelo, ano de de fabricacao 
 * acompanhar sobre veolcidade atual, frear, imprimir atualizado
 */

 public class Carro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor coloca um nome MARCA");
        String nomeMarca = scanner.next();
        
        System.out.println("Por favor coloca um nome MODELO");
        String nomeModelo = scanner.next();
        
        System.out.println("Qual ano de Fabricacao");
        int anodeFabricacao = scanner.nextInt();
        
        System.out.println("10km Qual a velocidade");
        int velocidade = scanner.nextInt();

        System.out.println("Velocidade diminui com a passar do tempo");
        int tempo = scanner.nextInt();
    }
    
    public void imprimirInformacao() {
        System.out.println("nomeMarca + nomeModelo + anodefabricacao + velocidade + tempo");
    }
}
