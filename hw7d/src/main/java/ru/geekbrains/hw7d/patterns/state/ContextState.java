package ru.geekbrains.hw7d.patterns.state;

public interface ContextState {

    void next(Context context);

    void previous(Context context);

    void printStatus();

}
