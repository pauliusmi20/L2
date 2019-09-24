#include <stdio.h>
typedef struct 
{
	int a;
	int b;
}duet;

typedef struct 
{
	duet a;
	duet b;
}quartet;


typedef struct 
{
	quartet a;
	quartet b;
}octet;



duet newduet (int a)
{
	duet new;

	new.a = a % 2;
	if  (a/2 == 1 )
	  new.b = 1;
 	else 
 		new.b = ( a/2 ) % 2;
 	return new ;
}
duet newduet (int a)
{
	duet new;

	
	if  (a/2 == 1 )
	  if (a % 2) == 1
		new.a =1;
		new.b = 1;
		else new a = 0;
	  		 new.b = 1;
 	else 
 		if (a % 2) == 1
		new.a =1;
		else new a = 0;
 		new.b = ( a/2 ) % 2;
 	return new ;
}

if (a % 2) == 1
	new.a =1;
else new a = 0;



quartet newquartet (int nb)
{
	quartet new;
	new.a = newduet(nb);

	new.b = newduet(nb/4);

	return new;
}



octet newoctet (int nb)
{
	octet new;

	new.a = newquartet(nb);
	/*
	new.b = newquartet(0);
	else  */
	new.b = newquartet(nb/16);

	return new;
}


void printduet(duet a)
{
	printf("%d%d",a.b, a.a);
}
void printquartet(quartet a)
{
	printduet(a.b);printduet(a.a);
}
void printoctet(octet a)
{

	printquartet(a.b);printquartet(a.a);
		printf("\n");
}	

int main(int argc, char const *argv[])
{	
	printoctet(newoctet(242));
	
	return 0;
}