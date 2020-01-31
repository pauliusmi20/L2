
#include <stdlib.h>
#include "liste.h"
#include "devel.h"
#include "fonctions_string.h"


int main(void) {

	PListe test = malloc(sizeof(Liste));
	test->elements=NULL;
	char *data[] = {"sdfsdfvzdver","aaaaaa", "bbbbbbbbb" };
	int i;

	test->dupliquer=dupliquer_str;
	test->copier= copier_str;
	test->detruire= detruire_str;
	test->afficher= afficher_str;
	test->comparer= comparer_str;
	test->ecrire= ecrire_str;
	test->lire= lire_str;

	for (i = 0; i <3; i++  ){
		inserer_fin(test, data[i]);	
		inserer_debut(test, data[i]);
	}
	/*
	for (i = 0; i <3; i++  ){
		inserer_place(test, data[i]);
	}	
*/
	afficher_liste(test); 
	detruire_liste(test);
	afficher_liste(test);	

	return 0;
}
