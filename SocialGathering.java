class SocialGathering{
   public static void main(String[] args) {
    IBeNice p = new Parent();
    IBeNice c = new Child();
    IBeNice a = new Accident();

    System.out.println("\nWhen the guests arrive...");
    p.Greet();
    c.Greet();
    a.Greet();


    System.out.println("\nWhile in reality...");
    ((Parent)p).freeWill();
    ((Child)c).freeWill();
    ((Accident)a).freeWill();

   }
}