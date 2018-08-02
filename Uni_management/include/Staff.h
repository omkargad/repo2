#ifndef STAFF_H
#define STAFF_H
#include <string>


using namespace std;
class Staff
{
    protected:
        string firstname;
        string lastname;

    public:
         Staff();
        ~Staff();
        Staff(string firstname, string lastname);

        string getfirstname()
        {
            return this->firstname;
        }
        string getlastname()
        {
            return this->lastname;
        }

};

#endif // STAFF_H
