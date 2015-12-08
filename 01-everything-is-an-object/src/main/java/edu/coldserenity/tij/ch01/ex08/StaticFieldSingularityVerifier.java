package edu.coldserenity.tij.ch01.ex08;

/**
 * Assuming that I'm not aware of loops.
 * <p/>
 * Using only what's been taught thus far.
 * I also did not write test for this class.
 */
public class StaticFieldSingularityVerifier {
    public static Integer marker = 0;

    public static void main(String[] args) {
        StaticFieldSingularityVerifier obj1 = new StaticFieldSingularityVerifier();
        StaticFieldSingularityVerifier obj2 = new StaticFieldSingularityVerifier();
        StaticFieldSingularityVerifier obj3 = new StaticFieldSingularityVerifier();
        StaticFieldSingularityVerifier obj4 = new StaticFieldSingularityVerifier();
        StaticFieldSingularityVerifier obj5 = new StaticFieldSingularityVerifier();

        System.out.println("Created 5 objects:");
        printObjectsTable(obj1, obj2, obj3, obj4, obj5);

        System.out.print(String.format("Marker field after increment [%d]", ++marker));

        System.out.println("Objects after the increment:");
        printObjectsTable(obj1, obj2, obj3, obj4, obj5);

    }

    /**
     * Nicely formats objects references and marker value as a table.
     */
    private static void printObjectsTable(StaticFieldSingularityVerifier obj1, StaticFieldSingularityVerifier obj2, StaticFieldSingularityVerifier obj3, StaticFieldSingularityVerifier obj4, StaticFieldSingularityVerifier obj5) {
        System.out.println(String.format(
                "| REF ID\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t | MARKER |\n" +
                        "|" + new String(new char[72]).replace("\0", "-") + "|--------|\n" +
                        "| %s |\t\t%s |\n" +
                        "| %s |\t\t%s |\n" +
                        "| %s |\t\t%s |\n" +
                        "| %s |\t\t%s |\n" +
                        "| %s |\t\t%s |\n" +
                        "",
                obj1, obj1.marker,
                obj2, obj2.marker,
                obj3, obj3.marker,
                obj4, obj4.marker,
                obj5, obj1.marker));
    }
}
