#include <iostream>

#include<cstring>

using namespace std;

struct student

{

string name;

int roll;

float marks;

};

int main() 

{

struct student s;

getline(cin,s.name);

cin>>s.roll;

cin>>s.marks;

cout<<"\nStudent Details"<< std::endl;

cout<<"Name: "<<s.name<<std::endl;

cout<<"Roll: "<<s.roll<<std::endl;

cout<<"Marks: "<<s.marks<<std::endl;

return 0;

 //Your code goes here

}