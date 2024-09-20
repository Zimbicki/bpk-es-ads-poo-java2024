public class Main {
    public static void main(String[] args) {
        Motor motor = new Motor(2000, "V8", TipoCombustivel.GASOLINA);
        Carro carro = new Carro("Mustang", motor);

        carro.ligarCarro();
        carro.acionarAcelerador(2000);
        carro.trocarMarcha();
        carro.turboBoost();
        carro.acionarFreio(1500);
        carro.reduzirPotenciaMotor();
        carro.desligarCarro();
    }
}
