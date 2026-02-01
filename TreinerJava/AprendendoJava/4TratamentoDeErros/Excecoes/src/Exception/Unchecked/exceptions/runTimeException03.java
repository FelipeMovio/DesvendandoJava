package Exception.Unchecked.exceptions;

public class runTimeException03 {
    public static void main(String[] args) {
        abreConexao();

    }

    private static String abreConexao() {
        try {
            System.out.println("abrindo arquivo");
            System.out.println("Escrevendo arquivo");
            return "conexao aberta";
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            System.out.println("fechando arquivo");
        }
        return null;
    }
}
