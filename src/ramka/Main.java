package ramka;

import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {

    public Main() {


        //super("Układ graficzny (Layout)");
        this.setBounds(300,320,300,200);

        initComponents();
        this.pack();

        this.setDefaultCloseOperation(3);



/*        // centrowanie ramki
        int szer = Toolkit.getDefaultToolkit().getScreenSize().width;
        int wys = Toolkit.getDefaultToolkit().getScreenSize().height;

        this.setSize(szer/2, wys/2);
        //this.setLocation(szer/4, wys/4);
        int szerRamki = this.getSize().width;
        int wysRamki = this.getSize().height;
        this.setLocation((szer-szerRamki)/2,(wys-wysRamki)/2);

        this.setDefaultCloseOperation(3);*/




       //zrobienie ramki
/*        JFrame frame = new JFrame("Ramka opcja 1");//1 sposób tytułu ramki
       // frame.setTitle("Ramka 2 opcja");// 2 sposób na tytuł Ramki

        frame.setSize(100,100);// 1 opcja wymiarów
       // frame.setSize(new Dimension(100,100)); // 2 opcja wymiarów

       // frame.setLocation(100,50); /// oś x dziła po poziomie i np 100 idzie w prawą stronę , y + leci w dół ramka , y - do góry na odwrót niż w matematyce
       // frame.setLocation(new Point(100,50)); /// 2 opcja

        frame.setBounds(100,50,100,100); // ustaw granice naszej ramki

        frame.setResizable(true); // ustawia żeby nie można było poruszać naszą ramką // true daje możliwość //false nie daje możiliwości

        frame.setIconImage(Toolkit.getDefaultToolkit().getImage("apka.jpeg"));




        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//1 sposób
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);//2 sposób
        frame.setDefaultCloseOperation(3);//3 sposób
        frame.setVisible(true);

        super("tytuł ramki");

        this.setBounds(100,50,300,100);
        this.setDefaultCloseOperation(3);

        this.pack();*/
    }

    public void initComponents(){
        button1.setPreferredSize(new Dimension(100,100));
        button2.setPreferredSize(button2.getPreferredSize());
        panel1.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
        panel1.add(button1);
        panel1.add(button2);
        panel1.add(button3);
        panel1.add(button4);

        this.getContentPane().add(panel1, BorderLayout.PAGE_START);



       /* centrum = new JButton("anuluj");
        up = new JButton("jestem u góry");
        down = new JButton("jestem na dole");
        left = new JButton("jestem z lewej");
        right = new JButton("jestem z prawej");

        Container kontener = this.getContentPane(); // kontent szybki czyli gdzie ma być button*/

        // 1 opcja przycisków
       /* kontener.add(centrum, BorderLayout.CENTER);// dodanie przycisku
        kontener.add(up,BorderLayout.PAGE_START);
        kontener.add(down,BorderLayout.PAGE_END);
        kontener.add(left,BorderLayout.WEST);
        kontener.add(right,BorderLayout.EAST);*/

/*       // 2 opcja przycisków gdzie mogę sam układać gdzie ma się coś znajdować
        centrum.setLocation(215,135);
        centrum.setSize(centrum.getPreferredSize());
        kontener.setLayout(null);
        kontener.add(centrum);*/
    }

    JPanel panel1 = new JPanel(new FlowLayout(FlowLayout.LEADING)); // panele służa nam do grupowania naszych elementów
    JButton button1 = new JButton("Button 1");
    JButton button2 = new JButton("Button 2");
    JButton button3 = new JButton("Button 3");
    JButton button4 = new JButton("Button 4");


/*
    JButton centrum;
    JButton up;
    JButton down;
    JButton left;
    JButton right;
*/


    public static void main(String[] args) throws Exception {
/*        User user1= new User();
        user1.setMail("mail@pl.pl");
        user1.setDateOfBirthday("2001-04-27");
        user1.setNumber("+48976567456");
        user1.setName("Mateusz");
        user1.setSurname("Jamka");
        System.out.println("Usera 1 dane to:"+" "+user1.getName()+" "+user1.getSurname()+" "+user1.getAge()+" "+user1.getDateOfBirthday());

        Pojazd p1= new Pojazd(200,7,61,4);
        System.out.println("Średnie spalanie na 100 km to :" +" "+p1.mileAge(7,100));

        Car c1=new Car(200,8,61,4,450,200,250);
        System.out.println("BMW model 320D czas wyścigu to :"+" "+c1.timeOfRace(200,250));

        Moto m1= new Moto(500,10,30,2,150,3);
        System.out.println("Siła działająca na motor :"+ " "+m1.acceleration(150,3));*/
        new Main().setVisible(true);

    }
}