public class BinarySearch {


    public static int binarySearch(int[] list,int left, int right, int key){
        while (left <= right) {
            int mid = (left + right) /2;
            if (key == list[mid]) {
                return mid;
            }
            if (key < list[mid]) {
                int rightAfter=mid-1;
                return binarySearch(list,left,rightAfter,key);
            }else {
                int leftAfter=mid+1;
                return binarySearch(list,leftAfter,right,key);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] list = {1,2,3,4,5,6,7,8};
        System.out.println(binarySearch(list,0, list.length-1,8));
    }
}
