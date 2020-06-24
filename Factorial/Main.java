#include<iostream>
using namespace std;
int fact(int x)
{
  int f=1;
  if(x==0)
  {
    return 1;
  }
  else
  {
    return x*fact(x-1);
  }
}
int main()
{
  //Type your code here.
  int n;
  cin>>n;
  cout<<"The factorial of "<<n<<" is "<<fact(n);
}