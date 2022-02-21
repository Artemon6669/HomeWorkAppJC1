package Lession1;

public class Course{
    private int distanceTrip;
    private int barrierHigh;


    public Course(int distanceTrip, int barrierHigh) {
        this.distanceTrip = distanceTrip;
        this.barrierHigh = barrierHigh;
    }

    public void doIt(Team team) {
        for (Player player: team.players) {
            if (distanceTrip <= player.getDistanceRun() && barrierHigh <= player.getJumpHigh()) {
                player.setResult("You win");
                } else {
                player.setResult("You loose");
            }
        }
    }


}
