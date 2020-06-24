#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int p,r,t;
   
    cin >> p;
    cin>> r;
    cin>> t;
  float i,a,d,final;
     i = (p*r*t)/100;
    cout<<i<<endl;
  	 a = p + i;
  	cout<<a<<endl;
  	 d = i*(0.02);
  	cout<<d<<endl;
  	 final = a - d;
  	cout<<final<<endl;
    return 0;
}