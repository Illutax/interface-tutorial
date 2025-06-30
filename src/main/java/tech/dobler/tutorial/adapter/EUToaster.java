package tech.dobler.tutorial.adapter;

public class EUToaster {

    void toast(IEUSteckdose steckdose) {
        steckdose.euStrom();
        System.out.println("Toaste mit Strom. :)");
    }

}
