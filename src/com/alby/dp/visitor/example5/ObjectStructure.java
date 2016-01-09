package com.alby.dp.visitor.example5;

public class ObjectStructure {

    private Component root = null;

    public void handleRequest(Visitor visitor){
        if (root!=null){
            root.accept(visitor);
        }
    }

    public void setRoot(Component root) {
        this.root = root;
    }
}
