import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.*;

public class MainFrame extends JFrame 
{
    //Määritellään textFieldit
    final private Font mainFont = new Font("Cascadia Code", Font.BOLD, 18);
    JTextField ykNumField, kaNumField, koNumField, neNumField, viNumField, kuNumField, seNumField, kahNumField, yhNumField,
    ykKyNumField, ykYkNumField, ykKaNumField, ykKoNumField, ykNeNumField, ykViNumField, ykKuNumField, ykSeNumField, ykKahNumField, ykYhNumField,
    kaKyNumField, kaYkNumField, kaKaNumField, kaKoNumField, kaNeNumField, kaViNumField, kaKuNumField, kaSeNumField, kaKahNumField, kaYhNumField,
    koKyNumField, koYkNumField, koKaNumField, koKoNumField, koNeNumField, koViNumField, koKuNumField, koSeNumField, koKahNumField, koYhNumField,
    neKyNumField, neYkNumField, neKaNumField, neKoNumField, neNeNumField, neViNumField, neKuNumField, neSeNumField, neKahNumField, neYhNumField,
    viKyNumField, viYkNumField, viKaNumField, viKoNumField, viNeNumField, viViNumField, viKuNumField, viSeNumField, viKahNumField, viYhNumField,
    kuKyNumField, kuYkNumField, kuKaNumField, kuKoNumField, kuNeNumField, kuViNumField, kuKuNumField, kuSeNumField, kuKahNumField, kuYhNumField,
    seKyNumField, seYkNumField, seKaNumField, seKoNumField, seNeNumField, seViNumField, seKuNumField, seSeNumField, seKahNumField, seYhNumField,
    kahKyNumField, kahYkNumField;

    JLabel lbWelcome;
    public void initialize() {
        //************Form Paneeli ************/
        //JLabel lbFirst = new JLabel("First Label");
        //lbFirst.setFont(mainFont);

        ykNumField = new JTextField(); kaNumField = new JTextField(); koNumField = new JTextField(); neNumField = new JTextField(); viNumField = new JTextField();
        kuNumField = new JTextField(); seNumField = new JTextField(); kahNumField = new JTextField(); yhNumField = new JTextField();
        ykKyNumField = new JTextField(); ykYkNumField = new JTextField(); ykKaNumField = new JTextField(); ykKoNumField = new JTextField(); ykNeNumField = new JTextField(); ykViNumField = new JTextField();
        ykKuNumField = new JTextField(); ykSeNumField = new JTextField(); ykKahNumField = new JTextField(); ykYhNumField = new JTextField();
        
        kaKyNumField = new JTextField(); kaYkNumField = new JTextField(); kaKaNumField = new JTextField(); kaKoNumField = new JTextField(); kaNeNumField = new JTextField(); kaViNumField = new JTextField();        
        kaKuNumField = new JTextField(); kaSeNumField = new JTextField(); kaKahNumField = new JTextField(); kaYhNumField = new JTextField();
        
        koKyNumField = new JTextField(); koYkNumField = new JTextField(); koKaNumField = new JTextField(); koKoNumField = new JTextField(); koNeNumField = new JTextField(); koViNumField = new JTextField();
        koKuNumField = new JTextField(); koSeNumField = new JTextField(); koKahNumField = new JTextField(); koYhNumField = new JTextField();
        
        neKyNumField = new JTextField(); neYkNumField = new JTextField(); neKaNumField = new JTextField(); neKoNumField = new JTextField(); neNeNumField = new JTextField(); neViNumField = new JTextField();
        neKuNumField = new JTextField(); neSeNumField = new JTextField(); neKahNumField = new JTextField(); neYhNumField = new JTextField();
        
        viKyNumField = new JTextField(); viYkNumField = new JTextField(); viKaNumField = new JTextField(); viKoNumField = new JTextField(); viNeNumField = new JTextField(); viViNumField = new JTextField();
        viKuNumField = new JTextField(); viSeNumField = new JTextField(); viKahNumField = new JTextField(); viYhNumField = new JTextField();
        
        kuKyNumField = new JTextField(); kuYkNumField = new JTextField(); kuKaNumField = new JTextField(); kuKoNumField = new JTextField(); kuNeNumField = new JTextField(); kuViNumField = new JTextField();
        kuKuNumField = new JTextField(); kuSeNumField = new JTextField(); kuKahNumField = new JTextField(); kuYhNumField = new JTextField();
        
        seKyNumField = new JTextField(); seYkNumField = new JTextField(); seKaNumField = new JTextField(); seKoNumField = new JTextField(); seNeNumField = new JTextField(); seViNumField = new JTextField();
        seKuNumField = new JTextField(); seSeNumField = new JTextField(); seKahNumField = new JTextField(); seYhNumField = new JTextField();
        
        kahKyNumField = new JTextField(); kahYkNumField = new JTextField();

        //laitetaan textFieldeille fontti
        ykNumField.setFont(mainFont); kaNumField.setFont(mainFont); koNumField.setFont(mainFont); neNumField.setFont(mainFont); viNumField.setFont(mainFont);
        kuNumField.setFont(mainFont); seNumField.setFont(mainFont); kahNumField.setFont(mainFont); yhNumField.setFont(mainFont);
        
        ykKyNumField.setFont(mainFont); ykKaNumField.setFont(mainFont); ykKoNumField.setFont(mainFont); ykNeNumField.setFont(mainFont); ykViNumField.setFont(mainFont);
        ykKuNumField.setFont(mainFont); ykSeNumField.setFont(mainFont); ykKahNumField.setFont(mainFont); ykYhNumField.setFont(mainFont);
        
        kaKyNumField.setFont(mainFont); kaYkNumField.setFont(mainFont); kaKaNumField.setFont(mainFont); kaKoNumField.setFont(mainFont); kaNeNumField.setFont(mainFont); kaViNumField.setFont(mainFont);
        kaKuNumField.setFont(mainFont); kaSeNumField.setFont(mainFont); kaKahNumField.setFont(mainFont); kaYhNumField.setFont(mainFont);

        koKyNumField.setFont(mainFont); koYkNumField.setFont(mainFont); koKaNumField.setFont(mainFont); koKoNumField.setFont(mainFont); koNeNumField.setFont(mainFont); koViNumField.setFont(mainFont);
        koKuNumField.setFont(mainFont); koSeNumField.setFont(mainFont); koKahNumField.setFont(mainFont); koYhNumField.setFont(mainFont);

        neKyNumField.setFont(mainFont); neYkNumField.setFont(mainFont); neKaNumField.setFont(mainFont); neKoNumField.setFont(mainFont); neNeNumField.setFont(mainFont); neViNumField.setFont(mainFont);
        neKuNumField.setFont(mainFont); neSeNumField.setFont(mainFont); neKahNumField.setFont(mainFont); neYhNumField.setFont(mainFont);

        viKyNumField.setFont(mainFont); viYkNumField.setFont(mainFont); viKaNumField.setFont(mainFont); viKoNumField.setFont(mainFont); viNeNumField.setFont(mainFont); viViNumField.setFont(mainFont);
        viKuNumField.setFont(mainFont); viSeNumField.setFont(mainFont); viKahNumField.setFont(mainFont); viYhNumField.setFont(mainFont);

        kuKyNumField.setFont(mainFont); kuKaNumField.setFont(mainFont); kuKoNumField.setFont(mainFont); kuNeNumField.setFont(mainFont); kuViNumField.setFont(mainFont);
        kuKuNumField.setFont(mainFont); kuSeNumField.setFont(mainFont); kuKahNumField.setFont(mainFont); kuYhNumField.setFont(mainFont);

        seKyNumField.setFont(mainFont); seYkNumField.setFont(mainFont); seKaNumField.setFont(mainFont); seKoNumField.setFont(mainFont); seNeNumField.setFont(mainFont); seViNumField.setFont(mainFont);
        seKuNumField.setFont(mainFont); seSeNumField.setFont(mainFont); seKahNumField.setFont(mainFont); seYhNumField.setFont(mainFont);

        kahKyNumField.setFont(mainFont); kahYkNumField.setFont(mainFont);


        
        JPanel formPanel = new JPanel();
        formPanel.setLayout(new GridLayout(10, 9, 5, 5));
        //Lisätään textFieldit paneeliin
        formPanel.add(ykNumField); formPanel.add(kaNumField); formPanel.add(koNumField); formPanel.add(neNumField); formPanel.add(viNumField);
        formPanel.add(kuNumField); formPanel.add(seNumField); formPanel.add(kahNumField); formPanel.add(yhNumField);

        formPanel.add(ykKyNumField); formPanel.add(ykYkNumField); formPanel.add(ykKaNumField); formPanel.add(ykKoNumField); formPanel.add(ykNeNumField);
        formPanel.add(ykViNumField); formPanel.add(ykKuNumField); formPanel.add(ykSeNumField); formPanel.add(ykKahNumField); formPanel.add(ykYhNumField);

        formPanel.add(kaKyNumField); formPanel.add(kaYkNumField); formPanel.add(kaKaNumField); formPanel.add(kaKoNumField); formPanel.add(kaNeNumField);
        formPanel.add(kaViNumField); formPanel.add(kaKuNumField); formPanel.add(kaSeNumField); formPanel.add(kaKahNumField); formPanel.add(kaYhNumField);

        formPanel.add(koKyNumField); formPanel.add(koYkNumField); formPanel.add(koKaNumField); formPanel.add(koKoNumField); formPanel.add(koNeNumField);
        formPanel.add(koViNumField); formPanel.add(koKuNumField); formPanel.add(koSeNumField); formPanel.add(koKahNumField); formPanel.add(koYhNumField);

        formPanel.add(neKyNumField); formPanel.add(neYkNumField); formPanel.add(neKaNumField); formPanel.add(neKoNumField); formPanel.add(neNeNumField);
        formPanel.add(neViNumField); formPanel.add(neKuNumField); formPanel.add(neSeNumField); formPanel.add(neKahNumField); formPanel.add(neYhNumField);

        formPanel.add(viKyNumField); formPanel.add(viYkNumField); formPanel.add(viKaNumField); formPanel.add(viKoNumField); formPanel.add(viNeNumField);
        formPanel.add(viViNumField); formPanel.add(viKuNumField); formPanel.add(viSeNumField); formPanel.add(viKahNumField); formPanel.add(viYhNumField);

        formPanel.add(kuKyNumField); formPanel.add(kuYkNumField); formPanel.add(kuKaNumField); formPanel.add(kuKoNumField); formPanel.add(kuNeNumField);
        formPanel.add(kuViNumField); formPanel.add(kuKuNumField); formPanel.add(kuSeNumField); formPanel.add(kuKahNumField); formPanel.add(kuYhNumField);

        formPanel.add(seKyNumField); formPanel.add(seYkNumField); formPanel.add(seKaNumField); formPanel.add(seKoNumField); formPanel.add(seNeNumField);
        formPanel.add(seViNumField); formPanel.add(seKuNumField); formPanel.add(seSeNumField); formPanel.add(seKahNumField); formPanel.add(seYhNumField);
        
        formPanel.add(kahKyNumField);formPanel.add(kahYkNumField);

        // Tarkistetaan että kirjoitettu merkki on numero
        kahYkNumField.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char input = e.getKeyChar();
                if ((input < '0' || input > '9') && input != '\b') {
                    e.consume();
                    System.out.println("Ei sallittu merkki!");
                }

            }
        });

        //************Nappien Paneeli ************/
        JButton OkBtn = new JButton("OK");
        OkBtn.setFont(mainFont);
        OkBtn.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
            }
            
        });
        JButton clearBtn = new JButton("Tyhjennä");
        clearBtn.setFont(mainFont);
        clearBtn.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
            }
            
        });
        JPanel nappiPaneeli = new JPanel();
        nappiPaneeli.setLayout(new GridLayout(1, 2, 5, 5));
        nappiPaneeli.add(OkBtn);
        nappiPaneeli.add(clearBtn);

        //Luodaan paneeli
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        mainPanel.setBackground(new Color(255, 255, 255));
        mainPanel.add(formPanel, BorderLayout.CENTER);
        mainPanel.add(nappiPaneeli, BorderLayout.SOUTH);

        add(mainPanel);


        setTitle("Sudokun Ratkaisija");
        setSize(500, 600);
        setMinimumSize(new Dimension(300, 400));
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public static void main(String[] args) {
        MainFrame myFrame = new MainFrame();
        myFrame.initialize();
    }
}