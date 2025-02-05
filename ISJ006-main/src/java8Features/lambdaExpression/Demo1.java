package java8Features.lambdaExpression;

public class Demo1 {
    @FunctionalInterface
    interface MusicService {
        void playMusic();
    }

    public static void main(String[] args) {
        MusicService musicService = () -> System.out.println("Playing music lambda expression way");
        musicService.playMusic();
    }
}
