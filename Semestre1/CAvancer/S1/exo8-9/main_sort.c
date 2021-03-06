

#include <stdio.h>
#include "utilitaires_tableaux.h"
#include "tris.h"
#include <stdlib.h>


int main(int argc, char **argv)
{
  int cpt = compter_lignes(argv[1]) ;
  int i = 0;	
  int *new = lire_tableau( argv[1] , &cpt );
	
	if(argc < 3){
		fprintf(stderr, "%s: Nombre d'arguments incorrect (%d)\n", argv[0], argc);
		fprintf(stderr, "USAGE: %s <fichier a trier> <fichier de sortie>\n", argv[0]);
		exit(1);
	}


	for(i=0;i<argc;i++)
		printf("Argument %d : %s\n", i, *argv[i]);
 
 
  tris(new, &cpt);

 
  ecrire_tableau(argv[2], new , cpt );


	return (0);
}

// remcptcave etu  
