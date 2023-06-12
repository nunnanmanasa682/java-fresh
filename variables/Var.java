class Var{
	   int a=200;
        int b=300;
		static int c=400;
     public static void main(String[] args){
	      Var t1=new Var();
		  Var t2=new Var();
		  System.out.println(Var.c);
		  t2.c=3;
		  System.out.println(c);
		  System.out.println(t1.c);
		  System.out.println(t2.c);
		 }
		}
	   