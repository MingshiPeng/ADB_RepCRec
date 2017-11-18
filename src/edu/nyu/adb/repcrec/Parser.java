package edu.nyu.adb.repcrec;


/**
 * class for parsing transactions from input files.
 */
public class Parser {

    public Parser(final String inFile);

    public void closeFile();
    

    /**
     * Parse one line of input and produce one or more Operation.
     * (might have multiple operation in one line)
     * @return
     */
    public List<Operation> getNextOp();

    public Boolean hasNextOp();


}