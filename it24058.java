public class it24058 {

    public static void main(String[] args) {

        for (int i = 0; i < args.length; i += 2) {

            if (i + 1 < args.length) {

                String brand = args[i];
                String color = args[i + 1];

                Vehicle v = new Vehicle(brand, color);
                v.start();
            }
        }
    }
}