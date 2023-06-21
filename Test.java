package practice7;
//OBS : queimei alguns neuronios fazendo essa atividade então espero que esteja certa
public class Test {
    public static void main(String[] args) {
    Card cartao1 = new Card(1);
    Card cartao2 = new Card(2);

    cartao1.adicionarcreditos(100);
    cartao2.adicionarcreditos(50);

    Terminal terminal = new Terminal();

    terminal.inserirCartao(cartao1);

    terminal.carregarCreditos(5);

    terminal.transferSaldo(cartao1, cartao2);

    terminal.inserirCartao(cartao2);

    terminal.trocarTicketsPorPremios(0);


    Game jogo = new Game("Jogo dos Tíquetes Aleatórios!", 3, 5);
    terminal.jogandoJogo(jogo);
    }

}