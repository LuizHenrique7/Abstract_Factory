import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
class ClienteTest {

    @Test
    void deveSelecionarMemoria8GB() {
        FabricaAbstrata fabrica = new FabricaNotebookIntel();
        Cliente cliente = new Cliente(fabrica);
        assertEquals("Memória 8GB", cliente.selecionarMemoria());
    }

    @Test
    void deveSelecionarMemoria16GB() {
        FabricaAbstrata fabrica = new FabricaNotebookAMD();
        Cliente cliente = new Cliente(fabrica);
        assertEquals("Memória 16GB", cliente.selecionarMemoria());
    }

    @Test
    void deveSelecionarCPUAMD() {
        FabricaAbstrata fabrica = new FabricaNotebookAMD();
        Cliente cliente = new Cliente(fabrica);
        assertEquals("AMD Ryzen 7", cliente.selecionarCPU());
    }

    @Test
    void deveSelecionarCPUIntel() {
        FabricaAbstrata fabrica = new FabricaNotebookIntel();
        Cliente cliente = new Cliente(fabrica);
        assertEquals("Intel Core i7", cliente.selecionarCPU());
    }

}