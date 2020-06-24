#include<iostream>
using namespace std;
int fibo(int x)
{
  if(x==0)
  {
	return 0;
  }
  else if(x==1)
  {
    return 1;
  }
  else
  {
    return (fibo(x-1) + fibo(x-2));
  }
}
int main()
{
  //Type your code here.
  int n, s;
  cin>>n;
  s=fibo(n-1);
  cout<<"The term "<<n<<" in the fibonacci series is "<<s;
}