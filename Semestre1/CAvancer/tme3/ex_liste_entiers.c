
#include <stdlib.h>
#include "liste.h"
#include "devel.h"
#include "fonctions_entiers.h"

int main(void) {

	PListe test = malloc(sizeof(Liste));
	test->elements=NULL;
	int data[] = {1,0,4,5,8,6,9,7,5,2,6,8,4,2,5};
	int i;
	
	
	
	test->dupliquer=dupliquer_int;
	test->copier= copier_int;
	test->detruire= detruire_int;
	test->afficher= afficher_int;
	test->comparer= comparer_int;
	test->ecrire= ecrire_int;
	test->lire= lire_int;

	for (i = 0; i <10; i++  ){
		inserer_fin(test, &data[i]);	
		inserer_debut(test, &data[i]);
	}
	
	for (i = 0; i <10; i++  ){
		inserer_place(test, &data[i]);
	}	

	afficher_liste(test); 
	detruire_liste(test);
	afficher_liste(test);	

	return 0;
}
