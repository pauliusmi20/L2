#include <stdio.h>
#include <stdlib.h>

typedef struct
{
  int diametre;
  int budget;
  int population;
  
  metro systeme;

}ville;

typedef struct
{
  int prix;
  listLigne ligne_metro;
}metro;

typedef struct
{
  int nb_stations;
  listStation *les_stations;
  listTrajet *les_trajets;

}ligne;

typedef struct
{
  int model;
  train *;
  ligne *lesLignes; 
  donneMomment moment;
  station *nextStation;
  station *prevStation;

}station;

typedef struct
{
  int model;
  int qteWagon;

}locomotive;

typedef struct
{
  int model
  donneMoment

}wagon;

typedef struct
{
  char nom[4];
  donneeVitesse now;
}train;


typedef struct
{
  train *train_moment;
  station *next; 
  station *prev;
  int distance;

}trajet;


/*
typedef struct
{
  int acceleration;
  int rendement;
  int prix
  int maintenance;
}modelLocomotive;

*/
