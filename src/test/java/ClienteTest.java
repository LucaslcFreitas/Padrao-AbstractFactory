import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {

    @Test
    void deveSimularEmprestimoPessoaJuridico() {
        FabricaAbstrata fabrica = new FabricaJuridico();
        Cliente cliente = new Cliente(fabrica);
        assertEquals("Valor total: 4010.5163101003764", cliente.simularEmprestimo(1000, 10));
    }

    @Test
    void deveSimularEmprestimoPessoaFisica() {
        FabricaAbstrata fabrica = new FabricaFisica();
        Cliente cliente = new Cliente(fabrica);
        assertEquals("Valor total: 3547.795800333112", cliente.simularEmprestimo(1000, 10));
    }

    @Test
    void deveConsultarSaldoPessoaJuridico() {
        FabricaAbstrata fabrica = new FabricaJuridico();
        Cliente cliente = new Cliente(fabrica);
        cliente.depositar(1000);
        assertEquals(955, cliente.consultarSaldo());
    }

    @Test
    void deveConsultarSaldoPessoaFisica() {
        FabricaAbstrata fabrica = new FabricaFisica();
        Cliente cliente = new Cliente(fabrica);
        cliente.depositar(1000);
        assertEquals(966, cliente.consultarSaldo());
    }
}