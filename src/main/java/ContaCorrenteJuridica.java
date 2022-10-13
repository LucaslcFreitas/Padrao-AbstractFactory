public class ContaCorrenteJuridica implements ContaCorrente{
    private double saldo = 0;
    private double taxaContaJuridica = 0.045;

    @Override
    public double consultarSaldo() {
        return saldo;
    }

    @Override
    public double depositar(double valor) {
        saldo = (valor * (1-taxaContaJuridica)) + saldo;
        return saldo;
    }
}
