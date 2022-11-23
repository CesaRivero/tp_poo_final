import java.util.ArrayList;

public class Garage {
    private double precioTotal;
    private boolean estaLleno;
    private double precioCambioRueda;
    private int capacidadMaxima;
    private Vehiculo trasporte;
    private ArrayList<Vehiculo>vehiculo;
    private double kilometrajeMedio;



    public boolean estaLleno() {

        return this.vehiculo.size()>=capacidadMaxima;
    }
    public void agregarVehiculo(Vehiculo vehiculo){
        if (estaLleno) ;/*falta limitar que no agregue si pasa l acapacidad maxima*/
        else
        this.vehiculo.add(vehiculo);
    }
    public void retirarVehiculo (Vehiculo vehiculo){
        this.vehiculo.remove(vehiculo);
    }

    Garage(int capacidadMaxima,double precioCambioRueda){
        this.setCapacidadMaxima(capacidadMaxima);
        this.setPrecioCambioRueda(precioCambioRueda);
        this.vehiculo=new ArrayList<Vehiculo>();
       /*this.kilometrajeMedio=this.trasporte.getKilometreaje()/this.getVehiculo().size(); intento de guardar los kilometrajes para sacar la media*/

    }
  /*  public void cambioRueda(){ intento de sumar las ruedas en variables locales
        int ruedaTotal=this.trasporte.getCantidadRueda();

       precioTotal=ruedaTotal*precioCambioRueda;
    }*/


    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public ArrayList<Vehiculo> getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(ArrayList<Vehiculo> vehiculo) {
        this.vehiculo = vehiculo;
    }

    public double getPrecioCambioRueda() {
        return precioCambioRueda;
    }

    public void setPrecioCambioRueda(double precioCambioRueda) {
        this.precioCambioRueda = precioCambioRueda;
    }



    public void setEstaLleno(boolean estaLleno) {
        this.estaLleno = estaLleno;
    }


    public double getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(double precioTotal) {
        this.precioTotal = precioTotal;
    }

    public double getKilometrajeMedio() {
        return kilometrajeMedio;
    }

    public void setKilometrajeMedio(double kilometrajeMedio) {
        this.kilometrajeMedio = kilometrajeMedio;
    }
}
