
package biblioteca;

import java.util.Scanner;
 
public class MainBiblioteca {
    public static void main(String[] args) {
    
    Scanner ler = new Scanner(System.in);
    Cliente c1 = new Cliente();
    Livro l1 = new Livro();
    
    
    System.out.println("cadastro");
    
    System.out.println("digite seu nome");
    c1.setNome(ler.nextLine());
    
    System.out.println("digite sua idade");
    c1.setIdade(ler.nextInt());
    
    System.out.println("digite seu telefone");
    c1.setTelefone(ler.nextDouble());
            
    System.out.println("digite o titulo do livro");
    l1.setTitulo(ler.next());
    
    System.out.println("Digite o genero do livro");
    l1.setGenero(ler.next());
    
    System.out.println("Digite o ano do livro");
    l1.setAno(ler.nextDouble());
    
    System.out.println("Digite o autor");
    l1.setAutor(ler.next());
    
    System.out.println("Valor do livro");
    l1.valor = ler.nextDouble();
    
        System.out.println(l1);
    System.out.println(l1.verificarBrinde());
        System.out.println(c1);
    System.out.println(c1.verificarDesconto());
    
    
    




   }
}