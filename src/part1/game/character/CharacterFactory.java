package part1.game.character;

public class CharacterFactory {

    public Character createCharacter(String info) {
        if (info.contentEquals("standing")) {
            return new StandingCharacter();
        } else if (info.contentEquals("sitting")) {
            return new SittingCharacter();
        } else if (info.contentEquals("leftcrabwalking")) {
            return new LeftCrabwalkingCharacter();
        } else if (info.contentEquals("rightcrabwalking")) {
            return new RightCrabwalkingCharacter();
        } else if (info.contentEquals("leftwalking")) {
            return new LeftWalkingCharacter();
        } else if (info.contentEquals("rightwalking")) {
            return new RightWalkingCharacter();
        } else if (info.contentEquals("leftrunning")) {
            return new LeftRunningCharacter();
        } else if (info.contentEquals("rightrunning")) {
            return new RightRunningCharacter();
        } else if (info.contentEquals("leftcrawling")) {
            return new LeftCrawlingCharacter();
        } else if (info.contentEquals("rightcrawling")) {
            return new RightCrawlingCharacter();
        } else if (info.contentEquals("jumping")) {
            return new JumpingCharacter();
        }
        return null;
    }

}
