package java8Features.functionalInterface;

public class Demo6SubclassCreationOfInterfaceUsingTradionalWay {
    @FunctionalInterface
    interface MusicService{
        void playMusic();
    }

    public static void main(String[] args) {
        class MusicServiceImpl implements MusicService{
            @Override
            public void playMusic() {
                System.out.println("Playing music tradional way");
            }
        }

        MusicService musicService = new MusicServiceImpl();

        musicService.playMusic();
    }
}
