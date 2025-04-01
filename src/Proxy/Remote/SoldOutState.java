package Proxy.Remote;

public class SoldOutState implements State {
    GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Can't insert quarter, machine is sold out");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Can't eject quarter, machine is sold out");
    }

    @Override
    public void turnCrank() {
        System.out.println("Can't turn, machine is sold out");
    }

    @Override
    public void dispense() {
        System.out.println("Can't dispense, machine is sold out");
    }
}
