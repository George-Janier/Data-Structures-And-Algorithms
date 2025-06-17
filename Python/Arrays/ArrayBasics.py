#declare and initialize
numbers = [5, 3, 9, 1, 4]

#access
print("Third Element: ", numbers[2])

#update
numbers[2] = 81
print("Updated Third Element: ", numbers[2])

#traverse
print("Array : ")
for num in numbers: 
    print(num, " ")

#insert
pos = 2
print("Inserting value(20) at position(2)")
numbers.insert(2, 20)
print("Array : ")
for num in numbers: 
    print(num, " ")
    
#delete
print("Deleting 20 of index2")
del numbers[2]
print("Array : ")
for num in numbers: 
    print(num, " ")