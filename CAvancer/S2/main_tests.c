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
	
  Animal *liste_proie = NULL;
  Animal *liste_predateur = NULL;
  int nb_proies = 0, nb_predateurs = 0, temp = rand() % 11 , temp2 = rand() % 11;

			for (int i = temp ; i < temp + NB_PROIES ;  i++)
				for (int j = temp2 ; j < temp2 + NB_PROIES ;  j++){
					liste_proie =	ajouter_en_tete_animal(liste_proie, creer_animal(i,j,energie) );
				}
			temp =  rand() % 11;
			temp2 = rand() % 11;					 	

			for (int i = temp ; i < temp + NB_PREDATEURS ;  i++)
				for (int j = temp2 ; j < temp2 + NB_PREDATEURS ;  j++){
				liste_predateur = 	liste_predateur = ajouter_en_tete_animal(liste_predateur, creer_animal(i,j,energie) );
				}
					liste_proie =	ajouter_en_tete_animal(liste_proie, creer_animal(i,j,energie) );
									
    afficher_ecosys(liste_proie,liste_predateur);  

  return 0;
}
