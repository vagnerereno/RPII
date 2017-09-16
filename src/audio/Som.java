package audio;

import java.io.*;
import sun.audio.*;

public class Som {

    String musica;

    public static AudioStream parar(AudioStream musica) throws Exception {
        AudioPlayer.player.stop(musica);
        return null;
    }

    public static AudioStream fase1() throws Exception {
        //mudar o caminho para cada maquina
        AudioStream audio = new AudioStream(new FileInputStream("C:\\Users\\vagne\\OneDrive\\Documentos\\NetBeansProjects\\RPII_1BACUPDALICENCA\\src\\audio\\musica_fase1.wav"));
        AudioPlayer.player.start(audio);
        ContinuousAudioDataStream loop;
        return audio;
    }

    public static AudioStream ato2() throws Exception {
        //mudar o caminho para cada maquina
        AudioStream audio = new AudioStream(new FileInputStream("C:\\Users\\vagne\\OneDrive\\Documentos\\NetBeansProjects\\RPII_1BACUPDALICENCA\\src\\audio\\musica_ato2.wav"));
        AudioPlayer.player.start(audio);
        ContinuousAudioDataStream loop;
        return audio;
    }

    public static AudioStream cervo() throws Exception {
        //mudar o caminho para cada maquina
        AudioStream audio = new AudioStream(new FileInputStream("C:\\Users\\vagne\\OneDrive\\Documentos\\NetBeansProjects\\RPII_1BACUPDALICENCA\\src\\audio\\cervo.wav"));
        AudioPlayer.player.start(audio);
        return audio;

    }

    public static AudioStream porta() throws Exception {
        //mudar o caminho para cada maquina
        AudioStream audio = new AudioStream(new FileInputStream("C:\\Users\\vagne\\OneDrive\\Documentos\\NetBeansProjects\\RPII_1BACUPDALICENCA\\src\\audio\\porta.wav"));
        AudioPlayer.player.start(audio);
        return audio;
    }

    public static AudioStream lutasoco() throws Exception {
        //mudar o caminho para cada maquina
        AudioStream audio = new AudioStream(new FileInputStream("C:\\Users\\vagne\\OneDrive\\Documentos\\NetBeansProjects\\RPII_1BACUPDALICENCA\\src\\audio\\brigademaos.wav"));
        AudioPlayer.player.start(audio);
        return audio;
    }

    public static AudioStream cadeado() throws Exception {
        //mudar o caminho para cada maquina
        AudioStream audio = new AudioStream(new FileInputStream("C:\\Users\\vagne\\OneDrive\\Documentos\\NetBeansProjects\\RPII_1BACUPDALICENCA\\src\\audio\\cadeado.wav"));
        AudioPlayer.player.start(audio);
        return audio;
    }

    public static AudioStream comendo() throws Exception {
        //mudar o caminho para cada maquina
        AudioStream audio = new AudioStream(new FileInputStream("C:\\Users\\vagne\\OneDrive\\Documentos\\NetBeansProjects\\RPII_1BACUPDALICENCA\\src\\audio\\comendo.wav"));
        AudioPlayer.player.start(audio);
        return audio;
    }

    public static AudioStream corre() throws Exception {
        //mudar o caminho para cada maquina
        AudioStream audio = new AudioStream(new FileInputStream("C:\\Users\\vagne\\OneDrive\\Documentos\\NetBeansProjects\\RPII_1BACUPDALICENCA\\src\\audio\\corre.wav"));
        AudioPlayer.player.start(audio);
        return audio;
    }

    public static AudioStream emppedra() throws Exception {
        //mudar o caminho para cada maquina
        AudioStream audio = new AudioStream(new FileInputStream("C:\\Users\\vagne\\OneDrive\\Documentos\\NetBeansProjects\\RPII_1BACUPDALICENCA\\src\\audio\\emppedra.wav"));
        AudioPlayer.player.start(audio);
        return audio;
    }

    public static AudioStream entradaFloresta() throws Exception {
        //mudar o caminho para cada maquina
        AudioStream audio = new AudioStream(new FileInputStream("C:\\Users\\vagne\\OneDrive\\Documentos\\NetBeansProjects\\RPII_1BACUPDALICENCA\\src\\audio\\entradaFloresta.wav"));
        AudioPlayer.player.start(audio);
        return audio;
    }

    public static AudioStream esfolar() throws Exception {
        //mudar o caminho para cada maquina
        AudioStream audio = new AudioStream(new FileInputStream("C:\\Users\\vagne\\OneDrive\\Documentos\\NetBeansProjects\\RPII_1BACUPDALICENCA\\src\\audio\\esfolar.wav"));
        AudioPlayer.player.start(audio);
        return audio;
    }

    public static AudioStream ferido() throws Exception {
        //mudar o caminho para cada maquina
        AudioStream audio = new AudioStream(new FileInputStream("C:\\Users\\vagne\\OneDrive\\Documentos\\NetBeansProjects\\RPII_1BACUPDALICENCA\\src\\audio\\ferido.wav"));
        AudioPlayer.player.start(audio);
        return audio;
    }

    public static AudioStream finalMario() throws Exception {
        //mudar o caminho para cada maquina
        AudioStream audio = new AudioStream(new FileInputStream("C:\\Users\\vagne\\OneDrive\\Documentos\\NetBeansProjects\\RPII_1BACUPDALICENCA\\src\\audio\\finalMario.wav"));
        AudioPlayer.player.start(audio);
        return audio;
    }

    /*public static AudioStream fogo() throws Exception {
        //mudar o caminho para cada maquina
        AudioStream audio = new AudioStream(new FileInputStream("E:\\RPII_1BACUPDALICENCA\\src\\audio\\fogo.wav"));
        AudioPlayer.player.start(audio);
        return audio;
    }*/

    public static AudioStream galinha() throws Exception {
        //mudar o caminho para cada maquina
        AudioStream audio = new AudioStream(new FileInputStream("C:\\Users\\vagne\\OneDrive\\Documentos\\NetBeansProjects\\RPII_1BACUPDALICENCA\\src\\audio\\galinha.wav"));
        AudioPlayer.player.start(audio);
        return audio;
    }

    public static AudioStream globin() throws Exception {
        //mudar o caminho para cada maquina
        AudioStream audio = new AudioStream(new FileInputStream("C:\\Users\\vagne\\OneDrive\\Documentos\\NetBeansProjects\\RPII_1BACUPDALICENCA\\src\\audio\\globin.wav"));
        AudioPlayer.player.start(audio);
        return audio;
    }

    public static AudioStream howno() throws Exception {
        //mudar o caminho para cada maquina
        AudioStream audio = new AudioStream(new FileInputStream("C:\\Users\\vagne\\OneDrive\\Documentos\\NetBeansProjects\\RPII_1BACUPDALICENCA\\src\\audio\\howno.wav"));
        AudioPlayer.player.start(audio);
        return audio;
    }

    public static AudioStream itemLendario() throws Exception {
        //mudar o caminho para cada maquina
        AudioStream audio = new AudioStream(new FileInputStream("C:\\Users\\vagne\\OneDrive\\Documentos\\NetBeansProjects\\RPII_1BACUPDALICENCA\\src\\audio\\itemLendario.wav"));
        AudioPlayer.player.start(audio);
        return audio;
    }

    public static AudioStream templo() throws Exception {
        //mudar o caminho para cada maquina
        AudioStream audio = new AudioStream(new FileInputStream("C:\\Users\\vagne\\OneDrive\\Documentos\\NetBeansProjects\\RPII_1BACUPDALICENCA\\src\\audio\\templo.wav"));
        AudioPlayer.player.start(audio);
        return audio;
    }

    public static AudioStream javali() throws Exception {
        //mudar o caminho para cada maquina
        AudioStream audio = new AudioStream(new FileInputStream("C:\\Users\\vagne\\OneDrive\\Documentos\\NetBeansProjects\\RPII_1BACUPDALICENCA\\src\\audio\\javali.wav"));
        AudioPlayer.player.start(audio);
        return audio;
    }

}
