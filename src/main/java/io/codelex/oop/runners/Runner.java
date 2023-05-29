package io.codelex.oop.runners;

public enum Runner {
    BEGINNER(10, 15),
    INTERMEDIATE(7, 10),
    ADVANCED(0, 7),
    NOVICE(16, 100);

    final int minMinutes;
    final int maxMinutes;

    Runner(int minMinutes, int maxMinutes) {
        this.minMinutes = minMinutes;
        this.maxMinutes = maxMinutes;
    }

    static Runner getFitnessLevel(int minutes) {

        if (minutes > 0 && minutes < 7) {
            return ADVANCED;
        } else if (minutes >= 7 && minutes < 10) {
            return INTERMEDIATE;
        } else if (minutes >= 10 && minutes <= 15) {
            return BEGINNER;
        } else {
            return NOVICE;
        }
    }
}

