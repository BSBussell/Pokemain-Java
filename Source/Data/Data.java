
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
            
            case 74: 
                return new Pokemon("Geodude", "Ground", level, 3,3,3,3,3);

            case 75:
                return new Pokemon("Graveler", "Ground", level, 5,5,5,5,5);

            case 76:
                return new Pokemon("Golem", "Ground", level, 7,7,7,7,7);

            case 77:
                return new Pokemon("Ponyta", "Fire", level, 3,3,3,3,3);

            case 78: 
                return new Pokemon("Rapidash", "Fire", level, 5,5,5,5,5);
            
            case 79:
                return new Pokemon("Slowpoke", "Water", level, 3,3,3,3,3);
            
            case 80:
                return new Pokemon("Slowbro", "Water", level, 5,5,5,5,5);

            case 81:
                return new Pokemon("Magnemite", "Electric", level, 3,3,3,3,3);

            case 82:
                return new Pokemon("Magneton", "Electric", level, 5,5,5,5,5);
            
            case 83:
                return new Pokemon("Farfeth'd", "Flying", level, 3,3,3,3,3);

            case 84:
                return new Pokemon("Doduo", "Flying", level, 3,3,3,3,3);

            case 85:
                return new Pokemon("Dodrio", "Flying", level, 5,5,5,5,5);

            case 86:
                return new Pokemon("Seel", "Water", level, 3,3,3,3,3);

            case 87:
                return new Pokemon("Dewgong", "Water", level, 5,5,5,5,5);

            case 88:
                return new Pokemon("Grimer", "Poison", level, 3,3,3,3,3);

            case 89:
                return new Pokemon("Muk", "Poison", level, 5,5,5,5,5);

            case 90:
                return new Pokemon("Shellder", "Water", level, 3,3,3,3,3);

            case 91:
                return new Pokemon("Cloyster", "Water", level, 5,5,5,5,5);

            case 92:
                return new Pokemon("Gastly", "Ghost", level, 3,3,3,3,3);

            case 93:
                return new Pokemon("Haunter", "Ghost", level, 5,5,5,5,5);

            case 94: 
                return new Pokemon("Gengar", "Ghost", level, 7,7,7,7,7);
            
            case 95:
                return new Pokemon("Onix", "Rock", level, 3,3,3,3,3);

            case 96: 
                return new Pokemon("Drowzee", "Psychic", level, 3,3,3,3,3);

            case 97:
                return new Pokemon("Hypno", "Psychic", level, 5,5,5,5,5);
            
            case 98:
                return new Pokemon("Krabby", "Water", level, 3,3,3,3,3);

            case 99:
                return new Pokemon("Kingler", "Water", level, 5,5,5,5,5);

            case 100:
                return new Pokemon("Voltorb", "Electric", level, 3,3,3,3,3);

            case 101:
                return new Pokemon("Electrode", "Electric", level, 5,5,5,5,5);

            case 102:
                return new Pokemon("Exeggcute", "Grass", level, 3,3,3,3,3);
                
            case 103:
                return new Pokemon("Exeggcutor", "Grass", level, 5,5,5,5,5);

            case 104:
                return new Pokemon("Cubone", "Ground", level, 3,3,3,3,3);

            case 105:
                return new Pokemon("Marowak", "Ground", level, 5,5,5,5,5);
                
            case 106:
                return new Pokemon("Hitmonlee", "Fighting", level, 5,5,5,5,5);

            case 107:
                return new Pokemon("Hitmonchan", "Fighting", level, 5,5,5,5,5);

            case 108:
                return new Pokemon("Lickitung", "Normal", level, 3,3,3,3,3);
                
            case 109:
                return new Pokemon("Koffing", "Poison", level, 3,3,3,3,3);

            case 110:
                return new Pokemon("Weezing", "Poison", level, 5,5,5,5,5);
                
            case 111:
                return new Pokemon("Rhyhorn", "Ground", level, 3,3,3,3,3);
                
            case 112:
                return new Pokemon("Rhydon", "Ground", level, 5,5,5,5,5);
                
            case 113:
                return new Pokemon("Chansey", "Normal", level, 3,3,3,3,3);
                
            case 114:
                return new Pokemon("Tangela", "Grass", level, 3,3,3,3,3);

            case 115:
                return new Pokemon("Kangaskhan", "Normal", level, 7,7,7,7,7);
                
            case 116:
                return new Pokemon("Horsea", "Water", level, 3,3,3,3,3);

            case 117:
                return new Pokemon("Seadra", "Water", level, 5,5,5,5,5);

            case 118:
                return new Pokemon("Goldeen", "Water", level, 3,3,3,3,3);

            case 119:
                return new Pokemon("Seaking", "Water", level, 5,5,5,5,5);

            case 120:
                return new Pokemon("Staryu", "Water", level, 3,3,3,3,3);

            case 121:
                return new Pokemon("Starmie", "Water", level, 5,5,5,5,5);

            case 122:
                return new Pokemon("Mr. Mime", "Psychic", level, 5,5,5,5,5);

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
                return new Move("Aurora Beam", "Ice", 65, 100, false);
                
            case 3:
                return new Move("Barrage", "Normal", 15, 85, true);
                //Hits 2-5 times

            case 4:
                return new Move("Bind", "Normal", 15, 85, true);
                //traps opponent, damaging them for 4-5 turns
            
            case 5:
                return new Move("Blizzard", "Ice", 110, 70, false);
                //May freeze opponent
                
            case 6:
                return new Move("Body Slam", "Normal", 85, 100, true);
                //may paralyze
                
            case 7:
                return new Move("Bone Club", "Ground", 65, 85, true);
                //may flinch
                
            case 8:
                return new Move("Bonemerang", "Ground", 50, 90, true);
                //hits twice
                
            case 9:
                return new Move("Bubble", "Water", 40, 100, false);  
                
            case 10:
                return new Move("Bubble Beam", "Water", 65, 100, false);
                
            case 11:
                return new Move("Clamp", "Water", 35, 85, true);
                //Traps opponent, damaging them for 4-5 turns.
                
            case 12:
                return new Move("Comet Punch", "Normal", 18, 85, true);
                //Hits 2-5 times
                
            case 13:
                return new Move("Confusion", "Psychic", 50, 100, false);
                //may confuse
                
            case 14: 
                return new Move("Contrict", "Normal", 10, 100, true);
                //may lower speed
                
            case 15:
                return new Move("Crab Rave", "Water", 100, 90, true);
                //orginally cranbhammer
                //high crit chance
            case 16:
                return new Move("Cut", "Normal", 50, 95, true);
            
            case 17:
                return new Move("Dig", "Ground", 80, 100, true);
                //dig first turn attack second turn
                
            case 18:
                return new Move("Dizzy Punch", "Normal", 70, 100, true);
                //May confuse
            
            case 19:
                return new Move("Double Kick", "Fighting", 30, 100, true);
                //Hits twice
            /*
            case 20:
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

    public static Move learnSet(int level, String type) {
        
        switch(type) {
            
            case "Normal":
                switch(level) {
                    case 0:
                        break;
                }
            case "Fire":
                switch(level) {
                    case 0:
                        break;
                }
            case "Water":
                switch(level) {
                    case 0:
                        break;
                }
            case "Electric":
                switch(level) {
                    case 0:
                        break;
                }
            case "Grass":
                switch(level) {
                    case 0:
                        break;
                }
            case "Ice":
                switch(level) {
                    case 0:
                        break;
                }
            case "Fighting":
                switch(level) {
                    case 0:
                        break;
                }
            case "Poison":
                switch(level) {
                    case 0:
                        break;
                }
            case "Ground":
                switch(level) {
                    case 0:
                        break;
                }
            case "Fly":
                switch(level) {
                    case 0:
                        break;
                }
            case "Psychic":
                switch(level) {
                    case 0:
                        break;
                }
            case "Bug":
                switch(level) {
                    case 0:
                        break;
                }
            case "Rock":
                switch(level) {
                    case 0:
                        break;
                }
            case "Ghost":
                switch(level) {
                    case 0:
                        break;
                }
            case "Dragon":
                switch(level) {
                    case 0:
                        break;
                }
        }
    return getMove(0);
    }
}