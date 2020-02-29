package com.alpha.work1;

public class Device {
    private String serialNumber;
    private String manufacture;
    private double price;

    public Device() {
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public String getManufacture() {
        return manufacture;
    }

    public double getPrice() {
        return price;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "class=" + getClass().getSimpleName() +
                ", serialNumber=" + serialNumber +
                ", manufacture=" + manufacture +
                ", price=" + price;
    }

    @Override
    public int hashCode() {
        int sum = 17;
        sum = 31 * sum + serialNumber.hashCode();
        sum = 31 * sum + manufacture.hashCode();
        long pr = Double.doubleToLongBits(price);  // privodim v "int"
        sum = 31 * sum + (int) (pr ^ (pr >>> 32));  // privodim v "int"
        return sum;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return  true;
        }
        if (obj == null || !(obj instanceof Device) ) {
            return  false;
        }
        Device other = (Device) obj;

        if (this.price != other.price) {
            return  false;
        }
        if ( !this.serialNumber.equals(other.serialNumber)) {
            return false;
        }
        return this.manufacture.equals(other.manufacture);

    }

    public Device(String serialNumber, String manufacture, double price) {
        this.serialNumber = serialNumber;
        this.manufacture = manufacture;
        this.price = price;


    }


}

