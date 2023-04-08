import java.util.Scanner;

public class Floor {
    private House[] houses = new House[100];
    private String color;
    private int houseCount = 0;

    Floor(String color, Apartment apartment){
        if(isColorAvailable(color,apartment)){
            this.color = color;
        }else{
            System.out.println("The color exist");
            System.out.println("Colors : ");
            apartment.PrintColors();
            System.out.println("Enter new color : ");
            Scanner input = new Scanner(System.in);
            String newColor = color;
            do{
                newColor = input.next();
                if(!isColorAvailable(newColor,apartment)){
                    System.out.println("The color exist, try another color");
                }else{
                    break;
                }
            }while (!isColorAvailable(newColor,apartment));
            this.color = newColor;
        }
    }

    public void AddHouse(House h){
        houses[houseCount] = h;
        houseCount++;
        System.out.println("House added");
    }

    public boolean isColorAvailable(String color, Apartment apartment){
        for (String colorExist : apartment.getFloorColors()) {
            if(color.equals(colorExist)){       //Check the Color list
                return false;
            }
        }
        apartment.setFloorColors(color);
        return true;
    }

    public void Print(){
        System.out.println("Floor color is : " + this.color);
        System.out.println("---------Houses---------");
        System.out.println("There are " + houseCount + " house on this floor");
        for (int i = 0; i <= houseCount - 1; i++) {
            houses[i].Print();
            System.out.println();
        }
    }
}
