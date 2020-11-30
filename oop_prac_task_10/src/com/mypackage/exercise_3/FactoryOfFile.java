package com.mypackage.exercise_3;

public class FactoryOfFile implements ICreateDocument {
    @Override
    public IDocument CreateNew(DocumentType type, String name) {
        IDocument toReturn = null;
        switch (type) {
            case TextDocument -> toReturn = new TextDocument(name);
            case ImageDocument -> toReturn = new ImageDocument(name);
            default -> toReturn = null;
        }
        return toReturn;
    }

    @Override
    public IDocument CreateOpen(DocumentType type, String name, int Weight) {
        IDocument toReturn = null;
        switch (type) {
            case TextDocument -> toReturn = new TextDocument(name, Weight);
            case ImageDocument -> toReturn = new ImageDocument(name, Weight);
            default -> toReturn = null;
        }
        return toReturn;
    }
}

