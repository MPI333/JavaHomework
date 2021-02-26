package ru.geekbrains.hw7d.patterns.state;

public class StateTwo implements ContextState {

    @Override
    public void next(Context context) {
        context.setState(new StateThree());
    }

    @Override
    public void previous(Context context) {
        context.setState(new StateOne());
    }

    @Override
    public void printStatus() {
        System.out.println("The second state completed!!!");
    }

}
