class Test2710223{
public static void main(String args[]){
int a[]={1,8,79,12,2,92,41,82,77,5,65};
int minValue=a[0];
for(int i=1;i<a.length;i++)
	if(a[i]<minValue)
		minValue=a[i];
	System.out.print("Minimum element:"+minValue);
}
}