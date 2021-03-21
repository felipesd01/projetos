
package Animal;
import java.util.Scanner;
public class Animal {
    
    String especie;
    String cor;
    
    public static void main(String[] args) {
     
       Scanner ler = new Scanner(System.in);
          
       Cachorro c1 = new Cachorro();
       Papagaio p1 = new Papagaio();
       Mosca m1 = new Mosca();
        
       System.out.println("Digite a especie:");
       String especie = ler.nextLine();
       
       System.out.println("Digite a cor:");
       String cor = ler.nextLine();
       
       System.out.println("Digite a Cor do pelo (cachorro) :");
       c1.corPelo = ler.nextLine();
       
       System.out.println("Digite a quantidade de patas (mosca):");
       m1.qtdPatas = ler.nextInt();
       
       System.out.println("Digite a Cor da pena (papagaio):");
       p1.corPena = ler.nextLine();
       
       
        System.out.println("INFORMAÇOES");
       
        System.out.println("===Animal===");
        System.out.println("Espécie:" + especie);
        System.out.println("Cor:" + cor);
        
        System.out.println("===PAPAGAIO===");
        System.out.println("cor:" + p1.corPena);
        
        System.out.println("===CACHORRO===");
        System.out.println("cor do pelo:" + c1.corPelo);
        
        System.out.println("===MOSCA===");
        System.out.println("quantidade de patas:" + m1.qtdPatas);
       
    }
    
}
