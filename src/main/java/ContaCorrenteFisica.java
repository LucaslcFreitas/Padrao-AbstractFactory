public class ContaCorrenteFisica implements ContaCorrente{
    private double saldo = 0;
    private double taxaContaFisica = 0.034;

    @Override
    public double consultarSaldo() {
        return saldo;
    }

    @Override
    public double depositar(double valor) {
        saldo = (valor * (1-taxaContaFisica)) + saldo;
        return saldo;
    }
}
