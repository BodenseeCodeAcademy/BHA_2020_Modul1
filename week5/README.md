# What is waiting for us in this weeks lecture?
This week first we will recap the week4 and continue with "switch" statement, than we will learn the code blocks and in the end we will cover the methods.


# Recap of week4
If condition provides decision making over one or more conditions. Condition should e a boolean value.
The Algorithm flow will change related to this condition.

```Java
	if(condition){
	
	}else if (condition){
	
	} else {
	
	}
```
# Switch -case
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
	
# Code Blocks

What is a code block?
```Java
{
this is a code block
}
```
Try to create 2 variables with the same name in the same code block:
```Java
{
	int i;
	int i;
	double i;
}
```
How about this:
```Java
{	//First code block
	int i=1;
	System.out.println("i in First Code Block ="+i);
	
	{ // Second Code Block, inside the first one
		int i=2;
		System.out.println("i in Second Code Block ="+i);
	}
}
```

# Methods
```Java	
	int sum(int i,int j){
		return i+j;
	}
```
  - access modifier
  - return type 
  - name
  - parameters
  
  
These links will help :
- https://www.w3schools.com/java/java_conditions.asp
- https://www.w3schools.com/java/java_switch.asp
- https://www.w3schools.com/java/java_methods_param.asp
- https://www.w3resource.com/java-exercises/method/index.php# 