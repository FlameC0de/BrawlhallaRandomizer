import java.util.Random;
import javax.swing.*;
import java.awt.*;

@SuppressWarnings("ALL")
//Randomizer
public class Randomizer {
    //Brawlhalla Logo Skallieren
    private static ImageIcon Brawlhalla = new ImageIcon(".idea/Bilder/Brawlhalla_Logo_Hellboy.png");

    private static ImageIcon CAT = new ImageIcon(".idea/Bilder/Cat.png");
    //Brawlhalla Legenden Image Icons
    private static ImageIcon Ada = new ImageIcon(".idea/Bilder/Legenden/Ada.png");
    private static ImageIcon Arcadia = new ImageIcon(".idea/Bilder/Legenden/Arcadia.png");
    private static ImageIcon Artemis = new ImageIcon(".idea/Bilder/Legenden/Artemis.png");
    private static ImageIcon Asuri = new ImageIcon(".idea/Bilder/Legenden/Asuri.png");
    private static ImageIcon Azoth = new ImageIcon(".idea/Bilder/Legenden/Azoth.png");
    private static ImageIcon Barraza = new ImageIcon(".idea/Bilder/Legenden/Barraza.png");
    private static ImageIcon Bodvar = new ImageIcon(".idea/Bilder/Legenden/Bodvar.png");
    private static ImageIcon Brynn = new ImageIcon(".idea/Bilder/Legenden/Brynn.png");
    private static ImageIcon Caspian = new ImageIcon(".idea/Bilder/Legenden/Caspian.png");
    private static ImageIcon Cassidy = new ImageIcon(".idea/Bilder/Legenden/Cassidy.png");
    private static ImageIcon Cross = new ImageIcon(".idea/Bilder/Legenden/Cross.png");
    private static ImageIcon Diana = new ImageIcon(".idea/Bilder/Legenden/Diana.png");
    private static ImageIcon Dusk = new ImageIcon(".idea/Bilder/Legenden/Dusk.png");
    private static ImageIcon Ember = new ImageIcon(".idea/Bilder/Legenden/Ember.png");
    private static ImageIcon Ezio = new ImageIcon(".idea/Bilder/Legenden/Ezio.png");
    private static ImageIcon Fait = new ImageIcon(".idea/Bilder/Legenden/Fait.png");
    private static ImageIcon Gnash = new ImageIcon(".idea/Bilder/Legenden/Gnash.png");
    private static ImageIcon Hattori = new ImageIcon(".idea/Bilder/Legenden/Hattori.png");
    private static ImageIcon Isaiah = new ImageIcon(".idea/Bilder/Legenden/Isaiah.png");
    private static ImageIcon Jaeyun = new ImageIcon(".idea/Bilder/Legenden/Jaeyun.png");
    private static ImageIcon Jhala = new ImageIcon(".idea/Bilder/Legenden/Jhala.png");
    private static ImageIcon Jiro = new ImageIcon(".idea/Bilder/Legenden/Jiro.png");
    private static ImageIcon Kaya = new ImageIcon(".idea/Bilder/Legenden/Kaya.png");
    private static ImageIcon Koji = new ImageIcon(".idea/Bilder/Legenden/Koji.png");
    private static ImageIcon Kor = new ImageIcon(".idea/Bilder/Legenden/Kor.png");
    private static ImageIcon Lin_Fei = new ImageIcon(".idea/Bilder/Legenden/Lin_Fei.png");
    private static ImageIcon Loki = new ImageIcon(".idea/Bilder/Legenden/Loki.png");
    private static ImageIcon Lord_Vraxx = new ImageIcon(".idea/Bilder/Legenden/Lord_Vraxx.png");
    private static ImageIcon Lucien = new ImageIcon(".idea/Bilder/Legenden/Lucien.png");
    private static ImageIcon Magyar = new ImageIcon(".idea/Bilder/Legenden/Magyar.png");
    private static ImageIcon Mako = new ImageIcon(".idea/Bilder/Legenden/Mako.png");
    private static ImageIcon Mirage = new ImageIcon(".idea/Bilder/Legenden/Mirage.png");
    private static ImageIcon Mordex = new ImageIcon(".idea/Bilder/Legenden/Mordex.png");
    private static ImageIcon Nix = new ImageIcon(".idea/Bilder/Legenden/Nix.png");
    private static ImageIcon Onyx = new ImageIcon(".idea/Bilder/Legenden/Onyx.png");
    private static ImageIcon Orion = new ImageIcon(".idea/Bilder/Legenden/Orion.png");
    private static ImageIcon Petra = new ImageIcon(".idea/Bilder/Legenden/Petra.png");
    private static ImageIcon Queen_Nai = new ImageIcon(".idea/Bilder/Legenden/Queen_Nai.png");
    private static ImageIcon Ragnir = new ImageIcon(".idea/Bilder/Legenden/Ragnir.png");
    private static ImageIcon Rayman = new ImageIcon(".idea/Bilder/Legenden/Rayman.png");
    private static ImageIcon Reno = new ImageIcon(".idea/Bilder/Legenden/Reno.png");
    private static ImageIcon Scarlet = new ImageIcon(".idea/Bilder/Legenden/Scarlet.png");
    private static ImageIcon Sentinel = new ImageIcon(".idea/Bilder/Legenden/Sentinel.png");
    private static ImageIcon Seven = new ImageIcon(".idea/Bilder/Legenden/Seven.png");
    private static ImageIcon Sidra = new ImageIcon(".idea/Bilder/Legenden/Sidra.png");
    private static ImageIcon Sir_Roland = new ImageIcon(".idea/Bilder/Legenden/Sir_Roland.png");
    private static ImageIcon Teros = new ImageIcon(".idea/Bilder/Legenden/Teros.png");
    private static ImageIcon Tezca = new ImageIcon(".idea/Bilder/Legenden/Tezca.png");
    private static ImageIcon Thatch = new ImageIcon(".idea/Bilder/Legenden/Thatch.png");
    private static ImageIcon Thea = new ImageIcon(".idea/Bilder/Legenden/Thea.png");
    private static ImageIcon Thor = new ImageIcon(".idea/Bilder/Legenden/Thor.png");
    private static ImageIcon Ulgrim = new ImageIcon(".idea/Bilder/Legenden/Ulgrim.png");
    private static ImageIcon Val = new ImageIcon(".idea/Bilder/Legenden/Val.png");
    private static ImageIcon Vector = new ImageIcon(".idea/Bilder/Legenden/Vector.png");
    private static ImageIcon Volkov = new ImageIcon(".idea/Bilder/Legenden/Volkov.png");
    private static ImageIcon Wu_Shang = new ImageIcon(".idea/Bilder/Legenden/Wu_Shang.png");
    private static ImageIcon Xull = new ImageIcon(".idea/Bilder/Legenden/Xull.png");
    private static ImageIcon Yumiko = new ImageIcon(".idea/Bilder/Legenden/Yumiko.png");
    private static ImageIcon Zariel = new ImageIcon(".idea/Bilder/Legenden/Zariel.png");
    private static ImageIcon Munin = new ImageIcon(".idea/Bilder/Legenden/Munin.png");
    private static ImageIcon Vivi = new ImageIcon(".idea/Bilder/Legenden/Vivi.png");
    private static ImageIcon Red_Raptor = new ImageIcon(".idea/Bilder/Legenden/Red_Raptor.png");


    public static void LegendenSpin(int Zufallszahl) {
        switch (Zufallszahl) {
            case 1:
                JOptionPane.showMessageDialog(null, "Ada", null, JOptionPane.INFORMATION_MESSAGE, Ada);
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "Arcadia", null, JOptionPane.INFORMATION_MESSAGE, Arcadia);
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "Artemis", null, JOptionPane.INFORMATION_MESSAGE, Artemis);
                break;
            case 4:
                JOptionPane.showMessageDialog(null, "Asuri", null, JOptionPane.INFORMATION_MESSAGE, Asuri);
                break;
            case 5:
                JOptionPane.showMessageDialog(null, "Azoth", null, JOptionPane.INFORMATION_MESSAGE, Azoth);
                break;
            case 6:
                JOptionPane.showMessageDialog(null, "Barraza", null, JOptionPane.INFORMATION_MESSAGE, Barraza);
                break;
            case 7:
                JOptionPane.showMessageDialog(null, "Bodvar", null, JOptionPane.INFORMATION_MESSAGE, Bodvar);
                break;
            case 8:
                JOptionPane.showMessageDialog(null, "Brynn", null, JOptionPane.INFORMATION_MESSAGE, Brynn);
                break;
            case 9:
                JOptionPane.showMessageDialog(null, "Caspian", null, JOptionPane.INFORMATION_MESSAGE, Caspian);
                break;
            case 10:
                JOptionPane.showMessageDialog(null, "Cassidy", null, JOptionPane.INFORMATION_MESSAGE, Cassidy);
                break;
            case 11:
                JOptionPane.showMessageDialog(null, "Cross", null, JOptionPane.INFORMATION_MESSAGE, Cross);
                break;
            case 12:
                JOptionPane.showMessageDialog(null, "Diana", null, JOptionPane.INFORMATION_MESSAGE, Diana);
                break;
            case 13:
                JOptionPane.showMessageDialog(null, "Dusk", null, JOptionPane.INFORMATION_MESSAGE, Dusk);
                break;
            case 14:
                JOptionPane.showMessageDialog(null, "Ember", null, JOptionPane.INFORMATION_MESSAGE, Ember);
                break;
            case 15:
                JOptionPane.showMessageDialog(null, "Ezio", null, JOptionPane.INFORMATION_MESSAGE, Ezio);
                break;
            case 16:
                JOptionPane.showMessageDialog(null, "Fait", null, JOptionPane.INFORMATION_MESSAGE, Fait);
                break;
            case 17:
                JOptionPane.showMessageDialog(null, "Gnash", null, JOptionPane.INFORMATION_MESSAGE, Gnash);
                break;
            case 18:
                JOptionPane.showMessageDialog(null, "Hattori", null, JOptionPane.INFORMATION_MESSAGE, Hattori);
                break;
            case 19:
                JOptionPane.showMessageDialog(null, "Isaiah", null, JOptionPane.INFORMATION_MESSAGE, Isaiah);
                break;
            case 20:
                JOptionPane.showMessageDialog(null, "Jaeyun", null, JOptionPane.INFORMATION_MESSAGE, Jaeyun);
                break;
            case 21:
                JOptionPane.showMessageDialog(null, "Jhala", null, JOptionPane.INFORMATION_MESSAGE, Jhala);
                break;
            case 22:
                JOptionPane.showMessageDialog(null, "Jiro", null, JOptionPane.INFORMATION_MESSAGE, Jiro);
                break;
            case 23:
                JOptionPane.showMessageDialog(null, "Kaya", null, JOptionPane.INFORMATION_MESSAGE, Kaya);
                break;
            case 24:
                JOptionPane.showMessageDialog(null, "Koji", null, JOptionPane.INFORMATION_MESSAGE, Koji);
                break;
            case 25:
                JOptionPane.showMessageDialog(null, "Kor", null, JOptionPane.INFORMATION_MESSAGE, Kor);
                break;
            case 26:
                JOptionPane.showMessageDialog(null, "Lin Fei", null, JOptionPane.INFORMATION_MESSAGE, Lin_Fei);
                break;
            case 27:
                JOptionPane.showMessageDialog(null, "Lord Vraxx", null, JOptionPane.INFORMATION_MESSAGE, Lord_Vraxx);
                break;
            case 28:
                JOptionPane.showMessageDialog(null, "Lucien", null, JOptionPane.INFORMATION_MESSAGE, Lucien);
                break;
            case 29:
                JOptionPane.showMessageDialog(null, "Magyar", null, JOptionPane.INFORMATION_MESSAGE, Magyar);
                break;
            case 30:
                JOptionPane.showMessageDialog(null, "Mako", null, JOptionPane.INFORMATION_MESSAGE, Mako);
                break;
            case 31:
                JOptionPane.showMessageDialog(null, "Mirage", null, JOptionPane.INFORMATION_MESSAGE, Mirage);
                break;
            case 32:
                JOptionPane.showMessageDialog(null, "Mordex", null, JOptionPane.INFORMATION_MESSAGE, Mordex);
                break;
            case 33:
                JOptionPane.showMessageDialog(null, "Nix", null, JOptionPane.INFORMATION_MESSAGE, Nix);
                break;
            case 34:
                JOptionPane.showMessageDialog(null, "Onyx", null, JOptionPane.INFORMATION_MESSAGE, Onyx);
                break;
            case 35:
                JOptionPane.showMessageDialog(null, "Orion", null, JOptionPane.INFORMATION_MESSAGE, Orion);
                break;
            case 36:
                JOptionPane.showMessageDialog(null, "Petra", null, JOptionPane.INFORMATION_MESSAGE, Petra);
                break;
            case 37:
                JOptionPane.showMessageDialog(null, "Queen Nai", null, JOptionPane.INFORMATION_MESSAGE, Queen_Nai);
                break;
            case 38:
                JOptionPane.showMessageDialog(null, "Ragnir", null, JOptionPane.INFORMATION_MESSAGE, Ragnir);
                break;
            case 39:
                JOptionPane.showMessageDialog(null, "Rayman", null, JOptionPane.INFORMATION_MESSAGE, Rayman);
                break;
            case 40:
                JOptionPane.showMessageDialog(null, "Reno", null, JOptionPane.INFORMATION_MESSAGE, Reno);
                break;
            case 41:
                JOptionPane.showMessageDialog(null, "Scarlet", null, JOptionPane.INFORMATION_MESSAGE, Scarlet);
                break;
            case 42:
                JOptionPane.showMessageDialog(null, "Sentinel", null, JOptionPane.INFORMATION_MESSAGE, Sentinel);
                break;
            case 43:
                JOptionPane.showMessageDialog(null, "Seven", null, JOptionPane.INFORMATION_MESSAGE, Seven);
                break;
            case 44:
                JOptionPane.showMessageDialog(null, "Sidra", null, JOptionPane.INFORMATION_MESSAGE, Sidra);
                break;
            case 45:
                JOptionPane.showMessageDialog(null, "Sir Roland", null, JOptionPane.INFORMATION_MESSAGE, Sir_Roland);
                break;
            case 46:
                JOptionPane.showMessageDialog(null, "Teros", null, JOptionPane.INFORMATION_MESSAGE, Teros);
                break;
            case 47:
                JOptionPane.showMessageDialog(null, "Tezca", null, JOptionPane.INFORMATION_MESSAGE, Tezca);
                break;
            case 48:
                JOptionPane.showMessageDialog(null, "Thatch", null, JOptionPane.INFORMATION_MESSAGE, Thatch);
                break;
            case 49:
                JOptionPane.showMessageDialog(null, "Thea", null, JOptionPane.INFORMATION_MESSAGE, Thea);
                break;
            case 50:
                JOptionPane.showMessageDialog(null, "Thor", null, JOptionPane.INFORMATION_MESSAGE, Thor);
                break;
            case 51:
                JOptionPane.showMessageDialog(null, "Ulgrim", null, JOptionPane.INFORMATION_MESSAGE, Ulgrim);
                break;
            case 52:
                JOptionPane.showMessageDialog(null, "Val", null, JOptionPane.INFORMATION_MESSAGE, Val);
                break;
            case 53:
                JOptionPane.showMessageDialog(null, "Vector", null, JOptionPane.INFORMATION_MESSAGE, Vector);
                break;
            case 54:
                JOptionPane.showMessageDialog(null, "Volkov", null, JOptionPane.INFORMATION_MESSAGE, Volkov);
                break;
            case 55:
                JOptionPane.showMessageDialog(null, "Wu Shang", null, JOptionPane.INFORMATION_MESSAGE, Wu_Shang);
                break;
            case 56:
                JOptionPane.showMessageDialog(null, "Xull", null, JOptionPane.INFORMATION_MESSAGE, Xull);
                break;
            case 57:
                JOptionPane.showMessageDialog(null, "Yumiko", null, JOptionPane.INFORMATION_MESSAGE, Yumiko);
                break;
            case 58:
                JOptionPane.showMessageDialog(null, "Zariel", null, JOptionPane.INFORMATION_MESSAGE, Zariel);
                break;
            case 59:
                JOptionPane.showMessageDialog(null, "Munin", null, JOptionPane.INFORMATION_MESSAGE, Munin);
                break;
            case 60:
                JOptionPane.showMessageDialog(null, "Vivi", null, JOptionPane.INFORMATION_MESSAGE, Vivi);
                break;
            case 61:
                JOptionPane.showMessageDialog(null, "Red_Raptor", null, JOptionPane.INFORMATION_MESSAGE, Red_Raptor);
                break;
            case 62:
                JOptionPane.showMessageDialog(null, "Loki", null, JOptionPane.INFORMATION_MESSAGE, Loki);
                break;

        }
    }

    //Methode in der die Fragen gestellt werden
    public static void main(String[] args) {
        Image originalImage = Brawlhalla.getImage();
        Image scaledImage = originalImage.getScaledInstance(250, 250, Image.SCALE_SMOOTH);
        ImageIcon BrawlhallaS = new ImageIcon(scaledImage);
        Random Zufall = new Random();

        int Zufallszahl;
        int repeat;

        JOptionPane.showMessageDialog(null, "Willkommen zum Brawlhalla Randomizer", null, JOptionPane.INFORMATION_MESSAGE, BrawlhallaS);

        //SpielstartFrage
        int Startfrage = JOptionPane.showConfirmDialog(null, "Möchten Sie eine Random Legende würfeln?", "Spielstart", JOptionPane.YES_NO_OPTION);
        if (Startfrage == JOptionPane.YES_OPTION) {
            do {
                Zufallszahl = Zufall.nextInt(62); // von 1 bis 62
                LegendenSpin(Zufallszahl);
                repeat = JOptionPane.showConfirmDialog(null, "Nochmal?", null, JOptionPane.YES_NO_OPTION);
            } while (repeat == JOptionPane.YES_OPTION);

            JOptionPane.showMessageDialog(null, "Dann nicht", null, JOptionPane.INFORMATION_MESSAGE, CAT);
        }
    }
}
