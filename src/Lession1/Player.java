package Lession1;


public class Player {
    private String name;
    private int jumpHigh;
    private int distanceRun;
    private String result;

    public void getName(String name) {
        this.name = name;
    }

    public int getDistanceRun() {
        return distanceRun;
    }

    public int getJumpHigh() {
        return jumpHigh;
    }
    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public Player(String name, int distanceRun, int jumpHigh) {
        this.name = name;
        this.distanceRun = distanceRun;
        this.jumpHigh = jumpHigh;
        this.result = getResult();
    }
    @Override
    public String toString() {
        return "Player: " + name + ", " + distanceRun + ", " + jumpHigh + ", " +  result;
    }

}
