package ming.exception_handling;

class CallEg
{

  public void methodA() throws Exception{
          try{
      methodB();
  }
          catch(Exception e){
              e.printStackTrace();
          }
  
   
  }

  public void methodB() throws Exception
  {
      try{
      methodC();
  }
          catch(Exception e){
              e.printStackTrace();
          }
  }

  public void methodC() throws Exception
  {
  throw new Exception("Mehod C Exception"); 
  }

}

public class TestTrace
{

  public static void main ( String[] args )throws Exception{
    CallEg eg = new CallEg();   // use default constructor
    try{
      eg.methodA();
    }
    catch ( Exception oops ){
       oops.printStackTrace();
    }
  }
}