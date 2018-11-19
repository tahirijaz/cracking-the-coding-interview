#include <stdio.h>


void bin(unsigned n) 
{ 
	unsigned i; 
	for (i = 1 << 31; i > 0; i = i / 2) 
		(n & i)? printf("1"): printf("0"); 
} 

unsigned int swap(int num){
	unsigned int odd_mask = 0xAAAAAAAA;
	unsigned int even_mask = 0x55555555;
	
	unsigned int swapped = ((num & odd_mask) >> 1) + ((num & even_mask) << 1);
	return swapped;
}

int main(int argc, char *argv[]) {
	unsigned int num = 777;
	bin(num);
	printf("\n");
	unsigned int swapped = swap(num);
	bin(swapped);
}



