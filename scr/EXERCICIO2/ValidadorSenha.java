package EXERCICIO2;

public class ValidadorSenha {
    private String senha;

    ValidadorSenha(String senha) {
        this.senha = senha;
    }

    private boolean ValidarTamanho() {
        return senha.length() >= 8;
    }

    private boolean ValidarConteudo() {
        return senha.contains("!") ||
                senha.contains("@") ||
                senha.contains("#") ||
                senha.contains("$") ||
                senha.contains("%") ||
                senha.contains("&");
    }

    public String VerificarSenha() {
        if (ValidarTamanho() && ValidarConteudo()) {
            return "Forte";
        } else {
            return "Fraca";
        }
    }
}
