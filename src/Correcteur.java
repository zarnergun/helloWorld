import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.*;

class readTxtFile implements Callable<Map<Character, ArrayList<String>>> {
    String mot = "";
    String listeEnA = "";
    ArrayList<String> lesMotsEnA  = new ArrayList();
    ArrayList<String> lesMotsEnB  = new ArrayList();
    ArrayList<String> lesMotsEnC  = new ArrayList();
    ArrayList<String> lesMotsEnD  = new ArrayList();
    ArrayList<String> lesMotsEnE  = new ArrayList();
    ArrayList<String> lesMotsEnF  = new ArrayList();
    ArrayList<String> lesMotsEnG  = new ArrayList();
    ArrayList<String> lesMotsEnH  = new ArrayList();
    ArrayList<String> lesMotsEnI  = new ArrayList();
    ArrayList<String> lesMotsEnJ  = new ArrayList();
    ArrayList<String> lesMotsEnK  = new ArrayList();
    ArrayList<String> lesMotsEnL  = new ArrayList();
    ArrayList<String> lesMotsEnM  = new ArrayList();
    ArrayList<String> lesMotsEnN  = new ArrayList();
    ArrayList<String> lesMotsEnO  = new ArrayList();
    ArrayList<String> lesMotsEnP  = new ArrayList();
    ArrayList<String> lesMotsEnQ  = new ArrayList();
    ArrayList<String> lesMotsEnR  = new ArrayList();
    ArrayList<String> lesMotsEnS  = new ArrayList();
    ArrayList<String> lesMotsEnT  = new ArrayList();
    ArrayList<String> lesMotsEnU  = new ArrayList();
    ArrayList<String> lesMotsEnV  = new ArrayList();
    ArrayList<String> lesMotsEnW  = new ArrayList();
    ArrayList<String> lesMotsEnX  = new ArrayList();
    ArrayList<String> lesMotsEnY  = new ArrayList();
    ArrayList<String> lesMotsEnZ  = new ArrayList();

    @Override
    public Map<Character, ArrayList<String>> call() {
        String s;
        Map<Character, ArrayList<String>> listeDesMotsParLettre = new HashMap<>();
        int count = 0;
        try {
            Scanner input = new Scanner("dico.txt");
            File file = new File(input.nextLine());
            input = new Scanner(file);
            while (input.hasNextLine()) {
                count++;
                    mot = input.nextLine();
                        if(mot.startsWith("a")) { lesMotsEnA.add(mot); }
                        if(mot.startsWith("b")) {lesMotsEnB.add(mot); }
                        if(mot.startsWith("c")) {lesMotsEnC.add(mot); }
                        if(mot.startsWith("d")) {lesMotsEnD.add(mot); }
                        if(mot.startsWith("e")) {lesMotsEnE.add(mot); }
                        if(mot.startsWith("f")) {lesMotsEnF.add(mot); }
                        if(mot.startsWith("g")) {lesMotsEnG.add(mot); }
                        if(mot.startsWith("h")) {lesMotsEnH.add(mot); }
                        if(mot.startsWith("i")) {lesMotsEnI.add(mot); }
                        if(mot.startsWith("j")) {lesMotsEnJ.add(mot); }
                        if(mot.startsWith("k")) {lesMotsEnK.add(mot); }
                        if(mot.startsWith("l")) {lesMotsEnL.add(mot); }
                        if(mot.startsWith("m")) {lesMotsEnM.add(mot); }
                        if(mot.startsWith("n")) {lesMotsEnN.add(mot); }
                        if(mot.startsWith("o")) {lesMotsEnO.add(mot); }
                        if(mot.startsWith("p")) {lesMotsEnP.add(mot); }
                        if(mot.startsWith("q")) {lesMotsEnQ.add(mot); }
                        if(mot.startsWith("r")) {lesMotsEnR.add(mot); }
                        if(mot.startsWith("s")) {lesMotsEnS.add(mot); }
                        if(mot.startsWith("t")) {lesMotsEnT.add(mot); }
                        if(mot.startsWith("u")) {lesMotsEnU.add(mot); }
                        if(mot.startsWith("v")) {lesMotsEnV.add(mot); }
                        if(mot.startsWith("w")) {lesMotsEnW.add(mot); }
                        if(mot.startsWith("x")) {lesMotsEnX.add(mot); }
                        if(mot.startsWith("y")) {lesMotsEnY.add(mot); }
                        if(mot.startsWith("z")) {lesMotsEnZ.add(mot); }
                        System.out.println(mot);
                }
                input.close();
            System.out.println(count);
        }
        catch (Exception e){//Catch exception if any
            System.err.println("Error try: " + e.getMessage());
        }

        listeDesMotsParLettre.put('a', lesMotsEnA);
        listeDesMotsParLettre.put('b',lesMotsEnB);
        listeDesMotsParLettre.put('c',lesMotsEnC);
        listeDesMotsParLettre.put('d',lesMotsEnD);
        listeDesMotsParLettre.put('e',lesMotsEnE);
        listeDesMotsParLettre.put('f',lesMotsEnF);
        listeDesMotsParLettre.put('g',lesMotsEnG);
        listeDesMotsParLettre.put('h',lesMotsEnH);
        listeDesMotsParLettre.put('i',lesMotsEnI);
        listeDesMotsParLettre.put('j',lesMotsEnJ);
        listeDesMotsParLettre.put('k',lesMotsEnK);
        listeDesMotsParLettre.put('l',lesMotsEnL);
        listeDesMotsParLettre.put('m',lesMotsEnM);
        listeDesMotsParLettre.put('n',lesMotsEnN);
        listeDesMotsParLettre.put('o',lesMotsEnO);
        listeDesMotsParLettre.put('p',lesMotsEnP);
        listeDesMotsParLettre.put('q',lesMotsEnQ);
        listeDesMotsParLettre.put('r',lesMotsEnR);
        listeDesMotsParLettre.put('s',lesMotsEnS);
        listeDesMotsParLettre.put('t',lesMotsEnT);
        listeDesMotsParLettre.put('u',lesMotsEnU);
        listeDesMotsParLettre.put('v',lesMotsEnV);
        listeDesMotsParLettre.put('w',lesMotsEnW);
        listeDesMotsParLettre.put('x',lesMotsEnX);
        listeDesMotsParLettre.put('y',lesMotsEnY);
        listeDesMotsParLettre.put('z',lesMotsEnZ);
        return listeDesMotsParLettre;
    }
}

public class Correcteur extends JFrame {

    JPanel container = new JPanel();
    JTextArea fieldText = new JTextArea();
    ExecutorService executorService = new ThreadPoolExecutor(1, 1, 1000,
            TimeUnit.SECONDS, new LinkedBlockingQueue<Runnable>());


    private void initIHM() {
        fieldText.setPreferredSize(new Dimension(400,300));
        fieldText.setBorder(BorderFactory.createRaisedBevelBorder());
        container.add(fieldText);
    }

    public Correcteur() throws ExecutionException, InterruptedException {
        this.setTitle("Correcteur");
        this.setSize(500, 350);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        initIHM();
        readTxtFile taskDico = new readTxtFile();
        Future<Map<Character, ArrayList<String>>> future = executorService.submit(taskDico);
        Map<Character, ArrayList<String>> listeDesMots = future.get();
        fieldText.setText(String.valueOf(listeDesMots.get('h').get(5)));

        this.setContentPane(container);
        this.setVisible(true);
    }
}
