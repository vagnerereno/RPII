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
        AudioStream audio = new AudioStream(new FileInputStream(System.getProperty("user.dir")+File.separator + "src"+ File.separator + "audio"+ File.separator + "musica_fase1.wav"));
        AudioPlayer.player.start(audio);
        ContinuousAudioDataStream loop;
        return audio;
    }

    public static AudioStream ato2() throws Exception {
        //mudar o caminho para cada maquina
        AudioStream audio = new AudioStream(new FileInputStream(System.getProperty("user.dir")+File.separator + "src"+ File.separator + "audio"+ File.separator + "musica_ato2.wav"));
        AudioPlayer.player.start(audio);
        ContinuousAudioDataStream loop;
        return audio;
    }

    public static AudioStream cervo() throws Exception {
        //mudar o caminho para cada maquina
        AudioStream audio = new AudioStream(new FileInputStream(System.getProperty("user.dir")+File.separator + "src"+ File.separator + "audio"+ File.separator + "cervo.wav"));
        AudioPlayer.player.start(audio);
        return audio;

    }

    public static AudioStream porta() throws Exception {
        //mudar o caminho para cada maquina
        AudioStream audio = new AudioStream(new FileInputStream(System.getProperty("user.dir")+File.separator + "src"+ File.separator + "audio"+ File.separator + "porta.wav"));
        AudioPlayer.player.start(audio);
        return audio;
    }

    public static AudioStream lutasoco() throws Exception {
        //mudar o caminho para cada maquina
        AudioStream audio = new AudioStream(new FileInputStream(System.getProperty("user.dir")+File.separator + "src"+ File.separator + "audio"+ File.separator + "brigademaos.wav"));
        AudioPlayer.player.start(audio);
        return audio;
    }

    public static AudioStream cadeado() throws Exception {
        //mudar o caminho para cada maquina
        AudioStream audio = new AudioStream(new FileInputStream(System.getProperty("user.dir")+File.separator + "src"+ File.separator + "audio"+ File.separator + "cadeado.wav"));
        AudioPlayer.player.start(audio);
        return audio;
    }

    public static AudioStream comendo() throws Exception {
        //mudar o caminho para cada maquina
        AudioStream audio = new AudioStream(new FileInputStream(System.getProperty("user.dir")+File.separator + "src"+ File.separator + "audio"+ File.separator + "comendo.wav"));
        AudioPlayer.player.start(audio);
        return audio;
    }

    public static AudioStream corre() throws Exception {
        //mudar o caminho para cada maquina
        AudioStream audio = new AudioStream(new FileInputStream(System.getProperty("user.dir")+File.separator + "src"+ File.separator + "audio"+ File.separator + "corre.wav"));
        AudioPlayer.player.start(audio);
        return audio;
    }

    public static AudioStream emppedra() throws Exception {
        //mudar o caminho para cada maquina
        AudioStream audio = new AudioStream(new FileInputStream(System.getProperty("user.dir")+File.separator + "src"+ File.separator + "audio"+ File.separator + "emppedra.wav"));
        AudioPlayer.player.start(audio);
        return audio;
    }

    public static AudioStream entradaFloresta() throws Exception {
        //mudar o caminho para cada maquina
        AudioStream audio = new AudioStream(new FileInputStream(System.getProperty("user.dir")+File.separator + "src"+ File.separator + "audio"+ File.separator + "entradaFloresta.wav"));
        AudioPlayer.player.start(audio);
        return audio;
    }

    public static AudioStream esfolar() throws Exception {
        //mudar o caminho para cada maquina
        AudioStream audio = new AudioStream(new FileInputStream(System.getProperty("user.dir")+File.separator + "src"+ File.separator + "audio"+ File.separator + "esfolar.wav"));
        AudioPlayer.player.start(audio);
        return audio;
    }

    public static AudioStream ferido() throws Exception {
        //mudar o caminho para cada maquina
        AudioStream audio = new AudioStream(new FileInputStream(System.getProperty("user.dir")+File.separator + "src"+ File.separator + "audio"+ File.separator + "ferido.wav"));
        AudioPlayer.player.start(audio);
        return audio;
    }

    public static AudioStream finalMario() throws Exception {
        //mudar o caminho para cada maquina
        AudioStream audio = new AudioStream(new FileInputStream(System.getProperty("user.dir")+File.separator + "src"+ File.separator + "audio"+ File.separator + "finalMario.wav"));
        AudioPlayer.player.start(audio);
        return audio;
    }

    public static AudioStream fogo() throws Exception {
        //mudar o caminho para cada maquina
        AudioStream audio = new AudioStream(new FileInputStream(System.getProperty("user.dir")+File.separator + "src"+ File.separator + "audio"+ File.separator + "fogo.wav"));
        AudioPlayer.player.start(audio);
        return audio;
    }

    public static AudioStream galinha() throws Exception {
        //mudar o caminho para cada maquina
        AudioStream audio = new AudioStream(new FileInputStream(System.getProperty("user.dir")+File.separator + "src"+ File.separator + "audio"+ File.separator + "galinha.wav"));
        AudioPlayer.player.start(audio);
        return audio;
    }

    public static AudioStream globin() throws Exception {
        //mudar o caminho para cada maquina
        AudioStream audio = new AudioStream(new FileInputStream(System.getProperty("user.dir")+File.separator + "src"+ File.separator + "audio"+ File.separator + "globin.wav"));
        AudioPlayer.player.start(audio);
        return audio;
    }

    public static AudioStream howno() throws Exception {
        //mudar o caminho para cada maquina
        AudioStream audio = new AudioStream(new FileInputStream(System.getProperty("user.dir")+File.separator + "src"+ File.separator + "audio"+ File.separator + "howno.wav"));
        AudioPlayer.player.start(audio);
        return audio;
    }

    public static AudioStream itemLendario() throws Exception {
        //mudar o caminho para cada maquina
        AudioStream audio = new AudioStream(new FileInputStream(System.getProperty("user.dir")+File.separator + "src"+ File.separator + "audio"+ File.separator + "itemLendario.wav"));
        AudioPlayer.player.start(audio);
        return audio;
    }

    public static AudioStream templo() throws Exception {
        //mudar o caminho para cada maquina
        AudioStream audio = new AudioStream(new FileInputStream(System.getProperty("user.dir")+File.separator + "src"+ File.separator + "audio"+ File.separator + "templo.wav"));
        AudioPlayer.player.start(audio);
        return audio;
    }

    public static AudioStream javali() throws Exception {
        //mudar o caminho para cada maquina
        AudioStream audio = new AudioStream(new FileInputStream(System.getProperty("user.dir")+File.separator + "src"+ File.separator + "audio"+ File.separator + "javali.wav"));
        AudioPlayer.player.start(audio);
        return audio;
    }
}