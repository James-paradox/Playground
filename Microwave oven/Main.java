#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int items;
  float time, total;
  cin>>items;
  cin>>time;
  if(items==2){
    total = ((50*time)/100) + time;
    cout<<total;
  }
  else if(items == 3) {
    total = 2*time;
    cout<<total;
  }
  else
    cout<<"Number of items is more";
}