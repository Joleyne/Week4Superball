public class FootBallPlayer {
    private int jerseyNumber;
    private String name;

    public FootBallPlayer(int jerseyNumber, String name) {
        this.jerseyNumber = jerseyNumber;
        this.name = name;
    }

    public int getJerseyNumber() {
        return jerseyNumber;
    }

    public void setJerseyNumber(int jerseyNumber) {
        this.jerseyNumber = jerseyNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "FootBallPlayer{" +
                "jerseyNumber = " + jerseyNumber +
                ", name = '" + name + '\'' +
                '}';
    }





}
