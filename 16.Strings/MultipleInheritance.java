public class MultipleInheritance {
    public static void main(String[] args) {
        SmartPhone S27 = new SmartPhone();
        S27.takePhoto();
        S27.playMusic();
    }
}
interface Camera{
    void takePhoto();
}
interface MusicPlayer{
    void  playMusic();
}

class SmartPhone implements Camera , MusicPlayer{
    public void takePhoto(){
        System.out.println("Taking Photo");
    }
    public void playMusic(){
        System.out.println("Playing Music");
    }
}