#include <iostream>
#include <cmath>

using namespace std;

int TernarySearch(int L[], int left, int right, int key){
    if(right>=left){
        int mid 1 = left + (right-left)/3;
        int mid2 = right - (right-left)/3;
        if(key==L[mid1]) return mid1;
        if(key==L[mid2]) return mid2;
        if(key<L[mid1]){
            return TernarySearch(L,left,mid1-1,key);
        }
        else if(key>L[mid2]){
            return TernarySearch(L,mid2+1,right,key);
        }
        else {
            return TernarySearch(L,mid1+1,mid2-1,key);
        }
    }
    return -1;
    
}

int main ()
{
    int L[] = {1,2,3,4,5,6,7,8,9,12,54,78,15};
    int l = 0;
    int r = sizeof(L) / sizeof(L[0]);
    int key = 9;

    int x = TernarySearch(L,l,r,key);
    if(x == -1){
        cout<<"Key Not found"<<endl;
    }
    else{
        cout<<"The position of Key is "<<x<<endl;
    }
}