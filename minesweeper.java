import java.util.*;
class minesweeper
{
 public static void main(String ar[])
 {
   Scanner z=new Scanner(System.in);

int r=0,c=0,m=0,e=0;
   do
  {
    System.out.println("Enter difficulty level");
    System.out.println("1-Beginner");
    System.out.println("2-Intermediate");
    System.out.println("3-Advanced");
    System.out.println("4-custom");
    e=z.nextInt();
    if(e==1)
    {
     r=9;
     c=9;
     m=10;
    }
  else if(e==2)
    {
     r=16;
     c=16;
     m=40;
    }
  else if(e==3)
    {
     r=16;
     c=30;
     m=99;
    }
  else if(e==4)
   {
    System.out.println("Enter the rows and columns of field");
    r=z.nextInt();
    c=z.nextInt();
    System.out.println("Enter number of mines");
    m=z.nextInt();
    }
   else
   System.out.println("wrong option");
  }
  while(e==0 || e>4);

    int f[][]=new int[r][c];
    int q=0,w=0,i,j,a=0,x,y,u=0;
    double b=0,v=0;
    String k[][]=new String[r][c]; 

   System.out.println("Enter position of mines in rows and columns");
     for (i=1;i<=m;i++)
    {
     
       b=Math.random()*r;
       q=(int)b;
     
       v=Math.random()*c;
       w=(int)v;

      f[q][w]=f[q][w]+10;

      if(q!=0)
        f[q-1][w]=f[q-1][w]+1;
      if(w!=0)
        f[q][w-1]=f[q][w-1]+1;
      if(q<r-1)
        f[q+1][w]=f[q+1][w]+1;
      if(w<c-1)
        f[q][w+1]=f[q][w+1]+1;
      if(q!=0 && w!=0)
        f[q-1][w-1]=f[q-1][w-1]+1;
      if(q<r-1 && w<c-1)
        f[q+1][w+1]=f[q+1][w+1]+1;
      if(q!=0 && w<c-1)
        f[q-1][w+1]=f[q-1][w+1]+1;
      if(q<r-1 && w!=0)
        f[q+1][w-1]=f[q+1][w-1]+1;
      }
   for(i=0;i<r;i++)
   {
    for(j=0;j<c;j++)
    {
     k[i][j]="*"; 
    }
    
   }
   for(i=0;i<r;i++)
   {
    for(j=0;j<c;j++)
    {
    System.out.print(k[i][j]+" ");
    }
    System.out.println();
    System.out.println();

   }

   System.out.println();
   System.out.println();
 do
 {

   System.out.println("1=Play");
   System.out.println("2=flag");
   System.out.println("3=Doubt");
   a=z.nextInt();
  if(a==1)
  {
   System.out.println("enter rows and columns");
   x=z.nextInt();
   y=z.nextInt();
   if(f[x-1][y-1]>=10)
   {
    k[x-1][y-1]="B";
    u=10;
    break;
   }
   else if(f[x-1][y-1]==0)
    k[x-1][y-1]=" ";
   else
   {
    k[x-1][y-1]=Integer.toString(f[x-1][y-1]);
   }
  }
  if(a==2)
  {
   System.out.println("enter rows and columns");
   x=z.nextInt();
   y=z.nextInt();
   k[x-1][y-1]="@";
  }
  if(a==3)
  {
   System.out.println("enter rows and columns");
   x=z.nextInt();
   y=z.nextInt();
   k[x-1][y-1]="?";
  }
  if(a>=4 || a==0)
  {
   System.out.println("Wrong option");
  }
  else
  {
  for(i=0;i<r;i++)
   {
    for(j=0;j<c;j++)
    {
     System.out.print(k[i][j]+" ");   
    }
     System.out.println();
     System.out.println();

   }
   System.out.println();
   System.out.println();

  }
}
 while(true);
 if(u==10)
 {
   for(i=0;i<r;i++)
   {
    for(j=0;j<c;j++)
    {
     if(f[i][j]>=10)
     System.out.print("B ");
     else if(f[i][j]==0)
     System.out.print("  ");
     else
     System.out.print(f[i][j]+" ");
    }
   System.out.println();
   System.out.println();

  }
  System.out.println("YOU LOOSE");
}
 else
  System.out.println("YOU WIN");
 
 }
}
