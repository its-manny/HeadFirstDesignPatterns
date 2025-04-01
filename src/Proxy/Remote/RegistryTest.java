package Proxy.Remote;

import java.rmi.Naming;

public class RegistryTest {

    public static void main(String[] args) {
        GumballMachineRemote gumballMachineRemote = null;

        try {
            gumballMachineRemote = new GumballMachine("localhost", 123);
            Naming.rebind("//localhost/gumballmachine", gumballMachineRemote);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
