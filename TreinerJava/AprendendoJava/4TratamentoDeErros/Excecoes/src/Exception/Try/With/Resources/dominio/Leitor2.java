package Exception.Try.With.Resources.dominio;

import java.io.IOException;

public class Leitor2 implements Cloneable, AutoCloseable {

    public void close() throws IOException {
        System.out.println("Fechando leitor1");
    }


}
