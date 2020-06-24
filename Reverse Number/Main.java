#include <iostream>
int main() 
{
	// Type your code here
  int n,a,sum=0;
  std::cin>>n;
  while(n>0){
  a=n%10;
    sum=(sum*10)+a;
    n=n/10;
  }
  std::cout<<sum;
  return 0;
}