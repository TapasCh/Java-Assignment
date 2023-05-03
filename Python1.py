1)Write a program in Python to print the factorial of a number.
num = int(input("Enter a number: "))
factorial = 1
if num < 0:
print(" Factorial does not exist for negative numbers")
elif num == 0:
print("The factorial of 0 is 1")
else:
for i in range(1,num + 1):
factorial = factorial*i
print("The factorial of",num,"is",factorial)



2)Write a program in Python to check whether a number is
Armstrong or not.
num = int(input("Enter a number: "))
sum = 0
temp = num
while temp > 0:
digit = temp % 10
sum += digit ** 3
temp //= 10
if num == sum:
print(num,"is an Armstrong number")

else:
print(num,"is not an Armstrong number")


3)Write a program in Python to print ASCII value of a character.
K = input("Please enter a character: ")
print ("The ASCII value of '" + K + "' is ", ord(K))


4)Write a program in Python to find area of a circle.
import math as M
Radius = float (input ("Please enter the radius of the given circle: "))
area_of_the_circle = M.pi* Radius * Radius
print (" The area of the given circle is: "

, area_of_the_circle)


5)Write a program in Python to find simple interest.
def simple_interest(p,t,r):
print('The principal is'
, p)
print('The time period is'
, t)
print('The rate of interest is'
,r)

si = (p * t * r)/100
print('The Simple Interest is'
, si)

# Driver code
P = int(input("Enter the principle amount :"))
T = int(input("Enter the time period :"))
R = int(input("Enter the rate of interest :"))
simple_interest(P,T,R)


6)Write a program in Python to find compound interest.
def compound_interest(principal, rate, time):
Amount = principal * (pow((1 + rate / 100), time))
CI = Amount - principal
print("Compound interest is", CI)

principal = int(input("Enter the principal amount: "))
rate = int(input("Enter rate of interest: "))
time = int(input("Enter time in years: " ))
compound_interest(principal,rate,time)

