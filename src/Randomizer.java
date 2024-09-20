import java.util.Random;
import javax.swing.*;
import java.awt.*;

//Randomizer
public class Randomizer {
    public static void main(String[] args) {
        //ImageIcons
        ImageIcon CAT = new ImageIcon(".idea/Bilder/Cat.png");
        //Brawlhalla Logo Skallieren
        ImageIcon Brawlhalla =  new ImageIcon(".idea/Bilder/Brawlhalla_Logo_Hellboy.png");
        Image originalImage = Brawlhalla.getImage();
        Image scaledImage = originalImage.getScaledInstance(250, 250, Image.SCALE_SMOOTH);
        //Skalkiertes Brawlhalla Logo verpacken als neues ImageIcon
        ImageIcon BrawlhallaS = new ImageIcon(scaledImage);

        //Brawlhalla Legenden Image Icons
        ImageIcon Ada = new ImageIcon(".idea/Bilder/Legenden/Ada.png");
        ImageIcon Arcadia = new ImageIcon(".idea/Bilder/Legenden/Arcadia.png");
        ImageIcon Artemis = new ImageIcon(".idea/Bilder/Legenden/Artemis.png");
        ImageIcon Asuri = new ImageIcon(".idea/Bilder/Legenden/Asuri.png");
        ImageIcon Azoth = new ImageIcon(".idea/Bilder/Legenden/Azoth.png");
        ImageIcon Barraza = new ImageIcon(".idea/Bilder/Legenden/Barraza.png");
        ImageIcon Bodvar = new ImageIcon(".idea/Bilder/Legenden/Bodvar.png");
        ImageIcon Brynn = new ImageIcon(".idea/Bilder/Legenden/Brynn.png");
        ImageIcon Caspian = new ImageIcon(".idea/Bilder/Legenden/Caspian.png");
        ImageIcon Cassidy = new ImageIcon(".idea/Bilder/Legenden/Cassidy.png");
        ImageIcon Cross = new ImageIcon(".idea/Bilder/Legenden/Cross.png");
        ImageIcon Diana = new ImageIcon(".idea/Bilder/Legenden/Diana.png");
        ImageIcon Dusk = new ImageIcon(".idea/Bilder/Legenden/Dusk.png");
        ImageIcon Ember = new ImageIcon(".idea/Bilder/Legenden/Ember.png");
        ImageIcon Ezio = new ImageIcon(".idea/Bilder/Legenden/Ezio.png");
        ImageIcon Fait = new ImageIcon(".idea/Bilder/Legenden/Fait.png");
        ImageIcon Gnash = new ImageIcon(".idea/Bilder/Legenden/Gnash.png");
        ImageIcon Hattori = new ImageIcon(".idea/Bilder/Legenden/Hattori.png");
        ImageIcon Isaiah = new ImageIcon(".idea/Bilder/Legenden/Isaiah.png");
        ImageIcon Jaeyun = new ImageIcon(".idea/Bilder/Legenden/Jaeyun.png");
        ImageIcon Jhala = new ImageIcon(".idea/Bilder/Legenden/Jhala.png");
        ImageIcon Jiro = new ImageIcon(".idea/Bilder/Legenden/Jiro.png");
        ImageIcon Kaya = new ImageIcon(".idea/Bilder/Legenden/Kaya.png");
        ImageIcon Koji = new ImageIcon(".idea/Bilder/Legenden/Koji.png");
        ImageIcon Kor = new ImageIcon(".idea/Bilder/Legenden/Kor.png");
        ImageIcon Lin_Fei = new ImageIcon(".idea/Bilder/Legenden/Lin_Fei.png");
        ImageIcon Loki = new ImageIcon(".idea/Bilder/Legenden/Loki.png");
        ImageIcon Lord_Vraxx = new ImageIcon(".idea/Bilder/Legenden/Lord_Vraxx.png");
        ImageIcon Lucien = new ImageIcon(".idea/Bilder/Legenden/Lucien.png");
        ImageIcon Magyar = new ImageIcon(".idea/Bilder/Legenden/Magyar.png");
        ImageIcon Mako = new ImageIcon(".idea/Bilder/Legenden/Mako.png");
        ImageIcon Mirage = new ImageIcon(".idea/Bilder/Legenden/Mirage.png");
        ImageIcon Mordex = new ImageIcon(".idea/Bilder/Legenden/Mordex.png");
        ImageIcon Nix = new ImageIcon(".idea/Bilder/Legenden/Nix.png");
        ImageIcon Onyx = new ImageIcon(".idea/Bilder/Legenden/Onyx.png");
        ImageIcon Orion = new ImageIcon(".idea/Bilder/Legenden/Orion.png");
        ImageIcon Petra = new ImageIcon(".idea/Bilder/Legenden/Petra.png");
        ImageIcon Queen_Nai = new ImageIcon(".idea/Bilder/Legenden/Queen_Nai.png");
        ImageIcon Ragnir = new ImageIcon(".idea/Bilder/Legenden/Ragnir.png");
        ImageIcon Rayman = new ImageIcon(".idea/Bilder/Legenden/Rayman.png");
        ImageIcon Reno = new ImageIcon(".idea/Bilder/Legenden/Reno.png");
        ImageIcon Scarlet = new ImageIcon(".idea/Bilder/Legenden/Scarlet.png");
        ImageIcon Sentinel = new ImageIcon(".idea/Bilder/Legenden/Sentinel.png");
        ImageIcon Seven = new ImageIcon(".idea/Bilder/Legenden/Seven.png");
        ImageIcon Sidra = new ImageIcon(".idea/Bilder/Legenden/Sidra.png");
        ImageIcon Sir_Roland = new ImageIcon(".idea/Bilder/Legenden/Sir_Roland.png");
        ImageIcon Teros = new ImageIcon(".idea/Bilder/Legenden/Teros.png");
        ImageIcon Tezca = new ImageIcon(".idea/Bilder/Legenden/Tezca.png");
        ImageIcon Thatch = new ImageIcon(".idea/Bilder/Legenden/Thatch.png");
        ImageIcon Thea = new ImageIcon(".idea/Bilder/Legenden/Thea.png");
        ImageIcon Thor = new ImageIcon(".idea/Bilder/Legenden/Thor.png");
        ImageIcon Ulgrim = new ImageIcon(".idea/Bilder/Legenden/Ulgrim.png");
        ImageIcon Val = new ImageIcon(".idea/Bilder/Legenden/Val.png");
        ImageIcon Vector = new ImageIcon(".idea/Bilder/Legenden/Vector.png");
        ImageIcon Volkov = new ImageIcon(".idea/Bilder/Legenden/Volkov.png");
        ImageIcon Wu_Shang = new ImageIcon(".idea/Bilder/Legenden/Wu_Shang.png");
        ImageIcon Xull = new ImageIcon(".idea/Bilder/Legenden/Xull.png");
        ImageIcon Yumiko = new ImageIcon(".idea/Bilder/Legenden/Yumiko.png");
        ImageIcon Zariel = new ImageIcon(".idea/Bilder/Legenden/Zariel.png");
        ImageIcon Munin = new ImageIcon(".idea/Bilder/Legenden/Munin.png");
        ImageIcon Vivi = new ImageIcon(".idea/Bilder/Legenden/Vivi.png");
        ImageIcon Red_Raptor = new ImageIcon(".idea/Bilder/Legenden/Red_Raptor.png");

        //Zufallszahl
        Random Zufall = new Random();
        int Zufallszahl = Zufall.nextInt(63);

        JOptionPane.showMessageDialog(null,"Willkommen zum Brawlhalla Randomizer",null,JOptionPane.INFORMATION_MESSAGE,
                BrawlhallaS);

        //SpielstartFrage
        int Startfrage = JOptionPane.showConfirmDialog(null,
                "Möchten Sie eine Random Legende würfeln?",
                "Spielstart",
                JOptionPane.YES_NO_OPTION);
        if (Startfrage == JOptionPane.YES_OPTION) {
            //Legenden-Cases
            switch(Zufallszahl) {
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
        }else{
            JOptionPane.showMessageDialog(null,"Dann nicht",null,JOptionPane.INFORMATION_MESSAGE,CAT);
        }



    }
}