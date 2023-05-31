package io.codelex.collections.practice.phonebook;

public class PhoneApp {
    public static void main(String[] args) {
        PhoneDirectory test = new PhoneDirectory();
        test.putNumber("albert", "20453602");
        test.putNumber("cina", "20023434");
        test.putNumber("bane", "39935454");
        test.putNumber("zyv", "84598498");

        System.out.println(test.getNumber("albert"));
        System.out.println(test.getNumber("cina"));
        System.out.println(test.getData());

    }
}
