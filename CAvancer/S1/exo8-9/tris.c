#include <stdio.h>

#include "utilitaires_tableaux.h"

void tris(int tab[], int *cpt)
{
  int i =0;

  while (!tab_trie(tab, *cpt))
  {
    for (i = 1; i < *cpt; i++)
	  {
  	  if (tab[i]<tab[i-1] )
			echanger_elem_tab(tab,i, i-1);
	  }	
 	}
return;
}
