public class Team
{
    // instance variables - replace the example below with your own
    private String teamName;
    private Athlete[] players;

    public Team(String name, int size)
    {
        // initialise instance variables
        this.teamName = name;
        this.players = new Athlete[size];
    }
    
    public String toString()
    {
        String output = "Team Name: " + teamName + "\n";
        for(Athlete a : players) {
            output += a + "\n";
        }
        return output;
    }
    
    public void addAthlete(Athlete a, int index){
        players[index] = a;
    }

}
