import java.util.SimpleTimeZone;

public class TesteLogin {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        login conta = new login();
        login conta2 = new login();

        System.out.println(conta.getNome());

        conta.setNome("Seu nome aqui!");

        conta2.setNome("Java é doideira");

    }

}