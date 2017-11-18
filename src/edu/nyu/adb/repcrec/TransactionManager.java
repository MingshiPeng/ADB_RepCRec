package edu.nyu.adb.repcrec;



public class TransactionManager {
    private final Parser parser;
    // serverName -> server instance
    private Map<String, Server> servers;
    // transactionName -> transaction instance
    private Map<String, Transaction> transactions;
    // transaction instance -> operation
    private Map<Transaction, Operation> waitingTransaction;

    public TransactionManager(final String inFile) {
        parser = new Parser(inFile);
        servers = new HashMap<String, Server>();
    }

    /**
     * Populate servers' initial state.
     */
    public void initServers() {

    }

    public void execute() {
        while (parser.hasNextOp()) {
            tryBlockedTransactions();
            detectDeadlock();
            final List<Operation> ops = parser.getNextOp();
            for (final Operation op : ops) {
                switch (op.opType) {
                    case Operation.BEGIN:

                    case Operation.BEGINRO:

                    case Operation.READ:
                    case Operation.WRITE:
                    case Operation.DUMP:
                    case Operation.END:
                    case Operation.FAIL:
                    case Operation.RECOVER:



                }
            }
        }
    }

    private void tryBlockedTransactions() {

    }

    private void detectDeadlock() {

    }

    private void dump(final List<String> args) {

    }


    

}