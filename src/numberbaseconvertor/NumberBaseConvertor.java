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
    private HashMap<String, String> hexMap;
   
    /**
     * Constructor for objects of class BaseConvertor
     */
    public NumberBaseConvertor()
    {
        intPartList = new ArrayList<>();
        decPartList = new ArrayList<>();
        hexMap = new HashMap<>();
        fillHexMap();
        
        outPut = null;
        inPut = null;
    }
 //-----------------------------------------------------------------------------   
    public void fillHexMap()
    {
        hexMap.put("A", "10");
        hexMap.put("B", "11");
        hexMap.put("C", "12");
        hexMap.put("D", "13");
        hexMap.put("E", "14");
        hexMap.put("F", "15");
        hexMap.put("10", "A");
        hexMap.put("11", "B");
        hexMap.put("12", "C");
        hexMap.put("13", "D");
        hexMap.put("14", "E");
        hexMap.put("15", "F");
    }
//-----------------------------------------------------------------------------    
    public void clearFields()
    {
        inPut = null;
        outPut = null;
        intPartList.clear();
        decPartList.clear();
    }
//-----------------------------------------------------------------------------    
    public void setInput( String value )
    {
        inPut = value;
    }
 //-----------------------------------------------------------------------------   
    public String getInput()
    {
        return inPut;
    }
 //-----------------------------------------------------------------------------
    public void setOutPut(String value) 
    {
        outPut = value;
    }
//-----------------------------------------------------------------------------    
    public String getOutPut()
    {
        return outPut;
    }
//-----------------------------------------------------------------------------    
    public void baseToDecimal( int base )
    {
        String intPart;
        String decPart;

        System.out.println("base: " + base);
        System.out.println("intPar: " + inPut);

        if ( inPut.contains( "." ) == true ) {
            intPart = inPut.substring( 0, inPut.indexOf( "." ) );
            decPart = inPut.substring( inPut.indexOf( "." ) + 1, inPut.length() );
            outPut = intToDecimal( intPart, base ) + "." + decToDecimal( decPart, base ); 
        }
        else {
            System.out.println("intod-: " + inPut );
            outPut = intToDecimal( inPut, base );       
        }
        System.out.println("finOutput: " + outPut);
    }
//-----------------------------------------------------------------------------
    public String intToDecimal( String intPart, int base )
    {
        int outPutNum = 0;
        String outPutStr;
        int exponent = intPart.length() - 1;
        int length = intPart.length();  
        String numStr;
        int digit;
        int temp;

        intPartList.clear();
        for ( int i = 0; i < intPart.length(); i++ ) {
            if (Character.isLetter(intPart.charAt(i)) == true) {
                numStr = hexMap.get(Character.toString(intPart.charAt(i)));
                
                intPartList.add(Integer.parseInt(numStr));
            }
            else
                intPartList.add( Character.getNumericValue( intPart.charAt( i ) ) ); 
        }
        
       for ( int i = 0; i < length; i++ ) {
            digit = intPartList.get( i );
            System.out.println("digit: " +digit);
            if ( digit == 0 ) {
                outPutNum += 0;
            }
            else if (exponent == 0){ 
                outPutNum += digit;
                System.out.println("digit-e=0 " + digit );
            }
            else {  
                temp = base;
                System.out.println("exponent " +exponent);
                for (int j = 0; j < exponent-1; j++ ) {
                    temp *= base;
                }
                System.out.println("temp: " +temp); 
                outPutNum += digit * temp;
            }
            exponent--;
            System.out.println("Exponant " +exponent);
        }
        
        System.out.println("outPutNum: " + outPutNum);
        outPutStr = Integer.toString( outPutNum );
        return outPutStr;
    }
//-----------------------------------------------------------------------------    
    public String decToDecimal( String decPart, int base )
    {
        double outPutNum = 0.0;
        double digit;
        String outPutStr;
        int exponent = -1;
        String numStr;
        double temp;

        decPartList.clear();
        System.out.println("dec[art " + decPart);
       for ( int i = 0; i < decPart.length(); i++ ) {
            if (Character.isLetter(decPart.charAt(i)) == true) {
                numStr = hexMap.get(Character.toString(decPart.charAt(i)));
                
                intPartList.add(Integer.parseInt(numStr));
            }
            else
                decPartList.add( Character.getNumericValue( decPart.charAt( i ) ) ); 
        }

        for ( int i = 0; i < decPart.length(); i++ ) {
            digit = decPartList.get( i );
            if (digit == 0)
                outPutNum += 0;
            else {
                temp = Math.pow(base, exponent);
                outPutNum += digit * temp;
                System.out.println("OutputNum " +outPutNum);
            }
            exponent--;
        }         
        outPutStr = String.valueOf( outPutNum );
        outPutStr = outPutStr.substring(outPutStr.indexOf(".") + 1, outPutStr.length() );

        return outPutStr;
    }
//-----------------------------------------------------------------------------
    public void fromDecimal(int base)
    {
        String intPart;
        String decPart;

        System.out.println("base: " + base);
        System.out.println("intPar: " + inPut);

        if ( inPut.contains( "." ) == true ) {
            intPart = inPut.substring( 0, inPut.indexOf( "." ) );
            decPart = inPut.substring( inPut.indexOf( "." ) + 1, inPut.length() );
            outPut = intToBase( intPart, base ) + "." + decToBase( decPart, base ); 
        }
        else {
            System.out.println("intod-: " + inPut );
            outPut = intToBase( inPut, base );       
        }
        System.out.println("finOutput: " + outPut);
    }
//-----------------------------------------------------------------------------
    public String intToBase(String intPart, int base)
    {
        String outPutStr = "";
        double value;
        int temp;
        double number = Double.parseDouble(intPart);
        double decimal;
        String hexVal;
        System.out.println("number from str " + number);
        
        while (number != 0) {
            value = number / base;
            if (value % 1 == 0)
                outPutStr = outPutStr.concat("0");
            else {
                if (base == 2)
                    outPutStr = outPutStr.concat("1");
                else if (base == 8) {
                    temp = (int)value;
                    decimal = value-(int)value;
                    decimal *= base;
                    value = temp;
                    outPutStr = outPutStr.concat((int)decimal + "");
                }
                else {
                    temp = (int)value;
                    decimal = value-(int)value;
                    decimal *= base;
                    value = temp;
                    if ((int)decimal >= 10 && (int)decimal <= 15) {
                        hexVal = hexMap.get(Integer.toString((int)decimal));
                        System.out.println("heVal " +hexVal);
                        outPutStr = outPutStr.concat(hexVal);
                    }
                    else
                        outPutStr = outPutStr.concat((int)decimal + "");
                }
            }
            number = (int)value;
        }
        
        outPutStr = new StringBuilder(outPutStr).reverse().toString();
        
        return outPutStr; 
    }
//-----------------------------------------------------------------------------
    public String decToBase(String decPart, int base)
    {
        String outPutStr = "";
        String hexVal;
        int temp;
        int length;
        int number;

        length = decPart.length();
        length *= 3;
        length += 1;
        
        number = Integer.parseInt(decPart);
        
        if (base == 2) {                        
            for (int i = 0; i < length; i++) {
                number *= base;
                if ( Integer.parseInt(Integer.toString(number).substring(0, 1)) == 1 ) {
                    outPutStr = outPutStr.concat("1");
                    number -= 100;
                }
                else
                    outPutStr = outPutStr.concat("0");
            }   
        }
        else {
            number *= base;
            while (number > 0) {
                length = Integer.toString(number).length();
                if (base == 8) {
                    outPutStr = outPutStr.concat(Integer.parseInt(Integer
                                     .toString(number).substring(0, 1)) + "");
                    number = Integer.parseInt(Integer.toString(number).substring(1, length));
                }
                else {
                    if (Integer.parseInt(Integer.toString(number).substring(0, 2)) <= 17) {
                        temp = Integer.parseInt(Integer.toString(number).substring(0, 2));
                        if (temp >= 10 && temp <= 15) {
                            hexVal = hexMap.get(Integer.toString(temp));
                            outPutStr = outPutStr.concat(hexVal);
                        }  
                        else
                            outPutStr = outPutStr.concat(temp + "");
                        number = Integer.parseInt(Integer.toString(number).substring(2, length));
                    }
                    else {
                        temp = Integer.parseInt(Integer.toString(number).substring(0, 1));
                        if (temp >= 10 && temp <= 15) {
                            hexVal = hexMap.get(Integer.toString(temp));
                            outPutStr = outPutStr.concat(hexVal);
                        }
                        else
                            outPutStr = outPutStr.concat(temp + "");
                        number = Integer.parseInt(Integer.toString(number).substring(1, length));
                    }
                    
                }
                number *= base;
            }
        }         
        return outPutStr;
    }   
}
//-----------------------------------------------------------------------------