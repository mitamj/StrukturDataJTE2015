class SalahIndeks{   
   
 public static void test(){
    throw new IllegalAccessException("SalahIndeks");
     }
  public static void main (String[]args){
      try
      {
          test();
      }catch (Exception e){
          System.out.println("Salah Indeks");
 }
    System.out.println(e.getMessage());
}
    System.out.println("Salah Indeks");
}
}
