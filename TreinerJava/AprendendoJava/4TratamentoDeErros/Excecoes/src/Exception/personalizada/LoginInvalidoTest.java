package Exception.personalizada;

import java.util.Scanner;

public class LoginInvalidoTest {
    public static void main(String[] args) {
        try {
            fazerLogin();
        }catch (LoginInvalidoException e){
            System.out.println(e.getMessage());
        }

    }
    public static void fazerLogin() throws LoginInvalidoException {
        Scanner teclado = new Scanner(System.in);
        String usernameDB = "goku";
        String senhaDB = "1234";
        System.out.print("Informe o login: ");
        String login = teclado.nextLine();
        System.out.print("Informe a senha: ");
        String senha = teclado.nextLine();

        if(!usernameDB.equals(login) || !senhaDB.equals(senha)){
            throw new LoginInvalidoException("Login ou senha inválidos!");
        }
        System.out.println("Login feito com sucesso");
    }

}
