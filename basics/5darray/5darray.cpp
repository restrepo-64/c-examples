#include<stdio.h>

main() {
    int array[5][5];
    int j;
    int k;
    int a;
    int b;

    for(j=0; j<5; j++) {
        for(k=0; k<j; k++) {
           array[j][k]= k;
        }
    }

    for(a=0; j<5; j++) {
        for(b=0; k<j; k++) {
          printf("contents of 2d array: %d",array[a][b]);
        }
    }
}
