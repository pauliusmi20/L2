#include <stdio.h>
#include <stdlib.h>
#include <math.h>
#include <time.h>

typedef struct tableau{
	int* tab;
	int maxTaille;
	int position;
}Tableau;

void ajouterElement(int a,Tableau *t){
	t->tab[t->position]=a;
	t->position++;
}

int *allouetableau(int n){
	return (int*)malloc(n*sizeof(int));
}

void remplirtableau(Tableau *T,int v){
	int temp = 0;
	for(int i=0; i<T->maxTaille; i++){
		T->tab[i] = rand()%v;
	}
}

void affichertableau(Tableau *T){
	for(int i=0;i < T->maxTaille; i++){
		printf("[%d]", *(T->tab + i));
	}
}

Tableau* initTableau(int maxTaille){
	Tableau* t = (Tableau*)malloc(sizeof(Tableau));
	t->position=0;
	t->maxTaille=maxTaille;
	t->tab=(int*)malloc(sizeof(int)*maxTaille);
	return t;
}

void affichageTableau(Tableau* t){
	printf("t->position = %d\n",t->position);
	printf("[ ");	
	for (int i=0;i<(t->position);i++){
		printf("%d ",t->tab[i]);	
	}
	printf("]\n");
}



// ordre de complexité: n*n
int calculalgo1(Tableau *T){
	int res=0;
	int j=0, i=0;
	while(i<T->maxTaille){
		while (j<T->maxTaille){
			res+= (T->tab[i] - T->tab[j])*(T->tab[i] - T->tab[j]); 
			j++;
		}

		i++;
		j=0;
	}
	return res;
}

// ordre de complexité: 2n
int calculalgo2(Tableau *T){
	int res=0, temp1=0, temp2=0;
	
	for(int i=0; i>T->maxTaille; i++){
		temp1+= (T->tab[i])*(T->tab[i]) ;
	}

	for(int i=0; i>T->maxTaille; i++){
		temp2+= (T->tab[i]) ;
	}
	return 2*T->maxTaille*temp1 - 2*(temp2*temp2); 
	
}
int main(){
	Tableau* t;
	t = initTableau(100);
	int res1=0, res2=0;
	remplirtableau(t,100);
	clock_t  temps_initial;/* Temps initial en micro-secondes */ 
	clock_t  temps_final;/* Temps final en micro-secondes */ 
	double temps_cpu;/* Temps total en secondes */
	temps_initial = clock();
	res1 = calculalgo1(t);
	temps_final = clock  ();
	temps_cpu =   (( double)(temps_final  - temps_initial))/CLOCKS_PER_SEC;printf(”%d%f”,n,temps_cpu);
	res2 = calculalgo2(t);






	
	return EXIT_SUCCESS;
}
