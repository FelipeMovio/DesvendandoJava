package JavaCollections.list.dominio;

import java.util.Objects;

public class Manga implements Comparable<Manga> {
    private Integer id;
    private String name;
    private Double preco;

    public Manga() {
    }

    public Manga(Integer id, String name, Double preco) {
        Objects.requireNonNull(id, "Id nao pode ser null");
        Objects.requireNonNull(name, "Name nao pode ser null");
        this.id = id;
        this.name = name;
        this.preco = preco;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Manga" +
                "id = " + id +
                ", name = '" + name + '\'' +
                ", preco = " + preco;

    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Manga manga = (Manga) o;
        return Objects.equals(id, manga.id) && Objects.equals(name, manga.name) && Objects.equals(preco, manga.preco);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, preco);
    }

    @Override
    public int compareTo(Manga outroManga) {
        return this.name.compareTo(outroManga.getName());

    }


}
