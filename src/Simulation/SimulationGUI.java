package Simulation;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
 import java.text.DecimalFormat;

public class SimulationGUI extends JFrame implements ActionListener{
    public JLabel lamda ;
    public JLabel mean ;
    public JTextField l ;
    public JTextField m ;
    public JFrame frame ;
    public JPanel panel;
    public JButton simulate ;
    public JLabel title,title2;
    
    public JPanel panel2;
    public JLabel L,w,lq,wq,p,po;
    public JTextField t1,t2,t3,t4,t5,t6;
    public JButton back;
    
    public SimulationGUI(){
        
        title = new JLabel("Queuing Model");
        
        lamda = new JLabel("Mean Number Of Arrivals : ");
        
        mean = new JLabel("Mean Number Of Customers :  ");
        
        
        simulate = new JButton("Simulate");
        
        l = new JTextField();
        m = new JTextField();
        
        
        title2 = new JLabel("Simulation");
        L  = new JLabel("L");
        w  = new JLabel("W");
        lq = new JLabel("LQ");
        wq = new JLabel("wq");
        p  = new JLabel("P");
        po = new JLabel("PO");
        
        t1 = new JTextField();
        t2 = new JTextField();
        t3 = new JTextField();
        t4 = new JTextField();
        t5 = new JTextField();
        t6 = new JTextField();
        
        back = new JButton("Back");
        
        frame = new JFrame();
       
        panel = new JPanel();
        panel2 = new JPanel();
        
        frame.setTitle("Simulation");
        frame.setSize(920, 650);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setLocation(500, 80);
        
        
        panel.setSize(920, 650);
        panel.setLayout(null);
        panel.setBackground(Color.BLACK);
                
        panel2.setSize(920, 650);
        panel2.setLayout(null);
        panel2.setBackground(Color.black);
        panel2.setVisible(false);
        
        
        title.setBounds(218, 20, 500, 70);
        title.setForeground(Color.green);
        title.setFont(new Font (Font.SANS_SERIF,Font.CENTER_BASELINE,60));
        
        
        lamda.setBounds(60, 150, 900, 45);
        lamda.setFont(new Font(Font.SANS_SERIF,Font.BOLD,35));
        lamda.setForeground(Color.yellow);
        
        
        l.setBounds(510, 160, 100, 30);
        l.setFont(new Font(Font.SANS_SERIF,Font.BOLD,30));
        l.setForeground(Color.BLACK); 
        
         
         
      
        mean.setBounds(60, 270, 900, 45);
        mean.setFont(new Font(Font.SANS_SERIF,Font.BOLD,35));
        mean.setForeground(Color.yellow);
        
        m.setBounds(570, 280, 100, 30);
        m.setFont(new Font(Font.SANS_SERIF,Font.BOLD,30));
        m.setForeground(Color.BLACK);   
           
         
       
        
        simulate.setBounds(345, 400, 190, 70);
        simulate.setFont(new Font(Font.MONOSPACED,Font.BOLD,30));
        simulate.setForeground(Color.blue);
        simulate.addActionListener(this);
        
      ///////////////////////////////////////////////////////////////////////////////////////////
      ///////////////////////////////////////////////////////////////////////////////////////////
        
      
        title2.setBounds(300, 10, 500, 70);
        title2.setForeground(Color.red);
        title2.setFont(new Font (Font.SANS_SERIF,Font.CENTER_BASELINE,60));
        
        L.setBounds(200, 120, 50, 30);
        L.setFont(new Font("",Font.BOLD,35));
        L.setForeground(Color.YELLOW);
        
        t1.setBounds(250, 121, 140, 35);
        t1.setFont(new Font(Font.SANS_SERIF,Font.BOLD,30));
        t1.setForeground(Color.BLACK); 
        t1.setBackground(Color.white);
        t1.setEditable(false);
      
        
        lq.setBounds(500, 120, 50, 30);
        lq.setFont(new Font("",Font.BOLD,35));
        lq.setForeground(Color.YELLOW);

        t2.setBounds(580, 121, 140, 35);
        t2.setFont(new Font(Font.SANS_SERIF,Font.BOLD,30));
        t2.setForeground(Color.BLACK); 
        t2.setBackground(Color.white);
        t2.setEditable(false);
        
        w.setBounds(200, 230, 50, 30);
        w.setFont(new Font("",Font.BOLD,35));
        w.setForeground(Color.YELLOW);

        t3.setBounds(250, 231, 140, 35);
        t3.setFont(new Font(Font.SANS_SERIF,Font.BOLD,30));
        t3.setForeground(Color.BLACK); 
        t3.setBackground(Color.white);
        t3.setEditable(false);
        
        
        wq.setBounds(500,232, 50, 40);
        wq.setFont(new Font("",Font.BOLD,35));
        wq.setForeground(Color.YELLOW);
        
        t4.setBounds(580, 231, 140, 35);
        t4.setFont(new Font(Font.SANS_SERIF,Font.BOLD,30));
        t4.setForeground(Color.BLACK); 
        t4.setBackground(Color.white);
        t4.setEditable(false);
        

        
        p.setBounds(200,340, 50, 30);
        p.setFont(new Font("",Font.BOLD,35));
        p.setForeground(Color.YELLOW);
        
        t5.setBounds(250, 341, 140, 35);
        t5.setFont(new Font(Font.SANS_SERIF,Font.BOLD,30));
        t5.setForeground(Color.BLACK); 
        t5.setBackground(Color.white);
        t5.setEditable(false);

        
        po.setBounds(500, 340, 50, 30);
        po.setFont(new Font("",Font.BOLD,35));
        po.setForeground(Color.YELLOW);
        
        t6.setBounds(580, 341, 140, 35);
        t6.setFont(new Font(Font.SANS_SERIF,Font.BOLD,30));
        t6.setForeground(Color.BLACK); 
        t6.setBackground(Color.white);
        t6.setEditable(false);
        
        
        back.setBounds(376, 450, 200, 70);
        back.addActionListener(this);
        back.setForeground(Color.blue);
        back.setFont(new Font("",Font.BOLD,40));

        
        

        
        
        frame.add(panel);
        frame.add(panel2);
        
        
        panel.add(title);
        panel.add(lamda);
        panel.add(mean);
        panel.add(l);
        panel.add(m);
        panel.add(simulate);
        
        panel2.add(title2);
        panel2.add(L);
        panel2.add(w);
        panel2.add(lq);
        panel2.add(wq);
        panel2.add(p);
        panel2.add(po);
        panel2.add(t1);
        panel2.add(t2);
        panel2.add(t3);
        panel2.add(t4);
        panel2.add(t5);
        panel2.add(t6);
        panel2.add(back);
        
        
    
    }
    
       @Override
    public void actionPerformed(ActionEvent ae) {
       
        if ((ae.getSource()==simulate) && ((l.getText().isEmpty() || m.getText().isEmpty()))){
            JOptionPane.showMessageDialog(getContentPane(),"Enter AlL Information!");
        }
                    double num1 = Double.valueOf(l.getText());
                    double num2 = Double.valueOf(m.getText());
            if((ae.getSource()==simulate) && (num1 < 0 || num2 < 0)){
               JOptionPane.showMessageDialog(getContentPane(),"Negative Numbers Aren't Allowed !");
            }        

        else {
            Simulation a=new Simulation();
                float avgnum = a.avgnum(Integer.parseInt(l.getText()), Integer.parseInt(m.getText()));
                t1.setText(""+new DecimalFormat("#0.###").format(avgnum));
                
                
                float avgnumc = a.avgnumc(Integer.parseInt(l.getText()), Integer.parseInt(m.getText()));
                t2.setText(""+new DecimalFormat("#0.###").format(avgnumc));
                
                float avgtime = a.avgtime(Integer.parseInt(l.getText()), Integer.parseInt(m.getText()));
                t3.setText(""+new DecimalFormat("#0.###").format(avgtime));
                
                float avgtc = a.avgtc(Integer.parseInt(l.getText()), Integer.parseInt(m.getText()));
                t4.setText(""+new DecimalFormat("#0.###").format(avgtc));
                
                float utilf = a.utilf(Integer.parseInt(l.getText()), Integer.parseInt(m.getText()));
                t5.setText(""+new DecimalFormat("#0.###").format(utilf));
                
                
                
                float percutet = a.percutet(Integer.parseInt(l.getText()), Integer.parseInt(m.getText()));
                t6.setText(""+new DecimalFormat("#0.###").format(percutet));
               
                
            panel.setVisible(false);
            panel2.setVisible(true);
        }
        if(ae.getSource()== back){
            l.setText("");
            m.setText("");
            panel2.setVisible(false);
            panel.setVisible(true);
        }
    }
}

