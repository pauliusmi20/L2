#include <stdio.h>
#include <stdlib.h>



typedef struct _list liste;


struct _list
{
  int element;
  struct _list *next; 
};

liste *init (int i)
{
  liste *new = NULL;
  new->next=NULL;
  new->element = i;
  return new; 
} 

liste *addtete(liste *list, int el)
{
  liste *new = NULL;
  new = init(el);
  new->next= list;  
  return new;
}

void afficher(liste *list)
{
  temp = temot
  while (temp != NULL ) && (list->next != NULL) )  {
    printf("%d |",list->element);
    list = list->next;
  }}
}

int main ()
{
  liste *new = NULL;
  int i = 0;
  for (i = 0 ; i < 5; i ++)
   { new = addtete(new,i);

  afficher(new); }
return 0;
}
