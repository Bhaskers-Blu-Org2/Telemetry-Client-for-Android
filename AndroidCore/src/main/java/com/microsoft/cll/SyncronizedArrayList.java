package com.microsoft.cll;

import java.util.ArrayList;

/**
 * A Synchronized array list
 */
public class SyncronizedArrayList<T> extends ArrayList<T>
{
    @Override
    public synchronized boolean add(T t) {
        if(this.contains(t)) {
            return false;
        }

        return super.add(t);
    }

    @Override
    public synchronized boolean remove(Object o) {
        return super.remove(o);
    }
}
