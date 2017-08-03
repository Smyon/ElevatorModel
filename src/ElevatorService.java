
public class ElevatorService {
    private final House house;

    public ElevatorService(House house) {
        this.house = house;
    }

    public Elevator call(int floor) {
        int min = house.getTotalFloors();
        Elevator elevator = null;
        for (Elevator e : house.getElevators()) {
            int distance = Math.abs(e.getFloor() - floor);
            if (min > distance) {
                min = distance;
                elevator = e;
            }
        }
        return elevator;
    }

    public int moveTo(Elevator elevator, int floor) {
        if (floor < 1 || floor > house.getTotalFloors()) {
            return -1;
        }

        elevator.setFloor(floor);

        return floor;
    }


}
