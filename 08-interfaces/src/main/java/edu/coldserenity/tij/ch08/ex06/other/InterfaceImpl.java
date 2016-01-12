package edu.coldserenity.tij.ch08.ex06.other;

/**
 * Some implementation.
 */
public class InterfaceImpl implements Interface {
    /**
     * cannot reduce the scope of the method because
     * sub-class must be able to do NOT LESS than
     * parent class does.
     * thus method remains public.
     */
    @Override
    public void printPublic() {
        System.out.println("InterfaceImpl.printPublic()");
    }
}
