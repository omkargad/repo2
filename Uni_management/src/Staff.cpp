#include "Staff.h"
#include <iostream>
#include<string>

using namespace std;
Staff::Staff(string firstname, string lastname)
{
    cout << "First name :" << firstname << endl;
    cout << "Last name :" << lastname << endl;
}

Staff::~Staff()
{
    cout << "staff Destroyed"  << endl;
}
