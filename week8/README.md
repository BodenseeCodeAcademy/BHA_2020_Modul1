# What is waiting for us in this weeks lecture?
This week first we will recap the previous week and continue with learning increments(post,pre), than we will learn the loops and in the end we will cover the arrays.

# Recap of previous week
Switch provides selection of one or multiple branches of code to run. 
If there are more than 2 posibilities for a condition it is better to use switch clause over if clause.
```Java
	switch(statement){
		case (option1): break;
		case (option2): break;
		case (option3): break;
		default:
	}
```
	
# Increment/ Decrement
Increments are actually assignmet statements. They can be post increment or pre increment.
```Java
	int i=0;
	int j=0;
	
	i=i+1;
	j=i++;
	j=++i;
	i=i-1;
	j=i--;
	j=--i;
```
# Loops
Suppose that we intended to write the numbers from 0 to 1000000. What should we do?
Should we write 1000000 times 
```Java
	System.out.println(number);
```
In order to solve this kind of repeating problems, we have loop structures to rescue.

# While Loops
When we have to repeat some kind of process regarding one condition, while loop is useful.

```Java
	while (condition){
		// do something here
	}
```
At first it checks the condition and if the condition is true runs the code block, 
the code block will run until the condition is false.
 - Examples:
	- Write the numbers from 1 to 1000
	- Write the number from 1000 to 1 
	- Write the odd numbers to 1000
	- Write the even numbers to 1000
	- Calculate the factorial of one number.

If you want to run the code block at least once and check the condition afterwards, you should use:

```Java
	do{
		// do something here
	}while (condition)
```	
# For Loops
When we have to repeat some kind of process and we know how many times it should run, for loop is useful.
```Java
	for (initizialion;condition;increment){
		// do something here
	}
```
 - Examples:
	- take initial value, end value and increment from user and write a for loop 
	-  sum the numbers from  0 to n

# Nested Loops
We can write loops inside another loop as much as we like.

```Java
	for (initizialion;condition;increment){
		// do something here
			for (initizialion;condition;increment){
				// do another thing here
			}
	}
```
  
	
