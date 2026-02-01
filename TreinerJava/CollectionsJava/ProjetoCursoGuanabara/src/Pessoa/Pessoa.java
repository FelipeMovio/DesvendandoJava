package Pessoa;

public abstract class Pessoa {
    protected String nome;
    protected Integer idade;
    protected String sexo;
    protected Integer experencia;


    public Pessoa() {
    }

    public Pessoa(String nome, String sexo, Integer idade) {
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
        this.experencia = 0;
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

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Integer getExperencia() {
        return experencia;
    }

    public void setExperencia(Integer experencia) {
        this.experencia = experencia;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", sexo='" + sexo + '\'' +
                ", experencia=" + experencia +
                '}';
    }
}
