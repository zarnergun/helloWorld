import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;
import java.io.File;
import java.util.*;
import java.util.concurrent.*;

class checkMotExiste implements Callable<Boolean> {
    private String mot;
    private Map<Character, ArrayList<String>> listeMots = new HashMap();

    public checkMotExiste(String mot, Map<Character, ArrayList<String>> listeMots) {
        this.mot = mot.toLowerCase();
        this.listeMots = listeMots;
    }

    @Override
    public Boolean call() {
        for (char c = 'a'; c <= 'z'; ++c) {
            if (mot.startsWith(String.valueOf(c))) {
                return listeMots.get(c).contains(mot);
            }
        }
        return false;
    }
}

class readTxtFile implements Callable<Map<Character, ArrayList<String>>> {
    String mot = "";
    String listeEnA = "";
    ArrayList<String> lesMotsEnA = new ArrayList<String>();
    ArrayList<String> lesMotsEnB = new ArrayList<String>();
    ArrayList<String> lesMotsEnC = new ArrayList<String>();
    ArrayList<String> lesMotsEnD = new ArrayList<String>();
    ArrayList<String> lesMotsEnE = new ArrayList<String>();
    ArrayList<String> lesMotsEnF = new ArrayList<String>();
    ArrayList<String> lesMotsEnG = new ArrayList<String>();
    ArrayList<String> lesMotsEnH = new ArrayList<String>();
    ArrayList<String> lesMotsEnI = new ArrayList<String>();
    ArrayList<String> lesMotsEnJ = new ArrayList<String>();
    ArrayList<String> lesMotsEnK = new ArrayList<String>();
    ArrayList<String> lesMotsEnL = new ArrayList<String>();
    ArrayList<String> lesMotsEnM = new ArrayList<String>();
    ArrayList<String> lesMotsEnN = new ArrayList<String>();
    ArrayList<String> lesMotsEnO = new ArrayList<String>();
    ArrayList<String> lesMotsEnP = new ArrayList<String>();
    ArrayList<String> lesMotsEnQ = new ArrayList<String>();
    ArrayList<String> lesMotsEnR = new ArrayList<String>();
    ArrayList<String> lesMotsEnS = new ArrayList<String>();
    ArrayList<String> lesMotsEnT = new ArrayList<String>();
    ArrayList<String> lesMotsEnU = new ArrayList<String>();
    ArrayList<String> lesMotsEnV = new ArrayList<String>();
    ArrayList<String> lesMotsEnW = new ArrayList<String>();
    ArrayList<String> lesMotsEnX = new ArrayList<String>();
    ArrayList<String> lesMotsEnY = new ArrayList<String>();
    ArrayList<String> lesMotsEnZ = new ArrayList<String>();

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
                if (mot.startsWith("a")) {
                    lesMotsEnA.add(mot);
                }
                if (mot.startsWith("b")) {
                    lesMotsEnB.add(mot);
                }
                if (mot.startsWith("c")) {
                    lesMotsEnC.add(mot);
                }
                if (mot.startsWith("d")) {
                    lesMotsEnD.add(mot);
                }
                if (mot.startsWith("e")) {
                    lesMotsEnE.add(mot);
                }
                if (mot.startsWith("f")) {
                    lesMotsEnF.add(mot);
                }
                if (mot.startsWith("g")) {
                    lesMotsEnG.add(mot);
                }
                if (mot.startsWith("h")) {
                    lesMotsEnH.add(mot);
                }
                if (mot.startsWith("i")) {
                    lesMotsEnI.add(mot);
                }
                if (mot.startsWith("j")) {
                    lesMotsEnJ.add(mot);
                }
                if (mot.startsWith("k")) {
                    lesMotsEnK.add(mot);
                }
                if (mot.startsWith("l")) {
                    lesMotsEnL.add(mot);
                }
                if (mot.startsWith("m")) {
                    lesMotsEnM.add(mot);
                }
                if (mot.startsWith("n")) {
                    lesMotsEnN.add(mot);
                }
                if (mot.startsWith("o")) {
                    lesMotsEnO.add(mot);
                }
                if (mot.startsWith("p")) {
                    lesMotsEnP.add(mot);
                }
                if (mot.startsWith("q")) {
                    lesMotsEnQ.add(mot);
                }
                if (mot.startsWith("r")) {
                    lesMotsEnR.add(mot);
                }
                if (mot.startsWith("s")) {
                    lesMotsEnS.add(mot);
                }
                if (mot.startsWith("t")) {
                    lesMotsEnT.add(mot);
                }
                if (mot.startsWith("u")) {
                    lesMotsEnU.add(mot);
                }
                if (mot.startsWith("v")) {
                    lesMotsEnV.add(mot);
                }
                if (mot.startsWith("w")) {
                    lesMotsEnW.add(mot);
                }
                if (mot.startsWith("x")) {
                    lesMotsEnX.add(mot);
                }
                if (mot.startsWith("y")) {
                    lesMotsEnY.add(mot);
                }
                if (mot.startsWith("z")) {
                    lesMotsEnZ.add(mot);
                }
            }
            input.close();
            System.out.println(count);
        } catch (Exception e) {//Catch exception if any
            System.err.println("Error try: " + e.getMessage());
        }

        listeDesMotsParLettre.put('a', lesMotsEnA);
        listeDesMotsParLettre.put('b', lesMotsEnB);
        listeDesMotsParLettre.put('c', lesMotsEnC);
        listeDesMotsParLettre.put('d', lesMotsEnD);
        listeDesMotsParLettre.put('e', lesMotsEnE);
        listeDesMotsParLettre.put('f', lesMotsEnF);
        listeDesMotsParLettre.put('g', lesMotsEnG);
        listeDesMotsParLettre.put('h', lesMotsEnH);
        listeDesMotsParLettre.put('i', lesMotsEnI);
        listeDesMotsParLettre.put('j', lesMotsEnJ);
        listeDesMotsParLettre.put('k', lesMotsEnK);
        listeDesMotsParLettre.put('l', lesMotsEnL);
        listeDesMotsParLettre.put('m', lesMotsEnM);
        listeDesMotsParLettre.put('n', lesMotsEnN);
        listeDesMotsParLettre.put('o', lesMotsEnO);
        listeDesMotsParLettre.put('p', lesMotsEnP);
        listeDesMotsParLettre.put('q', lesMotsEnQ);
        listeDesMotsParLettre.put('r', lesMotsEnR);
        listeDesMotsParLettre.put('s', lesMotsEnS);
        listeDesMotsParLettre.put('t', lesMotsEnT);
        listeDesMotsParLettre.put('u', lesMotsEnU);
        listeDesMotsParLettre.put('v', lesMotsEnV);
        listeDesMotsParLettre.put('w', lesMotsEnW);
        listeDesMotsParLettre.put('x', lesMotsEnX);
        listeDesMotsParLettre.put('y', lesMotsEnY);
        listeDesMotsParLettre.put('z', lesMotsEnZ);
        return listeDesMotsParLettre;
    }
}

class Correcteur extends JFrame {

    JPanel container = new JPanel();
    JTextArea fieldText = new JTextArea();
    JTextArea correctField = new JTextArea();
    Map<Character, ArrayList<String>> listeDesMots = new HashMap<>();
    ExecutorService executorService = new ThreadPoolExecutor(1, 1, 1000,
            TimeUnit.SECONDS, new LinkedBlockingQueue<Runnable>());

    public Correcteur() throws ExecutionException, InterruptedException {
        this.setTitle("Correcteur");
        this.setSize(500, 350);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        initIHM();
        readTxtFile taskDico = new readTxtFile();
        Future<Map<Character, ArrayList<String>>> future = executorService.submit(taskDico);
        listeDesMots = future.get();

        this.setContentPane(container);
        this.setVisible(true);
    }

    static int calculLevenshtien(String x, String y) {
        int[][]dp = new int[x.length() + 1][y.length() + 1];

        for (int i = 0; i <= x.length(); i++) {
            for (int j = 0; j <= y.length(); j++) {
                if (i == 0) {
                    dp[i][j]= j;
                }
                else if (j == 0) {
                    dp[i][j]= i;
                }
                else {
                    dp[i][j]= min(dp[i - 1][j - 1]
                                    + coupDeChangement(x.charAt(i - 1), y.charAt(j - 1)),
                            dp[i - 1][j]+ 1,
                            dp[i][j - 1]+ 1);
                }
            }
        }

        return dp[x.length()][y.length()];
    }

    public static int coupDeChangement(char a, char b) {
        return a == b ? 0 : 1;
    }

    public static int min(int... numbers) {
        return Arrays.stream(numbers)
                .min().orElse(Integer.MAX_VALUE);
    }

    private void initIHM() {
        fieldText.setPreferredSize(new Dimension(400, 150));
        correctField.setPreferredSize(new Dimension(400, 150));
        correctField.setBackground(Color.LIGHT_GRAY);
        correctField.setEditable(false);
        correctField.setText("Corrections possibles :");
        fieldText.setBorder(BorderFactory.createRaisedBevelBorder());
        container.add(fieldText);
        container.add(correctField);
        fieldText.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                String textUpdate = fieldText.getText().toLowerCase();
                try {
                    if (!textUpdate.isEmpty() && textUpdate.length() >= 2) {
                        warn();
                    }
                } catch (ExecutionException | InterruptedException executionException) {
                    executionException.printStackTrace();
                }
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                String textUpdate = fieldText.getText().toLowerCase();
                try {
                    System.out.println("texte : " + textUpdate);
                    if (!textUpdate.isEmpty() && textUpdate.length() >= 2) {
                        warn();
                    }
                } catch (ExecutionException | InterruptedException executionException) {
                    executionException.printStackTrace();
                }
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                String textUpdate = fieldText.getText().toLowerCase();
                try {
                    if (!textUpdate.isEmpty() && textUpdate.length() >= 2) {
                        warn();
                    }
                } catch (ExecutionException | InterruptedException executionException) {
                    executionException.printStackTrace();
                }
            }

            public void warn() throws ExecutionException, InterruptedException {
                checkMotExiste check = new checkMotExiste(fieldText.getText().toLowerCase(), listeDesMots);
                Future<Boolean> future = executorService.submit(check);
                TreeMap<Integer, String> listeCorrection = new TreeMap<Integer, String>();
                boolean motExist = future.get();
                System.out.println(fieldText.getText() + "->" + motExist);
                if (motExist) {
                    fieldText.setForeground(Color.blue);
                    correctField.setText("Mot correcte");
                } else {
                    fieldText.setForeground(Color.red);
                    correctField.setText("Corrections possibles : ");
                    Character firstLetter = fieldText.getText().toLowerCase().charAt(0);
                    for(String s : listeDesMots.get(firstLetter) ) {
                        int retour = calculLevenshtien(fieldText.getText().toLowerCase(), s);
                        if(retour <= (fieldText.getText().length()) )  {
                            listeCorrection.put(retour, s);
                        }
                    }
                    int compteur = 0;
                    for (Map.Entry<Integer, String> mapData : listeCorrection.entrySet() ) {
                        if(compteur<5) {
                            System.out.println("Key : " + mapData.getKey() + "Value : " + mapData.getValue());
                            compteur = mapData.getKey();
                            correctField.setText(correctField.getText() + "\n " + mapData.getValue());
                        }
                    }
                    //System.out.println("Trier :" + triAvecValeur(listeCorrection).entrySet());
                }

            }
        });
    }
}
