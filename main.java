public class main {
    public static void main(String[] args) {
        System.out.println("--- ALFONSO TERMINAL TRACKER: KERNEL SIMULATION ---");

        terminal terminal = new terminal();

        // Simulating vehicles arriving at the terminal queue
        terminal.createProcess("Jeepney", "Alfonso to Indang", 5);
        terminal.createProcess("Bus", "Alfonso to PITX", 10);
        terminal.createProcess("Tricycle", "Alfonso Poblacion Loop", 3);

        // Run the scheduler to process them
        terminal.runScheduler();
    }
}