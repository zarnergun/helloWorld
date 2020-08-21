import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculatrice extends JFrame{
    private JPanel container = new JPanel();
    String[] tab_chiffre = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "0"};
    String[] tab_operateur = {".", "C", "+", "-", "*", "/", "="};
    private double total;
    private String chiffreEnCours = "0";
    private String  operateur_actif = "";
    private JPanel pan = new JPanel();
    private JLabel ecran = new JLabel();
    private final JPanel chiffre = new JPanel();
    private final JPanel operateur = new JPanel();
    private final JPanel action = new JPanel();
    private Dimension dim = new Dimension(50, 40);
    private Dimension dim2 = new Dimension(50, 31);
    JButton[] tab_button_chiffre = new JButton[tab_chiffre.length];
    JButton[] tab_button_operateur = new JButton[tab_operateur.length];

    private void initIHM() {
        Font police = new Font("Arial", Font.BOLD, 20);
        ecran = new JLabel("0");
        ecran.setFont(police);
        ecran.setHorizontalAlignment(JLabel.RIGHT);
        ecran.setPreferredSize(new Dimension(220, 20));
        chiffre.setPreferredSize(new Dimension(165,200));
        operateur.setPreferredSize(new Dimension(55,200));
        JPanel panEcran = new JPanel();
        panEcran.setPreferredSize(new Dimension(220, 30));

        for(int i =0; i< tab_chiffre.length; i++) {
            tab_button_chiffre[i] = new JButton(tab_chiffre[i]);
            tab_button_chiffre[i].setPreferredSize(dim);
            tab_button_chiffre[i].addActionListener(new ChiffreListerner());
            chiffre.add(tab_button_chiffre[i]);
        }

        for(int i=0; i < tab_operateur.length; i++) {
            tab_button_operateur[i] = new JButton(tab_operateur[i]);
            tab_button_operateur[i].setPreferredSize(dim2);
            switch (i) {
                case 0:
                    // NOT IMPLEM
                    break;
                case 1:
                    tab_button_operateur[i] = new JButton(tab_operateur[i]);
                    tab_button_operateur[i].setBorder(new LineBorder(Color.DARK_GRAY));
                    tab_button_operateur[i].setPreferredSize(dim);
                    tab_button_operateur[i].addActionListener(new RemoveListener());
                    chiffre.add(tab_button_operateur[i]);
                    break;
                case 2:
                    tab_button_operateur[i] = new JButton(tab_operateur[i]);
                    tab_button_operateur[i].addActionListener(new PlusListener());
                    tab_button_operateur[i].setBorder(new LineBorder(Color.DARK_GRAY));
                    tab_button_operateur[i].setPreferredSize(dim);
                    operateur.add(tab_button_operateur[i]);
                    break;
                case 3:
                    tab_button_operateur[i] = new JButton(tab_operateur[i]);
                    tab_button_operateur[i].setBorder(new LineBorder(Color.DARK_GRAY));
                    tab_button_operateur[i].setPreferredSize(dim);
                    tab_button_operateur[i].addActionListener(new MinusListener());
                    operateur.add(tab_button_operateur[i]);
                    break;
                case 4:
                    tab_button_operateur[i] = new JButton(tab_operateur[i]);
                    tab_button_operateur[i].setBorder(new LineBorder(Color.DARK_GRAY));
                    tab_button_operateur[i].setPreferredSize(dim);
                    tab_button_operateur[i].addActionListener(new MultiListener());
                    operateur.add(tab_button_operateur[i]);
                    break;
                case 5:
                    tab_button_operateur[i] = new JButton(tab_operateur[i]);
                    tab_button_operateur[i].setBorder(new LineBorder(Color.DARK_GRAY));
                    tab_button_operateur[i].setPreferredSize(dim);
                    tab_button_operateur[i].addActionListener(new DivListener());
                    operateur.add(tab_button_operateur[i]);
                    break;
                case 6:
                    tab_button_operateur[i] = new JButton(tab_operateur[i]);
                    tab_button_operateur[i].setBorder(new LineBorder(Color.BLACK));
                    tab_button_operateur[i].setPreferredSize(dim);
                    tab_button_operateur[i].addActionListener(new EgalListener());
                    chiffre.add(tab_button_operateur[i]);
                    break;

            }
        }
        panEcran.add(ecran);
        panEcran.setBorder(BorderFactory.createLineBorder(Color.black));
        container.add(panEcran, BorderLayout.NORTH);
        container.add(chiffre, BorderLayout.CENTER);
        container.add(operateur, BorderLayout.WEST);

    }

    public Calculatrice(String titre) {
        this.setTitle(titre);
        this.setSize(230, 300);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pan.setBackground(Color.LIGHT_GRAY);
        initIHM();
        this.setContentPane(container);
        this.setVisible(true);
    }

    private class ChiffreListerner implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            String str = ((JButton)actionEvent.getSource()).getText();
            if(!chiffreEnCours.equals("0")) {
                chiffreEnCours+= str;
            }
            else {
                chiffreEnCours = str;
            }
            if(total != 0) {
                ecran.setText(total + " " + operateur_actif + " " + chiffreEnCours);
            }
            else {
                System.out.println("Total 0");
                if(operateur_actif.equals("-")) {
                    System.out.println("On est en négatif");
                    ecran.setText("-"+chiffreEnCours);
                }
                else {
                    ecran.setText(chiffreEnCours);
                }
            }
        }
    }

    private void calcul() {
        switch (operateur_actif) {
            case "" :
                if(!chiffreEnCours.equals("0")) {
                    total = Double.parseDouble(chiffreEnCours);
                    System.out.println("Départ du calcul : " + chiffreEnCours + " = " + total);
                }
                break;
            case "+" :
                total += Double.parseDouble(chiffreEnCours);
                System.out.println("Total apres addition : " + total);
                break;
            case "-" :
                total -= Double.parseDouble(chiffreEnCours);
                System.out.println("Total apres minus : " + total);
                break;
            case "*" :
                total *= Double.parseDouble(chiffreEnCours);
                System.out.println("Total apres multi : " + total);
                break;
            case "/" :
                total /= Double.parseDouble(chiffreEnCours);
                System.out.println("Total apres div : " + total);
                break;
        }
        chiffreEnCours = "0";
        System.out.println(operateur_actif);
    }

    private class EgalListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            calcul();
            operateur_actif="";
            ecran.setText(String.valueOf(total));
        }
    }

    private class PlusListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            System.out.println("-- addition --");
            if(!operateur_actif.equals("")) {
                calcul();
                operateur_actif = "+";

            }
            else {
                calcul();
                operateur_actif = "+";
            }
            ecran.setText(total + " " + operateur_actif + " " + chiffreEnCours);
        }
    }

    private class MinusListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            System.out.println("-- soustraction --");
            if(!operateur_actif.equals("")) {
                calcul();
                operateur_actif = "-";

            }
            else {
                calcul();
                operateur_actif = "-";
            }
            ecran.setText(total + " " + operateur_actif + " " + chiffreEnCours);
        }
    }

    private class MultiListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            System.out.println("-- multi --");
            if(!operateur_actif.equals("")) {
                calcul();
                operateur_actif = "*";

            }
            else {
                calcul();
                operateur_actif = "*";
            }
            ecran.setText(total + " " + operateur_actif + " " + chiffreEnCours);
        }
    }

    private class DivListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            System.out.println("-- multi --");
            if(!operateur_actif.equals("")) {
                calcul();
                operateur_actif = "/";

            }
            else {
                calcul();
                operateur_actif = "/";
            }
            ecran.setText(total + " " + operateur_actif + " " + chiffreEnCours);
        }
    }

    private class RemoveListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            chiffreEnCours = "0";
            total = 0;
            operateur_actif = "";
            ecran.setText("0");
        }
    }
}
