public class FabricaFisica implements FabricaAbstrata{
    @Override
    public ContaCorrente criarContaCorrente() {
        return new ContaCorrenteFisica();
    }

    @Override
    public Emprestimo criarEmprestimo() {
        return new EmprestimoFisica();
    }
}
