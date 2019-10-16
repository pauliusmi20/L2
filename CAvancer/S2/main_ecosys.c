#include <assert.h>
#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <time.h>
#include "ecosys.h"

#define NB_PROIES 20
#define NB_PREDATEURS 20
#define T_WAIT 40000

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

	while(1){
		 if (usleep(T_WAIT)){
			//fprintf(syntaxe get error)
			exit(-1);		 
		 }
		
		rafraichir_proies(&liste_proie);
		rafraichir_predateurs(&liste_predateur,&liste_proie);
		afficher_ecosys(liste_proie, liste_predateur);
	}
  return 0;
}

