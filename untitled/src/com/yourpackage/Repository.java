package com.yourpackage;

import java.util.ArrayList;
import java.util.List;

public class Repository<T> {
    private List<T> items;

    public Repository() {
        this.items = new ArrayList<>();
    }

    public void add(T item) {
        items.add(item);
    }

    public boolean remove(T item) {
        return items.remove(item);
    }

    public void update(int index, T newItem) {
        if (index >= 0 && index < items.size()) {
            items.set(index, newItem);
        } else {
            throw new IndexOutOfBoundsException("Индекс за пределами списка");
        }
    }

    public List<T> getItems() {
        return new ArrayList<>(items);  // Возвращаем копию списка
    }
}
