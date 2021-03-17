
package biblioteca;


public class Cliente {
    
    public String nome;
    private int idade;
    public double telefone;
    public String brinde2;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getTelefone() {
        return telefone;
    }

    public void setTelefone(double telefone) {
        this.telefone = telefone;
    }

    public Cliente() {
    }

    public String verificarDesconto(){
 
    if (this.idade < 18){
    brinde2 = "voce ganhou um marca paginas";
    }
    
    else{
    brinde2 = "voce nao ganhou brinde";
}
    return brinde2;
    
}
    @Override
    public String toString(){
        return
                "-----DADOS DO CLIENTE-----\nNome do Cliente: " + this.nome + "\nIdade do Cliente: " + this.idade + "\n"
                + "Telefone: " + this.telefone;
    }
            
            
            
}
