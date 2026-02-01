package aula9PraticaDosAnteriores;

public class Livro implements Publicacao {
    // Atributos
    private String titulo;
    private String autor;
    private int totalPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;

//Construtor
    public Livro(String titulo, int totalPaginas, Pessoa leitor, String autor) {
        this.titulo = titulo;
        this.totalPaginas = totalPaginas;
        this.autor = autor;
        this.pagAtual = 0;
        this.aberto = false;
        this.leitor = leitor;
    }

    public String detalhes() {
        return "Livro{" + "titulo=" + titulo + ", autor="
                + autor + ", totalPaginas=" + totalPaginas
                + ", pagAtual=" + pagAtual + ", aberto="
                + aberto + ", leitor=" + leitor.getNome() + '}';
    }

    @Override
    public void abrir() {
        if (!this.isAberto()) {
            this.setAberto(true);
            System.out.println( getTitulo() + " aberto com sucesso!");
        } else {
            System.out.println("O livro já está aberto.");
        }

    }

    @Override
    public void fechar() {
        if (this.isAberto()) {
            this.setAberto(false);
            System.out.println(getTitulo() + "fechado com sucesso!");
        } else {
            System.out.println("O livro já está fechado.");
        }

    }

    @Override
    public void folhear(int p) {
        if (this.isAberto()){
            if (p > this.getTotalPaginas()){
                this.setPagAtual(0);
                System.out.println("Não é possível folhear para essa página. O livro será reiniciado.");
            } else {
                this.setPagAtual(p);
                System.out.println("Folheando para a página " + p);
            }
        } else {
            System.out.println("Não é possível folhear um livro fechado. Abra o livro primeiro.");
        }

    }

    @Override
    public void avancarPag() {
        if (this.isAberto()){
            if (this.getPagAtual() < this.getTotalPaginas()){
                this.setPagAtual(this.getPagAtual() + 1);
                System.out.println("Avançando para a página " + this.getPagAtual());
            } else {
                System.out.println("Você já está na última página.");
            }
        } else {
            System.out.println("Não é possível avançar a página de um livro fechado. Abra o livro primeiro.");
        }

    }

    @Override
    public void voltarPag() {
        if (this.isAberto()){
            if (this.getPagAtual() > 0){
                this.setPagAtual(this.getPagAtual() - 1);
                System.out.println("Voltando para a página " + this.getPagAtual());
            } else {
                System.out.println("Você já está na primeira página.");
            }
        } else {
            System.out.println("Não é possível voltar a página de um livro fechado. Abra o livro primeiro.");
        }

    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotalPaginas() {
        return totalPaginas;
    }

    public void setTotalPaginas(int totalPaginas) {
        this.totalPaginas = totalPaginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

}
