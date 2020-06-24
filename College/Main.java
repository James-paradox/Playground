#include <iostream>
using namespace std;
 struct College { char name[100]; 
                 char city[100]; 
                 int yr; 
                 float per; 
                };
int main() {
  cout<<"Enter the number of colleges"<<endl;
  int n;
  cin>>n;
  College c[n];
  
  for(int i=0;i<n;i++)
  {
    cout<<"Enter the details of college "<<i+1<<endl;
    cout<<"Enter name"<<endl;
    cin>>c[i].name;
    cout<<"Enter city"<<endl;
    cin>>c[i].city;
    cout<<"Enter year of establishment"<<endl;
    cin>>c[i].yr;
    cout<<"Enter pass percentage"<<endl;
    cin>>c[i].per;
  }
  cout<<"Details of colleges"<<endl;
  for(int i=0;i<n;i++)
  {
    cout<<"College:"<<i+1<<endl;
    cout<<"Name:"<<c[i].name<<endl;
    cout<<"City:"<<c[i].city<<endl;
    cout<<"Year of establishment:"<<c[i].yr<<endl;
    cout<<"Pass percentage:"<<c[i].per<<endl;
  }
return 0;
}