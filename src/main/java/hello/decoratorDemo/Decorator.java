package hello.decoratorDemo;

public class Decorator implements DataService{

    DataServiceImply dataServiceImply;

    public Decorator(DataServiceImply dataServiceImply) {
        this.dataServiceImply = dataServiceImply;
    }

    @Override
    public String getRandomString() {
        System.out.println("interface is called");
        System.out.println("interface is finish");
        return dataServiceImply.getRandomString();
    }
}
