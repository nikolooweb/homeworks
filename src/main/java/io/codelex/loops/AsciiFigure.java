package io.codelex.loops;

public class AsciiFigure {
    public static void main(String[] args) {

        String star = "*";
        String slashLeft = "/";
        String slashRight = Character.toString((char) 92);
        final int size = 7;

        int indexFloors = size;
        int indexSymbols = 4;

        for (int i = 0; i < size; i++) {
            System.out.println(slashLeft.repeat(indexSymbols * (indexFloors - 1)) + star.repeat(indexSymbols * i) + star.repeat(indexSymbols * i) + slashRight.repeat(indexSymbols * (indexFloors - 1)));
            indexFloors--;

        }
    }
}
