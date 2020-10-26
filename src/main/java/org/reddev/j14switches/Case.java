package org.reddev.j14switches;

public class Case<T, U> {

    private final U key;
    private final SwitchExecutor<T> executor;

    public Case(U key, SwitchExecutor<T> executor) {
        this.key = key;
        this.executor = executor;
    }

    public U getKey() {
        return key;
    }

    public SwitchExecutor<T> getExecutor() {
        return executor;
    }
}
