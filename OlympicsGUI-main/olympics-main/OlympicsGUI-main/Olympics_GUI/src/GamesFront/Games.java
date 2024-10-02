/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GamesFront;
// DUO: ALejandra Reyes & Hanne Mendoza

import javax.swing.JOptionPane;
import java.util.Random;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Games extends javax.swing.JFrame {
    int elijio;
    ArrayList <Float> puntajesfinales1 = new ArrayList ();
    ArrayList <Float> puntajesfinales2 = new ArrayList ();
    ArrayList <Float> puntajesfinales3 = new ArrayList ();
    ArrayList <Float> puntajesfinales4 = new ArrayList ();
    
    public Games() {
        JOptionPane.showMessageDialog(null, "Bienvenido a las GUI Swimming Olympics! \nPresione OK para comenzar la simulación de la olimpiada");
        setLocation(280,250);         
        initComponents();
        
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnStart = new javax.swing.JButton();
        btnFinish = new javax.swing.JButton();
        btnResults = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        labelPic = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        btnOmega = new javax.swing.JButton();
        btnSpeedo = new javax.swing.JButton();
        btnCoke = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));

        btnStart.setBackground(new java.awt.Color(51, 51, 51));
        btnStart.setText("START");
        btnStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartActionPerformed(evt);
            }
        });

        btnFinish.setBackground(new java.awt.Color(51, 51, 51));
        btnFinish.setText("FINISH");
        btnFinish.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinishActionPerformed(evt);
            }
        });

        btnResults.setBackground(new java.awt.Color(204, 153, 0));
        btnResults.setText("RESULTS");
        btnResults.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResultsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addComponent(btnStart, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnResults, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(216, 216, 216)
                .addComponent(btnFinish, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnResults)
                    .addComponent(btnFinish)
                    .addComponent(btnStart))
                .addGap(16, 16, 16))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        labelPic.setBackground(new java.awt.Color(0, 0, 0));
        labelPic.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 24)); // NOI18N
        labelPic.setForeground(new java.awt.Color(0, 0, 0));
        labelPic.setText("OLYMPICS GAMES");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelPic)
                .addGap(331, 331, 331))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(labelPic)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(0, 102, 204));

        jLabel1.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel1.setText("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");

        jLabel2.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel2.setText("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");

        jLabel3.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel3.setText("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");

        jLabel4.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel4.setText("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");

        jLabel5.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("]");

        jLabel6.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("]");

        jLabel7.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("]");

        jLabel8.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("]");

        jLabel9.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("]");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel9))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(153, 153, 153));

        btnOmega.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GamesFront/omega.png"))); // NOI18N
        btnOmega.setText("jButton6");
        btnOmega.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnOmegaMouseClicked(evt);
            }
        });

        btnSpeedo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GamesFront/speedo.png"))); // NOI18N
        btnSpeedo.setText("jButton5");
        btnSpeedo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSpeedoMouseClicked(evt);
            }
        });

        btnCoke.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GamesFront/coke.png"))); // NOI18N
        btnCoke.setText("jButton7");
        btnCoke.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCokeMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(btnCoke, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSpeedo, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(124, 124, 124)
                .addComponent(btnOmega, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCoke, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOmega, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSpeedo, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCokeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCokeMouseClicked
        JOptionPane.showMessageDialog(null, "¡Destapa la felicidad con Coca Cola!");
    }//GEN-LAST:event_btnCokeMouseClicked

    private void btnSpeedoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSpeedoMouseClicked
        JOptionPane.showMessageDialog(null, "Encuentra formas de lograrlo, no excusas!");
    }//GEN-LAST:event_btnSpeedoMouseClicked

    private void btnOmegaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOmegaMouseClicked
        JOptionPane.showMessageDialog(null, "Recording Olympic Dreams since 1932");
    }//GEN-LAST:event_btnOmegaMouseClicked

    private void btnStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartActionPerformed
        Random rand = new Random();
        Object [] opciones = {"2","3","4","5"};
        
        elijio = JOptionPane.showOptionDialog(null, "Seleccione el numero de nadadores", "Nadadores",JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones[0]);
        
        switch (elijio) {
            
            case 0: 
                DecimalFormat df = new DecimalFormat("#.00");
                JOptionPane.showMessageDialog(null, "Competencia en Modo Normal");
                JOptionPane.showMessageDialog(null, "Ha comenzado la competencia!");
                float [][] matriz = new float [2][3];
                
                
                for(int i = 0 ; i < matriz.length ; i++){
                    for(int j = 0 ; j < matriz[i].length ; j++){                        
                        float nad1 = 10 + ( 50 - 10 ) * rand.nextFloat();
                        float nad2 = 10 + ( 50 - 10 ) * rand.nextFloat();  
                        
                        switch(i){
                            case 0 -> matriz[i][j] += nad1;
                            case 1 -> matriz[i][j] += nad2;
                        }  
                    }                    
                }
                
                int cont = 1; 
                for (int i = 0; i < 2; i++) {
                    float suma = recursivasumalaps(matriz, i, 0);
                    puntajesfinales1.add(suma);
                    
                    System.out.println("Nadador " + cont + ": " + df.format(suma));
                    cont++;
                }
                imprimirlista(puntajesfinales1); 
                
                JOptionPane.showMessageDialog(null,"Puntajes de la competencia: \n                    Lap 1            Lap 2            Lap3 \n" + imprimeJoption(matriz));
                JOptionPane.showMessageDialog(null, "Los puntajes han sido sumados y ya tenemos un ganador");
                JOptionPane.showMessageDialog(null, "Presione 'Results' para descubrirlo");
                                
                break;
                
            case 1:
                JOptionPane.showMessageDialog(null, "Competencia en Modo Eliminatoria");
                float [][] matriz2 = new float [3][3];
                DecimalFormat df2 = new DecimalFormat("#.00");
                
                
                for(int i = 0 ; i < matriz2.length ; i++){
                    for(int j = 0 ; j < matriz2[i].length ; j++){                        
                        float nad1 = 10 + ( 50 - 10 ) * rand.nextFloat();
                        float nad2 = 10 + ( 50 - 10 ) * rand.nextFloat();  
                        float nad3 = 10 + ( 50 - 10 ) * rand.nextFloat();
                        
                       switch(i){
                            case 0 -> matriz2[i][j] += nad1;
                            case 1 -> matriz2[i][j] += nad2;
                            case 2 -> matriz2[i][j] += nad3;
                            
                        }                        
                    }                    
                }
                
                cont=1; 
                
                for (int i = 0; i < 3; i++) {
                    float suma = recursivasumalaps(matriz2, i, 0);
                    puntajesfinales2.add(suma);
                    
                    System.out.println("Nadador " + cont + ": " + df2.format(suma));
                    cont++;
                }
                imprimirlista(puntajesfinales2);
                
                JOptionPane.showMessageDialog(null,"Puntajes de la competencia: \n                       Lap 1          Lap 2        Lap3 \n" + (imprimeJoption(matriz2)));
                JOptionPane.showMessageDialog(null, "Los puntajes han sido sumados y ya tenemos los ganadores");
                JOptionPane.showMessageDialog(null, "Presione 'Results' para descubrirlo");
                
                break;
              
            case 2:
                JOptionPane.showMessageDialog(null, "Competencia en Modo Eliminatoria");
                float [][] matriz3 = new float [4][3];
                DecimalFormat df3 = new DecimalFormat("#.00");
                               
                for(int i = 0 ; i < matriz3.length ; i++){
                    for(int j = 0 ; j < matriz3[i].length ; j++){                        
                        float nad1 = 10 + ( 50 - 10 ) * rand.nextFloat();
                        float nad2 = 10 + ( 50 - 10 ) * rand.nextFloat();  
                        float nad3 = 10 + ( 50 - 10 ) * rand.nextFloat();
                        float nad4 = 10 + ( 50 - 10 ) * rand.nextFloat();
                        
                        switch(i){
                            case 0 -> matriz3[i][j] += nad1;
                            case 1 -> matriz3[i][j] += nad2;
                            case 2 -> matriz3[i][j] += nad3;
                            case 3 -> matriz3[i][j] += nad4;
                            
                        }                       
                    }                    
                }
                cont=1; 
                
                for (int i = 0; i < 4; i++) {
                    float suma = recursivasumalaps(matriz3, i, 0);
                    puntajesfinales3.add(suma);
                    
                    System.out.println("Nadador " + cont + ": " + df3.format(suma));
                    cont++;
                }
                imprimirlista(puntajesfinales3); 
                
                JOptionPane.showMessageDialog(null,"Puntajes de la competencia: \n                       Lap 1          Lap 2        Lap3 \n" + (imprimeJoption(matriz3)));
                JOptionPane.showMessageDialog(null, "Tenemos un eliminado");
                
  
                int eliminado = 0;
                switch(indicedelganador(puntajesfinales3, (recursivabuscaeliminado(puntajesfinales3, 0, puntajesfinales3.get(0))))){
                    case 0 -> eliminado = 1;
                    case 1 -> eliminado = 2;
                    case 2 -> eliminado = 3;
                    case 3 -> eliminado = 4;                    
                }
                
                JOptionPane.showMessageDialog(null, "El eliminado es el Nadador " + eliminado);
                JOptionPane.showMessageDialog(null, "Los puntajes han sido sumados y ya tenemos los ganadores");
                JOptionPane.showMessageDialog(null, "Presione 'Results' para descubrirlo");
                
                break;

                
            case 3:
                JOptionPane.showMessageDialog(null, "Competencia en Modo Eliminatoria");
                float [][] matriz4 = new float [5][3];
                DecimalFormat df4 = new DecimalFormat("#.00");
               
                
                for(int i = 0 ; i < matriz4.length ; i++){
                    for(int j = 0 ; j < matriz4[i].length ; j++){                        
                        float nad1 = 10 + ( 50 - 10 ) * rand.nextFloat();
                        float nad2 = 10 + ( 50 - 10 ) * rand.nextFloat();  
                        float nad3 = 10 + ( 50 - 10 ) * rand.nextFloat();
                        float nad4 = 10 + ( 50 - 10 ) * rand.nextFloat();
                        float nad5 = 10 + ( 50 - 10 ) * rand.nextFloat();
                        
                        switch(i){
                            case 0 -> matriz4[i][j] += nad1;
                            case 1 -> matriz4[i][j] += nad2;
                            case 2 -> matriz4[i][j] += nad3;
                            case 3 -> matriz4[i][j] += nad4;
                            case 4 -> matriz4[i][j] += nad5;
                                
                        }                                               
                    }                    
                }
                
                cont=1; 
                
                for (int i = 0; i < 5; i++) {
                    float suma = recursivasumalaps(matriz4, i, 0);
                    puntajesfinales4.add(suma);
                    
                    System.out.println("Nadador " + cont + ": " + df4.format(suma));
                    cont++;
                }
                imprimirlista(puntajesfinales4);
                
                JOptionPane.showMessageDialog(null,"Puntajes de la competencia: \n                       Lap 1          Lap 2        Lap3 \n" + (imprimeJoption(matriz4)));
                JOptionPane.showMessageDialog(null, "Tenemos dos eliminados");
                
  
                int eliminado2 = 0;
                switch(indicedelganador(puntajesfinales4, (recursivabuscaeliminado(puntajesfinales4, 0, puntajesfinales4.get(0))))){
                    case 1 -> eliminado2 = 1;
                    case 2 -> eliminado2 = 2;
                    case 3 -> eliminado2 = 3;
                    case 4 -> eliminado2 = 4;
                    case 5 -> eliminado2 = 5;
                }
                puntajesfinales4.remove(eliminado2);
                
                int eliminado3 = 0;                
                switch(indicedelganador(puntajesfinales4, (recursivabuscaeliminado(puntajesfinales4, 0, puntajesfinales4.get(0))))){
                    case 1 -> eliminado3 = 1;
                    case 2 -> eliminado3 = 2;
                    case 3 -> eliminado3 = 3;
                    case 4 -> eliminado3 = 4;
                    case 5 -> eliminado3 = 5;
                }
                //puntajesfinales4.remove(eliminado3);
                JOptionPane.showMessageDialog(null, "Los eliminados son los nadadores " + eliminado2 + " y " + eliminado3);
                
                JOptionPane.showMessageDialog(null, "Los puntajes han sido sumados y ya tenemos los ganadores");
                JOptionPane.showMessageDialog(null, "Presione 'Results' para descubrirlo");
                
                break;                
       
        }//switch       
    }//GEN-LAST:event_btnStartActionPerformed

    private void btnResultsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResultsActionPerformed
        DecimalFormat df = new DecimalFormat("#.00");
        
        switch(elijio){
            case 0 :                
                JOptionPane.showMessageDialog(null, "El ganador es el nadador " + indicedelganador(puntajesfinales1, recursivabuscaganador(puntajesfinales1, 0, puntajesfinales1.get(0))) + " con " 
                        + df.format(recursivabuscaganador(puntajesfinales1, 0, puntajesfinales1.get(0))));
                
                break;
                
            case 1:
                
                HashMap < Float, Integer> Indice2 = new HashMap<>();
                    for (int i = 0; i < puntajesfinales2.size(); i++) {
                        Indice2.put(puntajesfinales2.get(i), i);
                    }
                Collections.sort(puntajesfinales2);
                float primerLugar = recursivabuscaganador(puntajesfinales2, 0, puntajesfinales2.get(0));
                float segundoLugar = recursivabuscaganador(puntajesfinales2, 1, puntajesfinales2.get(1));
                float tercerLugar = recursivabuscaganador(puntajesfinales2, 2, puntajesfinales2.get(2));
                
                int indiceP = Indice2.get(primerLugar);
                int indiceS = Indice2.get(segundoLugar);
                int indiceT = Indice2.get(tercerLugar);    
                
                JOptionPane.showMessageDialog(null, "El primer lugar es para el nadador " + indiceP + " con " + df.format(primerLugar) +
                                   "\nEl segundo lugar es para el nadador " + indiceS + " con " + df.format(segundoLugar) +
                                   "\nEl tercer lugar es para el nadador " + indiceT + " con " + df.format(tercerLugar));


                break;
                
            case 2:  
                
                HashMap < Float, Integer> Indice3 = new HashMap<>();
                    for (int i = 0; i < puntajesfinales3.size(); i++) {
                        Indice3.put(puntajesfinales3.get(i), i);
                    }
                Collections.sort(puntajesfinales3);
                float primerLugar1 = recursivabuscaganador(puntajesfinales3, 0, puntajesfinales3.get(0));
                float segundoLugar1 = recursivabuscaganador(puntajesfinales3, 1, puntajesfinales3.get(1));
                float tercerLugar1 = recursivabuscaganador(puntajesfinales3, 2, puntajesfinales3.get(2));
                
                int indiceP1 = Indice3.get(primerLugar1);
                int indiceS1 = Indice3.get(segundoLugar1);
                int indiceT1 = Indice3.get(tercerLugar1);    
                
                
                JOptionPane.showMessageDialog(null, "El primer lugar es para el nadador "  + indiceP1 +" con " + df.format(primerLugar1) +
                                   "\nEl segundo lugar es para el nadador " + indiceS1 + " con " + df.format(segundoLugar1) +
                                   "\nEl tercer lugar es para el nadador " + indiceT1 + " con " + df.format(tercerLugar1));

                break;
                
            case 3:  
                HashMap < Float, Integer> Indice4 = new HashMap<>();
                    for (int i = 0; i < puntajesfinales4.size(); i++) {
                        Indice4.put(puntajesfinales4.get(i), i);
                    }
                
                Collections.sort(puntajesfinales4);
                float primerLugar2 = recursivabuscaganador(puntajesfinales4, 0, puntajesfinales4.get(0));
                float segundoLugar2 = recursivabuscaganador(puntajesfinales4, 1, puntajesfinales4.get(1));
                float tercerLugar2= recursivabuscaganador(puntajesfinales4, 2, puntajesfinales4.get(2));
                
                int indiceP2 = Indice4.get(primerLugar2);
                int indiceS2 = Indice4.get(segundoLugar2);
                int indiceT2 = Indice4.get(tercerLugar2);  
                
                JOptionPane.showMessageDialog(null, "El primer lugar es para el nadador " + indiceP2 + " con " + df.format(primerLugar2) +
                                   "\nEl segundo lugar es para el nadador " + indiceS2 + " con " + df.format(segundoLugar2) +
                                   "\nEl tercer lugar es para el nadador " + indiceT2 + " con " + df.format(tercerLugar2));

                break;
                      
        }       
    }//GEN-LAST:event_btnResultsActionPerformed

    private void btnFinishActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinishActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnFinishActionPerformed


    public static void imprimir(float[][]matriz){
        DecimalFormat df = new DecimalFormat("#.00");
        for(int i = 0 ; i < matriz.length ; i++){
                    for(int j = 0 ; j < matriz[i].length ; j++){
                        System.out.print(df.format(matriz[i][j])+ " ");                        
                    }
                    System.out.println("");
                }
    }
    
    public static void imprimirlista(ArrayList <Float> puntajes){
        DecimalFormat df5 = new DecimalFormat("#.00");
        for (int i = 0; i < puntajes.size(); i++){            
            System.out.print("[" + df5.format(puntajes.get(i)) + "]");
        }
    }
    
    public static String imprimeJoption(float [][] matriz){
        DecimalFormat df = new DecimalFormat("#.00");
        String imp = "";
        int cont = 1;
        
        for (int i = 0; i < matriz.length; i++){
            imp += "Nadador " + cont + ": ";
            cont++;
            for (int j = 0; j < matriz[i].length; j++){
                imp += df.format(matriz[i][j]);
                if (j == matriz[i].length-1){
                    imp+="\n";
                }
                else {
                    imp += "             "; 
                }
            }
        }
      return imp;  
    }
    
    
    public static float recursivasumalaps (float [][] matriz, int fila, int col){
        if (col == matriz[fila].length){
            return 0;              
        }
        else{
            return matriz[fila][col] + recursivasumalaps(matriz, fila, col+1);
        }           
    }
    
    
    public static int indicedelganador (ArrayList <Float> puntajes, float menoromayor){
     int ind = 0; 
        for (int i = 0; i < puntajes.size(); i++){
        if (puntajes.get(i) == menoromayor){
            ind = i;
        }
    }
        return ind;
    }
            
    
    public static float recursivabuscaganador (ArrayList <Float> puntajes, int cont, float menor){
        if (cont == puntajes.size()){
            return menor;              
        }
        else{
            if (puntajes.get(cont) < menor){
                  menor = puntajes.get(cont);
            }
              
            return recursivabuscaganador(puntajes, cont+1, menor);
        }
           
    }
    
    public static float recursivabuscaeliminado (ArrayList <Float> puntajes, int cont, float mayor){        
        if (cont == puntajes.size()){
            return mayor;              
        }
        else{
            if (puntajes.get(cont) > mayor){
                  mayor = puntajes.get(cont);
            }
              
            return recursivabuscaeliminado(puntajes, cont+1, mayor);
        }
           
    }    
  
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCoke;
    private javax.swing.JButton btnFinish;
    private javax.swing.JButton btnOmega;
    private javax.swing.JButton btnResults;
    private javax.swing.JButton btnSpeedo;
    private javax.swing.JButton btnStart;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel labelPic;
    // End of variables declaration//GEN-END:variables
}
