#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  string door;
  int rail;
  cin>>door;
  cin>>rail;
  if(door == "front")
  {
    if(rail == 1)
    {
      cout<<"Left Handed";
    }
    else 
    {
      cout<<"Right Handed";
    }
  }
  else if (door == "rear")
  {
    if(rail == 1)
    {
      cout<<"Right Handed";
    }
    else 
    {
      cout<<"Left Handed";
    }
}
  else 
    cout<<"invalid input";
}