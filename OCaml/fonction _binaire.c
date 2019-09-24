#include <stdlib.h>
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
	if (a == 0)
	{
		new.a = 0; new.b = 0;
	}
	else 
	{
		new.a = a%2;
		a = a/2;
		if (a == 0)
		{
			new.b = 0;
		} 	
		else new.b = a%2;
	}
	return new;
}

quartet newquartet (int nb)
{
	quartet new;
	if (nb == 0)
	{
		new.a = newduet(nb) ; new.b =newduet(nb);
	}
	else 
	{
		new.a = newduet(nb);
		nb = nb/4;
		new.b =newduet(nb);	
	}
	return new;
}
octet newoctet (int nb)
{
	octet new;
	if (nb == 0)
	{
		new.a = newquartet(nb) ; new.b =newquartet(nb);
	}
	else 
	{
		new.a = newquartet(nb);
		nb = nb/8;
		new.b =newquartet(nb);	
	}
	return new;
}

void printduet(duet a)
{
	printf("%d%d",a.a, a.b);
}
void printquartet(quartet a)
{
	printduet(a.a);printduet(a.b);
}
void printoctet(octet a)
{
	printf("\n");
	printquartet(a.a);printquartet(a.b);
}	

int main(int argc, char const *argv[])
{
	printoctet(newoctet(450));

	return 0;
}