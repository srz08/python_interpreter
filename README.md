# Python-Interpreter
Python Interpreter written using Java's ANTLR library.

## Supported Operations
### 1. Assignment
a. L=`[]` (this instruction defines an empty list)

b. L=`[val_1, val_2, …]` where values can be of different types. The types to be considered in this assignment are integers and strings. For example, L=`[‘hello’, 2, ‘world’]` defines a list of three elements.

c. L`[i]` = value assigns a value to the ith element of the list. For example, L[1]=4 modifies the above list to: `[‘hello’, 4, ‘world’]`

### 2. Concatenation
L1 + L2 creates a new list by concatenating L1 and L2. For example,
`[1, 2]`+`[‘a’, ’b’, ’c’]` creates the list `[1, 2, ‘a’, ’b’, ’c’]`. Concatenating several lists at once is also supported.

### 3. Slicing
a. L`[begin_index:end_index]` returns the portion starting at begin_index (inclusive) and ending at end_index (exclusive). For example, the following code would return `[’b’,’c’]`
L=`[‘a’,’b’,’c’,’d’,’e’]`
L`[1:3]`

b. L`[begin_index:]` returns the portion from begin_index (inclusive) till the end of the list

c. L`[:end_index]` returns the portion from the beginning of the list till end_index (exclusive)

### 4. Simplified Comprehension
`[for val in list if condition]`. It defines a new list containing a subset of the elements in the original list satisfying the condition. Only lists of integers should be supported.

Conditions are restricted to the form: operand1 op operand2 where op is a comparison operator (==, !=, <, <=, >, >=) and each of the operands is either an integer or val. You should also support ‘and’, ‘or’, and ‘not’. 

## Sample Input
L1 = `['hello', 'everybody', 'from', 'aub']`	print(L1)  
L2 = `['hello', 55, 'from', L1]`			print(L2)  
L2`[2]` = 'to'				print(L2)  
L3 = `['333', 33, 3]`				print(L3)  
L4 = `['444', 44, 4]`				print(L4)  
  
L3 = L1 + L2				print(L3)  
L5 = L1 + L2 + L3 + L4			print(L5)  
  
L6 = L5`[3:7]`				print(L6)  
L7 = L5`[:6]`				print(L7)  
L8 = L5`[3:]`				print(L8)  

L9 = `[1, 2, 3, 4, 5, 6, 7, 8, 9]`  
c1=`[for x in L9 	if (x > 4)]`			print(c1)  
c2=`[for x in L9 	if (5 == 2)]`		print(c2)  
c3=`[for x in L9 	if (5 > x)]` 		print(c3)  
c4=`[for x in L9 	if (x == x)]`		print(c4)  
c5=`[for x in L9 	if not (x == 4)]`		print(c5)  
c6=`[for x in L9 	if (x != 4)]`		print(c6)  
c7=`[for y in L9 	if (x != 4)]`		print(c7)  
c8=`[for x in L9 	if (7 != y)]`		print(c8)  
c10=`[for x in L9 if ( ( ((x > 2) and (7 > x)) or (x == 9) ) and (x > 5) )]` 		print(c10)  
c11=`[for x in L9 if ( ( ((x > 2) and (7 > x)) or not(x == 9) ) and (x > 5) )]`  		print(c11)  
c12=`[for x in L9 if ( ( not ((x > 2) and (7 > x)) or not(x == 9) ) and (x > 5) ) ]`   	print(c12)  

## Sample Output
L1 is `['hello', 'everybody', 'from', 'aub']`  
L2 is `['hello', 55, 'from', L1]`  
L2 is `['hello', 55, 'to', L1]`  
L3 is `['333', 33, 3]`  
L4 is `['444', 44, 4]`  
L3 is `['hello', 'everybody', 'from', 'aub', 'hello', 55, 'to', L1]`  
L5 is `['hello', 'everybody', 'from', 'aub', 'hello', 55, 'to', L1, 'hello', 'everybody', 'from', 'aub', 'hello', 55, 'to', L1, '444', 44, 4]`  
L6 is `['aub', 'hello', 55, 'to']`  
L7 is `['hello', 'everybody', 'from', 'aub', 'hello', 55]`  
L8 is `['aub', 'hello', 55, 'to', L1, 'hello', 'everybody', 'from', 'aub', 'hello', 55, 'to', L1, '444', 44]`  
c1 is `[5, 6, 7, 8, 9]`  
c2 is `[]`  
c3 is `[1, 2, 3, 4]`  
c4 is `[1, 2, 3, 4, 5, 6, 7, 8, 9]`  
c5 is `[1, 2, 3, 5, 6, 7, 8, 9]`  
c6 is `[1, 2, 3, 5, 6, 7, 8, 9]`  
Unknown variable x. Did you mean y  
Unknown variable x. Did you mean y  
Unknown variable x. Did you mean y  
Unknown variable x. Did you mean y  
Unknown variable x. Did you mean y  
Unknown variable x. Did you mean y  
Unknown variable x. Did you mean y  
Unknown variable x. Did you mean y  
Unknown variable x. Did you mean y  
c7 is `[]`  
Unknown variable y. Did you mean x  
Unknown variable y. Did you mean x  
Unknown variable y. Did you mean x  
Unknown variable y. Did you mean x  
Unknown variable y. Did you mean x  
Unknown variable y. Did you mean x  
Unknown variable y. Did you mean x  
Unknown variable y. Did you mean x  
Unknown variable y. Did you mean x  
c8 is `[]`  
c10 is `[6, 9]`  
c11 is `[6, 7, 8]`  
c12 is `[6, 7, 8, 9]`  
