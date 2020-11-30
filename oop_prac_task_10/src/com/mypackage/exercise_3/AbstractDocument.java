package com.mypackage.exercise_3;

public abstract class AbstractDocument implements IDocument {
    String name;
    int Weight;

    public AbstractDocument(String name) {
        this.name = name;
    }

    public AbstractDocument(String name, int weight) {
        this.name = name;
        Weight = weight;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getWeight() {
        return Weight;
    }

    @Override
    public String getType() {
        return getClass().getSimpleName();
    }
}
