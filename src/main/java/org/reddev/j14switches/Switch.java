package org.reddev.j14switches;

import java.util.Optional;

/**
 * Switch class : contains only static methods
 */
public class Switch {

    /**
     * Checks with a minimal syntax and like Java 14
     *
     * @param baseValue Value to test
     * @param cases     Cases to test
     * @param <T>       Type of the value to return
     * @param <U>       Type of the value to test
     * @return
     */
    @SafeVarargs
    public static <T, U> Optional<T> apply(U baseValue, Case<T, U>... cases) {
        for (Case<T, U> aCase : cases) {
            if (aCase.test(baseValue)) return Optional.of(aCase.getExecutor().getResult());
        }
        return Optional.empty();
    }

}