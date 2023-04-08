public class Person {
    private String name;
    private int age;
    private boolean isOwner = false;
    Person(String name, int age, boolean isOwner){
        this.name = name;
        this.age = age;
        this.isOwner = isOwner;
    }

    Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isOwner() {
        return isOwner;
    }

    public void setOwner() {
        this.isOwner = !this.isOwner;
    }
}
