public class Main {
    public static void main(String[] args) {
        Apartment sinemen = new Apartment("Sinemen",14);

        Floor firstFloor = new Floor("blue",sinemen);
            House house1 = new House(sinemen);
                Person mralibatu = new Person("Ali Batuhan Ozsurmeli",20,true);
                Person lavinia = new Person("Lavinia",20);

        sinemen.AddFloor(firstFloor);
        firstFloor.AddHouse(house1);
        house1.AddPerson(mralibatu);
        house1.AddPerson(lavinia);

        Floor secondFloor = new Floor("purple",sinemen);
            House house2 = new House(sinemen);
                Person person1 = new Person("Person1",44);
                Person person2 = new Person("Person2",50);

            House house3 = new House(sinemen);
                Person person3 = new Person("Person3",60,true);
                Person person4 = new Person("Person4",35);
                Person person5 = new Person("Person5",53,true);
            House house4 = new House(sinemen);

        sinemen.AddFloor(secondFloor);
        secondFloor.AddHouse(house2);
        secondFloor.AddHouse(house3);
        secondFloor.AddHouse(house4);
        house2.AddPerson(person1);
        house2.AddPerson(person2);
        house3.AddPerson(person3);
        house3.AddPerson(person4);
        house3.AddPerson(person5);


        Floor thirdFloor = new Floor("blue",sinemen);
        sinemen.AddFloor(thirdFloor);

        System.out.println();
        sinemen.Print();
    }
}
