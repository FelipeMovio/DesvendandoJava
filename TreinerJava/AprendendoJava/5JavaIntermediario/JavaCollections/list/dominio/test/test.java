package JavaCollections.list.dominio.test;

import JavaCollections.list.dominio.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class MangaByIdComparator implements Comparator<Manga> {

    @Override
    public int compare(Manga manga1, Manga manga2) {
        return manga1.getId().compareTo(manga2.getId());
    }
}

public class test {

    public static void main(String[] args) {
        List<Manga> desenhos = new ArrayList<>();
        desenhos.add(new Manga(1, "Dragon Ball", 20.00));
        desenhos.add(new Manga(3, "Cavaleiros do Zodiaco", 19.9));
        desenhos.add(new Manga(2, "Yu Yu Hakusho", 15.88));
        desenhos.add(new Manga(5, "Naruto", 22.2));
        desenhos.add(new Manga(4, "One Piece", 18.00));
        for (Manga desenho : desenhos) {
            System.out.println(desenho);
        }
        System.out.println("---------");
        System.out.println("Ordem por nome");
        Collections.sort(desenhos);
        for (Manga desenho : desenhos) {
            System.out.println(desenho);
        }
        System.out.println("---------");
        System.out.println("ordem por Id");
        Collections.sort(desenhos, new MangaByIdComparator());
        for (Manga desenho : desenhos) {
            System.out.println(desenho);
        }
    }
}

