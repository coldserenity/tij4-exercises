package edu.coldserenity.tij.ch05.ex08;

import org.junit.Test;

import java.io.IOException;
import java.util.HashSet;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

/**
 * Testing {@link ConnectionManager}.
 */
public class ConnectionManagerTest {

    @Test
    public void testConnectionsOverflow() {
        ConnectionManager cm = new ConnectionManager(5);
        for (int i = 0; i < 5; i++) {
            assertNotNull(cm.getConnection());
        }

        assertNull(cm.getConnection());
    }

    @Test
    public void testReleasingConnections() throws IOException {
        ConnectionManager cm = new ConnectionManager(5);
        HashSet connectionsToRelease = new HashSet();
        for (int i = 0; i < 5; i++) {
            Connection connection = cm.getConnection();
            connectionsToRelease.add(connection);
            assertNotNull(connection);
        }

        assertNull(cm.getConnection());

        for(Object connection: connectionsToRelease) {
            ((Connection)connection).close();
        }

        for (int i = 0; i < 5; i++) {
            assertNotNull(cm.getConnection());
        }

        assertNull(cm.getConnection());
    }
}
