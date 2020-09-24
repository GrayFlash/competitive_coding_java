
/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
 public static void main (String[] args) throws java.lang.Exception
 {
  Scanner s=new Scanner(System.in);
 int t=s.nextInt();
 for(int xx=0;xx<t;xx++)
 {
     int n=s.nextInt();
     int k=s.nextInt();
     int ary[]=new int[n+1];int m[]=new int[n+1];
     int v[][]=new int[n][3];int indv=00;
     int temp1=0;int temp2=0;
     for(int ent=1;ent<=n;ent++)
     {
         ary[ent]=s.nextInt();
     }
     for(int i=1;i<=n;i++)
                {
                    m[ary[i]]=i;
                }
 
          for(int i=1;i<=n;i++)
            {
                if(ary[i]!=i)
                  //  cout<<i<<" "<<ary[i]<<"\n";
                {   int x=i;
                int y=ary[x];
                int z=ary[y];

                     if( ary[ary[ary[x]]]==x&& ary[ary[i]]!=i)
                     {

                        v[indv][0]=x;v[indv][1]=y;v[indv][2]=z;indv++;
                        
                        int val=ary[y];
                        int idx=m[ary[i]];
                       ary[y]=y;
                       ary[z]=z;
                       ary[x]=x;

                    m[y]=y;
                     m[z]= z;
                       m[i]=i;

                     }
                }
            }
            
            
            for(int i=1;i<=n;i++)
            {
                if(ary[i]!=i)
                  //  cout<<i<<" "<<ary[i]<<"\n";
                {

                     if(ary[ary[i]]!=i)
                     {
                               // cout<<"hi"<<ary[i];
                           v[indv][0]=i; v[indv][01]=ary[i]; v[indv][02]=m[i];    indv++; 
                        int index1=i;
                        int index2=ary[i];
                        int index3=m[i];
                        int value1=ary[i];
                        int value2=ary[ary[i]];
                        int value3=ary[m[i]];
                        m[value1]=index2;
                        m[value2]=index3;
                        m[value3]=index1;

                       ary[index2]=value1;
                       ary[index1]=value3;
                       ary[index3]=value2;


                     }
                }
            }
            
            for(int i=1;i<=n;i++)
            {
                if(ary[i]!=i)
                  //  cout<<i<<" "<<ary[i]<<"\n";
                {
                       int x=i;
                     int y=ary[i];
                     int z=ary[ary[i]];
                     int a=i;
                     int b= m[y];
                     int c=m[i];
                     if(ary[ary[i]]==i)
                     {
                         if(temp1==0&&temp2==0)
                         {
                             temp1=i;
                             temp2=ary[i];
                         }
                         else if(i!=temp2)
                         {   //   cout<<"hi"<<ary[i];
                         v[indv][0]=temp1; v[indv][1]=i; v[indv][2]=temp2;    indv++; 
                         
                              int index1=temp1;
                        int index2=i;
                        int index3=temp2;
                        int value1=ary[index1];
                        int value2=ary[index2];
                        int value3=ary[index3];
                        m[value1]=index2;
                        m[value2]=index3;
                        m[value3]=index1;

                       ary[index2]=value1;
                       ary[index1]=value3;
                       ary[index3]=value2;

                              temp1=0;
                              temp2=0;
                         }
                     }
                     else{


v[indv][0]=i; v[indv][1]=ary[i]; v[indv][2]=m[i];    indv++; 
                       int index1=i;
                        int index2=ary[i];
                        int index3=m[i];

int value1=ary[index1];
                        int value2=ary[index2];
                        int value3=ary[index3];
                        m[value1]=index2;
                        m[value2]=index3;
                        m[value3]=index1;

                       ary[index2]=value1;
                       ary[index1]=value3;
                       ary[index3]=value2;


                     }
                }
}

int anss=0;
  for(int i=1;i<=n;i++)
  {
      if(ary[i]!=i)
      {
          anss=1;
      }
  }
if(anss==1)
{
    System.out.println("-1");
    continue;
}
 System.out.println(indv);

             for(int iqqq=0;iqqq<indv;iqqq++)
             {
                System.out.println(v[iqqq][0]+" "+v[iqqq][1]+" "+v[iqqq][2]);
             }
    

 }
 }
}