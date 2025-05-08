package basics;

public class MultipleIF {
    public static void main(String[] args) {
        int salary = 15000;
        if (salary > 1000){
            salary += 2000;
        } else if (salary > 20000){
            salary += 1000;
        }else {
            salary += 500;
        }
        System.out.println(salary);
    }
}
