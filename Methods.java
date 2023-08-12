class Methods {

  
  public void display1() {
    System.out.println("Method without parameter");
  }


  public void display2(int a) {
    System.out.println("Method with a single parameter: " + a);
  }

  public static void main(String[] args) {
    
    
    Methods obj = new Methods();

    
    obj.display1();
    
    
    obj.display2(24);
  }
}