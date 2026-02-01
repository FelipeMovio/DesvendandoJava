package secondWeek.day8;

public class Pessoas {

    private String nome;
    private Integer idade;

    public Pessoas() {
    }

    public Pessoas(String nome, Integer idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void darNome(String nome){
        setNome(nome);
    }

    @Override
    public String toString() {
        return "Pessoas " +
                "nome = '" + nome + '\'' +
                ", idade = " + idade ;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }
}
