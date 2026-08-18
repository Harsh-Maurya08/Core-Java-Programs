class MergeTwoSortedArray{
    public static void main(String[] args){
        int[] array1 = {1,3,5,7,9};
        int[] array2 = {2,4,6,8,10};
        int[] newArray = new int[array1.length+array2.length];
        int i=0;
        int j=0;
        while(i<array1.length){
            if(array1[i]>array2[i]) {
                newArray[j++] = array2[i];
                newArray[j++]=array1[i];
            }
            else{
                newArray[j++] = array1[i];
                newArray[j++]=array2[i];
            }
            i++;
        }
        System.out.print("New merged sorted array is: ");
        i=0;
        while(i<newArray.length){
            System.out.print(newArray[i]+" ");
            i++;
        }
    }
}