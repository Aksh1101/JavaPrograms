package oops.staticExample;

public class Main {
    public static void main(String[] args) {
        Human Sam = new Human(24,"Sam Williams",34000, true);
        Human Tom = new Human(26,"Tom Hanks",65000, false);

        System.out.println(Sam.age);
        System.out.println(Human.population);

        //greeting() , cannot call this function here it is not static
        // as we can not use anything that is not static inside a static method

    }
    // this is not  dependent on objects
    static void greet(){
        //greeting(), here i cannot call it because it requires an instance
        // but the function you are using it in does not depend on instances

        // how to make it works
        // here it works referencing the instance in a static context
        Main obj = new Main();
        obj.greeting();
        // we have to make an obj for a function that in not static to call in inside a static method
    }

    void fun(){
        greeting();
        // non static fun can access other non-static function
    }

    // we know that something which is not static , belongs to an object
    void greeting(){
        greet(); // can access it that function here
        System.out.println("Hello World");
    }
}
