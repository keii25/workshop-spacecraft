
public class Spacecraft_Three extends Spacecraft implements IMannedships {

    public Spacecraft_Three(){

    }

    @Override
    protected void setSpeed(int speed) {
        this.speed = speed;
        
    }

    @Override
    protected void speedUp() {
        speed += 20;
        System.out.println("La velocidad del Vehiculo " + name + " es de "+ speed + " actualmente");
        
    }

    @Override
    protected void seeFuelUsed() {
        System.out.println("La gasolina que utiliza la Nave Espacial " + name + " es: " + fuel);
        
    }

    @Override
    public void repair() {
        System.out.println("La nave Espacial " + name + " esta realizando Reparaciones");
        
    }

    @Override
    public void studyGravity() {
        System.out.println("La nave Espacial " + name + " esta realizando estudios de comportamiento en la gravedad");
        
    }

    @Override
    public void doSatelliteMaintenance() {
        System.out.println("La nave Espacial " + name + " esta realizando mantenimiento de rutina a Satelites en Orbita");
        
    }
    
}
