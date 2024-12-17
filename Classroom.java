public class Classroom {
    public static void main(String[] argument) {
        Wilder awareMood = new Wilder("Anne-So", true);
        Wilder notAwareMood = new Wilder("Pilloux", false);

        System.out.println(awareMood.whoAmI());
        System.out.println(notAwareMood.whoAmI());
    }
}
