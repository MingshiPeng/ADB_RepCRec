package edu.nyu.adb.repcrec;


/**
 * Object representing an operation inside a transaction or utility functions like dump. 
 */
public class Operation {
    public int timestamp;
    public OpType opType;
    public List<String> args;

    public enum OpType {
        BEGIN, BEGINRO, READ, WRITE,
        DUMP, END, FAIL, RECOVER
    }

    /**
     * @param op one line from input file used to parse into Operation object.
     */
    public Operation(final String op) {

    }


}