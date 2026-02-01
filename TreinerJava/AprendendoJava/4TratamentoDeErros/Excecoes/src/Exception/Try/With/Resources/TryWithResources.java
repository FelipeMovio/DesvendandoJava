package Exception.Try.With.Resources;

import Exception.Try.With.Resources.dominio.Leitor1;
import Exception.Try.With.Resources.dominio.Leitor2;

import java.io.*;

public class TryWithResources {
    public static void main(String[] args) {
        lerArquivo();
    }
    public static void lerArquivo(){
        try(Leitor1 leitor1 = new Leitor1();
            Leitor2 leitor2 = new Leitor2()){

        }catch (IOException e){
            throw new RuntimeException(e);
        }
    }

    public static void lerArquivo2() {
        Reader reader = null;
        try { //BufferedReader, que é um objeto que facilita a leitura de texto a partir de um arquivo
            reader = new BufferedReader(new FileReader("arquivo.txt")); //O FileReader é usado para abrir o arquivo arquivo.txt.
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
