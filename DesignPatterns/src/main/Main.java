package main;

import Model.Bootcamper;

public class Main {
    public static void main(String[] args) {

        Bootcamper bootcamper = new Bootcamper();
        
        System.out.println(bootcamper.status.applyforJob());
        System.out.println(bootcamper.status.getCertified());
        System.out.println(bootcamper.status.enrollToCourse());
        System.out.println(bootcamper.status.getCertified());
        System.out.println(bootcamper.status.applyforJob());
        
    }
}
