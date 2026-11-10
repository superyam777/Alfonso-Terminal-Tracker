import java.util.LinkedList;
import java.util.Queue;

public class terminal {
    private Queue<vehicle> readyQueue = new LinkedList<>();
    private int nextPid = 101;

    public void createProcess(String vehicleType, String route, int burstTime) {
        vehicle newVehicle = new vehicle(nextPid++, vehicleType, route, burstTime);
        readyQueue.add(newVehicle);
        System.out.println(
                "[KERNEL] Created Process PID " + newVehicle.getPid() + " (" + vehicleType + " - " + route + ")");
    }

    public void runScheduler() {
        System.out.println("\n--- STARTING TERMINAL FCFS SCHEDULER ---");

        while (!readyQueue.isEmpty()) {
            vehicle currentVehicle = readyQueue.poll();
            currentVehicle.setState("RUNNING");

            System.out.println("\n[DISPATCHER] Vehicle loaded into bay:");
            currentVehicle.printDetails();

            // Simulate clock ticks / countdown loop
            // (Assuming we add a getter/setter for remaining time if needed, or simulate
            // the loop)
            System.out.println("[DISPATCHER] Processing departure...");

            currentVehicle.setState("TERMINATED");
            System.out.println("[DISPATCHER] Process PID " + currentVehicle.getPid()
                    + " has successfully departed and terminated.");
        }

        System.out.println("\n--- ALL VEHICLES CLEARED FROM TERMINAL ---");
    }
}