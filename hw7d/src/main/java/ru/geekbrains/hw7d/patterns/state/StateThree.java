package ru.geekbrains.hw7d.patterns.state;

public class StateThree implements ContextState {

    @Override
    public void next(Context context) {
        System.out.println("It's the last state!");
    }

    @Override
    public void previous(Context context) {
        context.setState(new StateTwo());
    }

    @Override
    public void printStatus() {
        System.out.println("The third state completed!!!");
    }

}
