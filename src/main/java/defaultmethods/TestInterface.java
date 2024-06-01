package src.main.java.defaultmethods;


interface TestInterface {
 default void test(){
   System.out.println("This is interface default method");
 }
  
  static void testStatic(){
    System.out.println("This is the interface static method");
  }
}
