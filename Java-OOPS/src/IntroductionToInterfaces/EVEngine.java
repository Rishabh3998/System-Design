package IntroductionToInterfaces;

public class EVEngine implements Engine {
    @Override
    public void start() {
        System.out.println("EV engine start");
    }

    @Override
    public void stop() {
        System.out.println("EV engine stop");
    }

    @Override
    public void accelerate() {
        System.out.println("EV engine accelerate");
    }
}
