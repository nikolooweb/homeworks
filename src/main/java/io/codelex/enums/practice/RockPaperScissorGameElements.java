package io.codelex.enums.practice;

public enum RockPaperScissorGameElements {
    ROCK("rock"),
    PAPER("paper"),
    SCISSOR("scissor");

    final String name;
    RockPaperScissorGameElements[] beat;
    RockPaperScissorGameElements(String stringValue){
        this.name = stringValue;
    }
    static {
        ROCK.beat = new RockPaperScissorGameElements[]{RockPaperScissorGameElements.SCISSOR};
        PAPER.beat = new RockPaperScissorGameElements[]{RockPaperScissorGameElements.ROCK};
        SCISSOR.beat = new RockPaperScissorGameElements[]{RockPaperScissorGameElements.PAPER};
    }
}
