package Proxy.Remote;

import java.rmi.RemoteException;

public class GumballMonitor {
    GumballMachineRemote gumballMachine;

    public GumballMonitor(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void report() {
        try {
            System.out.println("Gumball Machine: " + gumballMachine.getLocation());
            System.out.println("Inventory: " + gumballMachine.getCount());
            System.out.println("State: " + gumballMachine.getStateAsString());
        } catch(RemoteException e) {
            e.printStackTrace();
        }
    }
}
