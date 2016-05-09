public class HelloWorld {
  public static String hello(String greeted) {

   if(greeted == null || greeted.isEmpty()) {
     greeted = "World";
    }

    return "Hello, " + greeted + "!";

  }
}
