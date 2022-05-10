package ultraemojicombat;

public class UltraEmojiCombat {

    public static void main(String[] args) {
        Lutador l[] = new Lutador[6];
        l[0] = new Lutador("Gláucio", "Brasil", 26, 1.77f, 71.0f, 11, 2, 1);
        
        l[1] = new Lutador ("Alan", "Argentina", 23, 1.55f, 72.0f, 10, 3, 2);
        
        Luta UEC01 = new Luta();
        UEC01.marcarLutar(l[0], l[1]);
        UEC01.lutar();
    }

}
