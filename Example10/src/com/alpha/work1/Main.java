package com.alpha.work1;

public class Main {
    public static void main(String[] args) {
//        Device device = new Device("N001", "ASUS",
//                2034);
//        System.out.println(device);
//
//        Device device1 = new Monitor("M123", "LG",
//                4002.0, 1024, 768);
//        System.out.println(device1);
//
//        Device device2 = new EthernetAdapter("A5050", "HP",
//                1111.5,150, "AA5070");
        Device[] devices = createDevices();
        for (Device d : devices) {
            System.out.println(d);
        }

        System.out.println(devices[2].equals(devices[5]));
        System.out.println(devices[2].hashCode());
        System.out.println(devices[5].hashCode());
    }

    public static Device [] createDevices () {
        return new Device[] {
                new Device("N001", "ASUS",
                        2034),
                new Monitor("M123", "LG",
                4002.0, 1024, 768),
                new EthernetAdapter("A5050", "HP",
                1111.5,150, "AA5070"),
                new Device("N001", "ASUS",
                        2034),
                new Monitor("M123", "LG",
                        4002.0, 1024, 768),
                new EthernetAdapter("A5050", "HP",
                        1111.5,150, "AA5070"),
        };
    }
    
}


// реализовать иквлс и хещкода для класса Адаптер!!!!!!!!