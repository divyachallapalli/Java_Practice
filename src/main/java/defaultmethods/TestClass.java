package src.main.java.defaultmethods;


class TestClass implements TestInterface{
  public static void main(String[] args) {
    
    System.out.println("Hello Codiva");
    TestInterface.testStatic();
    TestClass cls=new TestClass();
    cls.sampleRun();
    cls.test();
  }
  
  private void sampleRun(){
    test();
  }
  
  public void test(){
    System.out.println("This is overridden test method");
  }
}
