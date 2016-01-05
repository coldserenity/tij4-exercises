package edu.coldserenity.tij.ch05.ex08;

import java.io.Closeable;
import java.io.IOException;
import java.util.UUID;

/**
 * Connection class.
 */
public class Connection implements Closeable {
    private UUID id = UUID.randomUUID();
    private ConnectionManager connectionManager;

    /**
     * Can only be instantiated by friendly classes.
     *
     * @param connectionManager connection manager that this connection belongs to
     */
    Connection(ConnectionManager connectionManager) {
        this.connectionManager = connectionManager;
    }

    @Override
    public String toString() {
        return String.format("Connection{id=%s}", id);
    }

    /**
     * Adding an option to close connection when no longer in use.
     *
     * @throws IOException if happens
     */
    @Override
    public void close() throws IOException {
        connectionManager.closeConnection(this);
        connectionManager = null;
    }
}
