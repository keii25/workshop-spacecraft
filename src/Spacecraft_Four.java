
public class Spacecraft_Four extends Spacecraft implements IMixedVehicle{

    public Spacecraft_Four(){

    }

    @Override
    protected void setSpeed(int speed) {
        this.speed = speed + 1;
    }

    @Override
    protected void speedUp() {
        speed += 25;
        System.out.println("La velocidad del Vehiculo " + name + " es de "+ speed + " actualmente");
        
    }

    @Override
    protected void seeFuelUsed() {
        System.out.println("La gasolina que utiliza la Nave Espacial " + name + " es: " + fuel);
        
    }

    @Override
    public void repair() {
        System.out.println("La nave Espacial " + name + " esta realizando Reparaciones  a Satelite 3");
        
    }

    @Override
    public void studyGravity() {
        System.out.println("La nave Espacial " + name + " esta realizando estudios de comportamiento de naves vecinas");
        
    }

    @Override
    public void doSatelliteMaintenance() {
        System.out.println("La nave Espacial " + name + " esta realizando mantenimiento Satelites nivel 1");
        
    }

    @Override
    public void doExploration() {
        System.out.println("La nave Espacial " + name + " esta realizando exploraciones CUALITATIVAS");
        
    }

    @Override
    public void studyCelestialBodies() {
        System.out.println("La nave Espacial " + name + " esta realizando estudios de cuerpos celestes X");
        
    }
    
}
