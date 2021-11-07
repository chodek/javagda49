package wzorce.builder;

public class Fish {
    private double length;
    private int age;
    private String colour;
    private double weight;
    private boolean flying;

    private Fish() {
    }

    public static class Builder {
        private double length;
        private int age;
        private String colour;
        private double weight;
        private boolean flying;

        public Builder length(double length) {
            this.length = length;
            return this;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Builder colour(String colour) {
            this.colour = colour;
            return this;
        }

        public Builder weight(double weight) {
            this.weight = weight;
            return this;
        }

        public Builder flying(boolean flying) {
            this.flying = flying;
            return this;
        }

        public Fish build() {
            Fish fish = new Fish();
            fish.length = this.length;
            fish.age = this.age;
            fish.colour = this.colour;
            fish.weight = this.weight;
            fish.flying = this.flying;

            return fish;

        }
    }

}
