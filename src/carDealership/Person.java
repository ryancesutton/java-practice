package carDealership;

public class Person {

    private String name;

    public Person(String name) {
        this.name = name;
    }

//    public static void main(String[] args) {
//        carDealership.Person person1 = new carDealership.Person("Ry");
//        System.out.println(person1.getName());
//        person1.setName("OtherName");
//        System.out.println(person1.getName());
//        person1.sayHello();
//    }


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sayHello() {
        System.out.println("Hello from: " + this.getName());
    }
}
