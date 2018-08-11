#include <iostream>
#include<bits/stdc++.h>

/*There are no more than 20 elements in the data set
   Hash function will return an integer from 0 to 19
   Data set must have unique elements
*/

std::string hashTable[21];
int hashTableSize = 21;

int hashFunc( std::string key ){
  /*Convert string key to an int index*/
}

int hashFunc2( std::string key ){
  /*Convert string key to an int index*/
}

void insert(std::string s) {
  /* compute the index using the hash function1 */
  int index = hashFunc(s);
  int indexH = hashFunc2(s);
  /* search for an unused slot and if the index will exceed the hashTableSize then
  roll back */
  while (hashTable[index] != "") {
    index = (index + indexH) % hashTableSize;
  }
  hashTable[index] = s;
}

void search(std::string s) {
  /* compute the index using the hash function */
  int index = hashFunc(s);
  int indexH = hashFunc2(s);
  /* search for an unused slot and if the index will exceed the hashTableSize
   then roll back*/
   while (hashTable[index] != s && hashTable[index] != "") {
     index = (index + indexH) % hashTableSize;
   }
   /* check if the element is present in the hash table */
   if (hashTable[index] == s) {
     std::cout << s << " is found!" << '\n';
   } else {
     std::cout << s <<" is not found!" << '\n';
   }
}
