#include <cstring>
#include <iostream>
using namespace std;
int main()
{
   //Your code goes here
  char a[100];
  cin.getline(a,100);
  int b= strlen(a);
  int count=0;
  for(int i=0;i<b;i++)
  {
    if(a[i]==' ')
    {
      count++;
    }
  }
  if(count<=10)
  {
    cout<<"Caption eligible for the contest";
  }
  else{
    cout<<"Caption not eligible for the contest";
  }
   
}