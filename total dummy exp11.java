package exp11;
import java.util.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Line2D;
import javax.swing.*;
import javax.sql.*;

public class Exp11 {

    public static void main(String[] args) {
       
        new hm();
    }
   
}

class hm
{
    JFrame f;
    JButton u,a;
    JLabel l;
   
    hm()
    {
        f = new JFrame();
        f.setTitle("Front Page");
        f.setSize(500,500);
        f.getContentPane().setBackground(Color.BLACK);
               
        l = new JLabel("ONLINE BOOK STORE");
        l.setFont(new Font("Bahnschrift",Font.BOLD, 25));
        l.setForeground(Color.WHITE);
        l.setBounds(120, 100, 300, 50);
       

        u = new JButton("For Users");
        u.setBounds(150,200,200,50);
        u.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                new usp();
                f.setVisible(false);
            }            
        });
       
        a = new JButton("For Admins");
        a.setBounds(150,300,200,50);
        a.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                new asp();
                f.setVisible(false);
            }            
        });
       
        f.setVisible(true);
        f.setLayout(null);
        f.add(u);
        
        f.add(l);
        f.add(a);
        f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
       
    }
}

class usp
{
    //sl sql = new sl();
    JFrame f;
    JLabel b,a,t;
    JButton h,bd,ba;
    JComboBox c;
    JTable tb;
    JPanel p1,p2;
    usp()
    {
        f = new JFrame();
        f.setSize(500,500);
        f.getContentPane().setBackground(Color.BLACK);
       
        h = new JButton("HOME");
        h.setFont(new Font("Bahnschrift",Font.BOLD, 10));
        h.setBounds(15, 15, 75, 35);
        h.setForeground(Color.BLACK);
        h.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                new hm();
                f.setVisible(false);
            }            
        });
        
        p1 = new JPanel();
        p1.setBounds(0,60,700,2);
        p2 = new JPanel();
        p2.setBounds(0,65,700,3);
        
        t = new JLabel("ONLINE BOOK STORE");
        t.setFont(new Font("Bahnschrift",Font.BOLD, 25));
        t.setBounds(150, 10, 300, 50);
        t.setForeground(Color.WHITE);
       
        b = new JLabel("Book Details :- ");
        b.setBounds(50, 110, 200, 50);
        b.setForeground(Color.WHITE);
        b.setFont(new Font("Bahnschrift",Font.BOLD, 20));
        
        bd = new JButton("Show Details");
        bd.setBounds(50, 160, 150, 30);
        bd.setForeground(Color.BLACK);
        bd.setFont(new Font("Bahnschrift",Font.BOLD, 15));
        bd.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                //sql.dip();
                new disptab();
            }
        });
        
        tb = new JTable();
       
        a = new JLabel("Author of    :    ");
        a.setBounds(50, 250, 200, 50);
        a.setForeground(Color.WHITE);
        a.setFont(new Font("Bahnschrift",Font.BOLD, 20));
       
        c = new JComboBox();
        c.setBounds(180, 263, 175, 20);
        
        ba = new JButton("Show Details");
        ba.setBounds(50, 300, 150, 30);
        ba.setForeground(Color.BLACK);
        ba.setFont(new Font("Bahnschrift",Font.BOLD, 15));
        ba.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                //sql.dip();
                new disptab2();
            }
        });
       
        f.setTitle("User page");
        f.setVisible(true);
        f.setLayout(null);
        f.add(t);
        f.add(p1);
        f.add(p2);
        f.add(b);
        f.add(h);
        f.add(ba);
        f.add(bd);
        f.add(c);
        f.add(a);
        f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
    }
}

class asp
{
    sl sql = new sl();
    int smp = 0;
   JFrame f;
   JButton h,ib,ub,db;
   JLabel t,i,u,it,ii,ip,iq,ia;
   JLabel ui,up,ut,uq,info,infod,infou;
   JPanel p1,p2,p3,u1,u2,u3,u4;
   JComboBox ct,ci;
   JTextField ti,tt,tp,tq,ta;
   JTextField pu,pq;
    asp()
    {
       f = new JFrame();
       f.setSize(700,700);
       f.getContentPane().setBackground(Color.BLACK);
       
       h = new JButton("HOME");
       h.setFont(new Font("Bahnschrift",Font.BOLD, 10));
       h.setBounds(15, 10, 75, 35);
       h.setForeground(Color.BLACK);
       h.addActionListener(new ActionListener()
       {
           public void actionPerformed(ActionEvent e)
           {
               new hm();
               f.setVisible(false);
           }            
       });
       
       p1 = new JPanel();
       p1.setBounds(0,60,700,2);
       p2 = new JPanel();
       p2.setBounds(0,65,700,3);
       
       u = new JLabel("Update a Book");
       u.setFont(new Font("Bahnschrift",Font.BOLD, 20));
       u.setBounds(25, 80, 150, 30);
       u.setForeground(Color.WHITE);
       u1 = new JPanel();
       u1.setBounds(23,102,143,2);
       u3 = new JPanel();
       u3.setBounds(23,105,143,2);
       
       p3 = new JPanel();
       p3.setBounds(100,385,500,1);
       
       ut = new JLabel("Select Title : ");
       ut.setFont(new Font("Bahnschrift",Font.BOLD, 15));
       ut.setBounds(25, 125, 150, 30);
       ut.setForeground(Color.WHITE);
       
       ct = new JComboBox();
       ct.setFont(new Font("Bahnschrift",Font.BOLD, 15));
       ct.setBounds(175, 130, 200, 20);
       ct.setForeground(Color.BLACK);
       
       up = new JLabel("Enter Price : ");
       up.setFont(new Font("Bahnschrift",Font.BOLD, 15));
       up.setBounds(25, 175, 150, 30);
       up.setForeground(Color.WHITE);
       
       pu = new JTextField();
       pu.setFont(new Font("Bahnschrift",Font.BOLD, 15));
       pu.setBounds(175, 180, 150, 20);
       pu.setForeground(Color.BLACK);
       
       uq = new JLabel("Enter Quantity : ");
       uq.setFont(new Font("Bahnschrift",Font.BOLD, 15));
       uq.setBounds(340, 175, 150, 30);
       uq.setForeground(Color.WHITE);
       
       pq = new JTextField();
       pq.setFont(new Font("Bahnschrift",Font.BOLD, 15));
       pq.setBounds(490, 180, 150, 20);
       pq.setForeground(Color.BLACK);
       
       ub = new JButton("Update Data");
       ub.setFont(new Font("Bahnschrift",Font.BOLD, 15));
       ub.setBounds(175, 225, 305, 30);
       ub.setForeground(Color.BLACK);
       infou = new JLabel("Book Successfully Updated");
       infou.setBounds(270, 255, 305, 20);
       infou.setFont(new Font("Bahnschrift",Font.BOLD, 10));
       infou.setForeground(Color.YELLOW);
       infou.setVisible(false);
       ub.addActionListener(new ActionListener()
       {
           public void actionPerformed(ActionEvent ae)
           {
               int sq;
               double sp;
               String t,p,q;
               //t = ct.getText();
               p = pu.getText();
               q = pq.getText();
               sq = Integer.parseInt(q);
               sp = Double.parseDouble(p);
               infou.setVisible(true);
               //System.out.print(" "+sq+" "+sp);
           }
       });
       
       ui = new JLabel("Select ID : ");
       ui.setFont(new Font("Bahnschrift",Font.BOLD, 15));
       ui.setBounds(25, 275, 150, 30);
       ui.setForeground(Color.WHITE);
       
       ci = new JComboBox();
       ci.setFont(new Font("Bahnschrift",Font.BOLD, 15));
       ci.setBounds(175, 280, 200, 20);
       ci.setForeground(Color.BLACK);       
       
       
       db = new JButton("Delete Book");
       db.setFont(new Font("Bahnschrift",Font.BOLD, 15));
       db.setBounds(175, 325, 305, 30);
       db.setForeground(Color.BLACK);
       infod = new JLabel("Book Successfully Deleted");
       infod.setBounds(270, 355, 305, 20);
       infod.setFont(new Font("Bahnschrift",Font.BOLD, 10));
       infod.setForeground(Color.YELLOW);
       infod.setVisible(false);
       db.addActionListener(new ActionListener()
       {
           public void actionPerformed(ActionEvent ae)
           {
               infod.setVisible(true);
           }
       });
       
       i = new JLabel("Add a Book");
       i.setFont(new Font("Bahnschrift",Font.BOLD, 20));
       i.setBounds(25, 400, 150, 30);
       i.setForeground(Color.WHITE); 
       u2 = new JPanel();
       u2.setBounds(23,422,110,2);
       u4 = new JPanel();
       u4.setBounds(23,425,110,2);
       
       t = new JLabel("ONLINE BOOK STORE");
       t.setFont(new Font("Bahnschrift",Font.BOLD, 25));
       t.setBounds(200, 15, 300, 50);
       t.setForeground(Color.WHITE);
       
       ii = new JLabel("Enter Book ID : ");
       ii.setFont(new Font("Bahnschrift",Font.BOLD, 15));
       ii.setBounds(25, 455, 150, 30);
       ii.setForeground(Color.WHITE);
       
       ti = new JTextField();
       ti.setFont(new Font("Bahnschrift",Font.BOLD, 15));
       ti.setBounds(175, 460, 150, 20);
       ti.setForeground(Color.BLACK);
       
       it = new JLabel("Enter Book Title : ");
       it.setFont(new Font("Bahnschrift",Font.BOLD, 15));
       it.setBounds(25, 505, 150, 30);
       it.setForeground(Color.WHITE);
       
       tt = new JTextField();
       tt.setFont(new Font("Bahnschrift",Font.BOLD, 15));
       tt.setBounds(175, 510, 150, 20);
       tt.setForeground(Color.BLACK);
       
       ia = new JLabel("Enter Book Author : ");
       ia.setFont(new Font("Bahnschrift",Font.BOLD, 15));
       ia.setBounds(25, 555, 150, 30);
       ia.setForeground(Color.WHITE);
       
       ta = new JTextField();
       ta.setFont(new Font("Bahnschrift",Font.BOLD, 15));
       ta.setBounds(175, 560, 150, 20);
       ta.setForeground(Color.BLACK);
       
       ip = new JLabel("Enter Book Price : ");
       ip.setFont(new Font("Bahnschrift",Font.BOLD, 15));
       ip.setBounds(340, 455, 150, 30);
       ip.setForeground(Color.WHITE);
       
       tp = new JTextField();
       tp.setFont(new Font("Bahnschrift",Font.BOLD, 15));
       tp.setBounds(495, 460, 150, 20);
       tp.setForeground(Color.BLACK);
       
       iq = new JLabel("Enter Book Quantity : ");
       iq.setFont(new Font("Bahnschrift",Font.BOLD, 15));
       iq.setBounds(340, 505, 160, 30);
       iq.setForeground(Color.WHITE);
       
       tq = new JTextField();
       tq.setFont(new Font("Bahnschrift",Font.BOLD, 15));
       tq.setBounds(495, 510, 150, 20);
       tq.setForeground(Color.BLACK);
       
       ib = new JButton("Add the Book");
       ib.setFont(new Font("Bahnschrift",Font.BOLD, 15));
       ib.setBounds(340, 555, 305, 30);
       ib.setForeground(Color.BLACK);
       info = new JLabel("Book Successfully Added");
       info.setBounds(440, 585, 305, 20);
       info.setFont(new Font("Bahnschrift",Font.BOLD, 10));
       info.setForeground(Color.YELLOW);
       info.setVisible(false);
       ib.addActionListener(new ActionListener()
       {
           public void actionPerformed(ActionEvent ae)
           {
               int si,sq;
               double sp;
               String t,a,i,p,q;
               t = tt.getText();
               a = ta.getText();
               i = ti.getText();
               p = tp.getText();
               q = tq.getText();
               si = Integer.parseInt(i);
               sq = Integer.parseInt(q);
               sp = Double.parseDouble(p);
               String[][] stp = new String[1][5];
                    stp[0][0] = i;
                    stp[0][1] = t;
                    stp[0][2] = a;
                    stp[0][3] = p;
                    stp[0][4] = q;
                    
                    sql.toq(stp,smp);
                    smp = smp+1;
               info.setVisible(true);
               
               //System.out.print(si);
           }
       });
       
       f.setTitle("Admins page");
       f.setVisible(true);
       f.setLayout(null);
       f.add(t);
       f.add(h);
       f.add(p3);
       f.add(u);
       f.add(p1);
       f.add(u1);
       f.add(u2);
       f.add(ii);
       f.add(it);
       f.add(ti);
       f.add(tt);
       f.add(ta);
       f.add(tp);
       f.add(tq);
       f.add(ct);
       f.add(ub);
       f.add(ia);
       f.add(ip);
       f.add(iq);
       f.add(pu);
       f.add(pq);
       f.add(ib);
       f.add(u3);
       f.add(ci);
       f.add(infou);
       f.add(infod);
       f.add(db);
       f.add(info);
       f.add(u4);
       f.add(p2);
       f.add(ut);
       f.add(up);
       f.add(uq);
       f.add(ui);
       f.add(i);
       f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
    }
}

class sl
{
   String[][] sql = new String[50][5]; 
   int t;
   void toq(String s[][],int i)
   {                t=i;
       
                
                     sql[i][0] = s[0][0];
                     //System.out.println(sql[i][0]);
                     sql[i][1] = s[0][1];
                     //System.out.println(sql[i][1]);
                     sql[i][2] = s[0][2];
                     //System.out.println(sql[i][2]);
                     sql[i][3] = s[0][3];
                     //System.out.println(sql[i][3]);
                     sql[i][4] = s[0][4];
                     for(int j=0;j<5;j++)
                        System.out.println(sql[i][j]);

   }
   
   void dip()
   {
       //new disptab(sql,t);
   }
   
}

class disptab 
{    
    JFrame f;    
    //disptab(String d[][],int i)
    disptab()
    {    
    f=new JFrame();    
    String data[][]={ {"101","Ram in Leelaigal","Mr.Rambo","269.0","28"},{"102","Muthu Sagasangal","Varamban","420.0","19"},    
                          {"104","Ashoka Banthu","Mr.Rambo","499.0","8"}};    
    String column[]={"ID","TITLE","AUTHOR","PRICE","QUANTITY"};         
    JTable jt=new JTable(data,column);    
    jt.setBounds(30,40,200,300);          
    jt.setBackground(Color.BLACK);
    jt.setForeground(Color.WHITE);
    JScrollPane sp=new JScrollPane(jt);   
    sp.setBackground(Color.BLACK);  
    f.add(sp);          
    f.setSize(500,400);    
    f.setVisible(true);    
    }
}

class disptab2 
{    
    JFrame f;    
    //disptab(String d[][],int i)
    disptab2()
    {    
    f=new JFrame();    
    String data[][]={ {"101","Ram in Leelaigal","Mr.Rambo","269.0","28"},    
                          {"104","Ashoka Banthu","Mr.Rambo","499.0","8"}};    
    String column[]={"ID","TITLE","AUTHOR","PRICE","QUANTITY"};         
    JTable jt=new JTable(data,column);    
    jt.setBounds(30,40,200,300);          
    jt.setBackground(Color.BLACK);
    jt.setForeground(Color.WHITE);
    JScrollPane sp=new JScrollPane(jt);   
    sp.setBackground(Color.BLACK);
    f.add(sp);          
    f.setSize(500,400);    
    f.setVisible(true);    
    }
}