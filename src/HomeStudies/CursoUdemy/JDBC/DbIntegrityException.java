package CursoUdemy.JDBC;

public class DbIntegrityException extends RuntimeException {

    private static final long  SerialUniversalUID= 1L;

    public DbIntegrityException(String msg) {
        super(msg);
    }
}
