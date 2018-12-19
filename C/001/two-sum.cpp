#include <iostream>
#include <vector>
#include <cstdarg>
#include <string>
using namespace std;

class Solution{
public:
	vector<int> twoSum(vector<int> &nums,int target){
		int vector_size,i,j;
		vector<int> result;
		vector_size=nums.size();
		for(i=0;i<=vector_size-1;++i){
			for(j=i+1;j<=vector_size-1;++j){
				if (nums[i]+nums[j]==target && i!=j){
					result.push_back(i);
					result.push_back(j);
				}
			}
		}
		return result;
	}
};

int main(){
    /* code */
    vector<int> testnums(2,7,11,15);
    int testtarget=9;
    Solution test;
    vector<int> testresult; 
    testresult=test.twoSum(testnums,testtarget);
    cout<<testresult[0]<<endl;
    return 0;
}
