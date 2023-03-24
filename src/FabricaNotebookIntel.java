public class FabricaNotebookIntel implements FabricaAbstrata {

    @Override
    public CPU createCPU() {
        return new CPU_Intel();
    }

    @Override
    public Memoria createMemoria() {
        return new Memoria8GB();
    }
}