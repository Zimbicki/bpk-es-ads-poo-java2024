public class Carro {
    private String modelo;
    private Motor motor;

    public Carro(String modelo, Motor motor) {
        this.modelo = modelo;
        this.motor = motor;
    }

    public void acionarAcelerador(int incrementoRpm) {
        motor.acelerar(incrementoRpm);
    }

    public void acionarFreio(int decrementoRpm) {
        motor.reduzirRpm(decrementoRpm);
    }

    public void trocarMarcha() {
        System.out.println("Marcha trocada.");
    }

    public void ligarCarro() {
        motor.ligar();
        System.out.println("Carro ligado.");
    }

    public void desligarCarro() {
        motor.desligar();
        System.out.println("Carro desligado.");
    }

    public void turboBoost() {
        motor.aumentarPotencia(50);
        System.out.println("Turbo Boost ativado.");
    }

    public void reduzirPotenciaMotor() {
        motor.reduzirPotencia(50);
        System.out.println("Redução de potência do motor.");
    }
}
