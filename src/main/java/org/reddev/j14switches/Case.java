package org.reddev.j14switches;

import java.util.function.Predicate;

/**
 * Case called when testing the switch
 *
 * @param <T> Type of the value to return
 * @param <U> Type of the value to test
 */
public class Case<T, U> {

    /**
     * Key of the case
     */
    private final Predicate<U> predicate;
    /**
     * Executor called when testing
     */
    private final SwitchExecutor<T> executor;

    /**
     * Constructor of the Case class
     *
     * @param key      Key of the case
     * @param executor Executor called when testing
     */
    public Case(Predicate<U> predicate, SwitchExecutor<T> executor) {
        this.predicate = predicate;
        this.executor = executor;
    }

    public static <T, U> Case<T, U> key(U key, SwitchExecutor<T> executor) {
        return new Case<>((u) -> u == key, executor);
    }

    /**
     * Returns the key of the case
     *
     * @return the key of the case
     */
    public Predicate<U> getPredicate() {
        return predicate;
    }

    /**
     * Returns the executor of the case
     *
     * @return The executor of the case
     */
    public SwitchExecutor<T> getExecutor() {
        return executor;
    }

    public boolean test(U u) {
        return predicate.test(u);
    }
}
