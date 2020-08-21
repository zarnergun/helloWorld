import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

public class readTxtFile() implements Runnable {
    String mot = "";
    @Override
    public void run() {

    }
}

public class Correcteur extends JFrame {

    ArrayList<String> lesMotsenA = new ArrayList<String>();
    JPanel container = new JPanel();
    JTextArea fieldText = new JTextArea();
    String listeEnA = "";

        private void readTxtFile()  {
            String s;
            try {
                FileReader fr = new FileReader("dico.txt");
                BufferedReader br = new BufferedReader(fr);
                while ((s = br.readLine()) != null) {

                    Scanner scan = new Scanner(s);
                    while (scan.hasNext()) {
                        mot = scan.next().toLowerCase();
                        if(mot.startsWith("a")) {
                            lesMotsenA.add(mot);
                            listeEnA += " "+ mot;
                        }
                        else {
                            System.out.println("sortie de scan");
                            break;
                        }
                    }
                }
                //Scanner file = new Scanner(new File("dico.txt")).useDelimiter(Pattern.compile("[\\r\\n;]+"));

                br.close();
                fr.close();
                fieldText.setText(listeEnA);

            }
            catch (Exception e){//Catch exception if any
                System.err.println("Error: " + e.getMessage());
            }
        }

    private void initIHM() {
        fieldText.setPreferredSize(new Dimension(400,300));
        fieldText.setBorder(BorderFactory.createRaisedBevelBorder());
        container.add(fieldText);
    }

    public Correcteur() throws IOException {
        this.setTitle("Correcteur");
        this.setSize(500, 350);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        initIHM();
        readTxtFile();
        this.setContentPane(container);
        this.setVisible(true);
    }
}
