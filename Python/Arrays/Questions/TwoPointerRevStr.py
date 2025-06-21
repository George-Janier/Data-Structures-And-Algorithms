arr = [12,23,34,45,56,67,78]
i = 0
j = len(arr)-1
while(i<=j):
    temp = arr[i]
    arr[i] = arr[j]
    arr[j] = temp
    i = i+1
    j = j-1
print(arr)
