#include <assert.h>
#include <unistd.h>
#include <stdio.h>
#include <stdlib.h>
#include <time.h>
#include "ecosys.h"

#define NB_PROIES 20
#define NB_PREDATEURS 20

/* Parametres globaux de l'ecosysteme (externes dans le ecosys.h)*/
float p_ch_dir=0.01;
float d_proie=1;
float d_predateur=1;
float p_manger=0.2;
float p_reproduce=0.01;
float energie=50;


int main(void) {
	Animal *liste_proie = creer_animal(rand()%(SIZE_X),rand()%(SIZE_Y),energie);
	Animal *liste_predateur =creer_animal(rand()%(SIZE_X),rand()%(SIZE_Y),energie);
	int i ;
	
	/* les positions sont aléatoires: ainsi il peux y avoir plusieurs animeaux sur la meme case ce qui signifie que les animeaux seront écrasées. 	*/	
		
	for (i = 0; i<NB_PROIES ; i++){
		ajouter_animal( rand()%(SIZE_X+1),rand()%(SIZE_Y+1),&liste_proie);	 
	}
	
	for (i = 0; i<NB_PREDATEURS ; i++){
		ajouter_animal( rand()%(SIZE_X+1),rand()%(SIZE_Y+1),&liste_predateur);	 
	}
	//TEST ACTIONS
	for (i = 0; i<10 ; i++){
		bouger_animaux(liste_proie);
		bouger_animaux(liste_predateur);
		afficher_ecosys(liste_proie,liste_predateur);	
	}
	printf("XXXXXXXXXXXXXXXXX\nXXXXXXXXXXXXXXXXX\nXXXXXXXXXXXXXXXXX\nXXXXXXXXXXXXXXXXX\nXXXXXXXXXXXXXXXXX");
	
	/** la fonction a l'aire de fonctioner, l'affichage évolue, mais le nb de proies et predateurs reste le meme*/
	
	for (i = 0; i<10 ; i++){
		reproduce(&liste_proie);
		reproduce(&liste_predateur);
		afficher_ecosys(liste_proie,liste_predateur);	
	}
	
	//affichage 
	afficher_ecosys(liste_proie,liste_predateur);	
  return 0;
}


