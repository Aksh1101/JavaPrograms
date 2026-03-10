package oops.collections.enumExamples;

public class Basic {
    enum Week{
        Mon,
        Tue,
        Wed,
        Thu,
        Fri,
        Sat,
        Sun
        // these are all called enum constants
        // public , static , final - all of them are
        // since its final you cant create child enums
        // there type is Week

    }
    public static void main(String[] args) {
        Week weekdays;
        weekdays = Week.Fri;

        for (Week day : Week.values()){
            System.out.println(day);
        }
        System.out.println(weekdays.ordinal());
    }
}
