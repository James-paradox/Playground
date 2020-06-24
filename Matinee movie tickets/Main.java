#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int age;
  float timing;
  cin>>age;
  cin>>timing;
  if( age>13 && timing>12)
  {
    cout<<"$5.00";
  }
  else if(age>13 && timing<12)
  {
    cout<<"$8.00";
  }
  //children
  else if(age<=13 && timing>12)
  {
    cout<<"$2.00";
  }
  else if(age <= 13 && timing<12)
  {
    cout<<"$4.00";
  }
  else
    cout<<"Invalid input";
}