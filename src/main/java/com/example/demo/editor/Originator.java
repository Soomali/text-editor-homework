package com.example.demo.editor;

public interface Originator<T> {

    T save();
    void restore(T state);
}
