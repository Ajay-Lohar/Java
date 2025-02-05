package java8Features.functionalInterface;

public class Demo7SubclassCreationOfInterfaceUsingTAnonymousWay {
    @FunctionalInterface
    interface MusicService {
        void playMusic();
    }

    public static void main(String[] args) {


        MusicService musicService = new MusicService() {
            @Override
            public void playMusic() {
                System.out.println("Playing music anonymous class way");
            }
        };

        musicService.playMusic();
    }
}
