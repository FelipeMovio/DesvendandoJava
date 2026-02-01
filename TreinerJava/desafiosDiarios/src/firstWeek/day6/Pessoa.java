package firstWeek.day6;


public class Pessoa {
    private String nome;
    private String genero;
    private Integer idade;
    private Float altura;

    public Pessoa() {}

    public Pessoa(String nome, String genero, Integer idade,Float altura) {
        this.nome = nome;
        this.genero = genero;
        this.idade = idade;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Float getAltura() {
        return altura;
    }

    public void setAltura(Float altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Pessoa" +
                "nome = '" + nome + '\'' +
                ", genero = '" + genero + '\'' +
                ", idade = " + idade +
                ", altura = " + altura ;
    }
}
