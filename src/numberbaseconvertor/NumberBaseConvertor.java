/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package numberbaseconvertor;

import java.util.*;

/**
 *
 * @author carl
 */
public class NumberBaseConvertor 
{
    private String inPut;
    private String outPut;
    private ArrayList<Integer> intPartList;
    private ArrayList<Integer> decPartList;

   
    /**
     * Constructor for objects of class BaseConvertor
     */
    public NumberBaseConvertor()
    {
        intPartList = new ArrayList<>();
        decPartList = new ArrayList<>();
        
        outPut = null;
        inPut = null;
    }
    
    public void clearFields()
    {
        inPut = null;
        outPut = null;
        intPartList.clear();
        decPartList.clear();
    }
    
    public void setInput( String value )
    {
        inPut = value;
    }
    
    public String getInput()
    {
        return inPut;
    }
    
    public String getOutPut()
    {
        return outPut;
    }
    
    public void baseToDecimal( int base )
    {
        String intPart;
        String decPart;

        System.out.println("base: " + base);
        
        if ( inPut.contains( "." ) == true ) {
            intPart = inPut.substring( 0, inPut.indexOf( "." ) );
            decPart = inPut.substring( inPut.indexOf( "." ) + 1, inPut.length() );
            outPut = intToDecimal( intPart, base ) + "." + decToDecimal( decPart, base ); 
        }
        else {
            outPut = intToDecimal( inPut, base );       
        }
    }

    public String intToDecimal( String intPart, int base )
    {
        int outPutNum = 0;
        String outPutStr = "";
        int exponent = intPart.length() - 1;
        int digit = 0;
        String hexTemp;

        for ( int i = 0; i < intPart.length(); i++ ) {
            intPartList.add( Character.getNumericValue( intPart.charAt( i ) ) ); 
        }

        for ( int i = 0; i < intPart.length(); i++ ) {
            digit = intPartList.get( i );
            if ( digit == 0 ) {
                outPutNum += 0;
            }
            else {
                digit *= base;
                outPutNum += Math.pow( digit, exponent );
            }
            exponent--;
        }
        outPutStr = Integer.toString( outPutNum );
        return outPutStr;
    }
    
    public String decToDecimal( String decPart, int base )
    {
        double outPutNum = 0.0;
        int digit = 0;
        String outPutStr = "";
        int exponent = 1;
     
        for ( int i = 0; i < decPart.length(); i++ ) {
            decPartList.add( Character.getNumericValue( decPart.charAt( i ) ) ); 
        }
        
        for ( int i = 0; i < decPart.length(); i++ ) {
            digit = decPartList.get( i ) * base;
            if ( digit == 0 ) {            
                outPutNum += 0;
            }
            else {
                outPutNum += Math.pow( ( 1.0 / digit ), exponent );
            }
            exponent++;
        }
        outPutStr = String.valueOf( outPutNum );
        outPutStr = outPutStr.substring( outPutStr.indexOf( "." ) + 1, outPutStr.length() );

        return outPutStr;
    }
    
    public void decimalToBinary()
    {
    }
    
    public void decimalToHex()
    {
    }
    
    public void decimalToOctal()
    {
    }
}