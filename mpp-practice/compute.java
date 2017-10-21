package intermethodref;

public interface compute 
{
 default int op(int f, int s)
  {
	  return(f-s);
  }
  
  public static int add(int f, int s)
  {
	  return(f+s);
  }
}
