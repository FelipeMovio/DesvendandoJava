//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws Exception {
        int[] numeros = new int[]{10, 20, 30, 100};
        int[] peso = new int[]{2, 0, 4};
        System.out.println("numeros : ");
        for (int i = 0; i < numeros.length; i++) {
            try {

                int resultado = numeros[i] / peso[i];
                System.out.println(numeros[i] + " / " + peso[i] + " = " + resultado);


//            System.out.println(numeros[5]);
            } catch (ArithmeticException AritError) {
                System.out.println("Erro de calculo " + AritError.getMessage());
            } catch (ArrayIndexOutOfBoundsException ArrayError){
                System.out.println("Erro de vetor " + ArrayError.getMessage());
            } catch (Exception e){
                e.printStackTrace();
            }finally {
                System.out.println("mensagem final");
                // finally executtado indenpentende de tudo
            }
        }



    }
}