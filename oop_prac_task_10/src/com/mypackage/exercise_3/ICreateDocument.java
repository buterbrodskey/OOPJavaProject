package com.mypackage.exercise_3;

public interface ICreateDocument {
    IDocument CreateNew(DocumentType type, String name);

    IDocument CreateOpen(DocumentType type, String name, int Weight);
}
