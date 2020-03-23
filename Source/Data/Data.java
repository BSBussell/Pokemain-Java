
import java.util.ArrayList;

public class Data {

    //public Data() {}
	public static Pokemon getPokemon(int id, int level) {

		switch(id) {

			case 1: 
				return new Pokemon(1, "Bulbasaur", "Grass", level, 3,2,2,3,3,16);
				
			case 2:
				return new Pokemon(2, "Ivysaur", "Grass", level, 5,4,4,5,5,32);
				
            case 3:
                return new Pokemon(3, "Venusaur", "Grass", level, 8,6,6,7,7);
			    
            case 4:
                return new Pokemon(4, "Charmander", "Fire", level, 2,3,2,3,3,16);
                
            case 5:
                return new Pokemon(5, "Charmeleon", "Fire", level, 4,5,4,5,5,36);
                
            case 6:
                return new Pokemon(6, "Charizard", "Fire", level, 6,8,6,7,7);
                
            case 7:
                return new Pokemon(7, "Squirtle", "Water", level, 2,2,3,3,3, 16);
                
            case 8: 
                return new Pokemon(8, "Wartortle", "Water", level, 4,4,5,5,5, 36);
                
            case 9:
                return new Pokemon(9, "Blastoise", "Water", level, 6,6,8,7,7);
                
            case 10:
                return new Pokemon(10, "Caterpie", "Bug", level, 2,2,2,2,2,7);
                
            case 11:
                return new Pokemon(11, "Metapod", "Bug", level, 1,1,9,1,10,10);
                
            case 12:
                return new Pokemon(12, "Butterfree", "Bug", level, 7,6,6,6,6);
                
            case 13:
                return new Pokemon(13, "Weedle", "Bug", level, 3,4,3,3,3,7);
                
            case 14: 
                return new Pokemon(14, "Kakuna", "Bug", level, 5,5,5,5,5,10);
                
            case 15:
                return new Pokemon(15, "Beedrill", "Bug", level, 6,8,6,6,7);
                
            case 16: 
                return new Pokemon(16, "Pidgey", "Flying", level, 3,3,3,3,3,18);
                
            case 17:
                return new Pokemon(17, "Pidgeotto", "Flying", level, 5,5,5,5,5,36);
                
            case 18: 
                return new Pokemon(18, "Pidgeot", "Flying", level, 7,7,7,7,7);
                
            case 19: 
                return new Pokemon(19, "Rattata", "Normal", level, 3,3,3,3,3,20);
                
            case 20:
                return new Pokemon(20, "Raticate", "Normal", level, 5,5,5,5,5);
                
            case 21: 
                return new Pokemon(21, "Spearow", "Flying", level, 3,3,3,3,3,20);
                
            case 22: 
                return new Pokemon(22, "Fearow", "Flying", level, 5,5,5,5,5);
                
            case 23: 
                return new Pokemon(23, "Ekans", "Poison", level, 3,3,3,3,3,22);
                
            case 24:
                return new Pokemon(24, "Arbok", "Poison", level, 5,5,5,5,5);
                
            case 25:
                return new Pokemon(25, "Pikachu", "Electric", level, 3,3,3,3,3);
                
            case 26:
                return new Pokemon(26, "Raichu", "Electric", level, 5,5,5,5,5);
                
            case 27: 
                return new Pokemon(27, "Sandshrew", "Ground", level, 3,3,3,3,3,22);
                
            case 28: 
                return new Pokemon(28, "Sandslash", "Ground", level, 5,5,5,5,5);
                
            case 29: 
                return new Pokemon(29, "Nidoran(♀)", "Poison", level, 3,3,3,3,3,16);
                
            case 30: 
                return new Pokemon(30, "Nidorina", "Poison", level, 5,5,5,5,5);
                
            case 31: 
                return new Pokemon(31, "Nidoqueen", "Poison", level, 7,7,7,7,7);
                
            case 32: 
                return new Pokemon(32, "Nidoran(♂)", "Poison", level, 3,3,3,3,3,16);
                
            case 33:
                return new Pokemon(33, "Nidorino", "Poison", level, 5,5,5,5,5);
                
            case 34: 
                return new Pokemon(34, "Nidoking", "Poison", level, 7,7,7,7,7);
                
            case 35:
                return new Pokemon(35, "Clefairy", "Normal", level, 7,4,4,4,4);
                
            case 36:
                return new Pokemon(36, "Clefable", "Normal", level, 9,8,8,8,6);
                
            case 37: 
                return new Pokemon(37, "Vulpix", "Fire", level, 3,3,3,3,3);
                
            case 38:
                return new Pokemon(38, "Ninetales", "Fire", level, 6,8,6,7,7);
                
            case 39:
                return new Pokemon(39, "Jigglypuff", "Normal", level, 3,3,3,3,3);
                
            case 40: 
                return new Pokemon(40, "Wigglytuff", "Normal", level, 5,5,5,5,5);
                
            case 41:
                return new Pokemon(41, "Zubat", "Poison", level, 3,3,3,3,3,22);
                
            case 42: 
                return new Pokemon(42, "Golbat", "Poison", level, 5,5,5,5,5);
                
            case 43:
                return new Pokemon(43, "Oddish", "Grass", level, 3,3,3,3,3,21);
                
            case 44: 
                return new Pokemon(44, "Gloom", "Grass", level, 5,5,5,5,5);
                
            case 45:
                return new Pokemon(45, "Vileplume", "Grass", level, 7,7,7,7,7);
                
            case 46:
                return new Pokemon(46, "Paras", "Bug", level, 3,3,3,3,3,24);
                
            case 47:
                return new Pokemon(47, "Parasect", "Bug", level, 5,5,5,5,5);
                
            case 48:
                return new Pokemon(48, "Venonat", "Bug", level, 3,3,3,3,3,31);
                
            case 49:
                return new Pokemon(49, "Venomoth", "Bug", level, 5,5,5,5,5);
                
            case 50: 
                return new Pokemon(50, "Diglett", "Ground", level, 3,4,4,3,2,26);
                
            case 51: 
                return new Pokemon(51, "Dugtrio", "Ground", level, 5,6,6,5,4);
                
            case 52: 
                return new Pokemon(52, "Meowth", "Normal", level, 3,3,3,3,3,28);
                
            case 53:
                return new Pokemon(53, "Persian", "Normal", level, 5,5,5,5,5);
                
            case 54:
                return new Pokemon(54, "Psyduck", "Normal", level, 3,3,3,3,3,33);
                
            case 55:
                return new Pokemon(55, "Golduck", "Water", level, 7,5,5,8,5);
                
            case 56:
                return new Pokemon(56, "Mankey", "Fighting", level, 4,5,3,3,5,28);
                
            case 57:
                return new Pokemon(57, "Primeape", "Fighting", level, 5,8,5,5,6);
                
            case 58:
                return new Pokemon(58, "Growlithe", "Fire", level, 3,3,3,4,3);
                
            case 59:
                return new Pokemon(59, "Arcanine", "Fire", level, 7,6,5,7,5);
                
            case 60:
                return new Pokemon(60, "Poliwag", "Water", level, 3,3,3,3,3,25);
                
            case 61:
                return new Pokemon(61, "Poliwhirl", "Water", level, 5,5,5,5,5);
                
            case 62: 
                return new Pokemon(62, "Poliwrath", "Water", level, 7,7,7,7,7);
                
            case 63:
                return new Pokemon(63, "Abra", "Psychic", level, 3,3,3,3,5,16);
                
            case 64: 
                return new Pokemon(64, "Kadabra", "Psychic", level, 5,5,5,5,5);
                
            case 65:
                return new Pokemon(65, "Alakazam", "Psychic", level, 7,7,7,7,7);
                
            case 66:
                return new Pokemon(66, "Machop", "Fighting", level, 3,3,3,3,3,28);
                
            case 67:
                return new Pokemon(67, "Machoke", "Fighting", level, 5,5,5,5,5);
                
            case 68:
                return new Pokemon(68, "Machamp", "Fighting", level, 7,7,7,7,7);
                
            case 69: 
                return new Pokemon(69, "Bellsprout", "Grass", level, 3,3,3,3,3,21);
                
            case 70:
                return new Pokemon(70, "Weepinbell", "Grass", level, 5,5,5,5,5);
                
            case 71:
                return new Pokemon(71, "Victreebel", "Grass", level, 7,7,7,7,7);
                
            case 72:
                return new Pokemon(72, "Tentacool", "Water", level, 3,3,3,3,3,30);
                
            case 73:
                return new Pokemon(73, "Tentacruel", "Water", level, 5,5,5,5,5);
            
            case 74: 
                return new Pokemon(74, "Geodude", "Ground", level, 3,3,3,3,3,25);

            case 75:
                return new Pokemon(75, "Graveler", "Ground", level, 5,5,5,5,5);

            case 76:
                return new Pokemon(76, "Golem", "Ground", level, 7,7,7,7,7);

            case 77:
                return new Pokemon(77, "Ponyta", "Fire", level, 3,3,3,3,3,40);

            case 78: 
                return new Pokemon(78, "Rapidash", "Fire", level, 5,5,5,5,5);
            
            case 79:
                return new Pokemon(79, "Slowpoke", "Water", level, 3,3,3,3,3,37);
            
            case 80:
                return new Pokemon(80, "Slowbro", "Water", level, 5,5,5,5,5);

            case 81:
                return new Pokemon(81, "Magnemite", "Electric", level, 3,3,3,3,3,30);

            case 82:
                return new Pokemon(82, "Magneton", "Electric", level, 5,5,5,5,5);
            
            case 83:
                return new Pokemon(83, "Farfeth'd", "Flying", level, 3,3,3,3,3);

            case 84:
                return new Pokemon(84, "Doduo", "Flying", level, 3,3,3,3,3,31);

            case 85:
                return new Pokemon(85, "Dodrio", "Flying", level, 5,5,5,5,5);

            case 86:
                return new Pokemon(86, "Seel", "Water", level, 3,3,3,3,3,34);

            case 87:
                return new Pokemon(87, "Dewgong", "Water", level, 5,5,5,5,5);

            case 88:
                return new Pokemon(88, "Grimer", "Poison", level, 3,3,3,3,3,38);

            case 89:
                return new Pokemon(89, "Muk", "Poison", level, 5,5,5,5,5);

            case 90:
                return new Pokemon(90, "Shellder", "Water", level, 3,3,3,3,3);

            case 91:
                return new Pokemon(91, "Cloyster", "Water", level, 5,5,5,5,5);

            case 92:
                return new Pokemon(92, "Gastly", "Ghost", level, 3,4,3,6,5,25);

            case 93:
                return new Pokemon(93, "Haunter", "Ghost", level, 5,6,5,8,7);

            case 94: 
                return new Pokemon(94, "Gengar", "Ghost", level, 7,8,7,10,9);
            
            case 95:
                return new Pokemon(95, "Onix", "Rock", level, 6,6,7,2,5);

            case 96: 
                return new Pokemon(96, "Drowzee", "Psychic", level, 3,3,3,3,3,26);

            case 97:
                return new Pokemon(97, "Hypno", "Psychic", level, 5,5,5,5,5);
            
            case 98:
                return new Pokemon(98, "Krabby", "Water", level, 3,3,3,3,3,28);

            case 99:
                return new Pokemon(99, "Kingler", "Water", level, 6,7,5,4,6);

            case 100:
                return new Pokemon(100, "Voltorb", "Electric", level, 3,3,3,3,3,30);

            case 101:
                return new Pokemon(101, "Electrode", "Electric", level, 3,7,3,6,4);

            case 102:
                return new Pokemon(102, "Exeggcute", "Grass", level, 4,3,4,5,2);
                
            case 103:
                return new Pokemon(103, "Exeggcutor", "Grass", level, 7,6,7,8,4);

            case 104:
                return new Pokemon(104, "Cubone", "Ground", level, 3,3,3,3,3,28);

            case 105:
                return new Pokemon(105, "Marowak", "Ground", level, 5,5,5,5,5);
                
            case 106:
                return new Pokemon(106, "Hitmonlee", "Fighting", level, 5,5,5,5,5);

            case 107:
                return new Pokemon(107, "Hitmonchan", "Fighting", level, 5,5,5,5,5);

            case 108:
                return new Pokemon(108, "Lickitung", "Normal", level, 3,3,3,3,3);
                
            case 109:
                return new Pokemon(109, "Koffing", "Poison", level, 3,3,3,3,3,35);

            case 110:
                return new Pokemon(110, "Weezing", "Poison", level, 5,5,5,5,5);
                
            case 111:
                return new Pokemon(111, "Rhyhorn", "Ground", level, 3,3,3,3,3,42);
                
            case 112:
                return new Pokemon(112, "Rhydon", "Ground", level, 5,5,5,5,5);
                
            case 113:
                return new Pokemon(113, "Chansey", "Normal", level, 15,3,3,3,3);
                
            case 114:
                return new Pokemon(114, "Tangela", "Grass", level, 6,4,3,3,4);

            case 115:
                return new Pokemon(115, "Kangaskhan", "Normal", level, 7,7,7,7,7);
                
            case 116:
                return new Pokemon(116, "Horsea", "Water", level, 3,3,3,3,3,32);

            case 117:
                return new Pokemon(117, "Seadra", "Water", level, 5,5,5,5,5);

            case 118:
                return new Pokemon(118, "Goldeen", "Water", level, 3,3,3,3,3,33);

            case 119:
                return new Pokemon(119, "Seaking", "Water", level, 5,5,5,5,5);

            case 120:
                return new Pokemon(120, "Staryu", "Water", level, 3,3,3,3,3);

            case 121:
                return new Pokemon(121, "Starmie", "Water", level, 5,5,5,5,5);

            case 122:
                return new Pokemon(122, "Mr. Mime", "Psychic", level, 5,5,5,5,5);

            case 123:
                return new Pokemon(123, "Scyther", "Bug", level, 5,5,5,5,5);

            case 124:
                return new Pokemon(124, "Jynx", "Psychic", level, 5,5,5,5,5);

            case 125:
                return new Pokemon(125, "Electabuzz", "Electric", level, 5,5,5,5,5);
                
            case 126:
                return new Pokemon(126, "Magmar", "Fire", level, 5,6,6,5,5);
                
            case 127:
                return new Pokemon(127, "Pinsir", "Bug", level, 5,5,5,5,5);

            case 128: 
                return new Pokemon(128, "Tauros", "Normal", level, 5,5,5,5,5);

            case 129:
                return new Pokemon(129, "Magikarp", "Water", level, 1,1,1,1,1,20);

            case 130:
                return new Pokemon(130, "Gyrados", "Water", level, 8,9,8,9,9);

            case 131:
                return new Pokemon(131, "Lapras", "Water", level, 7,7,7,7,7);

            case 132:
                return new Pokemon(132, "Ditto", "Normal", level, 3,3,3,3,3);
                
            case 133:
                return new Pokemon(133, "Eevee", "Normal", level, 3,3,3,3,3);

            case 134:
                return new Pokemon(134, "Vaporeon", "Water", level, 6,6,6,6,6);

            case 135:
                return new Pokemon(135, "Jolteon", "Electric", level, 6,6,6,6,6);
                
            case 136:
                return new Pokemon(136, "Flareon", "Fire", level, 6,6,6,6,6);

            case 137:
                return new Pokemon(137, "Porygon", "Normal", level, 5,5,5,5,5);
                
            case 138:
                return new Pokemon(138, "Omanyte", "Water", level, 3,3,3,3,3,40);

            case 139:
                return new Pokemon(139, "Omastar", "Water", level, 5,5,5,5,5);

            case 140:
                return new Pokemon(140, "Kabuto", "Rock", level, 4,4,4,4,4,40);

            case 141:
                return new Pokemon(141, "Kabutops", "Rock", level, 8,8,8,8,8);

            case 142:
                return new Pokemon(142, "Aerodactyl", "Rock", level, 7,7,7,7,7);

            case 143:
                return new Pokemon(143, "Snorlax", "Normal", level, 7,7,7,7,7);

            case 144:
                return new Pokemon(144, "Articuno", "Ice", level, 9,9,9,9,9);
            
            case 145:
                return new Pokemon(145, "Zapdos", "Electric", level, 9,9,9,9,9);

            case 146:
                return new Pokemon(146, "Moltres", "Fire", level, 9,9,9,9,9);

            case 147:
                return new Pokemon(147, "Dratini", "Dragon", level, 3,3,3,3,3,30);

            case 148:
                return new Pokemon(148, "Dragonair", "Dragon", level, 5,5,5,5,5,55);

            case 149:
                return new Pokemon(149, "Dragonite", "Dragon", level, 7,7,7,7,7);

            case 150: 
                return new Pokemon(150, "Mewtwo", "Psychic", level, 10,10,10,10,10);

            case 151:
                return new Pokemon(151, "Mew", "Psychic", level, 11,11,11,11,11);
                
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
                Pokemon first = getPokemon(6,10);
                first.addMove(getMove(28));
                gen.addPokemon(first);
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

        String[] names = {"Abraham","Alex"};
        Trainer gen = new Trainer();
        gen.setName(names[0]);
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
                return new Move("Constrict", "Normal", 10, 100, true);
                //may lower speed
                
            case 15:
                return new Move("Crab Rave", "Water", 100, 90, true);
                //orginally cranbhammer
                //high crit chance
            case 16:
                return new Move("Cut", "Normal", 50, 95, true);
            
            case 17: 
                return new Move("Dragon Rage","Dragon", 40, 100, false);
            
            case 18:
                return new Move("Dig", "Ground", 80, 100, true);
                //dig first turn attack second turn
                
            case 19:
                return new Move("Dizzy Punch", "Normal", 70, 100, true);
                //May confuse
            
            case 20:
                return new Move("Double Kick", "Fighting", 30, 100, true);
                //Hits twice
            
            case 21:
                return new Move("Double Slap", "Normal", 15, 85, true);
                //Hits 2 - 5 times
            
            case 22:
                return new Move("Double-Edge", "Normal", 120, 100, true);
                //recoil
            
            case 23:
                return new Move("Dream Eater", "Psychic", 100, 100, false);
            
            case 24:
                return new Move("Drill Peck", "Flying", 80, 100, true);
            
            case 25:
                return new Move("Eartquake", "Ground", 100, 100, true);
                //power doubled if opponent is underground from dig

            case 26:
                return new Move("Egg Bomb", "Normal", 100, 75, true);
                
            case 27:
                return new Move("Ember", "Fire", 40, 100, false);
                //may brun
            
            case 28: 
                return new Move("Explosion", "Normal", 250, 100, true);
                //user faints

            case 29:
                return new Move("Fire Blast", "Fire", 110, 85, false);
                //May Burn

            case 30: 
                return new Move("Fire Punch", "Fire", 75, 100, true);
                //May Brun

            case 31:
                return new Move("Fire Spin", "Fire", 35, 85, false);
                //Complicated shit
            
            case 32: 
                return new Move("Fissure", "Ground", 1000000, 30, true);
                //One hit kill if hit, but can't hit pokemon that are faster
            
            case 33:
                return new Move("Flamethrower", "Fire", 90, 100, false);
                //May Burn

            case 34:
                return new Move("Fly", "Flying", 90, 95, true);

            case 35:
                return new Move("Fury Attack", "Normal", 15, 85, true);
                //hits 2-5 times
            
            case 36: 
                return new Move("Fury Swipes", "Normal",18, 80, true);

            case 37:
                return new Move("Guillotine", "Normal", 1000000, 30, true);
            
            case 38:
                return new Move("Gust", "Flying", 40, 100, false);
            
            case 39:
                return new Move("Headbutt", "Normal", 70, 100, true);
            
            case 40: 
                return new Move("High Jump Kick", "Fighting", 130, 90, true);
            
            case 41:
                return new Move("Horn Attack", "Normal", 65, 100, true);
            
            case 42:
                return new Move("Hydro Pump", "Water", 110, 80, false);
            
            case 43:
                return new Move("Hyper Bean", "Normal", 150, 90, false);
                //orginally Hyper Beam
            
            case 44:
                return new Move("Hyper Fang", "Normal", 80, 90, true);
            
            case 45:
                return new Move("Ice Bean", "Ice", 90, 100, false);
                //may freeze

            case 46:
                return new Move("Ice Punch", "Ice", 75, 100, true);
                //may freeze

            case 47:
                return new Move("Jump Kick", "Fighting", 100, 95, true);

            case 48:
                return new Move("Karate Chop", "Fighting", 50, 100, true);

            case 49:
                return new Move("Leech Life", "Bug", 80, 100, false);
                // recovers half of damage dealt

            case 50:
                return new Move("Lick", "Ghost", 30, 100, true);
                //may paralize
            
            case 51:
                return new Move("Mega Drain", "Grass", 40, 100, false);
                // recovers half of damage dealt

            case 52:
                return new Move("Mega Kick", "Normal", 120, 75, true);
            
            case 53:
                return new Move("Mega Punch", "Normal", 80, 85, true);
            
            case 54:
            
                return new Move("Night Shade", "Ghost", 0,100,false);
            

            case 55:
                return new Move("Pay Day", "Normal", 40, 100, true);
                //gives moeny equal to 5x the pokemon's level
            
            case 56:
                return new Move("Peck", "Flying", 35, 100, true);
            
            case 57:
                return new Move("Petal Dance", "Grass", 120, 100, false);
            
            case 58:
                return new Move("Pin Missile", "Bug", 25, 95, false);
                //hits 2-5 times
            
            case 59:
                return new Move("Poison Sting", "Poison", 15, 100, true);
                //may poison
            
            case 60:
                return new Move("Pound", "Normal", 40, 100, true);

            case 61:
                return new Move("Psybean", "Psychic", 65, 100, false);
            
            case 62:
                return new Move("Psychic", "Psychic", 90, 100, false);
            
            case 63:
                return new Move("Quick Attack", "Normal", 40, 100, true);
                //hits first
            
            case 64:
                return new Move("Rage", "Normal", 20, 100, true);
            
            case 65:
                return new Move("Razor Leaf", "Grass", 55, 95, true);
            
            case 66:
                return new Move("Razor Wind", "Normal", 80, 100, false);
            
            case 67:
                return new Move("Rock Slide", "Rock", 75, 90, true);
                //may flinch
            
            case 68:
                return new Move("Rock Throw", "Rock", 50, 90, true);
            
            case 69:
                return new Move("Rolling Kick", "Fighting", 60, 85, true);
            
            case 70:
                return new Move("Scratch", "Normal", 40, 100, true);
            
            case 71:
                return new Move("Self-Destruct", "Normal", 200, 100, true);
                //user faints
            
            case 72:
                return new Move("Skull Bash", "Normal", 130, 100, true);
            
            case 73:
                return new Move("Sky Attack", "Flying", 140, 90, true);
            
            case 74:
                return new Move("Slam", "Normal", 80, 75, true);
            
            case 75:
                return new Move("Slash", "Normal", 70, 100, true);
            
            case 76:
                return new Move("Sludge", "Poison", 65, 100, false);
                //may poison
            
            case 77:
                return new Move("Smog", "Poison", 30, 70, false);
                //may poison
            
            case 78:
                return new Move("Solar Bean", "Grass", 120, 100, false);
            
            case 79:
                return new Move("Spike Cannon", "Normal", 20, 100, true);
            
            case 80:
                return new Move("Stomp", "Normal", 65, 100, true);
                //May Flinch
            
            case 81:
                return new Move("Strength", "Normal", 80, 100, true);
            
            case 82:
                return new Move("Submission", "Normal",80, 80, true);
                // recoil
            
            case 83: 
                return new Move("Super Fang", "Normal", 0, 90, true);
                //deals half 
            
            case 84:
                return new Move("Surf", "Water", 90, 100, false);
            
            case 85:
                return new Move("Swift", "Normal", 60, 150, false);
            
            case 86:
                return new Move("Tackle", "Normal", 40, 100, true);
            
            case 87:
                return new Move("Take Down", "Normal", 90, 85, true);
            
            case 88:
                return new Move("Thrash", "Normal", 120, 100, true);
            
            case 89:
                return new Move("Thunder","Electric", 110, 70, false);
            
            case 90:
                return new Move("Tunder Punch", "Electric", 75, 100, true);
            
            case 91:
                return new Move("Thunder Shock", "Electric", 40, 100, false);
            
            case 92:
                return new Move("Thunderbolt", "Electric", 90, 100, false);
            
            case 93:
                return new Move("Tri Attack", "Normal", 80, 100, false);
            
            case 94:
                return new Move("Twineedle", "Bug", 25, 100, true);
            
            case 95:
                return new Move("Vine Whip", "Grass", 45, 100, true);
            
            case 96:
                return new Move("Vise Grip", "Normal", 55, 100, true);
            
            case 97:
                return new Move("Water Gun", "Water", 40, 100, false);
            
            case 98:
                return new Move("Waterfall", "Water", 80, 100, false);
                //may flinch
            
            case 99:
                return new Move("Wing Attack", "Flying", 60, 100, false);
            
            case 100:
                return new Move("Wrap", "Normal", 15, 90, true);
            case 101:
                return new Move("Bite","Normal", 60,100,true);
                // Flinch





            
                
                
                
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

    public static Move learnSet(String type, int level) {
        
        switch(type) {
            
            case "Normal":
                switch(level) {
                    case 3:
                        return getMove(86); // Tackle
                    case 8:
                        return getMove(16); // Cut
                    case 19:
                        return getMove(50); // Lick
                    case 23:
                        return getMove(87); // Take Down
                    case 27:
                        return getMove(64); // Rage
                    case 32:
                        return getMove(55); // Pay Day
                    case 52:
                        return getMove(6); // Body Slam
                    case 58:
                        return getMove(81); // Strength
                    case 62:
                        return getMove(43); // Hyper Bean
                    case 68:
                        return getMove(22); // Double-Edge
                    default:
                        return new Move("Null", "Null", 0, 0, true);
                }
            case "Fire":
                switch(level) {
                    case 1:
                        return getMove(27); // Ember
                    case 2:
                        return getMove(70); // Scratch
                    case 16:
                        return getMove(31); // Fire Spin
                    case 24:
                        return getMove(64); // Rage
                    case 36:
                        return getMove(75); // Slash
                    case 39: 
                        return getMove(30); // Fire Punch
                    case 46:
                        return getMove(33); // Flamethrower
                    case 55:
                        return getMove(29); // Fire Blast
                    default:
                        return new Move("Null", "Null", 0, 0, true);
                        
                }
            case "Water":
                switch(level) {
                    case 2:
                        return getMove(86); // Tackle
                    case 15:
                        return getMove(97); // Water Gun
                    case 24:
                        return getMove(101); // Bite
                    case 31:
                        return getMove(0); // Withdrawl
                    case 42:
                        return getMove(72); // Skull Bash
                    case 52:
                        return getMove(42); // Hydro Pump
                    default:
                        return new Move("Null", "Null", 0, 0, true);
                }
            case "Electric":
                switch(level) {
                    case 0:
                        break;
                    default:
                        return new Move("Null", "Null", 0, 0, true);
                }
            case "Grass":
                switch(level) {
                    case 5:
                        return getMove(86); // Tackle
                    case 8:
                        return getMove(0); // Absorb
                    case 10:
                        return getMove(16); // Cut
                    case 13:
                        return getMove(95); // Vine Whip
                    case 18:
                        return getMove(76); // Sludge
                    case 20:
                        return getMove(63); // Quick Attack
                    case 25:
                        return getMove(51); // Mega Drain
                    case 30:
                        return getMove(65); // Razor Leaf
                    case 40:
                        return getMove(57); // Petal Dance
                    case 65:
                        return getMove(78); // Solar Bean
                    default:
                        return new Move("Null", "Null", 0, 0, true);
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
                    default:
                        return new Move("Null", "Null", 0, 0, true);
                }
            case "Poison":
                switch(level) {
                    case 0:
                        break;
                    default:
                        return new Move("Null", "Null", 0, 0, true);
                }
            case "Ground":
                switch(level) {
                    case 0:
                        break;
                    default:
                        return new Move("Null", "Null", 0, 0, true);
                }
            case "Fly":
                switch(level) {
                    case 0:
                        break;
                    default:
                        return new Move("Null", "Null", 0, 0, true);
                }
            case "Psychic":
                switch(level) {
                    case 0:
                        break;
                    default:
                        return new Move("Null", "Null", 0, 0, true);
                }
            case "Bug":
                switch(level) {
                    case 6:
                        return getMove(0); // Tackle
                    case 12:
                        return getMove(0); // Confusion
                    case 32:
                        return getMove(0); // Psybean
                    default:
                        return new Move("Null", "Null", 0, 0, true);
                }
            case "Rock":
                switch(level) {
                    case 0:
                        break;
                    default:
                        return new Move("Null", "Null", 0, 0, true);
                }
            case "Ghost":
                switch(level) {
                    case 0:
                        break;
                    default:
                        return new Move("Null", "Null", 0, 0, true);
                }
            case "Dragon":
                switch(level) {
                    case 5:
                        return getMove(100); // Wrap
                    case 10:
                        return getMove(92); // Thunderbolt
                    case 14:
                        return getMove(85); // Swift
                    case 23:
                        return getMove(84); // Surf
                    case 27:
                        return getMove(81); // Strength
                    case 35:
                        return getMove(74); // Slam
                    case 45:
                        return getMove(17); // Dragon Rage
                    case 60:
                        return getMove(43); // Hyper Beam
                    default:
                        return new Move("Null", "Null", 0, 0, true);
                }
        }
        return getMove(0);
    }

    public static double typeEffectiveness(String typeAttacker, String typeDefender) {
    
    ArrayList<String> noEffect = new ArrayList<String>();
    ArrayList<String> notVeryEffect = new ArrayList<String>();
    ArrayList<String> superEffect = new ArrayList<String>();
    
    switch(typeAttacker) {
            
            case "Normal":
                noEffect.add("Ghost");
                notVeryEffect.add("Rock");
                
                break;
            
            case "Fire":
                notVeryEffect.add("Fire");
                notVeryEffect.add("Water");
                notVeryEffect.add("Rock");
                notVeryEffect.add("Dragon");
                
                superEffect.add("Grass");
                superEffect.add("Ice");
                superEffect.add("Bug");
                
                break;

            case "Water":
                notVeryEffect.add("Water");
                notVeryEffect.add("Grass");
                notVeryEffect.add("Dragon");

                superEffect.add("Fire");
                superEffect.add("Ground");
                superEffect.add("Rock");
                
                break;
                
            case "Electric":
                noEffect.add("Ground");

                notVeryEffect.add("Electric");
                notVeryEffect.add("Grass");
                notVeryEffect.add("Dragon");

                superEffect.add("Water");
                superEffect.add("Flying");
                
                break;

            case "Grass":
                notVeryEffect.add("Fire");
                notVeryEffect.add("Grass");
                notVeryEffect.add("Poison");
                notVeryEffect.add("Flying");
                notVeryEffect.add("Bug");
                notVeryEffect.add("Dragon");
                
                superEffect.add("Water");
                superEffect.add("Ground");
                superEffect.add("Rock");
                
                break;
                
            case "Ice":
                notVeryEffect.add("Water");
                notVeryEffect.add("Ice");
                
                superEffect.add("Grass");
                superEffect.add("Ground");
                superEffect.add("Flying");
                superEffect.add("Dragon");
                
                break;
                
                
            case "Fighting":
                noEffect.add("Ghost");

                notVeryEffect.add("Poison");
                notVeryEffect.add("Flying");
                notVeryEffect.add("Psychic");
                notVeryEffect.add("Bug");

                superEffect.add("Normal");
                superEffect.add("Ice");
                superEffect.add("Rock");
                
                break;
                
            case "Poison":
                notVeryEffect.add("Poison");
                notVeryEffect.add("Ground");
                notVeryEffect.add("Rock");
                notVeryEffect.add("Ghost");

                superEffect.add("Grass");
                superEffect.add("Bug");
                
                break;
                
            case "Ground":
                noEffect.add("Flying");

                notVeryEffect.add("Bug");
                notVeryEffect.add("Grass");

                superEffect.add("Fire");
                superEffect.add("Electric");
                superEffect.add("Poison");
                superEffect.add("Rock");
                
                break;
                
            case "Flying":
                notVeryEffect.add("Electric");
                notVeryEffect.add("Bug");

                superEffect.add("Grass");
                superEffect.add("Fighting");
                superEffect.add("Bug");
                
            case "Psychic":
                notVeryEffect.add("Psychic");

                superEffect.add("Fighting");
                superEffect.add("Poison");
                
                break;

            case "Bug":
                notVeryEffect.add("Fire");
                notVeryEffect.add("Fighting");
                notVeryEffect.add("Flying");
                
                superEffect.add("Grass");
                superEffect.add("Poison");
                superEffect.add("Psychic");
                
                break;
                
            case "Rock":
                notVeryEffect.add("Fighting");
                notVeryEffect.add("Ground");

                superEffect.add("Fire");
                superEffect.add("Ice");
                superEffect.add("Flying");
                
                break;
                
            case "Ghost":
                noEffect.add("Normal");
                noEffect.add("Psychic");

                superEffect.add("Ghost");
                break;

            case "Dragon":
                superEffect.add("Dragon");
                
                break;
        }
        if (noEffect.contains(typeDefender)) {
            return 0.0;
        } else if (notVeryEffect.contains(typeDefender)) {
            return 0.5;
        } else if (superEffect.contains(typeDefender)) {
            return 2.0;
        } else {
            return 1.0;
        }
    }
}



