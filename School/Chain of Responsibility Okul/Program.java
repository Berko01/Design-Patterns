public class Program {
    public static void main(String[] args) {
        PlayerHandler mp4Player = new ConcreteHandlerMp4();
        PlayerHandler mpgPlayer = new ConcreteHandlerMpg();
        PlayerHandler aviPlayer = new ConcreteHandlerAvi();

        mp4Player.setNextHandler(mpgPlayer);
        mpgPlayer.setNextHandler(aviPlayer);

        mp4Player.play("video.mpg");        
        mp4Player.play("video.avi");
        mp4Player.play("video.mp4");
        mp4Player.play("video.swf");
    }
}
