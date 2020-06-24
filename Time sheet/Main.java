#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int s,m,t,w,th,f,sa,p;
  cin>>s;
  cin>>m;
  cin>>t;
  cin>>w;
  cin>>th;
  cin>>f;
  cin>>sa;
  if(m<=24){
    if(m<=8)
    {
      p=m*100;
     // cout<<p;
    }
    else
    {
      p=(m*100)+(m-8)*15;
     // cout<<p;
    }
}
  else 
  {
    cout<<"invalid input";
  }
  int x = p;
if(t<=24)
{
    if(t<=8)
    {
      x=x+(t*100);
      //cout<<x;
    }
    else
    {
      x=x+((t*100)+(t-8)*15);
      //cout<<x;
    }
}
 else{
    cout<<"Invalid input";
 }
int y=x;
  if(w<=24) {   
    if(w<=8 )
    {
      y=y+(w*100);
    }
    else
    {
      y=y+((w*100)+(w-8)*15);
    }
  }
   else{
    cout<<"Invalid input";
 }
  int z=y;
   //cout<<z;   
 if(th<=24)
 {
    if(th<=8)
    {
      z=z+(th*100);
    }
    else
    {
      z=z + ((th*100)+(th-8)*15);
    }
 }
   else{
    cout<<"Invalid input";
 }
  int q= z;
  if(f<=24) {
    if(f<=8)
    {
      q=q+(f*100);
    }
    else
    {
      q=q+((f*100)+(f-8)*15);
    }
  }
   else{
    cout<<"Invalid input";
 }
  //cout<<q;
  int total_hr = m+t+w+th+f;
  int sal;
  int t_s = 100 + ((100*50)/100);
  int t_sa = 100 + ((100*25)/100);
    
  if( total_hr > 40)
  {
     sal = q + ((total_hr - 40)*25);
    cout<<sal;
  }
  else
  {
    if(s>=0 || sa>=0)
    {
       sal = q + (s*t_s) + (sa*t_sa);
      cout<<sal;
    }
  }
}