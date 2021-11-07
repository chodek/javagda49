package wzorce.builder;

public class Main {
    public static void main(String[] args) {

        Fish goldFish = new Fish.Builder()
                .age(15)
                .flying(true)
                .build();
    }
}
