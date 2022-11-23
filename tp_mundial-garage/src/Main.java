public class Main {
    public static void main(String[] args) {
        Garage garage1=new Garage(2,100);
        Auto auto1=new Auto("Renault","Logan",40000,4,5);
        Moto moto1=new Moto("BMW","800",2,110);
        Auto auto2=new Auto("Renault","Sandero",40000,4,5);
garage1.agregarVehiculo(auto1);
garage1.agregarVehiculo(moto1);
garage1.agregarVehiculo(auto2);




        System.out.println(String.format("Esta lleno? %b\nCapacidad actual: %s\nKilometraje medio:%f",garage1.estaLleno(), garage1.getVehiculo().size(),garage1.getKilometrajeMedio()));
    }
}