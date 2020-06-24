#include<iostream>
using namespace std;
struct complex{
  int r1;
  int r2;
  int im1;
  int im2;
};
void display(complex, int);
int main(){
  complex c;
  int n;
  cin>>n;
  cin>>c.r1;
  cin>>c.im1;
  cin>>c.r2;
  cin>>c.im2;
  display(c,n);
}
void display(complex c, int n)
{
  if(n==1)
  {
    int a,b;
    a=c.r1 + c.r2;
    b=c.im1 + c.im2;
    if(b>=0)
    {
    cout<<a<<"+"<<b<<"i"<<endl;
    }
    else if(b<0)
    {
      cout<<a<<"-"<<b<<"i"<<endl;
    }
  }
   else if(n==2)
  {
    int p,q;
    p=c.r1 - c.r2;
    q=c.im1 - c.im2;
    if(q>=0)
    {
    cout<<p<<"+"<<q<<"i"<<endl;
    }
    else if(q<0)
    {
      cout<<p<<"-"<<q<<"i"<<endl;
    }
  }
   else if(n==3)
  {
    int x,y;
    x=(c.r1*c.r2) + (c.im1*c.im2*(-1));
    y=(c.r1*c.im2) + (c.im1*c.r2);
    if(y>=0)
    {
    cout<<x<<"+"<<y<<"i"<<endl;
    }
    else if(y<0)
    {
      cout<<x<<y<<"i"<<endl;
    }
  }
  else
  {
    cout<<"Invalid choice"<<endl;
  }
}