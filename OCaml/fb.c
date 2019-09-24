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
		new.b = (a/2 )%2;
	}
	return new;
}

duet newduet3 (int a)
{
	duet new;
	if (a == 0)
	{
		new.a = 0; new.b = 0;
	}
	else 
	{
		if (a/2 == 0)
		{
			if (a%2 == 1) 
 			
 				new.a = 1;
 				new.b = 0;
 			}
			else
			{
			new.a = 0;
			new.b = 0;
			}
		} 	
		else 
		{
			if (a%2 == 1)
			{ 
				if ( (a/2 )% 2 == 1)
				{
				new.a = 1;
				new.b = 1;
				}

				else 
				{
				new.a = 1;
				new.b = 0;
				}
			}	
			else 
			{
				if ( (a/2 )% 2 == 1)
				{
				new.a = 0;
				new.b = 1;
				}
				else 
				{
				new.a = 0;
				new.b = 0;
				}
			}
		}
	}
	return new;
}
/*
if (a%2 == 1) 
	if ( (a/2 )% 2 == 1)
	{
		new.b = 1;
		new.a = 1;
	}
	else 
		new.b = 0;
		new.a = 1;
else 
	if ( (a/2 )% 2 == 1)
	{
		new.b = 1;
		new.a = 0;
	}
	else 
		new.b = 0;
		new.a = 0;


if ( (a/2 )% 2 == 1)
new.b = 1;
else new.b = 0;
*/

duet newduet2 (int a)
{
	duet new;
	if (a == 0)
	{
		new.a = 0; new.b = 0;
	}
	else 
	{
		if (a /2 == 0)
		{
			if (a%2 ==1)
				new.a = 1;
			else 
				{
				 new.a = 0;
				 new.b = 0;
				}
		} 	
		else new.b = (a/2)%2;
	}
	return new;
}



quartet newquartet2 (int nb)
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
		nb = nb/2;
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
		nb = nb/4;
		new.b =newquartet(nb);	
	}
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
	printoctet(newoctet(10));

	return 0;
}