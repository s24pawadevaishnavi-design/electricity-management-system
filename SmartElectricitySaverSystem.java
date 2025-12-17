import java.util.Scanner;

public class SmartElectricitySaverSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("======================================");
        System.out.println("     SMART ELECTRICITY SAVER SYSTEM");
        System.out.println("======================================\n");

        // User input
        System.out.print("Enter number of devices: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        String[] deviceNames = new String[n];
        int[] powerRatings = new int[n];
        boolean[] deviceStatus = new boolean[n];

        int totalPower = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("\nDevice " + (i + 1) + " Details");

            System.out.print("Enter device name: ");
            deviceNames[i] = sc.nextLine();

            System.out.print("Enter power rating (Watts): ");
            powerRatings[i] = sc.nextInt();

            System.out.print("Is device ON? (yes/no): ");
            sc.nextLine(); // consume newline
            String status = sc.nextLine().trim().toLowerCase();

            if (status.equals("yes")) {
                deviceStatus[i] = true;
                totalPower += powerRatings[i];
            } else {
                deviceStatus[i] = false;
            }
        }

        // Generate System ID
        int systemId = (int)(Math.random() * 90000) + 10000;

        // Display output
        System.out.println("\n------------ ENERGY CONSUMPTION REPORT ------------");
        System.out.println("System ID           : ES-" + systemId);
        System.out.println("Total Devices       : " + n);
        System.out.println("Active Power Usage  : " + totalPower + " Watts");

        if (totalPower > 300) {
            System.out.println("Energy Status       : High Consumption");
            System.out.println("Suggestion          : Switch off unused devices");
        } else {
            System.out.println("Energy Status       : Optimal Consumption");
            System.out.println("Suggestion          : Energy usage is efficient");
        }

        System.out.println("---------------------------------------------------");

        sc.close();
    }
}