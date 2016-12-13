// Problem 1.1 - Check String has all unique characters no extra space

public class IsUnique{
  private boolean isUnique(String str){
    long bitVector = 0;
    
    for(int i=0; i<str.length(); i++){
      int ch = (int)(str.charAt(i) - 'a');
      if(((1<<ch) & bitVector) > 0)
        return false;
      bitVector |= (1<<ch);
    }
    return true;
  }

  public static void main(String[] args){
    IsUnique unique = new IsUnique();
    System.out.println(unique.isUnique("tahir"));
    System.out.println(unique.isUnique("tahirt"));
  }
}
