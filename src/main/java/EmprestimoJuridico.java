public class EmprestimoJuridico implements Emprestimo{
    double taxaJuros = 0.149;

    @Override
    public String simularEmprestimo(double valor, int qtParcelas) {
        return "Valor total: " + valor * (Math.pow(1+taxaJuros, qtParcelas));
    }
}
