package IntroductionToInterfaces;

public class Car implements Engine, Brake, Media {
    int a = 30;
    @Override
    public void brake() {
        System.out.println("Normal brake");
    }

    @Override
    public void start() {
        System.out.println("Normal engine start");
    }

    @Override
    public void stop() {
        System.out.println("Normal engine stop");
    }

    @Override
    public void accelerate() {
        System.out.println("Normal car accelerate");
    }
}
