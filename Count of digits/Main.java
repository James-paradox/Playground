#include<iostream>
int main()
{
  // Type your code here
  int n,sum=0,a;
  std::cin>>n;
  do{
	a=n%10;
    sum = sum+1;
    n=n/10;  
  }while(n>0);
  std::cout<<sum;
}