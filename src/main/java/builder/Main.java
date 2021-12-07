package builder;

public class Main {
    public static void main(String[] args) {
        User user = User.builder().age(19).gender("m").build();

        System.out.println(user);
    }
}
