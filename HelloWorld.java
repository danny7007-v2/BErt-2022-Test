import 
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.Scheduler;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDash;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class HelloWorld extends TimedRobot {
    
    NetworkTable table = NetworkTableInstance.getDefault().getTable("dashboard");

    public HelloWorld(){
        
    }

    public static void main(String[] args) {
        
    }
}