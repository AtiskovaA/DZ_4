public class Main {
    public static void main(String[] args) {
        MagicBox<String> magicBox = new MagicBox<>(3);
        System.out.println(magicBox.add("Anya"));
        System.out.println(magicBox.add("Pasha"));
        System.out.println(magicBox.add("Roma"));

        MagicBox<Integer> magicBox1 = new MagicBox<>(3);
        System.out.println(magicBox1.add(110));

        System.out.println(magicBox.pick());

    }
}