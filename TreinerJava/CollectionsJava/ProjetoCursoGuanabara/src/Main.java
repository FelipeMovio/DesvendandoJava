import Pessoa.Gafanhoto;
import Video.Video;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;


public class Main {
    public static void main(String[] args) {
        ArrayList<Video> v = new ArrayList<>();
         v.add(new Video("macaco"));
         v.add(new Video("cachoros a solta"));
         v.add(new Video("tudo nosso"));


        ArrayList<Gafanhoto> pessoas = new ArrayList<>();
        pessoas.add(new Gafanhoto("joao","M",22, "jt123"));
        pessoas.add(new Gafanhoto("maria","F",19,"maria@12"));

        LinkedList<Visualizacao> vis = new LinkedList<>();
        vis.add(new Visualizacao( pessoas.get(0),v.get(0)));
                                  // pegando a posição da pessoa e do video

        System.out.println(vis.get(0).toString());

    }
}