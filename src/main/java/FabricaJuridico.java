public class FabricaJuridico implements FabricaAbstrata{
    @Override
    public ContaCorrente criarContaCorrente() {
        return new ContaCorrenteJuridica();
    }

    @Override
    public Emprestimo criarEmprestimo() {
        return new EmprestimoJuridico();
    }
}
