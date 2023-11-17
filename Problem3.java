class SingleElement {
    static int singleNonDuplicate(int[] arr) {
        int start = 0;
        int end = arr.length-1;

        while (start < end) {
            int mid = (start+end)/2;

            if (mid%2 == 1) 
                mid--;

            if (arr[mid] != arr[mid+1]) 
                end = mid;
            else 
                start = mid+2;
        }
        return arr[start];
    }

    public static void main(String[] args) {
        int[] arr = {2,3,3};
        System.out.println(singleNonDuplicate(arr));
    }
}
