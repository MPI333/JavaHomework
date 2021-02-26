package ru.geekbrains.hw7d.patterns.state;

public class Context {

    private ContextState state = new StateOne();

    public ContextState getState() {
        return state;
    }

    public void setState(ContextState state) {
        this.state = state;
    }

    public void nextState() {
        state.next(this);
    }

    public void previousState() {
        state.previous(this);
    }

    public void printStatus() {
        state.printStatus();
    }

}
