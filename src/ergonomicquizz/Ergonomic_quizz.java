/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ergonomicquizz;

import ergonomicquizz.Login.LoginForm;
import javax.swing.UIManager;


/**
 *
 * @author yamada
 */
public class Ergonomic_quizz {
        
    public static void main(String[] args) {  
       LoginForm login = new LoginForm();
       login.setVisible(true);
       login.setTitle("Bem-Vindo(a)!");
       login.setLocationRelativeTo(null);
    }
}
