package core.basesyntax;

import core.basesyntax.Machine;
import core.basesyntax.Bulldozer;


public class Bulldozer extends Machine {
    @Override
    public void doWork() {
        System.out.println("Bulldozer is starting work.");
    }

    @Override
    public void stopWork() {
        System.out.println("Bulldozer has stopped working.");
    }
}
