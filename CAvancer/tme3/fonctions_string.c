#include <stdlib.h>
#include <stdio.h>
#include <string.h>
#include <math.h>
#include "devel.h"

void *dupliquer_str(const void *src) {
  char *isrc=(char *)src;
  char *idst=malloc(sizeof(char));
  if (idst==NULL) {
    affiche_message("Erreur d'allocation");
    return NULL;
  }
  *idst=*isrc;
  return (void *)idst;
}


void copier_str(const void *src, void *dst) {
  char *isrc=(char *)src;
  char *idst=(char *)dst;
  *idst=*isrc;
}

void detruire_str(void *data) {
	free(data);
}

void afficher_str(const void *data) {
  char **idata=(char **)data;
  printf("%s",*idata);
}


int comparer_str(const void *a, const void *b) {
	char *ia=(char *)a;
	char *ib=(char *)b;
    return abs(strlen(ia) - strlen(ib) );
}

int ecrire_str(const void *data, FILE *f) {
  char *idata=(char *)data;
  return fprintf(f, "%s", idata);
}

void * lire_str(FILE *f) {
  char i;
  char r=fscanf(f," %c",&i);
  if (r<1) return NULL;
  char *pi=(char *)malloc(sizeof(char));
  *pi=i;
  return pi;
}
