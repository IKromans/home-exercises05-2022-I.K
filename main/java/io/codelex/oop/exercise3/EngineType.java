package io.codelex.oop.exercise3;

import java.util.function.Predicate;

public enum EngineType implements Predicate<String> {
    V12,
    V8,
    V6,
    S6,
    S4,
    AIR_COOLED,
    HYBRID,
    S3;

    @Override
    public boolean test(String s) {
        return false;
    }
}
