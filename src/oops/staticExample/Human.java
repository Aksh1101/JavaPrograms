package oops.staticExample;


public class Human {
        int age;
        String name;
        int salary;
        Boolean married;
        static long population; // this population variable is not dependent on the object if we are using it with static

        static void message(){
            System.out.println("Hello World");
            //System.out.println(this.age); you cannot use this keyword inside in static method
        }


    public Human(int age, String name,int salary, Boolean married) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
        Human.population += 1; // we use class name instead of this as(population) it is static
        Human.message();
    }
}
