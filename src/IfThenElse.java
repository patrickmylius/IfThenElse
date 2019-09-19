public class IfThenElse {
    public static void main(String[] args) {

        String svar = bilStarter(true, true);
        System.out.println(svar);
    }

    public static String bilStarter(boolean doorClose, boolean engineOn) {

        if (doorClose && engineOn) {
            return "Ready to go!";
        }
        if (doorClose && !engineOn) {
            return "Turn on engine";
        }
        if (!doorClose && engineOn) {
            return "Close the door";
        }
        return "Get moving!";
    }
}





