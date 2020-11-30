package com.mypackage.exercise_2;

public class ChairFactory implements AbstractChairFactory {
    @Override
    public Chair getChair(ChairType type) {
        Chair toReturn = null;
        switch (type) {
            case VictorianChair:
                toReturn = new VictorianChair();
                break;
            case MagicChair:
                toReturn = new MagicChair();
                break;
            case FunctionalChair:
                toReturn = new FunctionalChair();
                break;
            default:
                throw new IllegalArgumentException("не производим таких стульев: " + type);
        }
        return toReturn;
    }
}
