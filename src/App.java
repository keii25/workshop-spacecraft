import java.util.Scanner;
import java.util.concurrent.TimeUnit;



public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("--------------------------------");
        System.out.println("      Create Ships               ");
        System.out.println("--------------------------------");
        try (Scanner readOpcion = new Scanner(System.in)) {
            int opcion; 
            

            do{
                System.out.println("\n");
                System.out.println("1. ShuttlesVehicle");
                System.out.println("2. Mannedships");
                System.out.println("3. Unmannedships");
                System.out.println("4. Mixedvehicle");
                System.out.println("5. Exit");
                System.out.println("");
                System.out.print("Enter an option: ");
                opcion = readOpcion.nextInt();
                System.out.println("\n");
                
                
                switch(opcion){
                    case(1):
                        System.out.println("ShuttlesVehicle");
                        Spacecraft_One spacecraft_One = new Spacecraft_One();

                        System.out.print("Enter ship name: ");
                        spacecraft_One.name = readOpcion.next();            
                        TimeUnit.SECONDS.sleep(2);
                        System.out.println("\n");
                        spacecraft_One.setSpeed(5);
                        spacecraft_One.speedUp();
                        spacecraft_One.throwLoad();
                        System.out.println("\n");                            
                    break;

                    case(2):
                        System.out.println("Mannedships");
                        Spacecraft_Two spacecraft_Two = new Spacecraft_Two();

                        spacecraft_Two.fuel = "N2H4";
                        System.out.print("Enter ship name: ");
                        spacecraft_Two.name = readOpcion.next();
                        TimeUnit.SECONDS.sleep(2);
                        System.out.println("\n");
                        spacecraft_Two.setSpeed(3);
                        spacecraft_Two.speedUp();
                        spacecraft_Two.doExploration();
                        spacecraft_Two.seeFuelUsed();
                        System.out.println("\n");
                    break;

                    case(3):
                        System.out.println("Unmannedships");
                        Spacecraft_Three spacecraft_Three = new Spacecraft_Three();

                        spacecraft_Three.fuel = "NO4+UDMH";
                        System.out.print("Enter ship name: ");
                        spacecraft_Three.name = readOpcion.next();
                        TimeUnit.SECONDS.sleep(2);
                        System.out.println("\n");
                        spacecraft_Three.setSpeed(3);
                        spacecraft_Three.speedUp();
                        spacecraft_Three.repair();
                        spacecraft_Three.studyGravity();
                        spacecraft_Three.doSatelliteMaintenance();
                        System.out.println("");
                    break;

                    case(4):
                        System.out.println("Mixedvehicle");
                        Spacecraft_Four spacecraft_Four = new Spacecraft_Four();

                        spacecraft_Four.fuel = "Aerozina50 + N04";
                        System.out.print("Enter ship name: ");
                        spacecraft_Four.name = readOpcion.next();
                        TimeUnit.SECONDS.sleep(2);
                        System.out.println("\n");
                        spacecraft_Four.setSpeed(7);
                        spacecraft_Four.speedUp();
                        spacecraft_Four.doExploration();
                        spacecraft_Four.doSatelliteMaintenance();
                        System.out.println("");
                        break;
                    default:
                        System.out.println("Bye !!!");
                    break;
                }
                
            }while(opcion <= 4);
        }catch(Exception e){
            System.out.println("Invalid option, bye !");
        }
    }

}
