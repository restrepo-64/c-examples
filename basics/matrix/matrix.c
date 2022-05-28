#include<stdio.h>

main() {
    int matrix[5][5], *xptr, *rowptr;
    int j, k;
    int *rowptrs[5];
    int *temp;
    int *row;

//create matrix
    for(j=0; j<5; j++) {
        for(k=0; k<5; k++) {
           if(j==k){
            matrix[j][k]=1;
           }
        else {
            matrix[j][k]=0;
        }

        }
    }
//print matrix regularly
        printf("contents of matrix: \n");
        xptr=&(matrix[0][0]);
        for(j=0;j<25;j++){
        printf("%d ", *xptr);
        xptr++;
    }

//switch rows 4 and 0
        for(j=0;j<5;j++) {
            rowptrs[j]=&(matrix[j][0]);
        }

        temp=rowptrs[0];
        rowptrs[0]=rowptrs[4];
        rowptrs[4]=temp;
//print out new matrix
        printf("\n new matrix print is this: \n");

        for(j=0;j<5;j++){
        row=rowptrs[j];
            for(k=0;k<5;k++){
                printf("%d", *row);
                row++;
            }
            printf("\n");
    }
}
