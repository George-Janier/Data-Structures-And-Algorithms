#Linear Search is a algorithm that searches based on key value.
#It is the most basic search algorithm.
#Time Complexity : O(n)

arr = [23,34,23,45,23,45,45]
x = 45
for i in range(0,len(arr)) :
    if(arr[i]==x):
        print("Element found at ", i)
        quit()
print("Element not found!!!")

