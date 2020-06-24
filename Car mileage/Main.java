#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  float mil,t_travel;
  int petrol,dist;
  cin>>mil;
  cin>>petrol;
  cin>>dist;
  t_travel = mil*petrol;
  if(t_travel>dist){
    cout<<"Can reach";
  }
  else
  {
    cout<<"Cannot reach";
  }
}