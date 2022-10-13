public class Cliente {

    private ContaCorrente contaCorrente;
    private Emprestimo emprestimo;

    public Cliente(FabricaAbstrata fabrica) {
        this.contaCorrente = fabrica.criarContaCorrente();
        this.emprestimo = fabrica.criarEmprestimo();
    }

    public double consultarSaldo() {
        return this.contaCorrente.consultarSaldo();
    }

    public double depositar(double valor) {
        return this.contaCorrente.depositar(valor);
    }

    public String simularEmprestimo(double valor, int qtParcelas) {
        return this.emprestimo.simularEmprestimo(valor, qtParcelas);
    }
}
