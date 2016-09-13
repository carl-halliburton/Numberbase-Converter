/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package numberbaseconvertor;

import java.awt.*;

/**
 *
 * @author carl
 */
public class Convertor extends javax.swing.JFrame {
    private NumberBaseConvertor convertor;
    /**
     * Creates new form Convertor
     */
    public Convertor() {
        convertor = new NumberBaseConvertor();
        initComponents();
        disabledButtons();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        inPutField.setEditable(false);
        
        btnBspace.setFont(new Font("Arial Unicode MS", Font.PLAIN , 11));
        btnBspace.setText("\u232B");
    }

    public void disabledButtons()
    {
        btnZero.setEnabled(false);
        btnOne.setEnabled(false);
        btnTwo.setEnabled(false);
        btnTwo.setEnabled(false);
        btnThree.setEnabled(false);
        btnFour.setEnabled(false);
        btnFive.setEnabled(false);
        btnSix.setEnabled(false);
        btnSeven.setEnabled(false);
        btnEight.setEnabled(false);
        btnNine.setEnabled(false);
        btnA.setEnabled(false);
        btnB.setEnabled(false);
        btnC.setEnabled(false);
        btnD.setEnabled(false);
        btnE.setEnabled(false);
        btnF.setEnabled(false);
        btnDecimal.setEnabled(false);
    }
    
    public void enableButtons()
    {
        btnZero.setEnabled(true);
        btnOne.setEnabled(true);
        btnTwo.setEnabled(true);
        btnTwo.setEnabled(true);
        btnThree.setEnabled(true);
        btnFour.setEnabled(true);
        btnFive.setEnabled(true);
        btnSix.setEnabled(true);
        btnSeven.setEnabled(true);
        btnEight.setEnabled(true);
        btnNine.setEnabled(true);
        btnA.setEnabled(true);
        btnB.setEnabled(true);
        btnC.setEnabled(true);
        btnD.setEnabled(true);
        btnE.setEnabled(true);
        btnF.setEnabled(true);
        btnDecimal.setEnabled(true);
    }
    
    public void printData()
    {
        String inPut = convertor.getInput();
        String outPut = convertor.getOutPut();
        displayArea.append( inPut + "--" + outPut + "\n");
        convertor.clearFields();
    }
    
    public void convertButton()
    {
        String temp;
        
        convertor.setInput( inPutField.getText() );
        inPutField.setText("");
        if ( cbxInput.getSelectedItem().equals("Binary") &&
           ( cbxOutput.getSelectedItem().equals("Decimal"))    ) 
            convertor.baseToDecimal(2);
        else if ( cbxInput.getSelectedItem().equals("Octal") &&
           ( cbxOutput.getSelectedItem().equals("Decimal")) )   
            convertor.baseToDecimal(8);
        else if ( cbxInput.getSelectedItem().equals( "Hexadecimal" ) &&
           ( cbxOutput.getSelectedItem().equals("Decimal")) )
             convertor.baseToDecimal(16);
        else if ( cbxInput.getSelectedItem().equals( "Decimal" ) &&
           ( cbxOutput.getSelectedItem().equals("Binary")) )
            convertor.fromDecimal(2);
        else if ( cbxInput.getSelectedItem().equals( "Decimal" ) &&
           ( cbxOutput.getSelectedItem().equals("Octal")) )
            convertor.fromDecimal(8);
        else if ( cbxInput.getSelectedItem().equals( "Decimal" ) &&
           ( cbxOutput.getSelectedItem().equals("Hexadecimal")) )
            convertor.fromDecimal(16);
        else if ( cbxInput.getSelectedItem().equals( "Binary" ) &&
           ( cbxOutput.getSelectedItem().equals("Octal")) ) {
            convertor.baseToDecimal(2);
            temp = convertor.getInput();
            convertor.setInput(convertor.getOutPut());
            convertor.fromDecimal(8);
            convertor.setInput(temp);
        }
        else if ( cbxInput.getSelectedItem().equals( "Binary" ) &&
           ( cbxOutput.getSelectedItem().equals("Hexadecimal")) ) {
            convertor.baseToDecimal(2);
            temp = convertor.getInput();
            convertor.setInput(convertor.getOutPut());
            convertor.fromDecimal(16);
            convertor.setInput(temp);
        }
        else if ( cbxInput.getSelectedItem().equals( "Octal" ) &&
           ( cbxOutput.getSelectedItem().equals("Binary")) ) {
            convertor.baseToDecimal(8);
            temp = convertor.getInput();
            convertor.setInput(convertor.getOutPut());
            convertor.fromDecimal(2);
            convertor.setInput(temp);
        }
         else if ( cbxInput.getSelectedItem().equals( "Hexadecimal" ) &&
           ( cbxOutput.getSelectedItem().equals("Binary")) ) {
            convertor.baseToDecimal(16);
            temp = convertor.getInput();
            convertor.setInput(convertor.getOutPut());
            convertor.fromDecimal(2);
            convertor.setInput(temp);
        }
         else if ( cbxInput.getSelectedItem().equals( "Octal" ) &&
           ( cbxOutput.getSelectedItem().equals("Hexadecimal")) ) {
            convertor.baseToDecimal(8);
            temp = convertor.getInput();
            convertor.setInput(convertor.getOutPut());
            convertor.fromDecimal(16);
            convertor.setInput(temp);
        }
         else if ( cbxInput.getSelectedItem().equals( "Hexadecimal" ) &&
           ( cbxOutput.getSelectedItem().equals("Octal")) ) {
            convertor.baseToDecimal(16);
            temp = convertor.getInput();
            convertor.setInput(convertor.getOutPut());
            convertor.fromDecimal(8);
            convertor.setInput(temp);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        displayArea = new javax.swing.JTextArea();
        cbxInput = new javax.swing.JComboBox();
        cbxOutput = new javax.swing.JComboBox();
        inputLabel = new javax.swing.JLabel();
        outPutLabel = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        inPutField = new javax.swing.JTextField();
        convertButton = new javax.swing.JButton();
        refreshButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnC = new javax.swing.JButton();
        btnD = new javax.swing.JButton();
        btnE = new javax.swing.JButton();
        btnF = new javax.swing.JButton();
        btnZero = new javax.swing.JButton();
        btnThree = new javax.swing.JButton();
        btnSix = new javax.swing.JButton();
        btnNine = new javax.swing.JButton();
        btnOne = new javax.swing.JButton();
        btnSeven = new javax.swing.JButton();
        btnFour = new javax.swing.JButton();
        btnFive = new javax.swing.JButton();
        btnTwo = new javax.swing.JButton();
        btnEight = new javax.swing.JButton();
        btnB = new javax.swing.JButton();
        btnA = new javax.swing.JButton();
        btnDecimal = new javax.swing.JButton();
        inputClear = new javax.swing.JButton();
        btnBspace = new javax.swing.JButton();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        displayArea.setEditable(false);
        displayArea.setColumns(20);
        displayArea.setRows(5);
        jScrollPane1.setViewportView(displayArea);

        cbxInput.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Decimal", "Binary", "Hexadecimal", "Octal" }));
        cbxInput.setSelectedIndex(-1);
        cbxInput.setToolTipText("");
        cbxInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxInputActionPerformed(evt);
            }
        });

        cbxOutput.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Decimal", "Binary", "Hexadecimal", "Octal" }));
        cbxOutput.setSelectedIndex(-1);

        inputLabel.setText("Input");

        outPutLabel.setText("Output");

        inPutField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inPutFieldActionPerformed(evt);
            }
        });

        convertButton.setText("Convert");
        convertButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                convertButtonActionPerformed(evt);
            }
        });

        refreshButton.setText("Refresh");
        refreshButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshButtonActionPerformed(evt);
            }
        });

        btnC.setText("C");
        btnC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCActionPerformed(evt);
            }
        });

        btnD.setText("D");
        btnD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDActionPerformed(evt);
            }
        });

        btnE.setText("E");
        btnE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEActionPerformed(evt);
            }
        });

        btnF.setText("F");
        btnF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFActionPerformed(evt);
            }
        });

        btnZero.setText("0");
        btnZero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnZeroActionPerformed(evt);
            }
        });

        btnThree.setText("3");
        btnThree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThreeActionPerformed(evt);
            }
        });

        btnSix.setText("6");
        btnSix.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSixActionPerformed(evt);
            }
        });

        btnNine.setText("9");
        btnNine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNineActionPerformed(evt);
            }
        });

        btnOne.setText("1");
        btnOne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOneActionPerformed(evt);
            }
        });

        btnSeven.setText("7");
        btnSeven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSevenActionPerformed(evt);
            }
        });

        btnFour.setText("4");
        btnFour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFourActionPerformed(evt);
            }
        });

        btnFive.setText("5");
        btnFive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiveActionPerformed(evt);
            }
        });

        btnTwo.setText("2");
        btnTwo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTwoActionPerformed(evt);
            }
        });

        btnEight.setText("8");
        btnEight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEightActionPerformed(evt);
            }
        });

        btnB.setText("B");
        btnB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBActionPerformed(evt);
            }
        });

        btnA.setText("A");
        btnA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAActionPerformed(evt);
            }
        });

        btnDecimal.setText(".");
        btnDecimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDecimalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnTwo)
                    .addComponent(btnFive)
                    .addComponent(btnEight)
                    .addComponent(btnDecimal))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btnSix)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSeven)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnF))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(btnThree)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnFour))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(btnZero)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnOne)))
                                .addGap(6, 6, 6)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(btnC)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnD))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(btnA)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnB)))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnNine)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnOne)
                    .addComponent(btnA)
                    .addComponent(btnB)
                    .addComponent(btnZero)
                    .addComponent(btnDecimal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThree)
                    .addComponent(btnTwo)
                    .addComponent(btnFour)
                    .addComponent(btnC)
                    .addComponent(btnD))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSix)
                    .addComponent(btnSeven)
                    .addComponent(btnE)
                    .addComponent(btnF)
                    .addComponent(btnFive))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNine)
                    .addComponent(btnEight))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        inputClear.setText("Clear");
        inputClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputClearActionPerformed(evt);
            }
        });

        btnBspace.setText("B/S");
        btnBspace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBspaceActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(convertButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(inputClear)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBspace))
                    .addComponent(refreshButton)
                    .addComponent(inPutField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbxInput, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(inputLabel)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbxOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(outPutLabel))))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(refreshButton)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputLabel)
                    .addComponent(outPutLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxOutput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inPutField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(convertButton)
                    .addComponent(inputClear)
                    .addComponent(btnBspace))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void convertButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_convertButtonActionPerformed
        convertButton();
        printData();
        convertor.clearFields();
    }//GEN-LAST:event_convertButtonActionPerformed

    private void refreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshButtonActionPerformed
        displayArea.setText("");
        cbxInput.setSelectedIndex(0);
        cbxOutput.setSelectedIndex(0);
        convertor.clearFields();
        disabledButtons();
    }//GEN-LAST:event_refreshButtonActionPerformed

    private void inPutFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inPutFieldActionPerformed
        //this.getRootPane().setDefaultButton( convertButton ); 
        //convertButton();
    }//GEN-LAST:event_inPutFieldActionPerformed

    private void cbxInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxInputActionPerformed
        enableButtons();
        if ( cbxInput.getSelectedItem().equals( "Decimal" ) ) {
            btnA.setEnabled(false);
            btnB.setEnabled(false);
            btnC.setEnabled(false);
            btnD.setEnabled(false);
            btnE.setEnabled(false);
            btnF.setEnabled(false);
        }
        else if ( cbxInput.getSelectedItem().equals( "Binary" ) ) {
            btnTwo.setEnabled(false);
            btnThree.setEnabled(false);
            btnFour.setEnabled(false);
            btnFive.setEnabled(false);
            btnSix.setEnabled(false);
            btnSeven.setEnabled(false);
            btnEight.setEnabled(false);
            btnNine.setEnabled(false);
            btnA.setEnabled(false);
            btnB.setEnabled(false);
            btnC.setEnabled(false);
            btnD.setEnabled(false);
            btnE.setEnabled(false);
            btnF.setEnabled(false);
        }
        else if ( cbxInput.getSelectedItem().equals( "Octal" ) ) {
            btnEight.setEnabled(false);
            btnNine.setEnabled(false);
            btnA.setEnabled(false);
            btnB.setEnabled(false);
            btnC.setEnabled(false);
            btnD.setEnabled(false);
            btnE.setEnabled(false);
            btnF.setEnabled(false);
        }
    }//GEN-LAST:event_cbxInputActionPerformed

    private void btnCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCActionPerformed
        String temp = "C";
        inPutField.setText( inPutField.getText() + temp );
    }//GEN-LAST:event_btnCActionPerformed

    private void btnZeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnZeroActionPerformed
        String temp = "0";
        inPutField.setText( inPutField.getText() + temp );
    }//GEN-LAST:event_btnZeroActionPerformed

    private void btnOneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOneActionPerformed
        String temp = "1";
        inPutField.setText( inPutField.getText() + temp );
    }//GEN-LAST:event_btnOneActionPerformed

    private void btnTwoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTwoActionPerformed
        String temp = "2";
        inPutField.setText( inPutField.getText() + temp );
    }//GEN-LAST:event_btnTwoActionPerformed

    private void btnThreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThreeActionPerformed
        String temp = "3";
        inPutField.setText( inPutField.getText() + temp );
    }//GEN-LAST:event_btnThreeActionPerformed

    private void btnFourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFourActionPerformed
        String temp = "4";
        inPutField.setText( inPutField.getText() + temp );
    }//GEN-LAST:event_btnFourActionPerformed

    private void btnFiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiveActionPerformed
        String temp = "5";
        inPutField.setText( inPutField.getText() + temp );
    }//GEN-LAST:event_btnFiveActionPerformed

    private void btnDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDActionPerformed
        String temp = "D";
        inPutField.setText( inPutField.getText() + temp );
    }//GEN-LAST:event_btnDActionPerformed

    private void btnSixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSixActionPerformed
        String temp = "6";
        inPutField.setText( inPutField.getText() + temp );
    }//GEN-LAST:event_btnSixActionPerformed

    private void btnSevenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSevenActionPerformed
        String temp = "7";
        inPutField.setText( inPutField.getText() + temp );
    }//GEN-LAST:event_btnSevenActionPerformed

    private void btnEightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEightActionPerformed
        String temp = "8";
        inPutField.setText( inPutField.getText() + temp );
    }//GEN-LAST:event_btnEightActionPerformed

    private void btnEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEActionPerformed
        String temp = "E";
        inPutField.setText( inPutField.getText() + temp );
    }//GEN-LAST:event_btnEActionPerformed

    private void btnNineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNineActionPerformed
        String temp = "9";
        inPutField.setText( inPutField.getText() + temp );
    }//GEN-LAST:event_btnNineActionPerformed

    private void btnAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAActionPerformed
        String temp = "A";
        inPutField.setText( inPutField.getText() + temp );
    }//GEN-LAST:event_btnAActionPerformed

    private void btnBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBActionPerformed
        String temp = "B";
        inPutField.setText( inPutField.getText() + temp );
    }//GEN-LAST:event_btnBActionPerformed

    private void btnFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFActionPerformed
        String temp = "F";
        inPutField.setText( inPutField.getText() + temp );
    }//GEN-LAST:event_btnFActionPerformed

    private void btnDecimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDecimalActionPerformed
        String temp = ".";
        if (inPutField.getText().equals("") == true)
            inPutField.setText( inPutField.getText() + "0" + temp );
        else
            inPutField.setText( inPutField.getText() + temp );
    }//GEN-LAST:event_btnDecimalActionPerformed

    private void inputClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputClearActionPerformed
        inPutField.setText("");
    }//GEN-LAST:event_inputClearActionPerformed

    private void btnBspaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBspaceActionPerformed
        String temp = inPutField.getText();
        
        inPutField.setText(temp.substring(0,temp.length()-1));
    }//GEN-LAST:event_btnBspaceActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Convertor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Convertor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Convertor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Convertor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Convertor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnA;
    private javax.swing.JButton btnB;
    private javax.swing.JButton btnBspace;
    private javax.swing.JButton btnC;
    private javax.swing.JButton btnD;
    private javax.swing.JButton btnDecimal;
    private javax.swing.JButton btnE;
    private javax.swing.JButton btnEight;
    private javax.swing.JButton btnF;
    private javax.swing.JButton btnFive;
    private javax.swing.JButton btnFour;
    private javax.swing.JButton btnNine;
    private javax.swing.JButton btnOne;
    private javax.swing.JButton btnSeven;
    private javax.swing.JButton btnSix;
    private javax.swing.JButton btnThree;
    private javax.swing.JButton btnTwo;
    private javax.swing.JButton btnZero;
    private javax.swing.JComboBox cbxInput;
    private javax.swing.JComboBox cbxOutput;
    private javax.swing.JButton convertButton;
    private javax.swing.JTextArea displayArea;
    private javax.swing.JTextField inPutField;
    private javax.swing.JButton inputClear;
    private javax.swing.JLabel inputLabel;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel outPutLabel;
    private javax.swing.JButton refreshButton;
    // End of variables declaration//GEN-END:variables
}