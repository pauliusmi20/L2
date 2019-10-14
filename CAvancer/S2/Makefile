GCC_FLAGS := -g -Wall 

all:  tests_ecosys ecosys

ecosys.o: ecosys.c 
	gcc $(GCC_FLAGS) -c ecosys.c

main_ecosys.o:	main_ecosys.c
	gcc $(GCC_FLAGS) -c main_ecosys.c

tests_ecosys : main_test.c
	gcc $(GCC_FLAGS) -c main_test.c
	
ecosys: main_ecosys.o ecosys.o
	gcc $(GCC_FLAGS) -o ecosys main_ecosys.o ecosys.o
clean:
	rm -f *.o *~ $(PROGRAMS)
