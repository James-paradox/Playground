#include<iostream>
#include<string>
#include<cstring>
using namespace std;
void strrrev(char * str) 
{
int j = 0, i = 0;
while(str[j+1]) j++;
while(i < j) 
{
char temp = str[i];
str[i] = str[j];
str[j] = temp;
i++;
j--;
}
}
int main()
{
  //Type your code here.
  char str[50];
  cin.getline(str,50);
  char a1[50];
  cin.getline(a1,50);
  //string a2;
strrrev(str);
 // cout<<str;
 int num = strcmp(str, a1);
  if(num==0)
  {
    cout<<"It is correct";
  }
  else
    cout<<"It is wrong";
}