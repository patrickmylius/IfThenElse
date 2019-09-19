import junit.framework.TestCase;

public class IfThenElseTest extends TestCase {


    public void testMain() {

        IfThenElse ifthenelse = new IfThenElse();

        boolean engineOn = false; //change false/true to test different outputs
        boolean doorClose = true; //change to false / true to test different outputs

        if (doorClose && engineOn) {
            System.out.println("Ready to go"); // door is close and engine is on

        } if (!doorClose && engineOn) {
            System.out.println("Close the door"); // door is open and engine is on

        } if (doorClose && !engineOn){
            System.out.println(" Turn on engine"); // door is closed and engine is off

        }if (!doorClose && !engineOn)
            System.out.println("Close door and start engine"); // door is open and engine is off

    }

    public void testBilStarter() {

    }
}