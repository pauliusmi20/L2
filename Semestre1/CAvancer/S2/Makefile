CFLAGS := -g -Wall 

all:  tests_ecosys ecosys

ecosys.c: ecosys.h

tests_ecosys : main_tests.o ecosys.o
	gcc $(GCC_FLAGS) -o tests_ecosys main_tests.o ecosys.o
	
ecosys : main_ecosys.o ecosys.o
	gcc $(GCC_FLAGS) -o ecosys main_ecosys.o ecosys.o

main_tests.o : main_tests.c
	gcc $(GCC_FLAGS) -c main_tests.c
	
ecosys.o : ecosys.c
	gcc $(GCC_FLAGS) -c ecosys.c

clean:
	rm -f *.o *~ $(PROGRAMS)
