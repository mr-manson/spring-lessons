package by.nikalaichanka.spring;

import java.util.List;

public class MusicPlayer {
    private Music music;
    private List<Music> musicList;
    private String name;
    private int volume;

    public MusicPlayer(){}

    public MusicPlayer(Music music){
        this.music = music;
    }

    public void setMusic (Music music){
        this.music = music;
    }

    public String getName(){
        return name;
    }

    public void setName (String name){
        this.name = name;
    }

    public int getVolume(){
        return volume;
    }

    public void setVolume(int volume){
        this.volume = volume;
    }

    public void playMusic (){
        System.out.println("Playing: " + music.getSong());
    }

    //TODO List Music
    public void playMusic(List music){

    }
}
