import static org.junit.Assert.assertEquals;

public class Test {
    private Greeter greeter = new Greeter();

    @org.junit.Test
    public void GreeterSayHello(){
        assertEquals(greeter.sayHello(),"Hello world!");
    }
}
