package edu.nyu.adb.repcrec;

public class Lock {
    public LockType lockType;
    public String transactionId;
    public Lock(final LockType lockType, final String transactionId) {
        this.lockType = lockType;
        this.transactionId = transactionId;
    }
}