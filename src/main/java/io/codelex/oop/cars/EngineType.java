package io.codelex.oop.cars;

public enum EngineType {

    I3(3),
    I4(4),
    I5(5),
    I6(6),
    V6(6),
    V8(8),
    V10(10),
    V12(12);

    final int cylinders;

    EngineType(int cylinderCount) {
        this.cylinders = cylinderCount;
    }
}
