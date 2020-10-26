package org.reddev.j14switches;

import java.util.Optional;

public class Switch {

    @SafeVarargs
    public static <T, U> Optional<T> newSwitch(U baseValue, Case<T, U>... cases) {
        for (Case<T, U> aCase : cases) {
            if (baseValue == aCase.getKey()) return Optional.of(aCase.getExecutor().getResult());
        }
        return Optional.empty();
    }

}
