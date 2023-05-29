package io.codelex.oop.parcels;

public class Parcel implements Validator{
    private int xLength;
    private int yLength;
    private int zLength;
    private float weight;
    private boolean isExpress;

    public Parcel(int xLength, int yLength, int zLength, float weight, boolean isExpress){
        this.xLength = xLength;
        this.yLength = yLength;
        this.zLength = zLength;
        this.weight = weight;
        this.isExpress = isExpress;
    }

    @Override
    public boolean validate() {
        if ((xLength + yLength + zLength) > 300){
            System.out.println("sum of all dimensions exceeds 300");
            return false;
        } else if (xLength < 30 || yLength < 30 || zLength < 30) {
            System.out.println("one of dimensions is less than 30");
            return false;
        } else if (weight > 30 && !isExpress || weight > 15 && isExpress) {
            System.out.println("check weight limits for specific shipping method");
            return false;
        } else {
            System.out.println("Valid parcel...");
            return true;
        }
    }
}
