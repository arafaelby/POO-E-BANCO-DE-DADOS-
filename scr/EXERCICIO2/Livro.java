package EXERCICIO2;

public class Livro {
    private String titulo;
    private String autor;
    private int anoPublicacao;

        Livro(String titulo, String autor, int anoPublicacao) {
          this.titulo = titulo;
          this.autor = autor;
          this.anoPublicacao = anoPublicacao;
        }

        public boolean IsLancamento() {
            return this.anoPublicacao >= 2023;
        }

        public String getDescricaoCompleta() {
            String NovoTitulo = titulo.trim().toLowerCase();

            return "" + "[" + NovoTitulo + "]" + " por " + "[" + autor + "]";
        }
}

