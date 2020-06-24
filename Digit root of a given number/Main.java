#include<iostream>
using namespace std;
int sod(int x)
{
  int s;
  if(x>9)
  {
    if(x==0)
    {
     s= x;
      return s;
    }
    else
    {
      s= (x%10 + sod(x/10));
    //  return s;
    }
  }
  else
    {
      return x;
    }
    int t=s;
  	if(t<=9)
    {
      return t;
    }
 	else 
    {
      return sod(t);
    }
}
int main()
{
	int n;
  cin>>n;
  cout<<sod(n);
}