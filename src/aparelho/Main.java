package aparelho;


/**
 * Classe para testar as saídas.
 */
public class Main {

  public static void main(String[] args) {
    AparelhoMultiuso aparelho = new AparelhoMultiuso();

    System.out.println("--------------------------------------------------------------------------------");
    aparelho.selecionarMusica("Mire as estrelas");
    aparelho.tocar();
    aparelho.pausar();

    System.out.println("--------------------------------------------------------------------------------");
    aparelho.atender();
    aparelho.iniciarCorreioVoz();
    aparelho.ligar(98925693);

    System.out.println("--------------------------------------------------------------------------------");

    aparelho.exibirPagina();
    aparelho.atualizarPagina();
    aparelho.adicionarNovaAba();

    System.out.println("--------------------------------------------------------------------------------");

  }

}