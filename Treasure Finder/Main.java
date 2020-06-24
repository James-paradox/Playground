#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a,b,c,x;
  cin>>a;
  cin>>b;
  cin>>c;
  if(a >= b && a >= c)
    {
        if(b >= c)
        {
            cout<<"The treasure is in box which has number "<<b<<endl;
        }
        else
        {
            cout<<"The treasure is in box which has number "<<c<<endl;
        }
    }
    else if(b >= a && b >= c)
    {
        if(a >= c)
        {
            cout<<"The treasure is in box which has number "<<a<<endl;
        }
        else
        {
             cout<<"The treasure is in box which has number "<<c<<endl;
        }
    }

    // c is the largest number of the three
    else if(a >= b)
    {
        cout<<"The treasure is in box which has number "<<a<<endl;
    }
    else
    {
         cout<<"The treasure is in box which has number "<<b<<endl;
    }
  
  x = ((a<b)?(a<c?a:c):(b<c?b:c));
  if(a%x==0 && b%x==0 && c%x==0)
  {
    cout<<"The code to open the box is "<<x<<endl;
  }
  else
    cout<<"The code to open the box is 1"<<endl;
}