public class Apartment {
    private String name;
    private int no;
    private int floorsCount = 0;
    private Floor[] floors = new Floor[100];
    private boolean[] houseID = new boolean[1000];
    private String[] floorColors = new String[floors.length];

    public Apartment(String name, int no) {
        this.name = name;
        this.no = no;
    }
    public void AddFloor(Floor floor){
        floors[floorsCount] = floor;
        floorsCount++;
    }

    public void Print(){
        System.out.println("Apartment name : " + name);
        System.out.println("No : " + no);
        System.out.println("----------Floors----------");
        System.out.println(this.name +" has " + floorsCount + " floors");
        System.out.println();
        for (int i = 0; i <= floorsCount - 1; i++) {
            this.floors[i].Print();
            System.out.println();
        }
    }

    public boolean[] getHouseID() {
        return houseID;
    }

    public void setHouseID(int id) {
        this.houseID[id] = true;
    }

    public String[] getFloorColors() {
        return floorColors;
    }

    public void setFloorColors(String color) {
        this.floorColors[floorsCount] = color;
    }
    public void PrintColors(){
        for (int i = 0; i <= floorsCount - 1; i++) {
            System.out.println(floorColors[i]);
        }
    }
}
