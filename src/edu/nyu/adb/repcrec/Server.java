package edu.nyu.adb.repcrec;


/**
 * This class represents a server.
 * Provide read/write functionality.
 * Deals with 2PL.
 */
public class Server {
    // key-value pairs
    private final Map<String, String> kvmap;
    // variable name -> locks the variable holds.
    private final Map<String, List<Lock>> lockTable;
    // variable name -> locks waiting for the variable.
    private final Map<String, Deque<Lock>> waitTable;
    private Boolean isFailed;

    public Server() {
        kvMap = new HashMap<String, String>();
        lockTable = new HashMap<String, List<Lock>>();
        lockTable = new HashMap<String, Deque<Lock>>();
        isFailed = false;
    }

    /**
     * try to set a lock on a variable.
     * Will be unseccessful if other transaction 
     * has already set the lock.
     * @param lock      the lock to be set.
     * @param key       the name of the variable to be locked.
     * @return          a boolean indicating whether lock was successfully set.
     *                  e.g. will fail when there is already a WL.
     */
    public Boolean trySetLock(final Lock lock, final String key) {

    }

    /**
     * Release all locks set by a certain transaction.
     * 
     * @param
     */
    public void releaseLock(final String transactionId) {

    }

    /**
     * disconnect server and wipe out memory about lock.
     */
    public void fail() {
        lockTable = new HashMap<String, List<Lock>>();
        lockTable = new HashMap<String, Deque<Lock>>();
        isFailed = true;
    }

    /**
     * Recover from failure.
     */
    public void recover() {
        isFailed = false;
    }

    public Boolean isFailed() {
        return this.isFailed;
    }
    
}