import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;


public class Gui extends JFrame implements ActionListener{
	
    ArrayList<Integer> num= new ArrayList<Integer>();
    //schermata rimuovi
    JFrame pag2;
    JButton bt1;
    JLabel lb1;
    JTextField ft1;
    
    //schermata iniziale
    JButton b1, b2,b3;
    JTextField f1;
    JLabel l;
    JLabel l1,l3;
    JTextArea a1;
    JPanel panel1;
    
    Gui(){
    	num.add(0);

        l1=new JLabel();

        l3=new JLabel();

        l1.setText("INSERISCI UN NUMERO: ");
        l1.setForeground(Color.red);
        l1.setBounds(50,15,180,20);
        this.add(l1);

        l3.setText("NUMERI ORDINATI: ");
        l3.setForeground(Color.red);
        l3.setBounds(150, 120, 180,20);
        this.add(l3);

        f1= new JTextField();
        f1.setBounds(50, 45, 140, 20);
        this.add(f1);

        a1= new JTextArea();
        a1.setBounds(150, 140, 120, 20);
        a1.setEditable(false);
        this.add(a1);

        b1=new JButton("AGGIUNGI");
        b1.setBounds(50, 75, 90, 25);
        b1.setMargin(new Insets(0, 0, 0, 0));      
        this.add(b1);
        b1.addActionListener(this);

        b2=new JButton("RIMUOVI");
        b2.setBounds(155, 75, 80, 25);
        b2.setMargin(new Insets(0, 0, 0, 0)); 
        this.add(b2);
        b2.addActionListener(this);

        b3=new JButton("VISUALIZZA");
        b3.setBounds(50, 130, 90, 25);
        b3.setMargin(new Insets(0, 0, 0, 0)); 
        this.add(b3);
        b3.addActionListener(this);

        l= new JLabel();
        this.add(l);
        
        
        pag2=new JFrame();
        
        bt1=new JButton("RIMUOVI");
        bt1.setBounds(50, 75, 90, 25);
        pag2.add(bt1);
        bt1.addActionListener(this);
       
        lb1=new JLabel();
        lb1.setText(" INSERISCI IL NUMERO!");
        lb1.setBounds(25, 5, 150, 20);
        pag2.add(lb1);
        
        ft1= new JTextField();
        ft1.setBounds(25, 40, 145, 20);
        pag2.add(ft1);
        
        
        
        pag2.add(l);
        pag2.setVisible(false);
        pag2.setSize(200,150);
        pag2.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
       
        this.setTitle("AGGIUNGI NUMERI ORIDINATI");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(320, 250);
        this.setResizable(false);
        this.setVisible(true);

    }


    @Override
    public void actionPerformed(ActionEvent e) {
   
        if(e.getSource()==b1){
        	
        
        	num.add(Integer.parseInt(f1.getText()));
        	
        	
       for(int i=1; i<num.size();i++) {
    	   int temp=i;
    	   
    	   for(int j=i+1; j<num.size();j++)
    		   
        	if(num.get(j)<num.get(temp)) {
        		temp=j;
      
        		int cont=num.get(temp);
        		num.set(temp,num.get(i));
        		num.set(i,cont);
        	}
        	
      }

        	

        }else if(e.getSource()==b2){
               
        	pag2.setVisible(true);
        	
        	if(e.getSource()==bt1) {
        		
        	
        		for(int t=0;t<num.size();t++) {
        		if(Integer.parseInt(ft1.getText())==num.get(t)) {
        			num.set(t,null);
        			
        		}
        				
        	}
        			
        }
        	
        }else if(e.getSource()==b3){
        	
        	a1.setText(num.toString());        	
        	
          
            }
        }
    }
