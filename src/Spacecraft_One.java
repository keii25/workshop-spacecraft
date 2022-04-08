/**
 * 
 */

public class Spacecraft_One extends Spacecraft implements IShuttlesVehicle {

    public Spacecraft_One(){   
    }

    @Override
    protected void setSpeed(int speed) {        
        this.speed = speed;
    }

    @Override
    protected void speedUp() {
        speed += 10;
        System.out.println("La velocidad del Vehiculo " + name + " es de "+ speed + " actualmente");
        
    }

    @Override
    protected void seeFuelUsed() { 
        System.out.println("La gasolina que utiliza la Nave Espacial " + name + " es: " + fuel);    
        
    }

    @Override
    public void throwLoad() {
        System.out.println("El vehiculo " + name + " ha liberado la carga");
        
    }

    
   


    
}
