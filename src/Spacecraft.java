import java.util.Date;

/**
 * Represent a class abstract of de Spacecraft
 */

public abstract class Spacecraft {

    // abstract class fields
    protected String name;
    protected String country;
    protected String fuel;
    protected Date yearActvity;
    protected int speed;  

    /**
     * 
     */
    protected abstract void setSpeed(int speed);

    /**
     * 
     */
    protected abstract void speedUp();


    /**
     * 
     */
    protected abstract void seeFuelUsed();

    
}
