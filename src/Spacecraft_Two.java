
public class Spacecraft_Two extends Spacecraft implements IUnmannedships {

    public Spacecraft_Two(){
        
    }

    @Override
    protected void setSpeed(int speed) {
        this.speed = speed;
        
    }

    @Override
    protected void speedUp() {
        speed += 16;
        System.out.println("La velocidad del Vehiculo " + name + " es de "+ speed + " actualmente");
        
    }

    @Override
    protected void seeFuelUsed() {
        System.out.println("La gasolina que utiliza la Nave Espacial " + name + " es: " + fuel);
        
    }

    @Override
    public void doExploration() {
        System.out.println("La nave Espacial " + name + " esta realizando exploraciones de rutina");
        
    }

    @Override
    public void studyCelestialBodies() {
        System.out.println("La nave Espacial " + name + " esta realizando estudios de cuerpos celestes");
        
    }
    
}
