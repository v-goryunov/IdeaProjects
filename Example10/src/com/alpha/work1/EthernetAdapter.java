package com.alpha.work1;

import java.util.Objects;

public class EthernetAdapter extends Device {
    private int speed;
    private String mac;

    public EthernetAdapter(String serialNumber, String manufacture,
                           double price, int speed, String mac) {
        super(serialNumber, manufacture, price);
        this.speed = speed;
        this.mac = mac;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    @Override
    public String toString() {
        return super.toString() +
        ", speed=" + speed + ", mac=" + mac;
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        if (!(obj instanceof EthernetAdapter)) {
            return false;
        }
        EthernetAdapter other = (EthernetAdapter) obj;
        if (this.speed != other.speed) {
            return false;
        }
        return this.mac == other.mac;
    }

    @Override
    public int hashCode() {
        int sum = super.hashCode();
        sum = 31 * sum + speed;
        int mac1 = Integer.parseInt(mac);
        sum = 31 * sum + (int) mac1;
        return sum;
    }
}
