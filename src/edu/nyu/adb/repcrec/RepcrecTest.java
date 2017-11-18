package edu.nyu.adb.repcrec;


public class RepcrecTest {
    
    @Test
    public void testWhole() {
        final TransactionManager tm = new TransactionManager("/path/to/input/file");
        tm.initServers();
        tm.execute();
        return;
    }
}