package org.launchcode.java.demos.exercises.technology;

import java.util.Objects;

/**
 * Created by Chris Bay
 */
public abstract class AbstractEntity {

    private final int id;
    private static int nextId = 1;

    public AbstractEntity () {
        this.id = nextId;
        nextId++;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AbstractEntity that = (AbstractEntity) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public int getId() {
        return id;
    }
}
