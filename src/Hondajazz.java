class HondaJazz extends Car {
    public HondaJazz() {
        // Sample specific attributes for Honda Jazz
        super(4, 5, 40.0, "Automatic");
    }

    // Additional method specific to Honda Jazz
    public void playMusic() {
        System.out.println("Playing music in Honda Jazz.");
    }
}

class ToyotaFortuner extends Car {
    public ToyotaFortuner() {
        // Sample specific attributes for Toyota Fortuner
        super(4, 4, 80.0, "Manual");
    }

    // Additional method specific to Toyota Fortuner
    public void offRoad() {
        System.out.println("Toyota Fortuner is off-roading.");
    }
}

class SuzukiKatana extends Car {
    public SuzukiKatana() {
        // Sample specific attributes for Suzuki Katana
        super(2, 2, 20.0, "Automatic");
    }

    // Additional method specific to Suzuki Katana
    public void wheelie() {
        System.out.println("Suzuki Katana is doing a wheelie.");
    }
}
