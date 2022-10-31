import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        House[] houses = House.arrayOfHouses();
        System.out.println(Arrays.toString(houses));

        Scanner scanner = new Scanner(System.in);
        System.out.println("\na) Enter number of rooms you want to see: ");
        int numberOfRooms = scanner.nextInt();
        System.out.println("b) Enter min and max floor: ");
        int minFloor = scanner.nextInt();
        int maxFloor = scanner.nextInt();
        System.out.println("c) Enter min area you want to see: ");
        double minArea = scanner.nextDouble();

        var filteredHousesByRooms= filteredByRooms(houses, numberOfRooms);
        var filteredHousesByFloorsAndRooms = filteredByRoomsAndFloors(houses, numberOfRooms, minFloor, maxFloor);
        var filteredHousesByArea = filteredByArea(houses, minArea);

        System.out.println("\na) HOUSES WITH GIVEN NUMBER OF ROOMS: " + Arrays.toString(filteredHousesByRooms));
        System.out.println("\nb) HOUSES WITH GIVEN NUMBER OF ROOMS AND FLOOR RANGE: " + Arrays.toString(filteredHousesByFloorsAndRooms));
        System.out.println("\nc) HOUSES WITH BIGGER AREA THAN GIVEN: " + Arrays.toString(filteredHousesByArea));
    }

        public static House[] filteredByRooms(House[] houses, int rooms) {
            return Arrays.stream(houses)
                    .filter(house -> house.getRooms() == rooms)
                    .toArray(House[]::new);
        }

        public static House[] filteredByArea(House[] houses, double minArea) {
                var filteredHousesByArea = Arrays.stream(houses)
                        .filter(house -> house.getArea() > minArea)
                        .toArray(House[]::new);
                return filteredHousesByArea;
        }

        public static House[] filteredByRoomsAndFloors(House[] houses, int rooms, int minFloor, int maxFloor) {
                var filteredHousesByFloorsAndRooms = Arrays.stream(houses)
                        .filter(house -> house.getRooms() == rooms && house.getFloor() >= minFloor && house.getFloor() <= maxFloor )
                        .toArray(House[]::new);
                return filteredHousesByFloorsAndRooms;
        }
}
