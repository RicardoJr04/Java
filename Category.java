package practice7;

public class Category {
    
private String nome;
private int ticketsNecessarios;
private int quantidadedisponivel;

public Category (String nome, int  ticketsNecessarios, int quantidadedisponivel ){
    this.nome = nome;
    this.ticketsNecessarios = ticketsNecessarios;
    this.quantidadedisponivel = quantidadedisponivel;
}

public boolean SolicitarPremio(Card cartao) {
    return cartao.getSaldoTickets() >= ticketsNecessarios && quantidadedisponivel > 0;
}

public void solicitarPremio(Card cartao) {
    if (SolicitarPremio(cartao)) {
        cartao.subtrairTickets(ticketsNecessarios);
        quantidadedisponivel--;
        
        System.out.println("Cartão -" + cartao.getnumeroIdentificacao() + " - Solicitação de prêmio (" + nome + ")");
        System.out.println("Prêmio concedido! Restam " + quantidadedisponivel + " prêmios dessa categoria.");
    }
else {
    System.out.println("cartão - "+ cartao.getnumeroIdentificacao());
    System.out.println("Tickets insuficientes ou premio esgotado");
}




}
}