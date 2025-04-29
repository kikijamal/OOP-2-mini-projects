public class BatteryCharger {

    public static void main(String[] args) {
        int batteryLevel = 0; // we have initialized the battery to start at 0

        System.out.println("Starting battery charge...");

        // this is the while loop that ensure it continues charging till 100%
        while (batteryLevel < 100) { //condition needed to be satisfied
            batteryLevel += 10; // increment charging by 10%
            System.out.println("Charging... Battery at " + batteryLevel + "%");


            try {
                Thread.sleep(500); // this handles a pause for 0.5ms
            } catch (InterruptedException e) {
                System.out.println("Charging interrupted!");
            }
        }

        System.out.println("Battery fully charged! ✅");
    }
}

