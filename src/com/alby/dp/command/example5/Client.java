package com.alby.dp.command.example5;

public class Client {
    public static void main(String[] args) {
        Waiter waiter = new Waiter();

        Command chop = new ChopCommand();
        Command dock = new DockCommand();
        Command pork = new PorkCommand();

        waiter.orderDish(chop);
        waiter.orderDish(dock);
        waiter.orderDish(pork);

        waiter.orderOver();
    }
}
