package com.alby.dp.iterator.example1;

public class Client {
    public static void main(String[] args) {
        String[] ss = {"aaa","bbb0","ccc"};

        Aggregate aggregate = new ConcreteAggregate(ss);

        Iterator iterator = aggregate.createIterator();

        iterator.first();
        while (!iterator.isDone()){
            Object o = iterator.currentItem();

            System.out.println(o);

            iterator.next();
        }
    }
}
