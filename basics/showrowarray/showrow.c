#include<stdio.h>

main() {
    int array[10][10], *xptr, *rowptrs[10], colptrs[10];
    int *row, *col, j, k, *temp;


    for(j=0; j<10; j++) {
        for(k=0; k<10; k++) {
           array[j][k]= (j*10)+k;
        }
    }

     //2d array with rows
    printf("\n print array by rows: \n");
   for(j=0;j<10;j++){
        rowptrs[j]=&(array[j][0]);
    }

    for(j=0;j<10;j++){
       row=rowptrs[j];
        for(k=0;k<10;k++){
            printf("%d ", *row);
            row++;
        }
        printf("\n");
    }
    showRow(&array, 0, 10);
    showCol(&array, 0, 10);
    showRow(&array, (0,1,2,3,4,5,6,7,8,9), 100);
    showCol(&array, (0,1,2,3,4,5,6,7,8,9), 100);

}

void showRow(int *array, int rowNumber, int nColsInRow) {
    int j, k;
    int *row;
    int *rowptrs[10];

    printf("here is your show row: \n");
//logic: #columns is max for array; row# should indicate which row;
//should be able to go through given array and print out row. same with columnshow
//??? passing variables but not correctly
    /*for(j=0;j<10;j++){
        rowptrs[j]=&(array[j][0]);
    }

    for(j=0;j<10;j++){
       row=rowptrs[j];
        for(k=0;k<10;k++){
            printf("%d ", *row);
            row++;
        }
        printf("\n");
    }*/

    /*for(j=0;j<nColsInRow;j++) {
        k=rowNumber;
        printf("%d ", array[][j]);

    }
    for(j=0;j<nColsInRow;j++){
        row=&(array[rowNumber][j]);
    }*/

    for(j=0;j<nColsInRow;j++){
       rowNumber=row;
            printf("%d ", row);
            row++;
        }
    printf("\n");
}

void showCol(int *arrayName, int colNumber, int nRowsInCol) {
     int j, k;
    int *col;
    int *colptrs[10];

    printf("here is your show col: \n");
     for(j=0;j<nRowsInCol;j++){
       colNumber=col;
            printf("%d ", col);
            col++;
        }
    printf("\n");
}
