public class Moto extends Vehiculo{
    private int cilindrada;
    Moto(String marca, String modelo,int cantidadRueda,int cilindrada){
        this.setCantidadRueda(cantidadRueda);
        this.setMarca(marca);
        this.setModelo(modelo);
        this.setCilindrada(cilindrada);

    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }
}
