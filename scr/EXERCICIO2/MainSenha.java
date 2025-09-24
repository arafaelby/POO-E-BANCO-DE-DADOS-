package EXERCICIO2;

public class MainSenha {
    public static void main(String[] args) {
        ValidadorSenha SenhaFacebbok = new ValidadorSenha("face3!");
        ValidadorSenha SenhaInsta = new ValidadorSenha("instagram@");
        ValidadorSenha SenhaTikTok = new ValidadorSenha("abcdefgh");

        System.out.println("A senha é considerada: " + SenhaFacebbok.VerificarSenha());
        System.out.println("A senha é considerada: " + SenhaInsta.VerificarSenha());
        System.out.println("A senha é considerada: " + SenhaTikTok.VerificarSenha());
    }
}
