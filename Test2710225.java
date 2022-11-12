class Test2710225{
static void arrSort(int a[]){
int temp=0;
for(int i=0;i<a.length;i++){
for(int j=i+1;j<a.length;j++){
if(a[i]<a[j]){
temp=a[i];
a[i]=a[j];
a[j]=temp;
}
}
}

for(int i=0;i<a.length;i++)
System.out.print(" "+a[i]);
}
public static void main(String args[]){
int a[]={8,79,12,92,41,82,77,65};
arrSort(a);
}
}