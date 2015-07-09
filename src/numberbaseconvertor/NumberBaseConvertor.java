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
    private ArrayList<String> hexOctList;
    private HashMap<String, String> hexMap;
   
    /**
     * Constructor for objects of class BaseConvertor
     */
    public NumberBaseConvertor()
    {
        intPartList = new ArrayList<>();
        decPartList = new ArrayList<>();
        hexOctList = new ArrayList<>();
        hexMap = new HashMap<>();
        fillHexMap();
        
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
    
    public void fillHexMap()
    {
        hexMap.put("A", "10");
        hexMap.put("B", "11");
        hexMap.put("C", "12");
        hexMap.put("D", "13");
        hexMap.put("E", "14");
        hexMap.put("F", "15");
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
           
        if (base == 16) {
            for ( int i = 0; i < intPart.length(); i++ ) {
                hexOctList.add("" + intPart.charAt( i )); 
            }
            for ( int i = 0; i < intPart.length(); i++ ) {
                hexTemp = hexOctList.get(i);
                if (hexOctList.get(i).equals("A") ||
                    hexOctList.get(i).equals("B") ||
                    hexOctList.get(i).equals("C") ||
                    hexOctList.get(i).equals("D") ||
                    hexOctList.get(i).equals("E") ||
                    hexOctList.get(i).equals("F") ) {
                    hexOctList.add(i, hexMap.get(hexTemp));
                }
                intPart = intPart.concat(hexOctList.get(i));
            }   
            System.out.print("InrPar - " + intPart);
            
        }

        for ( int i = 0; i < intPart.length(); i++ ) {
            intPartList.add( Character.getNumericValue( intPart.charAt( i ) ) ); 
        }
        
    /*    
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
        */
        outPutStr = intPart;
        return outPutStr;
    }
    
    public String decToDecimal( String decPart, int base )
    {
        double outPutNum = 0.0;
        int digit = 0;
        String outPutStr = "";
        int exponent = 1;
       /* 
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
        */
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