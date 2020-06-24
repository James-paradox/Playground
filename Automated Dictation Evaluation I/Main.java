#include<iostream>
#include<string>
using namespace std;
int main()
{
  //Type your code here.
  string str;
  getline(cin,str);
  string a1;
  getline(cin,a1);
  if(str==a1)
  {
    cout<<"It is correct";
  }
  else 
    cout<<"It is wrong";
}