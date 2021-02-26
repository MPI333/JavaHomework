package ru.geekbrains.hw7d.patterns.state;

public class StateOne implements ContextState {

    @Override
    public void next(Context context) {
        context.setState(new StateTwo());
    }

    @Override
    public void previous(Context context) {
        System.out.println("It's the first state!");
    }

    @Override
    public void printStatus() {
        System.out.println("The first state completed!!!");
    }

}
