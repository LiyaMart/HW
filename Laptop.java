package hw;
public class Laptop {
    private String brand;
    private String model;
    private int ram;
    private int sdd;
    private String os;
    private String color;

    public String getBrand(){
        return brand;
    }

    public void setBrand(String brand){
        this.brand = brand;
    }

    public String getModel(){
        return model;
    }

    public void setModel(String model){
        this.model = model;
    }

    public int getRAM(){
        return ram;
    }

    public void setRAM(int ram){
        this.ram = ram;
    }

    public int getSDD(){
        return sdd;
    }

    public void setSDD(int sdd){
        this.sdd = sdd;
    }

    public String getOS(){
        return os;
    }

    public void setOS(String os){
        this.os = os;
    }

    public String getColor(){
        return color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public String toString() {
        return "brand: " + brand + ", model: " + model + ", RAM, Gb: " + ram + ", SDD, Gb: " + sdd + ", OS: " + os + ", color: " + color;
    }

    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }
        if (obj instanceof Laptop){
            Laptop laptop = (Laptop) obj;
            return color.equals(laptop.color) && os == laptop.os && sdd == laptop.sdd && ram == laptop.ram;
        }
        return false;
    }

    public int hashCode() {
        return color.hashCode() + sdd + ram + os.hashCode();
    }
}