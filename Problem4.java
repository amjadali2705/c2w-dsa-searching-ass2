class InsertElem {
    static int getIdx(int n, int[] arr, int target) {
        int start = 0;
        int end = n-1;

        while(start <= end) {
            int mid = (start+end)/2;

            if(arr[mid] == target)
                return mid;
            else if(arr[mid] < target)
                start = mid+1;
            else
                end = mid-1;
        }
        return start;
    }

    public static void main(String[] args) {
        int n = 4;
        int[] arr = new int[] {1,3,5,7};
        int target = 6;
        System.out.println(getIdx(n, arr, target));
    }
}