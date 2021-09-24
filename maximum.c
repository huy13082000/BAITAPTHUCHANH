#include<stdio.h>

int main(){
    int a,b,c;
    int m;

    printf("Nhap a, b, c: ");
    scanf("%d, %d, %d",&a,&b,&c);
    m=a;
    if(m<b){
        m=b;
    }
    if(m<c){
        m=c;
    }
    printf("Gia tri lon nhat: %d cua %d, %d, %d",m,a,b,c);
    return 0;
}