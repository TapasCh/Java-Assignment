1) Write a Python program to addition, subtraction, multiplication &amp; transpose operations for matrix.
import numpy as np

# create two matrices
A = np.array([[1, 2], [3, 4]])
B = np.array([[5, 6], [7, 8]])

# addition
C = A + B
print("Addition:\n", C)
# subtraction
C = A - B
print("Subtraction:\n", C)
# multiplication
C = A.dot(B)
print("Multiplication:\n", C)
# transpose
C = A.T
print("Transpose of A:\n", C)

Output: 
Addition:
 [[ 6  8]
 [10 12]]
Subtraction:
 [[-4 -4]
 [-4 -4]]
Multiplication:
 [[19 22]
 [43 50]]
Transpose of A:
 [[1 3]
 [2 4]]




2. Python program to find the frequency of each element in an array:

from collections import Counter

# create an array
arr = [1, 2, 3, 4, 1, 2, 3, 5, 1, 2, 1]

# count the frequency of each element
freq = Counter(arr)
# print the frequency of each element
for key, value in freq.items():
    print(key, ":", value)

    
    
Output:

1 : 4
2 : 3
3 : 2
4 : 1
5 : 1
    

 3) Python program to print the duplicate elements of an array:

# create an array
arr = [1, 2, 3, 4, 1, 2, 3, 5, 1, 2, 1]

# find the duplicate elements
duplicates = set([x for x in arr if arr.count(x) > 1])

# print the duplicate elements
print("Duplicate elements:", duplicates)


Output:
Duplicate elements: {1, 2, 3}
 
 
 
    
4. Python program to sort the elements of an array in ascending and descending order:

# create an array
arr = [3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5]

# sort in ascending order
arr_asc = sorted(arr)
print("Ascending order:", arr_asc)

# sort in descending order
arr_desc = sorted(arr, reverse=True)
print("Descending order:", arr_desc)

Output:
Ascending order: [1, 1, 2, 3, 3, 4, 5, 5, 5, 6, 9]
Descending order: [9, 6, 5, 5, 5, 4, 3, 3, 2, 1, 1]
    
    
    
 Assignment 3####


1. Write a Python program to sort the elements of given list in Ascending & Descending order. 

my_list = [9, 2, 5, 1, 7, 4, 8, 6, 3]
# sort the list in ascending order
my_list.sort()
print("Sorted list (ascending order):", my_list)
# sort the list in descending order
my_list.sort(reverse=True)
print("Sorted list (descending order):", my_list)

2. Write a Python program to find difference of two lists. 

list1 = [1, 2, 3, 4, 5]
list2 = [3, 4, 5, 6, 7]
diff = list(set(list1) - set(list2))
print("Difference of list1 and list2:", diff)

3. Write a Python program to input, append and print the list elements (inputs will be given by the user). 

my_list = []

# input 5 elements and append them to the list
for i in range(5):
    elem = input("Enter an element: ")
    my_list.append(elem)

# print the list elements
print("List elements:", my_list)

4. Write a Python Program to create three tuples with the numbers, their squares and cubes. 

numbers = []
squares = []
cubes = []

# generate numbers, squares, and cubes and append them to the tuples
for i in range(1, 6):
    numbers.append(i)
    squares.append(i ** 2)
    cubes.append(i ** 3)

# create tuples with numbers, squares, and cubes
tuples = list(zip(numbers, squares, cubes))
print("Tuples with numbers, squares, and cubes:", tuples)

5. Write a Python Program to create a function called ArraySort and call that function with an array of 10 elements to sort the numbers in the array. 

def ArraySort(arr):
    sorted_arr = sorted(arr)
    return sorted_arr

# call ArraySort function with an array of 10 elements
my_array = [9, 2, 5, 1, 7, 4, 8, 6, 3, 0]
sorted_array = ArraySort(my_array)

# print the sorted array
print("Sorted Array:", sorted_array)

6. Write a Python Program to create a Class called StudentInfo, which contains StudentName, StudentRollNumber, StudentMarks. Create five Objects of this Class and Initialize these Objects with Student Informatio for 5 students. Find the average of the marks obtained by 5 students.

class StudentInfo:
    def  __init__(self, name, roll_no, marks):
        self.StudentName = name
        self.StudentRollNumber = roll_no
        self.StudentMarks = marks

    def average_marks(self, students):
        total_marks = 0
        for student in students:
            total_marks += student.StudentMarks
        avg_marks = total_marks / len(students)
        return avg_marks

# create five objects of the StudentInfo class and initialize them with student information
student1 = StudentInfo("John", 1, 80)
student2 = StudentInfo("Mary", 2, 90)
student3 = StudentInfo("Bob", 3, 70)
student4 = StudentInfo("Alice", 4, 85)
student5 = StudentInfo("David", 5, 75)

# create a list of the five student objects
students = [student1, student2, student3, student4, student5]

# find the average of the marks obtained by the five students
avg_marks = student1.average_marks(students)
print("Average marks obtained by the five students:", avg_marks)
      
      
      
 Assignment 4######
      
 1. Write a Python program to find frequency of each element in an array. Assume the array to be Arr = [1, 2, 8, 2, 3, 8, 2, 2, 1, 2, 2, 5, 1, 5, 3, 5 ]; 

Arr = [1, 2, 8, 2, 3, 8, 2, 2, 1, 2, 2, 5, 1, 5, 3, 5]

# create an empty dictionary to keep track of the frequency of each element
freq_dict = {}

# loop through the array and increment the count of each element in the dictionary
for elem in Arr:
    if elem in freq_dict:
        freq_dict[elem] += 1
    else:
        freq_dict[elem] = 1

# print the frequency of each element
for elem, freq in freq_dict.items():
    print(elem, ":", freq)

2. Define a function in python and pass two integer variables to the function by pass by reference and swap these two numbers inside the function. 

def swap_numbers(a_list):
    a_list[0], a_list[1] = a_list[1], a_list[0]

# Example usage
x = 5
y = 10
numbers = [x, y]
print("Before swap: x =", x, "and y =", y)
swap_numbers(numbers)
x, y = numbers
print("After swap: x =", x, "and y =", y)


3. Implement a python program to demonstrate function overloading feature supported by python. 


def sum(a, b):
    return a + b

def sum(a, b, c):
    return a + b + c

print(sum(1, 2))        # Output: TypeError: sum() missing 1 required positional argument: 'c'
print(sum(1, 2, 3))     # Output: 6


4. Write a python program which defines a simple class which has just a constructor and a destructor (with no member functions or data members), and create an instance of array of classes allocating it memory dynamically. At the end of the program de-allocate the memory. 

class MyClass:
    def __init__(self):
        print("Constructor called.")

    def __del__(self):
        print("Destructor called.")


# Create an array of 5 MyClass instances using dynamic memory allocation
my_class_array = [MyClass() for i in range(5)]

# Deallocate the memory
del my_class_array

      
      
5. Write a Python program to calculate the average value of the numbers in a given tuple of tuples. Original Tuple: ((10, 10, 10, 12), (30, 45, 56, 45), (81, 80, 39, 32), (1, 2, 3, 4)) Average value of the numbers of the said tuple of tuples: [30.5, 34.25, 27.0, 23.25]

t = ((10, 10, 10, 12), (30, 45, 56, 45), (81, 80, 39, 32), (1, 2, 3, 4))

# calculate the average of each column in the tuple of tuples
result = []
for i in range(len(t[0])):
    column_sum = 0
    for row in t:
        column_sum += row[i]
    result.append(column_sum / len(t))

print("Average value of the numbers of the said tuple of tuples:", result)

        
