package io.codelex.enums.practice;

public enum Directions{
    NORTH("up"),
    SOUTH("down"),
    EAST("right"),
    WEST("left");

    final String directionSimplified;

    Directions (String direction) {
        this.directionSimplified = direction;
    }

}

