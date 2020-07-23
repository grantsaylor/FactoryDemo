package part1.game.character;

public class CharacterFactory {

    public Character createCharacter(String info){
        if(info.contentEquals("standing")){
            return new StandingCharacter();
        }else if(info.contentEquals("sitting")){
            return new SittingCharacter();
        }

        return null;

    }

}
