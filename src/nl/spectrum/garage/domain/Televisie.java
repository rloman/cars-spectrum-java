package nl.spectrum.garage.domain;

// "100% abstract class "
public interface Televisie {

   /* public abstract */ void on();
   void off();

   int switchChannel(int newChannel);

   int volume(int volume);

}
