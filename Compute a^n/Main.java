#include<iostream>
using namespace std;
int power(int x, int y)
{
  if(y==0)
  {
    return 1;
  }
  else
    return (x*power(x,y-1));
}
int main()
{
  //Type your code here.
  int a,n;
  cout<<"Enter the value of a "<<endl;
  cin>>a;
  cout<<"Enter the value of n "<<endl;
  cin>>n;
  cout<<"The value of "<<a<<" power "<<n<<" is "<<power(a,n)<<endl;
}