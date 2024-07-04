package builder;

public class Phone {
    private String os;
    private String processador;
    private double tamanhoDaTela;
    private int ram;
    private int bateria;

    public Phone(String os, String processador, double tamanhoDaTela, int ram, int bateria) {
        this.os = os;
        this.processador = processador;
        this.tamanhoDaTela = tamanhoDaTela;
        this.ram = ram;
        this.bateria = bateria;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "os='" + os + '\'' +
                ", processador='" + processador + '\'' +
                ", tamanhoDaTela=" + tamanhoDaTela +
                ", ram=" + ram +
                ", bateria=" + bateria +
                '}';
    }
}
