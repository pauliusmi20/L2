#include <stdio.h>
#include <stdlib.h>

typedef struct _liste_double liste_double;

struct _liste_double
{
  int element;
  liste_double *prev;
  liste_double *next;
   
};

liste_double *newList(int element)
{
  liste_double *new = malloc(sizeof(liste_double));
  new->element = element;
  new->prev = NULL;
  new->next = NULL;
  return new;
}

liste_double *addStart(int element, liste_double *list)
{
  liste_double *new =newList(element);
 
  if (isVide(list) ) return new;
  new->next = list;
  list->prev = new;
  return new;
    
}

int isVide(liste_double *list)
{
  return list == NULL;
}

liste_double *addEnd(int element, liste_double *list)
{
  liste_double *temp = list;
  liste_double *new =newList(element);
  if (isVide(list) ) return newList(element);
  while(temp->next != NULL) temp = temp->next;
  temp->next = new;
  new->prev = temp;
  return list;  
}

int renvoieIndice(liste_double *list)
{
  int cpt=0;
  liste_double *temp = list;

  if (isVide(list)) return -1;
  
  while (temp->prev != NULL) { temp = temp->prev; cpt++;}
  return cpt;
}
/*
void freeList(liste_double *list)
{
  if (isVide(list)) return list;
  
  while (temp->next != NULL)
  {
    
  }
}
*/
int insertIndice(int element, liste_double *list, int indice)
{
  int cpt=0;
  liste_double *new = newList(element), *prev = NULL, *temp = list;

  if (isVide(list) ) return 0;
  
  if (indice == 0) {prev = list; list = list->next; list->prev = NULL; free(prev); return 1; }

  while (temp->next != NULL )
  {
  if (cpt ==indice ) 
    {
	if (temp ->next == NULL)
	{
	  
	}
	new->next = temp;
  	prev->next = new;
	temp->prev = new;
	new->prev = prev;
	return 1;
	 
    }
  prev = temp;
  temp = temp->next;
  cpt++;
  }
  return 0;  
}

int removeIndice(liste_double *list, int indice)
{
  int cpt=0;
  liste_double *prev = NULL, *temp = list;

  if (isVide(list) ) return 0;
 
  while (temp != NULL )
  {
  if (cpt ==indice ) 
    {
	if (temp->next != NULL )
	 {
	  prev->next = temp->next;
  	  free(temp);
 	  temp = prev ->next;
	  temp->prev = prev;
	 }
	return 1;
	 
    }
  prev = temp;
  temp = temp->next;
  cpt++;
  }
  return 0;  
}

void affichageDouble(liste_double *list)
{
  liste_double *temp = NULL, *temp2 = list;

   
  printf("\nstart->end\n"); 

  while(temp2!=NULL)
	{printf("[%d]",temp2->element); if (temp2->next == NULL)temp = temp2; temp2= temp2->next;}  

  printf("\nend->start\n");

  while(temp!=NULL)
	{printf("[%d]",temp->element); temp= temp->prev;}
  printf("\n");
}

int main()
{
  int i = 0;
  liste_double *test = NULL;

  for (i = 10; i>0; i--)
    test = addEnd(i,test);

  if (insertIndice(25, test, 3) && removeIndice(test,3) )
	affichageDouble(test);

  return 0;
}
