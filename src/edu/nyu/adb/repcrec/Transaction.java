package edu.nyu.adb.repcrec;



public class Transaction {
    private final String name;
    private final int startTime;
    private final Boolean isReadOnly;
    private final Set<Server> accessedServer;
    private final Map<String, String> afterImage;
    private Boolean isAborted;

    public Transaction(final String name, final int startTime, final Boolean isReadOnly) {
        this.name = name;
        this.startTime = startTime;
        this.isReadOnly = isReadOnly;
        this.accessedServer = new HashSet<Server>();
        this.isAborted = false;
    }

    public void commitOrAbort() {

    }

    public void tryBlockedOperation(final Operation op) {

    }

    private Boolean serversNeverFailDuringTransaction() {

    }
}