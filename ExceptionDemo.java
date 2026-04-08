import java.util.*;
public class ExceptionDemo{
    public static void main(String[] args){
        try{
            int a=10;
            int b=0;
            int c=a/b;
            System.out.println(c);
        }catch(Exception e){
            System.out.println("error: Division by zero");
        }finally{
            System.out.println("program excuted");
        }
        }
    }
