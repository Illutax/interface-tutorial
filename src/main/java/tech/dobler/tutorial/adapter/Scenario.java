package tech.dobler.tutorial.adapter;

public class Scenario {

    public static void main(String[] args) {
        final var meinToaster = new EUToaster();
        final var meineSteckdose = new UKSteckdose();

        final UKAufEUAdapter meinenAdapter = new UKAufEUAdapter(meineSteckdose);
        //IEUSteckdose downCastAdapter = meinenAdapter;
        meinToaster.toast(meinenAdapter);
    }
}
