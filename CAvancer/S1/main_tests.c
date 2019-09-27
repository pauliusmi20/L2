#include <stdio.h>
#include <stdlib.h>

#include "utilitaires_tableaux.h"
#include "tris.h"


int main()
{
  int cpt = 0, i = 0;
  int *new = lire_tableau("100_valeurs.txt", &cpt );

  for ( i = 0; i < cpt; i ++) 
    printf("[%d] \n" , new[i]);

  ecrire_tableau("exemple.txt", new , 40 );

  tris(new, &cpt);

  for ( i = 0; i < cpt; i ++) 
    printf("[%d] \n" , new[i]);

  return 0;

}
