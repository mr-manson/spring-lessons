package by.nikalaichanka.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");
        //AnnotationConfigApplicationContext context2 = new AnnotationConfigApplicationContext(MyConfig.class);

        //Music music = context.getBean("musicBean", Music.class);
        //MusicPlayer player = new MusicPlayer(music);

        //MusicPlayer player = context.getBean("musicPlayer", MusicPlayer.class);

        Music music = context.getBean("musicBean", Music.class);

        MusicPlayer player = new MusicPlayer(music);
        player.playMusic();

        /*System.out.println(player.getName());
        System.out.println(player.getVolume());*/

        context.close();
    }
}
