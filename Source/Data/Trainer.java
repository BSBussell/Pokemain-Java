import java.util.ArrayList;

public class Trainer {

    private String name;

    private int numberOfPokemon;
    private ArrayList<Pokemon> team = new ArrayList<Pokemon>();
    
    private int cashPrize;
    private boolean isGymLeader;
    
    public Trainer(String name, int numberOfPokemon, int cashPrize, boolean isGymLeader) {

    }

    public Trainer() {

        this.isGymLeader = false;
    }

    public void setName(String name) {

        this.name = name;
    }

    public void setTeamSize(int size) {

        this.numberOfPokemon = size;
    }

    public void setPrize(int cashPrize) {

        this.cashPrize = cashPrize;
    }

    public void setGymLeader() {

        this.isGymLeader = true;
    }

    public void addPokemon(Pokemon pokemon) {

        team.add(pokemon);
    }

    public String getName() {

        return name;
    }

    public ArrayList<Pokemon> getTeam() {

        return team;
    }
}