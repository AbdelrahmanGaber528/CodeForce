#include <iostream>
#include <string>

using namespace std;

int sumOfDigits(long long n) {
    int sum = 0;
    while (n > 0) {
        int digit = n % 10;
        sum += digit;
        n /= 10;
    }
    return sum;
}

int main() {
    long long id;
    cin >> id;

    bool isPalindrome = true;
    string nP = to_string(id);
    
    for (size_t i = 0; i < nP.length() / 2; i++) {
        if (nP[i] != nP[nP.length() - 1 - i]) {
            isPalindrome = false;
            break;
        }
    }

    int sum = sumOfDigits(id);
    
    if (isPalindrome && id % sum == 0)
        cout << "Best mentor." << endl;
    else if ((isPalindrome && id % sum != 0) || (id % sum == 0 && !isPalindrome))
        cout << "He's good." << endl;
    else
        cout << "He'll be fired." << endl;

    return 0;
}
