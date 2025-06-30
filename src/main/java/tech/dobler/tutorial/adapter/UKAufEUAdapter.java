package tech.dobler.tutorial.adapter;

public class UKAufEUAdapter implements IEUSteckdose {

    private final UKSteckdose verfügbareSteckdose;

    public UKAufEUAdapter(UKSteckdose steckdose) {
        this.verfügbareSteckdose = steckdose;
    }

    @Override
    public void euStrom() {
        verfügbareSteckdose.ukStrom();
        System.out.println("Verändere den Strom.");
    }

}
