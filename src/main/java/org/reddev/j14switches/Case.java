package org.reddev.j14switches;

/**
 * Case called when testing the switch
 * @param <T> Type of the value to return
 * @param <U> Type of the value to test
 */
public class Case<T, U> {

    /**
     * Key of the case
     */
    private final U key;
    /**
     * Executor called when testing
     */
    private final SwitchExecutor<T> executor;

    /**
     * Constructor of the Case class
     * @param key Key of the case
     * @param executor Executor called when testing
     */
    public Case(U key, SwitchExecutor<T> executor) {
        this.key = key;
        this.executor = executor;
    }

    /**
     * Returns the key of the case
     * @return the key of the case
     */
    public U getKey() {
        return key;
    }

    /**
     * Returns the executor of the case
     * @return The executor of the case
     */
    public SwitchExecutor<T> getExecutor() {
        return executor;
    }
}
