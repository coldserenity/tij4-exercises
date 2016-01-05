package edu.coldserenity.tij.ch05.ex08;

import java.util.HashSet;

/**
 * Exercise 8: (4)
 * <p/>
 * Following the form of the example Lunch.java, create a class called
 * ConnectionManager that manages a fixed array of Connection objects.
 * <p/>
 * The client programmer must not be able to explicitly create Connection
 * objects, but can only get them via a static method in ConnectionManager.
 * <p/>
 * When the ConnectionManager runs out of objects, it returns a null
 * reference.
 * <p/>
 * Test the classes in main( ).
 */
public class ConnectionManager {
    private HashSet connections = new HashSet();
    private int maxConnections;


    public ConnectionManager(int maxConnections) {
        System.out.println("Created connection manager with max connection capacity = " + maxConnections);
        this.maxConnections = maxConnections;
    }

    public Connection getConnection() {
        if (connections.size() < maxConnections) {
            Connection newConnection = new Connection(this);
            connections.add(newConnection);
            return newConnection;
        } else {
            return null;
        }
    }

    public static void main(String[] args) {
        final int MAX_CAPACITY = 5;
        ConnectionManager cm = new ConnectionManager(MAX_CAPACITY);
        for (int i = 0; i < MAX_CAPACITY; i++) {
            System.out.println("cm.getConnection(): " + cm.getConnection());
        }

        System.out.println("\nFetching connections beyond capacity:");
        System.out.println("cm.getConnection(): " + cm.getConnection());
        System.out.println("cm.getConnection(): " + cm.getConnection());
    }

    /**
     * Method for removing connections from pool when they are closed.
     *
     * Package visibility, since method is only for use by Connection class.
     *
     * @param connection connection to remove
     */
    void closeConnection(Connection connection) {
        connections.remove(connection);
    }
}
