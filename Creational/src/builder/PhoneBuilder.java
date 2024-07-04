package builder;

public class PhoneBuilder {
    private String os;
    private String processador;
    private double tamanhoDaTela;
    private int ram;
    private int bateria;

    public PhoneBuilder setOs(String os) {
        this.os = os;
        return this;
    }

    public PhoneBuilder setProcessador(String processador) {
        this.processador = processador;
        return this;
    }

    public PhoneBuilder setTamanhoDaTela(double tamanhoDaTela) {
        this.tamanhoDaTela = tamanhoDaTela;
        return this;
    }

    public PhoneBuilder setRam(int ram) {
        this.ram = ram;
        return this;
    }

    public PhoneBuilder setBateria(int bateria) {
        this.bateria = bateria;
        return this;
    }

    public Phone getPhone(){
        return new Phone(os, processador, tamanhoDaTela, ram, bateria);
    }
}
