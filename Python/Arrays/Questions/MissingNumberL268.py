nums = [3,0,1]
nums.sort()
for i in range(0, len(nums)-1):
    if(nums[i+1]-nums[i] != 1):
        print(i+1)