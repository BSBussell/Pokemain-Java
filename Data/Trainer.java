import java.util.ArrayList;

public class Trainer {

    String name;

    int numberOfPokemon;
    ArrayList<Pokemon> team = new ArrayList<Pokemon>();
    
    int cashPrize;
    boolean isGymLeader;
    
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
}