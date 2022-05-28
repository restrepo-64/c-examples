#include<stdio.h>

main() {
    int array[5][5], *xptr, *rowptrs[5], *colptrs[5];
    int *row, *col, j, k, *temp;


    for(j=0; j<5; j++) {
        for(k=0; k<5; k++) {
           array[j][k]= (j*5)+k;
        }
    }
    //2d array
    printf("Contents of 2darray is as follows: \n");
    xptr=&(array[0][0]);

    for(j=0; j<25; j++) {

          printf("%d ", *xptr);
            xptr++;
    }
    //2d array with columns
    printf("\n print array by rows: \n");
   for(j=0;j<5;j++){
        rowptrs[j]=&(array[j][0]);
    }

    for(j=0;j<5;j++){
       row=rowptrs[j];
        for(k=0;k<5;k++){
            printf("%d ", *row);
            row++;
        }
        printf("\n");
    }
    //2d array switch columns


     printf("\n print NEW array by columns: \n");

    for(j=0;j<5;j++) {
        colptrs[j]=&array[0][j];
    }

   /*  for (j=0;j<5;j++) {
        for(k=0;k<5;k++){
            col=array[k][j];
            col++;
        }
    } */

    for(j=0;j<5;j++){
       col=colptrs[j];
        for(k=0;k<5;k++){
            col=&(array[k][j]);
            printf("%d ", *col);
            col++;
        }

        printf("\n");
    }
}
