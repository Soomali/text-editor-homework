package com.example.demo.editor;

public interface Memento<T> {

    public T getState();
    public void setState(T state);
}
