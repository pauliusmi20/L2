#include <stdlib.h>
#include <stdio.h>
#include "devel.h"

#include "fonctions_2entiers.h"

void *dupliquer_2int(const void *src) {
  double_int *isrc=(double_int *)src;
  double_int *idst=malloc(sizeof(double_int));
  if (idst==NULL) {
    affiche_message("Erreur d'allocation");
    return NULL;
  }
  *idst=*isrc;
  return (void *)idst;
}

void copier_2int(const void *src, void *dst) {
  double_int *isrc=(double_int *)src;
  double_int *idst=(double_int *)dst;
  *idst=*isrc;
}

void detruire_2int(void *data) {
  free(data);
}

void afficher_2int(const void *data) {
  double_int *idata=(double_int *)data;
  printf("a=%d b=%d",*idata->a,*idata->b);
}

int comparer_2int(const void *a, const void *b) {
  int *ia=(int *)a;
  int *ib=(int *)b;
  return (*ia>*ib)-(*ia<*ib);
}

int ecrire_2int(const void *data, FILE *f) {
  const double_int *idata=(const double_int *)data;
  return fprintf(f, "%d", *idata->a)&&(fprintf(f, "%d", *idata->b));
}

void * lire_2int(FILE *f) {
  
  return NULL; // pour que cela compile
}
