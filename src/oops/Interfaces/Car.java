package oops.Interfaces;

public class Car implements Engine , Brake , Media{

    @Override
    public void brake() {
        System.out.println("Brake is pressed");
    }

    @Override
    public void startEngine() {
        System.out.println("Engine is started");
    }

    @Override
    public void stopEngine() {
        System.out.println("Engine is stopped");
    }

    @Override
    public void accEngine() {
        System.out.println("Engine is accelerated");
    }

    @Override
    public void play() {
        System.out.println("Music is playing");
    }

    @Override
    public void pause() {
        System.out.println("Music is paused");
    }

    @Override
    public void stop() {
        System.out.println("Music is stopped");
    }
}
