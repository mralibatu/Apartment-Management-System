import java.util.Scanner;

public class House {
    private Person[] people = new Person[10];
    private int id;
    private int personCount = 0;

    House(Apartment apartment){
        this.id = getAvailableID(apartment);
    }

    public void AddPerson(Person p){
        if((getOwner() != null) && p.isOwner()){                  //If house already has an owner and person wants to be an owner
            System.out.println("House has already a owner");
            System.out.println("Owner is " + getOwner().getName());
            System.out.println("If you want to change the owner press \"1\" ");
            Scanner input = new Scanner(System.in);
            int choose = input.nextInt();
            if (choose == 1) {
                getOwner().setOwner();
                System.out.println("Now there is no owner of the house");
            }else{
                p.setOwner();                          //Person doesn't want to be an owner anymore
                System.out.println("Owner is still " + getOwner().getName());
            }

        }
        people[personCount] = p;
        personCount++;
        if(p.isOwner()){
            System.out.println(p.getName() + " is added as owner");
        }else{
            System.out.println(p.getName() + " is added");
        }
    }
    private int getAvailableID(Apartment apartment){
        for (int i = 0; i < apartment.getHouseID().length; i++) {
            if(!apartment.getHouseID()[i]){         //Check the apartment ID list
                apartment.setHouseID(i);            //Fill the list
                return i;
            }
        }
        return -1;
    }

    public Person getOwner(){
        for (Person person: this.people
             ) {
            if(person == null){         //If there is no people in this house, we can say that there is no owner
                return null;
            }
            if(person.isOwner()){         //If there is a person who is the owner, return the owner
                return person;
            }
        }

        return null;
    }

    public void Print(){
        System.out.println("---------House id : " + this.id + "---------");
        if(personCount == 0){
            System.out.println("There is no one live in this house");
        }else{

            System.out.println("There are " + personCount + " person live in this house");
            System.out.println("People who stay in this house : ");
            for (int i = 0; i <= personCount - 1; i++) {
                if(people[i].isOwner()){
                    System.out.println(people[i].getName() + " (Owner)");
                }else{
                    System.out.println(people[i].getName());
                }
            }
        }

        System.out.println();
    }
}
