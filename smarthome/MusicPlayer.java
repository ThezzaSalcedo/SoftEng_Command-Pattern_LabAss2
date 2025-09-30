package smarthome;

public class MusicPlayer implements Switchable, Adjustable {
    private int volume = 50;
    private boolean isPlaying = false;

    @Override
    public void turnOn() {
        if (!isPlaying) {
            isPlaying = true;
            System.out.println("Music Player is turned ON and playing at volume " + volume + "%");
        } else {
            System.out.println("Music Player is already ON and playing at volume " + volume + "%");
        }
    }

    @Override
    public void turnOff() {
        if (isPlaying) {
            isPlaying = false;
            System.out.println("Music Player is turned OFF");
        } else {
            System.out.println("Music Player is already OFF");
        }
    }

    @Override
    public void increase() {
        if (volume < 100) {
            volume += 10;
        }
        System.out.println("Music Player volume increased to " + volume + "%");
    }

    @Override
    public void decrease() {
        if (volume > 0) {
            volume -= 10;
        }
        System.out.println("Music Player volume decreased to " + volume + "%");
    }
}
