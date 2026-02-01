package ClassesUteis.Wrappers;

   public class Produto {
       private Integer codigo;      // Wrapper para int
       private String nome;         // String para o nome do produto
       private Double preco;        // Wrapper para double
       private Integer quantidade;   // Wrapper para int
       private Boolean disponivel;   // Wrapper para boolean


       // Construtor com parametros
       public Produto(Integer codigo, String nome, Double preco, Integer quantidade, Boolean disponivel) {
           this.codigo = codigo;
           this.nome = nome;
           this.preco = preco;
           this.quantidade = quantidade;
           this.disponivel = disponivel;
       }

       public void exibirInformacoes() {
           System.out.println("Código: " + this.getCodigo());
           System.out.println("Nome: " + this.getNome());
           System.out.println("Preço: R$ " + this.getPreco());
           System.out.println("Quantidade em Estoque: " + this.getQuantidade());
           System.out.println("Disponível: " + (this.getDisponivel() ? "Sim" : "Não"));
           System.out.println("-----------------------------");
       }

       public Integer getCodigo() {
           return codigo;
       }

       public void setCodigo(Integer codigo) {
           this.codigo = codigo;
       }

       public String getNome() {
           return nome;
       }

       public void setNome(String nome) {
           this.nome = nome;
       }

       public Double getPreco() {
           return preco;
       }

       public void setPreco(Double preco) {
           this.preco = preco;
       }

       public Integer getQuantidade() {
           return quantidade;
       }

       public void setQuantidade(Integer quantidade) {
           this.quantidade = quantidade;
       }

       public Boolean getDisponivel() {
           return disponivel;
       }

       public void setDisponivel(Boolean disponivel) {
           this.disponivel = disponivel;
       }
   }

