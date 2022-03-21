package javaprograms;

public class MatrixAddandMul{  
public static void main(String args[]){     
    int a[][]={{6,4,3},{7,8,3},{3,2,5}};    
    int b[][]={{8,6,5},{5,0,1},{1,5,4}};    
       int c[][]=new int[3][3];
       int d[][]=new int[3][3];
   
for(int i=0;i<3;i++){                                         
for(int j=0;j<3;j++){    
c[i][j]=a[i][j]+b[i][j];  
System.out.print(c[i][j]+" ");    
}    
System.out.println();  
} 
for(int i=0;i<3;i++){    
for(int j=0;j<3;j++){    
d[i][j]=0;      
for(int k=0;k<3;k++)      
{      
d[i][j]+=a[i][k]*b[k][j];      
}  
System.out.print(d[i][j]+" "); 
} 
System.out.println(); 
}     
}} 
