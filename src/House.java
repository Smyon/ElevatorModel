
public class House {
    private int totalFloors;
    private  Elevator[] elevators;

    public House() {
    }

    public House(int totalFloors, Elevator... elevators) {
        this.totalFloors = totalFloors;
        this.elevators = elevators;
    }

    public int getTotalFloors() {                               // Это называется инкапсуляцией
        return totalFloors;                                     // Прячим поле и обращяемся к нему через методы
    }

    public void setTotalFloors(int totalFloors) {
        this.totalFloors = totalFloors;
    }

    public Elevator[] getElevators() {
        return elevators;
    }

    public void setElevators(Elevator... elevators) {
        this.elevators = elevators;
    }

    public String getInfo() {
        String info = "Total floors: " + totalFloors + "\n";
        for (Elevator elevator : elevators) {
            info += "Elevators: " + elevator.getInfo() + "\n";
        }
        return  info;
    }
}
