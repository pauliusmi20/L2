#include <stdlib.h>
#include <stdio.h>
#include <sys/types.h>
#include <sys/stat.h>
#include <fcntl.h>


#define TT 128


int copie( char *f1, char *f2,char *f3){
	int fd1, fd2, fd3, n;
	int somme = 0;
	char buf[TT];
	
	fd1 = open(f1, O_RDONLY); 
	fd2 = open(f2, O_RDONLY); 
	fd3 = open(f3, O_WRONLY);
	
	if((fd1 || fd2 || fd3)<0){
		perror("open");
		return -1;
	} 
	while ( n=read(fd1,buf,TT)>0 ){
		if (n<0){
			perror("read");
			return -1;
		}
		somme+=n;
		if (n==0)	break;
		if (write(fd3,buf[n],n)<0) {
			perror(0);
			return -1;
		}
	}
	while ( n=read(fd1,buf,TT)>0 ){
		if (n<0){
			perror("read");
			return -1;
		}
		somme+=n;
		if (n==0)	break;
		if (write(fd3,buf[n],n)<0) {
			perror(0);
			return -1;
		}
		close(fd1);
		close(fd3);
		close(fd2);
	}
	return somme;

}
int main(int argc, char **argv){
	int i;
	for(i= 0; i<argc; i++){
		printf("Argument %d :%s\n",i,argv[i]);
		}
	
	return (0);
}



















