import com.company.details.*;
import com.company.professions.*;
import com.company.vehicles.*;

public class Exercise7{
    public static void main(String[] args){
        Car NewSedan = new Car();
        NewSedan.brand = "BMW";
        NewSedan.autoClass = "C";
        NewSedan.weight = 1500;
        NewSedan.driver = new Driver();
        NewSedan.driver.fullname = "Sergey Arb";
        NewSedan.driver.age = 27;
        NewSedan.engine = new Engine();
        NewSedan.engine.power = 250;
        NewSedan.engine.brand = "BMW";
        NewSedan.start();
        NewSedan.turnLeft();
        NewSedan.turnRight();
        NewSedan.stop();
        NewSedan.printInfo();
    }
}