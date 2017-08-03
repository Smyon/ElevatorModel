
public class Elevator {                         // Содержит значение лифта и этажа
    private int floor;                          // Поля обычно приват или протектед
    private int id;
    public boolean getInfo;


    public Elevator() {
    }

    public Elevator(int floor, int id) {
        this.floor = floor;
        this.id = id;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getInfo() {
        return id + ", " + floor;
    }
}