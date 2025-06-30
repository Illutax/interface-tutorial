package tech.dobler.tutorial.interfaces;

public class Szenario {
    public static void main(String[] args) {
        Tierhandlung tierhandlung = new Tierhandlung();
        tierhandlung.alleTiere.add(new Katze());
        tierhandlung.alleTiere.add(new Katze());
        tierhandlung.alleTiere.add(new Hund());
        tierhandlung.alleTiere.add(new Hund());
        tierhandlung.alleTiere.add(new Papagei());
        tierhandlung.alleTiere.add(new Papagei());

        for (ITier einTier : tierhandlung.alleTiere) {
            if (einTier instanceof Hund) {
                System.out.println("Es ist ein Hund");
                Hund meinHund = (Hund) einTier;
                meinHund.legeDickenFettenHaufen();
            }

            einTier.sprechen();
        }
    }
}
