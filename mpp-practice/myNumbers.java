package intermethodref;

public class myNumbers 
{
 private int fir;
 private int sec;
 private int sum;
 compute cmpt;
  public myNumbers(int f,int s)
  {
	  fir=f;
	  sec=s;
	  sum=compute.add(f, s);
  }
  
  public void setFir(int f)
  {
	  fir=f;
  }
  public int getFir()
  {
	  return fir;
  }
  
  public void setSec(int s)
  {
	  sec=s;
  }
  public int getSec()
  {
	  return sec;
  }
  
  public int getSum()
  {
	  return sum;
  }
  
  
  //Add two numbers
  public int addUs()
  {
	  return (compute.add(this.fir, this.sec));
  }
  
  public int subUs()
  {
	 
	 return (myMethodSub(new compute() 
      {
	        public int op(int f,int s) 
	        { 
	        	return(compute.super.op(f,s));}
	        }
		));
	//compute cmp=new compute();
	 
  }
  public int myMethodSub(compute cmp)
  {
	  return(cmp.op(this.fir,this.sec));
  }
  
  public int mulUs()
  {
	  cmpt=new mul();
	  return(cmpt.op(fir, sec));
  }
  public int dvdUs()
  {
	  cmpt=new divide();
	  return(cmpt.op(fir, sec));
  }
}
