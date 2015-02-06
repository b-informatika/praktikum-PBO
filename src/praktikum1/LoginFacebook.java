/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package praktikum1;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class LoginFacebook {
    public static void main(String[] args) {
        
        String email="facebook@gmail.com";
        String password="123";
        
        String inputEmail;
        String inputPassword;
        
        Scanner scan=new Scanner(System.in);
        
        inputEmail=JOptionPane.showInputDialog("Masukan Email Anda :");
        inputPassword=JOptionPane.showInputDialog("Masukan Password Anda :");
        
//        System.out.print("Masukan Email Anda : ");inputEmail=scan.next();
//        System.out.print("Masukan Password Anda : ");inputPassword=scan.next();
        
        if((inputEmail.equals(email))&&(inputPassword.equals(password))){
            JOptionPane.showMessageDialog(null, "Login Berhasil !");
        }else{
            JOptionPane.showMessageDialog(null, "Login gagal !");
        }
    }
    
}
