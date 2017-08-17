/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainoff;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Alumno
 */
public class obtenerFactorialyFi extends JFrame implements ActionListener{
     JButton obtener = new JButton("Obtener");
     JTextField facto = new JTextField("");
     JTextField factoR = new JTextField(" ");
     JTextField fiboR = new JTextField(" ");
     int yalohizo = 0;
     
    public obtenerFactorialyFi (){
      
    }
    
    public void ventana(){
        setTitle("Obtener Factorial y Fibonacci");
        setSize(800, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        setVisible(true);
        elementos();
        
        
    }
    
    public void elementos(){
        JLabel texto = new JLabel("Ingresa tu numero");
        texto.setBounds(50, 50, 150, 25);
        add(texto);
        
        JLabel resultadoFa = new JLabel("Resultado Factorial");
        resultadoFa.setBounds(50, 350, 180, 25);
        add(resultadoFa);
        
        JLabel resultadoFi = new JLabel("Resultado Fibonacci");
        resultadoFi.setBounds(400, 350, 160, 25);
        add(resultadoFi);
        
        obtener.setBounds(450, 50, 100, 25);
        obtener.addActionListener(this);
        add(obtener);
        
        
        facto.setBounds(200, 50, 200, 25);
        add(facto);

        factoR.setBounds(184, 350, 200, 25);
        add(factoR);
        
        
        fiboR.setBounds(530, 350, 200, 25);
        add(fiboR);
        
        setVisible(true);
    }
    
    

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(obtener)){
            String cadena = facto.getText();
            if(facto.getText().isEmpty()){
                System.out.println("Está vacio");
                JOptionPane.showMessageDialog(this, "Ingrese un numero");
            }
            else{
                System.out.println("No está vacio");
                for(int i = 0; i < cadena.length(); i++){
                    if(cadena.codePointAt(i) >= 48 && cadena.codePointAt(i) <= 57){
                        System.out.println("Es un número");
                        ArrayList <setnum> listita = new ArrayList<>();
            
                        setnum setito = new setnum();
                        setito.setNumero(0);
                        listita.add(setito);
                        setnum set =  new setnum();
                        set.setNumero(1);
                        listita.add(set);


                        int cuantos = Integer.parseInt(facto.getText());
                        int factofi = 0, suma = 0;
                        for(int j = 0;j < cuantos; j++){
                            if(j == 0){
                                factofi = (j+1);
                            }
                            factofi = factofi * (j+1);
                            suma = listita.get(listita.size()-2).getNumero() + listita.get(listita.size()-1).getNumero();
                            setnum nume =  new setnum();
                            nume.setNumero(suma);
                            listita.add(nume);
                        }
                        System.out.println("facto " + factofi);
                        factoR.setText(String.valueOf(factofi));
                        if(yalohizo != 0){
                            fiboR.setText("");
                            for(int k = 0; k < cuantos; k++){
                            fiboR.setText(fiboR.getText()+"-"+listita.get(k).getNumero() );
                            }
                        }
                        else{
                            for(int c = 0; c < cuantos; c++){
                            fiboR.setText(fiboR.getText()+"-"+listita.get(c).getNumero() );
                            }
                        }
                        yalohizo = 1;
                    }
                    else{
                        System.out.println("No es un número");
                        JOptionPane.showMessageDialog(this, "Ingrese un numero");
                    }
                }
                
            }
            
        }
    }
    
    
}
