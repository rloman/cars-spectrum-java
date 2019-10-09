package nl.spectrum.garage.domain;

public class Samsung implements Televisie {

    private boolean on;
    private int currentChannel;
    private int volume;


    @Override
    public void on() {
        this.on = true;
        System.out.println("Samsung is now "+(this.on ? " on" : " off"));

    }

    @Override
    public void off() {
        this.on = false;
        System.out.println("Samsung is now "+(this.on ? " on" : " off"));
    }

    @Override
    public int switchChannel(int newChannel) {
        this.currentChannel = newChannel;

        System.out.println("Samsung is now on channel "+this.currentChannel);

        return this.currentChannel;
    }

    @Override
    public int volume(int volume) {
       this.volume = volume;

       return this.volume;
    }
}
