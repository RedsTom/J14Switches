package org.reddev.j14switches;

@FunctionalInterface
public interface SwitchExecutor<T> {

    /**
     * Called when switch is checked
     * @return The result of the case
     */
    T getResult();

}
