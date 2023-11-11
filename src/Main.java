public class Main {
    public static void main(String[] args) {
        HondaJazz jazz = new HondaJazz();
        jazz.moveForward();
        jazz.turn();
        jazz.fillGas();
        jazz.changeGear();
        jazz.playMusic();

        ToyotaFortuner fortuner = new ToyotaFortuner();
        fortuner.moveForward();
        fortuner.turn();
        fortuner.fillGas();
        fortuner.changeGear();
        fortuner.offRoad();

        SuzukiKatana katana = new SuzukiKatana();
        katana.moveForward();
        katana.turn();
        katana.fillGas();
        katana.changeGear();
        katana.wheelie();
    }
}