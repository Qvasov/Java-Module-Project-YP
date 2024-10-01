public class Race {
    private String leader = "";
    private int leaderDistance = 0;

    public void defineLeader(Car car) {
        int carDistance = car.getSpeed() * 24;
        if (carDistance > leaderDistance) {
            leader = car.getName();
            leaderDistance = carDistance;
        }
    }

    public String getLeader() {
        return leader;
    }
}
