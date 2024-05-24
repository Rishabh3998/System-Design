package IntroductionToInterfaces;

public class SportsCar {
    private Engine engine;
    private final Media musicPlayer;

    public SportsCar() {
        engine = new PowerEngine();
        musicPlayer = new MediaPlayer();
    }

    public SportsCar(Engine engine, Media musicPlayer) {
        this.engine = engine;
        this.musicPlayer = musicPlayer;
    }

    public void start () {
        engine.start();
    }

    public void stop () {
        engine.stop();
    }

    public void startMusic () {
        musicPlayer.start();
    }

    public void stopMusic () {
        musicPlayer.stop();
    }

    public void upgradeEngine (Engine engine) {
        this.engine = engine;
    }
}
