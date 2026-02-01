package aula9PraticaDosAnteriores;

public class Pessoa {
    // Atributos
    private String nome;
    private int idade;
    private String sexo;

    //construtor
    public Pessoa(String nome,int idade,String sexo){
        System.out.println("-------------------");
        this.setNome(getNome());
        System.out.println("Meu nome é: " + nome);
        this.setIdade(getIdade());
        System.out.println("Tenho: " + idade + " anos");
        this.setSexo(getSexo());
        System.out.println("Meu sexo é: " + sexo);
    }



    public void fazerAniversario() {
        this.setIdade(this.getIdade() + 1);
    }

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

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
}
