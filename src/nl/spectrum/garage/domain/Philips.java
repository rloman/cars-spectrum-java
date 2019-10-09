package nl.spectrum.garage.domain;

public class Philips implements Televisie {


    @Override
    public void on() {
        System.out.println("Philips on ... ");
    }

    @Override
    public void off() {

    }

    @Override
    public int switchChannel(int newChannel) {
        return 0;
    }

    @Override
    public int volume(int volume) {
        return 0;
    }
}
