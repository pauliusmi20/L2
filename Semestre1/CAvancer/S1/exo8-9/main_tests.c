

#include <stdio.h>
#include <stdlib.h>
#include <assert.h>
#include "utilitaires_tableaux.h"
#include "tris.h"





/*********************************************************


	TEST LA FOCNTION : ELLE TRIE BIEN LES VALEURS, PRINT DANS TERMINALE a *dest





int main()
{
	char *arg = "100_valeurs.txt";
	char *dest = "val_trier.txt";
  int cpt = compter_lignes(arg) ;
  int i = 0;


	
  
  int *new = lire_tableau("100_valeurs.txt", &cpt );

	
	printf("tab d'origine dans : %s :\n ", arg);
  for ( i = 0; i < cpt; i ++) 
    printf("[%d] \n" , new[i]);



  tris(new, &cpt);

  ecrire_tableau(dest, new , cpt );

	printf("tab à écrire dans %s :\n  ", dest);
  for ( i = 0; i < cpt; i ++) 
    printf("[%d] \n" , new[i]);
    
    new = lire_tableau( dest, &cpt );
 	printf("tab écrit dans %s :\n  ", dest);   
      for ( i = 0; i < cpt; i ++) 
    printf("[%d] \n" , new[i]);

  return 0;

}


*********************************************************/



