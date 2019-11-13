package hello.decoratorDemo;

public class Main {
    private static Cache cache = new Cache(new Decorator(new DataServiceImply()));

    public static void main(String[] args) {
        System.out.println(cache.getRandomString());
        System.out.println(cache.getRandomString());
    }
}
