package util;

import exception.ValidationException;

@FunctionalInterface
public interface validation<T> {
    void validate(T value) throws ValidationException;
}
