public class Cliente {

    private CPU cpu;

    private Memoria memoria;


    public Cliente (FabricaAbstrata fabrica) {
        this.cpu = fabrica.createCPU();
        this.memoria = fabrica.createMemoria();

    }

    public String selecionarCPU(){ return this.cpu.selecionar();}

    public String selecionarMemoria(){ return this.memoria.selecionar();}

}
