/*
 The Mind Agent encapsulates a static array of thirteen Stings called the 
 atomTABLE that contains all the data read from the Atom Table File.
 This makes the Atom Table File data randomly accessible.  
 The Mind Agent also encapsulates four cognitive processes that will operate on 
 the data contained in the atomTable.
*/
package AGI_Object_Model;

import java.io.*;

/**
 *
 * @author Daniel Martin
 */

public class Mind_Agent {
    
    private static String[] atomTABLE;
    
    private static final int L0_OFFSET = 0;
    private static final int L1_OFFSET = 9;
    private static final int    GINDEX = 12;
    
    
    public Mind_Agent(){
        
        atomTABLE = new String[13];
        Read_atomTableFile();
        Display_atomTable();
        
    }
    
    /*
     Move() - Will do backward processing [from Win Node down to Square Nodes]
     to find the path having greatest pValues to a terminal square number 
     derived from the Square Node atomID.
    */
    public int Move(){
        int sqrNum = 0;
        
        return sqrNum;
    }
    
    /*
     Mark() - will do forward processing [from Square Nodes up to Win Node] 
     to adjust act_truthValues according to the availability of a Square Node 
     and propagate pValues up the atom space hierarchy.  Thereby, each Square
     Type Node will have a pValue equal to the sum of the pValues for the
     Square Nodes connected to it.  Likewise, the Win Node will have a pValue
     equal to the pValues of the Square Type Nodes connected to it.
    */
    public void Mark(int sqrNum){
        
    }
    
    /*
     Win() - will do forward processing to increment the attenValues for those
     nodes participating in a win for 'X' and initialize act_truthValues with
     corresponding init_truthValues, and set Square Node atomData to the empty
     character, '_'.
    */
    public void Win(){
        
    }
    
    /*
     Loose() - will do forward processing to increment the attenValues for
     those nodes participating in a tie or a win for 'O' and initialize
     act_truthValues with corresponding init_truthValues, and set Square Node
     atomData to the empty character, '_'.
    */
    public void Loose(){
        
    }
    
    /*
     Extra interface method to wirte db and exit application.
    */
    public void Exit(){
        Write_atomTableFile();
    }
    
    /*
     CLASS UTILITIES:
    */
    
    private void Read_atomTableFile(){
        
        BufferedReader in = null;
        String line = null;
        
        try{
            File f = new File("C:\\__miniET\\AtomTableFile.txt");
            in = new BufferedReader( new FileReader(f) );
            for(int i = 0; i < 13; i++){
                line = in.readLine();
                atomTABLE[i] = line;
            }
            in.close();
        }catch( Exception e  ){
            System.out.println(e.getMessage());
            System.exit( 0 );
        }
    } 
    
    private void Write_atomTableFile(){
        
        PrintWriter out = null;
        String line = null;
        
        try{
            File f = new File("C:\\__miniET\\AtomTableFile.txt");
            out = new PrintWriter( 
                  new BufferedWriter( new FileWriter(f)), true );
            for(int i = 0; i < 13; i++){
                line = atomTABLE[i];
                out.println(line);
            }
            out.flush();
            out.close();
        }catch( Exception e ){
            System.out.println(e.getMessage());
            System.exit( 0 );
        }
    }
    
    private void Display_atomTable(){
        for(int i = 0; i < 13; i++){
            System.out.println( atomTABLE[i] );
        }
    }
    
    private int Get_atomID(){
        int atomID = -1;
        
        return atomID;
    }
    
    private int Get_truthValue(){
        int truthValue = -1;
        
        return truthValue;
    }
    
    private String Set_truthValue( int i, int value ){
        return null;
    }
    
    private int Get_attnValue(){
        int attnValue = -1;
        
        return attnValue;
    }
    
    private String Set_attnValue( int i, int value ){
        return null;
    }
    
    private char Get_atomData(){
        char atomData = ' ';
        
        return atomData;
    }
    
    private String Set_atomData( int i, char value ){
        return null;
    }
    
    private int Get_pIndex(){
        int pIndex = -1;
        
        return pIndex;
    }
    
    private int Get_qIndex(){
        int qIndex = -1;
        
        return qIndex;
    }
    
    private int Get_initTruthValue(){
        int initTruthValue = -1;
        
        return initTruthValue;
    }
    
    /* Convert a Numeric Balue into a Field. */
    private String getField( int aValue ){
        String aField = "";
        
        return aField;
    }
    
    /* Convert a Field into a Numeric Value. */
    private int getValue(  ){
        int aValue = -1;
        
        return aValue;
    }
    
}
