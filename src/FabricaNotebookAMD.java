public class FabricaNotebookAMD implements FabricaAbstrata {

    @Override
    public CPU createCPU() {
        return new CPU_AMD();
    }

    @Override
    public Memoria createMemoria() {
        return new Memoria16GB();
    }
}