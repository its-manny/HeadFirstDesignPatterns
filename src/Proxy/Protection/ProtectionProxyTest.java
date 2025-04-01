package Proxy.Protection;

import java.lang.reflect.Proxy;

/**
 * Implements the PROXY Pattern (specifically PROTECTION PROXY).
 * Provides a surrogate or placeholder for another object and controls access to it.
 */
public class ProtectionProxyTest {

    public static void main(String[] args) {
        // create some people
        Person steve = new PersonImpl();
        steve.setName("Steve");
        steve.setGender("M");
        steve.setInterests("Cycling");

        Person bob = new PersonImpl();
        bob.setName("Bob");
        bob.setGender("M");
        bob.setInterests("Fishing");

        // create proxies
        Person ownerProxy = getOwnerProxy(bob);
        Person nonOwnerProxy = getNonOwnerProxy(steve);

        // should fail
        try {
            ownerProxy.setGeekRating(10);
        } catch(Exception e) {
            System.out.println("Owner can't set geek rating");
        }

        // should work
        nonOwnerProxy.setGeekRating(10);
    }

    private static Person getOwnerProxy(Person person) {
        return (Person) Proxy.newProxyInstance(
                person.getClass().getClassLoader(),
                person.getClass().getInterfaces(),
                new OwnerInvocationHandler(person));
    }

    private static Person getNonOwnerProxy(Person person) {
        return (Person) Proxy.newProxyInstance(
                person.getClass().getClassLoader(),
                person.getClass().getInterfaces(),
                new NonOwnerInvocationHandler(person));
    }
}
