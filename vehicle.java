public class vehicle {
    private int pid;
    private String vehicleType;
    private String route;
    private int remainingTime;
    private String state;

    public vehicle(int pid, String vehicleType, String route, int burstTime) {
        this.pid = pid;
        this.vehicleType = vehicleType;
        this.route = route;
        this.remainingTime = burstTime;
        this.state = "READY";
    }

    public void printDetails() {
        System.out.println("[PID " + pid + "] " + vehicleType + " (" + route + ") | State: " + state
                + " | Remaining Time: " + remainingTime + "s");
    }

    public void setState(String newState) {
        this.state = newState;
    }

    public int getPid() {
        return this.pid;
    }
}