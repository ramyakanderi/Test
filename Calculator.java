public class Calculator{

int Addition()
   {  
   int x = 20;
   int y = 30;
   int add = x+y;
return add;
   }

public static void main(String[] args){
Calculator object = new Calculator();
   int Addition;
   Addition = object.Addition();
   System.out.println(Addition);
  }
}
