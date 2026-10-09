#include <stdbool.h>

bool isPalindrome(int x) {
  int temp = x;
  long reverse = 0;
  if (x < 0) {
    return false;
  }
  while (temp != 0) {
    int digit = temp % 10;
    reverse = reverse * 10 + digit;
    temp /= 10;
  }

  if (x == reverse) {
    return true;
  } else {
    return false;
  }
}