public class House {
     private int id;
     private int flat;
     private double area;
     private int floor;
     private int rooms;
     private String street;

    public House(int id, int flat, double area, int floor, int rooms, String street) {
        this.id = id;
        this.flat = flat;
        this.area = area;
        this.floor = floor;
        this.rooms = rooms;
        this.street = street;
    }

    public static House[] arrayOfHouses(){
        House[] houses = new House[5];
        houses[0] = new House(111111, 12,34, 5, 2, "Sira");
        houses[1] = new House(222222, 1,60, 1, 3, "Nova");
        houses[2] = new House(333333, 3,60, 1, 2, "Bula");
        houses[3] = new House(444444, 10,74.5, 4, 3, "Tima");
        houses[4] = new House(555555, 23,27.5, 7, 1, "Nebo");
        return houses;
    }

    public int getId() {
        return id;
    }
    private void setId(int id) {
        this.id = id;
    }
    public int getFlat() {
        return flat;
    }
    public void setFlat(int flat) {
        this.flat = flat;
    }
    public double getArea() {
        return area;
    }
    public void setArea(double area) {
        this.area = area;
    }
    public int getFloor() {
        return floor;
    }
    public void setFloor(int floor) {
        this.floor = floor;
    }
    public int getRooms() {
        return rooms;
    }
    public void setRooms(int rooms) {
        this.rooms = rooms;
    }
    public String getStreet() {
        return street;
    }
    public void setStreet(String street) {
        this.street = street;
    }
    @Override
     public String toString() {
         return "\nHouse ID: " + id + ", Area: " + area + ", Flat: " + flat + ", Floor: " + floor + ", Rooms: " + rooms + ", Street: " + street;
     }
}
