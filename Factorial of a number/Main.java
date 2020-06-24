#include<iostream>
int main(){
  // Type your code here
  int n,fact=1;
  std::cin>>n;
  for(n;n!=0;n--)
  {
    fact=fact*n;
  }
  std::cout<<fact;
}