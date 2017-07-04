# Alphabet
import java.io.*;
import java.util.*;
import java.lang.*;
public class Alphi{
  public static void main(String args[])throws IOException
  {
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter the character:");
    char ch=br.readLine().charAt(0);
    if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z'))
    {
      System.out.println("Alphabet");
    }
    else       
    System.out.println("not Alphabet");
  }
}
