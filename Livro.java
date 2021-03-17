
package biblioteca;


public class Livro {
    
    public String titulo;
    public String genero;
    public double ano;
    private String autor;
    public String brinde;
    public double valor;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public double getAno() {
        return ano;
    }

    public void setAno(double ano) {
        this.ano = ano;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    

    public Livro() {
    }
    
    public String verificarBrinde(){       
        
        if(this.valor > 100){
            brinde = "Parabéns você ganhou um brinde!!!";
        }
            
        else{
            brinde = "você nao tem direito a brinde";
    }
        return brinde;
        
     
    }
    
    @Override
    public String toString(){
        return
                "-----DADOS DO LIVRO-----\nTítulo do livro: " + this.titulo + "\nGênero do livro: " + this.genero + "\n"
                + "Ano do livro: " + this.ano + "\nAutor do livro: " + this.autor + "\nValor do livro: " + this.valor;
    }
}
