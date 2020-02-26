
public class Data {

    //public Data() {}
	public static Pokemon getPokemon(int id, int level) {

		switch(id) {

			case 1: 
				return new Pokemon("Bulbasaur", "Grass", level, 3,3,3,3,3);
				
			case 2:
				return new Pokemon("Ivysaur", "Grass", level, 5,5,5,5,5);
				
            case 3:
                return new Pokemon("Venusaur", "Grass", level, 7,7,7,7,7);
			    
            case 4:
                return new Pokemon("Charmander", "Fire", level, 3,3,3,3,3);
                
            case 5:
                return new Pokemon("Charmeleon", "Fire", level, 5,5,5,5,5);
                
            case 6:
                return new Pokemon("Charizard", "Fire", level, 7,7,7,7,7);
                
            case 7:
                return new Pokemon("Squirtle", "Water", level, 3,3,3,3,3);
                
            case 8: 
                return new Pokemon("Wartortle", "Water", level, 5,5,5,5,5);
                
            case 9:
                return new Pokemon("Blastoise", "Water", level, 7,7,7,7,7);
                
            case 10:
                return new Pokemon("Caterpie", "Bug", level, 2,2,2,2,2);
                
            case 11:
                return new Pokemon("Metapod", "Bug", level, 4,4,4,4,4);
                
            case 12:
                return new Pokemon("Butterfree", "Bug", level, 6,6,6,6,6);
                
            case 13:
                return new Pokemon("Weedle", "Bug", level, 3,3,3,3,3);
                
            case 14: 
                return new Pokemon("Kakuna", "Bug", level, 5,5,5,5,5);
                
            case 15:
                return new Pokemon("Beedrill", "Bug", level, 7,7,7,7,7);
                
            case 16: 
                return new Pokemon("Pidgey", "Flying", level, 3,3,3,3,3);
                
            case 17:
                return new Pokemon("Pidgeotto", "Flying", level, 5,5,5,5,5);
                
            case 18: 
                return new Pokemon("Pidgeot", "Flying", level, 7,7,7,7,7);
                
            case 19: 
                return new Pokemon("Rattata", "Normal", level, 3,3,3,3,3);
                
            case 20:
                return new Pokemon("Raticate", "Normal", level, 5,5,5,5,5);
                
            case 21: 
                return new Pokemon("Spearow", "Flying", level, 3,3,3,3,3);
                
            case 22: 
                return new Pokemon("Fearow", "Flying", level, 5,5,5,5,5);
                
            case 23: 
                return new Pokemon("Ekans", "Poison", level, 3,3,3,3,3);
                
            case 24:
                return new Pokemon("Arbok", "Poison", level, 5,5,5,5,5);
                
            case 25:
                return new Pokemon("Pikachu", "Electric", level, 3,3,3,3,3);
                
            case 26:
                return new Pokemon("Raichu", "Electric", level, 5,5,5,5,5);
                
            case 27: 
                return new Pokemon("Sandshrew", "Ground", level, 3,3,3,3,3);
                
            case 28: 
                return new Pokemon("Sandslash", "Ground", level, 5,5,5,5,5);
                
            case 29: 
                return new Pokemon("Nidoran(♀)", "Poison", level, 3,3,3,3,3);
                
            case 30: 
                return new Pokemon("Nidorina", "Poison", level, 5,5,5,5,5);
                
            case 31: 
                return new Pokemon("Nidoqueen", "Poison", level, 7,7,7,7,7);
                
            case 32: 
                return new Pokemon("Nidoran(♂)", "Poison", level, 3,3,3,3,3);
                
            case 33:
                return new Pokemon("Nidorino", "Poison", level, 5,5,5,5,5);
                
            case 34: 
                return new Pokemon("Nidoking", "Poison", level, 7,7,7,7,7);
                
            case 35:
                return new Pokemon("Clefairy", "Normal", level, 3,3,3,3,3);
                
            case 36:
                return new Pokemon("Clefable", "Normal", level, 5,5,5,5,5);
                
            case 37: 
                return new Pokemon("Vulpix", "Fire", level, 3,3,3,3,3);
                
            case 38:
                return new Pokemon("Ninetales", "Fire", level, 5,5,5,5,5);
                
            case 39:
                return new Pokemon("Jigglypuff", "Normal", level, 3,3,3,3,3);
                
            case 40: 
                return new Pokemon("Wigglytuff", "Normal", level, 5,5,5,5,5);
                
            case 41:
                return new Pokemon("Zubat", "Poison", level, 3,3,3,3,3);
                
            case 42: 
                return new Pokemon("Golbat", "Poison", level, 5,5,5,5,5);
                
            case 43:
                return new Pokemon("Oddish", "Grass", level, 3,3,3,3,3);
                
            case 44: 
                return new Pokemon("Gloom", "Grass", level, 5,5,5,5,5);
                
            case 45:
                return new Pokemon("Vileplume", "Grass", level, 7,7,7,7,7);
                
            case 46:
                return new Pokemon("Paras", "Bug", level, 3,3,3,3,3);
                
            case 47:
                return new Pokemon("Parasect", "Bug", level, 5,5,5,5,5);
                
            case 48:
                return new Pokemon("Venonat", "Bug", level, 3,3,3,3,3);
                
            case 49:
                return new Pokemon("Venomoth", "Bug", level, 5,5,5,5,5);
                
            case 50: 
                return new Pokemon("Diglett", "Ground", level, 3,3,3,3,3);
                
            case 51: 
                return new Pokemon("Dugtrio", "Ground", level, 5,5,5,5,5);
                
            case 52: 
                return new Pokemon("Meowth", "Normal", level, 3,3,3,3,3);
                
            case 53:
                return new Pokemon("Persian", "Normal", level, 5,5,5,5,5);
                
            case 54: 
                return new Pokemon("Psyduck", "Water", level, 3,3,3,3,3);
                
            case 55:
                return new Pokemon("Golduck", "Water", level, 5,5,5,5,5);
                
            case 56:
                return new Pokemon("Mankey", "Fighting", level, 3,3,3,3,3);
                
            case 57:
                return new Pokemon("Primeape", "Fighting", level, 5,5,5,5,5);
                
            case 58:
                return new Pokemon("Growlithe", "Fire", level, 3,3,3,3,3);
                
            case 59:
                return new Pokemon("Arcanine", "Fire", level, 5,5,5,5,5);
                
            case 60:
                return new Pokemon("Poliwag", "Water", level, 3,3,3,3,3);
                
            case 61:
                return new Pokemon("Poliwhirl", "Water", level, 5,5,5,5,5);
                
            case 62: 
                return new Pokemon("Poliwrath", "Water", level, 7,7,7,7,7);
                
            case 63:
                return new Pokemon("Abra", "Psychic", level, 3,3,3,3,3);
                
            case 64: 
                return new Pokemon("Kadabra", "Psychic", level, 5,5,5,5,5);
                
            case 65:
                return new Pokemon("Alakazam", "Psychic", level, 7,7,7,7,7);
                
            case 66:
                return new Pokemon("Machop", "Fighting", level, 3,3,3,3,3);
                
            case 67:
                return new Pokemon("Machoke", "Fighting", level, 5,5,5,5,5);
                
            case 68:
                return new Pokemon("Machamp", "Fighting", level, 7,7,7,7,7);
                
            case 69: 
                return new Pokemon("Bellsprout", "Grass", level, 3,3,3,3,3);
                
            case 70:
                return new Pokemon("Weepinbell", "Grass", level, 5,5,5,5,5);
                
            case 71:
                return new Pokemon("Victreebel", "Grass", level, 7,7,7,7,7);
                
            case 72:
                return new Pokemon("Tentacool", "Water", level, 3,3,3,3,3);
                
            case 73:
                return new Pokemon("Tentacruel", "Water", level, 5,5,5,5,5);
                
            case 152:
                return new Pokemon();
            
            default:
                return new Pokemon();
		}
	}

    public static Trainer getTrainer(int id) {
        
        Trainer gen = new Trainer();

        switch(id) {

            case -1: 
                gen.setName("Ben");
                gen.setTeamSize(1);
                gen.setPrize(100);
                Pokemon first = getPokemon(6,40);
                first.addMove(getMove(0),0);
                gen.addPokemon(getPokemon(6,40));
                return gen;

            case 0:
                gen.setName("Jimmy");
                gen.setTeamSize(2);
                gen.setPrize(180);
                gen.addPokemon(getPokemon(19,4));
                gen.addPokemon(getPokemon(16,6));
                return gen;
                
            case 1:
                gen.setName("Bill");
                gen.setTeamSize(3);
                gen.setPrize(402);
                gen.addPokemon(getPokemon(21,7));
                gen.addPokemon(getPokemon(27,9));
                return gen;

            default:
                return gen;
                
        }
    }

    public static Trainer genTrainer(int level) {

        Trainer gen = new Trainer();
        return gen;
    }

    /*public static Trainer getGymLeader(int id) {

        switch(id) {
            
            case 0:
                
        }
    }*/

    public static Move getMove(int id) {

        switch(id) {
            
            case 0: 
                return new Move("Absorb", "Grass", 20, 100, false);
                //User recovers half the HP inflicted on opponent
                
            case 1:
                return new Move("Acid", "Poison", 40, 100, false);
                
            case 2:
                return new Move("Barrage", "Normal", 15, 85, true);
                //Hits 2-5 times
                
            case 3:
                return new Move("Bind", "Normal", 15, 85, true);
                //traps opponent, damaging them for 4-5 turns
                
            case 4:
                return new Move("Body Slam", "Normal", 85, 100, true);
                //may paralyze
                
            case 5:
                return new Move("Bone Club", "Ground", 65, 85, true);
                //may flinch
                
            case 6:
                return new Move("Bonemerang", "Ground", 50, 90, true);
                //hits twice
                
            case 7:
                return new Move("Bubble", "Water", 40, 100, false);  
                
            case 8:
                return new Move("Bubble Beam", "Water", 65, 100, false);
                
            case 9:
                return new Move("Clamp", "Water", 35, 85, true);
                //Traps opponent, damaging them for 4-5 turns.
                
            case 10:
                return new Move("Comet Punch", "Normal", 18, 85, true);
                //Hits 2-5 times
                
            /*case 11:
                return new Move();
                
                */
                
            default:
                return new Move("","",0,0,false);
            
            
            
            
            
            
            /*
            case 0:
                return Move("Tackle","Normal",40,true);
                
            case 1:
                return Move("Bubble","Water",40,false);
                
            case 2:
                return Move("Vine Whip","Grass",45,true);
                
            case 3:
                return Move("Ember","Fire",40,false);
                
            */
            
        }
    }
}