/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package User_Interfaces;

import Data_Management.Maintain_Users;
import SmarkShopperSystem.Smart_Shoppers_System;
import Data_Management.User;
import java.awt.Color;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author patli
 */
public class Settings_Form extends javax.swing.JFrame {

    String username;
    String password;
    String userType;
    String firstName;
    String lastName;
    String street;
    String country;
    String city;
    String PostalCode;
    
    String loginFilePath = "C:\\SmartShoppersSystem\\logins.csv";
    File loginFile = new File(loginFilePath);
    
    User currentUser;
    
    
    public void getUser(User user){
        this.currentUser = user;
        this.username = user.getUsername();
        this.password = user.getPassword();
        this.userType = user.getUserType();
        this.firstName = user.getFirstName();
        this.lastName = user.getLastName();
        this.street = user.getStreet();
        this.country = user.getCountry();
        this.city = user.getCity();
        this.PostalCode = user.getPostalCode();
    }
    
    /**
     * Creates new form Change_Password
     */
    public Settings_Form() {
        initComponents();
        //center the form
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jButton_UpdateNames = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPasswordField_New = new javax.swing.JPasswordField();
        jPasswordField_Old = new javax.swing.JPasswordField();
        jButton_Close = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPasswordField_ConfirmNew = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jTextField_FirstName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField_LastName = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField_Username = new javax.swing.JTextField();
        jButton_UpdatePassword = new javax.swing.JButton();
        jButton_UpdateUsername = new javax.swing.JButton();
        jButton_UpdateAddress = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jButton_DeleteAccount = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jButton_RequestInfo = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jTextField_PostalCode = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTextField_Country = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jTextField_City = new javax.swing.JTextField();
        jTextField_Street = new javax.swing.JTextField();
        loginLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(0, 204, 204));
        jPanel2.setForeground(new java.awt.Color(153, 153, 153));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton_UpdateNames.setBackground(new java.awt.Color(0, 204, 204));
        jButton_UpdateNames.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButton_UpdateNames.setForeground(new java.awt.Color(255, 255, 255));
        jButton_UpdateNames.setText("Update Names");
        jButton_UpdateNames.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton_UpdateNamesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton_UpdateNamesMouseExited(evt);
            }
        });
        jButton_UpdateNames.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_UpdateNamesActionPerformed(evt);
            }
        });
        jPanel3.add(jButton_UpdateNames, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 328, -1, 41));

        jLabel1.setText("New Password:");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(77, 102, -1, -1));

        jLabel2.setText("Old Password:");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 62, -1, -1));
        jPanel3.add(jPasswordField_New, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 99, 372, -1));
        jPanel3.add(jPasswordField_Old, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 59, 372, -1));

        jButton_Close.setBackground(new java.awt.Color(0, 204, 204));
        jButton_Close.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButton_Close.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Close.setText("Close");
        jButton_Close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton_CloseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton_CloseMouseExited(evt);
            }
        });
        jButton_Close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_CloseActionPerformed(evt);
            }
        });
        jPanel3.add(jButton_Close, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 146, 47));

        jLabel3.setText("Confirm New Password:");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 136, -1, -1));
        jPanel3.add(jPasswordField_ConfirmNew, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 133, 372, -1));

        jLabel4.setText("First Name:");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 238, -1, -1));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel3.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 222, 572, -1));
        jPanel3.add(jTextField_FirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 238, 108, 25));

        jLabel5.setText("Last Name:");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 288, -1, -1));
        jPanel3.add(jTextField_LastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 285, 109, -1));

        jLabel6.setText("Username:");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 392, -1, -1));
        jPanel3.add(jTextField_Username, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 389, 112, -1));

        jButton_UpdatePassword.setBackground(new java.awt.Color(0, 204, 204));
        jButton_UpdatePassword.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButton_UpdatePassword.setForeground(new java.awt.Color(255, 255, 255));
        jButton_UpdatePassword.setText("Update Password");
        jButton_UpdatePassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton_UpdatePasswordMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton_UpdatePasswordMouseExited(evt);
            }
        });
        jButton_UpdatePassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_UpdatePasswordActionPerformed(evt);
            }
        });
        jPanel3.add(jButton_UpdatePassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(209, 161, -1, 41));

        jButton_UpdateUsername.setBackground(new java.awt.Color(0, 204, 204));
        jButton_UpdateUsername.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButton_UpdateUsername.setForeground(new java.awt.Color(255, 255, 255));
        jButton_UpdateUsername.setText("Update Username");
        jButton_UpdateUsername.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton_UpdateUsernameMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton_UpdateUsernameMouseExited(evt);
            }
        });
        jButton_UpdateUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_UpdateUsernameActionPerformed(evt);
            }
        });
        jPanel3.add(jButton_UpdateUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 419, -1, 41));

        jButton_UpdateAddress.setBackground(new java.awt.Color(0, 204, 204));
        jButton_UpdateAddress.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButton_UpdateAddress.setForeground(new java.awt.Color(255, 255, 255));
        jButton_UpdateAddress.setText("Update Address");
        jButton_UpdateAddress.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton_UpdateAddressMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton_UpdateAddressMouseExited(evt);
            }
        });
        jButton_UpdateAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_UpdateAddressActionPerformed(evt);
            }
        });
        jPanel3.add(jButton_UpdateAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(305, 322, -1, 48));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setText("Delete Account:");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(405, 382, 154, -1));

        jButton_DeleteAccount.setBackground(new java.awt.Color(0, 204, 204));
        jButton_DeleteAccount.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButton_DeleteAccount.setForeground(new java.awt.Color(255, 255, 255));
        jButton_DeleteAccount.setText("Delete Account");
        jButton_DeleteAccount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton_DeleteAccountMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton_DeleteAccountMouseExited(evt);
            }
        });
        jButton_DeleteAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_DeleteAccountActionPerformed(evt);
            }
        });
        jPanel3.add(jButton_DeleteAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(405, 416, -1, 46));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setText("Request Personal Info:");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 382, 208, -1));

        jButton_RequestInfo.setBackground(new java.awt.Color(0, 204, 204));
        jButton_RequestInfo.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButton_RequestInfo.setForeground(new java.awt.Color(255, 255, 255));
        jButton_RequestInfo.setText("Request Info");
        jButton_RequestInfo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton_RequestInfoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton_RequestInfoMouseExited(evt);
            }
        });
        jButton_RequestInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_RequestInfoActionPerformed(evt);
            }
        });
        jPanel3.add(jButton_RequestInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 416, 154, 46));

        jLabel10.setText("Postal Code:");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(415, 247, -1, -1));

        jTextField_PostalCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_PostalCodeActionPerformed(evt);
            }
        });
        jPanel3.add(jTextField_PostalCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(487, 238, 72, 31));

        jLabel11.setText("Country:");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(226, 288, -1, -1));
        jPanel3.add(jTextField_Country, new org.netbeans.lib.awtextra.AbsoluteConstraints(283, 281, 126, 31));

        jLabel12.setText("City:");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(458, 281, -1, -1));

        jLabel13.setText("Street Name & #:");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(186, 238, -1, -1));

        jTextField_City.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_CityActionPerformed(evt);
            }
        });
        jPanel3.add(jTextField_City, new org.netbeans.lib.awtextra.AbsoluteConstraints(487, 281, 72, 31));
        jPanel3.add(jTextField_Street, new org.netbeans.lib.awtextra.AbsoluteConstraints(283, 238, 126, 31));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 34, 580, 480));

        loginLabel.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        loginLabel.setForeground(new java.awt.Color(255, 255, 255));
        loginLabel.setText("Update Information");
        jPanel2.add(loginLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(181, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_CityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_CityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_CityActionPerformed

    private void jTextField_PostalCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_PostalCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_PostalCodeActionPerformed

    
    private void jButton_RequestInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_RequestInfoActionPerformed
        String nl = "\r\n";
        File requestInfoFile = new File("C:\\SmartShoppersSystem\\requestedInfo.txt");
        try {
            requestInfoFile.createNewFile();
        } catch (IOException ex) {
            Logger.getLogger(Settings_Form.class.getName()).log(Level.SEVERE, null, ex);
        }
        FileWriter fw;
        try {
            fw = new FileWriter(requestInfoFile, false);
            fw.write("Username: " + this.username + nl);
            fw.write("First Name: " + this.firstName + nl);
            fw.write("Last Name: " + this.lastName + nl);
            fw.write("Street: " + this.street + nl);
            fw.write("Postal Code: " + this.PostalCode + nl);
            fw.write("City: " + this.city + nl);
            fw.write("Country: " + this.country);
            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(Settings_Form.class.getName()).log(Level.SEVERE, null, ex);
        }
        JOptionPane.showMessageDialog(null, "Requested Data can be found in C:\\SmartShoppersSystem"
                , "Requested Data", 2);
    }//GEN-LAST:event_jButton_RequestInfoActionPerformed

    private void jButton_RequestInfoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_RequestInfoMouseExited
        // TODO add your handling code here:
        jButton_RequestInfo.setBackground(new Color(0, 204, 204));
    }//GEN-LAST:event_jButton_RequestInfoMouseExited

    private void jButton_RequestInfoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_RequestInfoMouseEntered
        // set jbutton background
        jButton_RequestInfo.setBackground(new Color(0, 153, 153));
    }//GEN-LAST:event_jButton_RequestInfoMouseEntered

    private void jButton_DeleteAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_DeleteAccountActionPerformed
        try {
            int input = JOptionPane.showConfirmDialog(null,
                    "Are you sure you want to delete your account?", "Deletion of Account",
                    JOptionPane.OK_CANCEL_OPTION, 2);
            Maintain_Users maintainLogin = new Maintain_Users();
            maintainLogin.load(loginFilePath);
            
            if (input == 0){
                for(User user: maintainLogin.users){
                    if(user.getUsername().equals(this.username)){
                        maintainLogin.users.remove(user);
                        break;
                    }
                }
                JOptionPane.showMessageDialog(null, "Account Deleted", "Deleted", 2);
                maintainLogin.update(loginFilePath);
                
                Smart_Shoppers_System login = new Smart_Shoppers_System();
                login.setVisible(true);
                login.pack();
                login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                this.dispose();
            }
        } catch (Exception ex) {
            Logger.getLogger(Settings_Form.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton_DeleteAccountActionPerformed

    private void jButton_DeleteAccountMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_DeleteAccountMouseExited
        // set jbutton background
        jButton_DeleteAccount.setBackground(new Color(0, 204, 204));
    }//GEN-LAST:event_jButton_DeleteAccountMouseExited

    private void jButton_DeleteAccountMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_DeleteAccountMouseEntered
        // set jbutton background
        jButton_DeleteAccount.setBackground(new Color(0, 153, 153));
    }//GEN-LAST:event_jButton_DeleteAccountMouseEntered

    private boolean addressFilled(String street, String postalCode, String city, String country){
        boolean filled = true;
        
        if(street.trim().equals("") || postalCode.trim().equals("") || city.trim().equals("")
                || country.trim().equals("")){
            filled = false;
            JOptionPane.showMessageDialog(null, "Username not entered", "Missing Field", 2);
        }
        return filled;
    }
    
    private void updateAddress(){
        String newStreet = jTextField_Street.getText();
        String newPostalCode = jTextField_PostalCode.getText();
        String newCity = jTextField_City.getText();
        String newCountry = jTextField_Country.getText();
        
        try {
            if(addressFilled(newStreet, newPostalCode, newCity, newCountry)){
                Maintain_Users maintainLogin = new Maintain_Users();
                maintainLogin.load(loginFilePath);
                
                for(User user: maintainLogin.users){
                    if(user.getUsername().equals(this.username)){
                        user.setStreet(newStreet);
                        user.setPostalCode(newPostalCode);
                        user.setCity(newCity);
                        user.setCountry(newCountry);
                        this.currentUser = user;
                        break;
                    }
                }
                maintainLogin.update(loginFilePath);
                JOptionPane.showMessageDialog(null, "Address Successfully Changed.", "New Username", 2);
            }
        } catch (Exception ex) {
            Logger.getLogger(Settings_Form.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void jButton_UpdateAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_UpdateAddressActionPerformed
       updateAddress();
    }//GEN-LAST:event_jButton_UpdateAddressActionPerformed

    private void jButton_UpdateAddressMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_UpdateAddressMouseExited
        // set jbutton background
        jButton_UpdateAddress.setBackground(new Color(0, 204, 204));
    }//GEN-LAST:event_jButton_UpdateAddressMouseExited

    private void jButton_UpdateAddressMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_UpdateAddressMouseEntered
        // set jbutton background
        jButton_UpdateAddress.setBackground(new Color(0, 153, 153));
    }//GEN-LAST:event_jButton_UpdateAddressMouseEntered
    
    private boolean usernameFilled(String username){
        boolean filled = true;
        
        if(username.trim().equals("")){
            filled = false;
            JOptionPane.showMessageDialog(null, "Username not entered", "Missing Field", 2);
        }
        return filled;
    }
    
    private void updateUsername(){
        String newUsername = jTextField_Username.getText();
        try {
            if(usernameFilled(newUsername)){
                Maintain_Users maintainLogin = new Maintain_Users();
                maintainLogin.load(loginFilePath);
                for(User user: maintainLogin.users){
                    if(user.getUsername().equals(this.username)){
                        user.setUsername(newUsername);
                        this.currentUser = user;
                        break;
                    }
                }
                maintainLogin.update(loginFilePath);
                JOptionPane.showMessageDialog(null, "Username Successfully Changed to " + newUsername + ".", 
                "New Username", 2);
            }
        } catch (Exception ex) {
            Logger.getLogger(Settings_Form.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void jButton_UpdateUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_UpdateUsernameActionPerformed
        updateUsername();
    }//GEN-LAST:event_jButton_UpdateUsernameActionPerformed

    private void jButton_UpdateUsernameMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_UpdateUsernameMouseExited
        // set jbutton background
        jButton_UpdateUsername.setBackground(new Color(0, 204, 204));
    }//GEN-LAST:event_jButton_UpdateUsernameMouseExited

    private void jButton_UpdateUsernameMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_UpdateUsernameMouseEntered
        // set jbutton background
        jButton_UpdateUsername.setBackground(new Color(0, 153, 153));
    }//GEN-LAST:event_jButton_UpdateUsernameMouseEntered

    private boolean verifiedPassword(String oldPassword, String newPassword, String confirmNewPass){
        boolean passwordVerified = false;
        
        if(!oldPassword.trim().equals("") && !newPassword.trim().equals("") && 
            !confirmNewPass.trim().equals("") && oldPassword.equals(this.password)){
            passwordVerified = true;
        }else{
            JOptionPane.showMessageDialog(null, "Passwords do not match!", "Error", 2);
        }
        return passwordVerified;
    }
    
    private void updatePassword() throws Exception{
        String oldPassword = String.valueOf(jPasswordField_Old.getPassword());
        String newPassword = String.valueOf(jPasswordField_New.getPassword());
        String confirmNewPass = String.valueOf(jPasswordField_ConfirmNew.getPassword());
        
        if(verifiedPassword(oldPassword, newPassword, confirmNewPass)){
            Maintain_Users maintainLogin = new Maintain_Users();
            maintainLogin.load(loginFilePath);
            for(User user: maintainLogin.users){
                if(user.getUsername().equals(this.username)){
                    user.setPassword(newPassword);
                    this.currentUser = user;
                    break;
                }
            }
            maintainLogin.update(loginFilePath);
            JOptionPane.showMessageDialog(null, "Password Successfully Changed", "New Password", 2);
        }
    }
    
    private void jButton_UpdatePasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_UpdatePasswordActionPerformed
        try {
            updatePassword();
        } catch (Exception ex) {
            Logger.getLogger(Settings_Form.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton_UpdatePasswordActionPerformed

    private void jButton_UpdatePasswordMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_UpdatePasswordMouseExited
        // set jbutton background
        jButton_UpdatePassword.setBackground(new Color(0, 204, 204));
    }//GEN-LAST:event_jButton_UpdatePasswordMouseExited

    private void jButton_UpdatePasswordMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_UpdatePasswordMouseEntered
        // set jbutton background
        jButton_UpdatePassword.setBackground(new Color(0, 153, 153));
    }//GEN-LAST:event_jButton_UpdatePasswordMouseEntered

    private void jButton_CloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_CloseActionPerformed
        Customer_Form customer = new Customer_Form();
        customer.getUser(this.currentUser);
        customer.setVisible(true);
        customer.pack();
        customer.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jButton_CloseActionPerformed

    private void jButton_CloseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_CloseMouseExited
        // set jbutton background
        jButton_Close.setBackground(new Color(0, 204, 204));
    }//GEN-LAST:event_jButton_CloseMouseExited

    private void jButton_CloseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_CloseMouseEntered
        // set jbutton background
        jButton_Close.setBackground(new Color(0, 153, 153));
    }//GEN-LAST:event_jButton_CloseMouseEntered

    private boolean verifiedNames(String firstName, String lastName){
        boolean namesVerified = true;
        
        if(firstName.trim().equals("") && lastName.trim().equals("")){
            namesVerified = false;
            JOptionPane.showMessageDialog(null, "Both fields are empty", "Missing Fields", 2);
        }
        
        return namesVerified;
    }
    
    private void updateNames() throws Exception{
        String newFirstName = String.valueOf(jTextField_FirstName.getText());
        String newLastName = String.valueOf(jTextField_LastName.getText());
        
        if(verifiedNames(newFirstName, newLastName)){
            Maintain_Users maintainLogin = new Maintain_Users();
            maintainLogin.load(loginFilePath);
            for(User user: maintainLogin.users){
                if(user.getFirstName().equals(this.firstName) && user.getLastName().equals(this.lastName)){
                    user.setFirstName(newFirstName);
                    user.setLastName(newLastName);
                    this.firstName = newFirstName;
                    this.lastName = newLastName;
                    break;
                }
            }
            maintainLogin.update(loginFilePath);
            JOptionPane.showMessageDialog(null, "Names Successfully Changed", "New Password", 2);
        }
    }
    
    private void jButton_UpdateNamesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_UpdateNamesActionPerformed
        try {
            updateNames();
        } catch (Exception ex) {
            Logger.getLogger(Settings_Form.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton_UpdateNamesActionPerformed

    private void jButton_UpdateNamesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_UpdateNamesMouseExited
        // set jbutton background
        jButton_UpdateNames.setBackground(new Color(0, 204, 204));
    }//GEN-LAST:event_jButton_UpdateNamesMouseExited

    
    private void jButton_UpdateNamesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_UpdateNamesMouseEntered
        // set jbutton background
        jButton_UpdateNames.setBackground(new Color(0, 153, 153));
    }//GEN-LAST:event_jButton_UpdateNamesMouseEntered

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
            java.util.logging.Logger.getLogger(Settings_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Settings_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Settings_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Settings_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Settings_Form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Close;
    private javax.swing.JButton jButton_DeleteAccount;
    private javax.swing.JButton jButton_RequestInfo;
    private javax.swing.JButton jButton_UpdateAddress;
    private javax.swing.JButton jButton_UpdateNames;
    private javax.swing.JButton jButton_UpdatePassword;
    private javax.swing.JButton jButton_UpdateUsername;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPasswordField jPasswordField_ConfirmNew;
    private javax.swing.JPasswordField jPasswordField_New;
    private javax.swing.JPasswordField jPasswordField_Old;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTextField_City;
    private javax.swing.JTextField jTextField_Country;
    private javax.swing.JTextField jTextField_FirstName;
    private javax.swing.JTextField jTextField_LastName;
    private javax.swing.JTextField jTextField_PostalCode;
    private javax.swing.JTextField jTextField_Street;
    private javax.swing.JTextField jTextField_Username;
    private javax.swing.JLabel loginLabel;
    // End of variables declaration//GEN-END:variables

}
