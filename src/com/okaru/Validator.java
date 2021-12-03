package com.okaru;

@FunctionalInterface
public interface Validator<T> {
    public boolean isValid(T obj);
}