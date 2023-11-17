class HighestNo {
    static int getHighestNo(int n, int[] arr) {
        int start = 0;
        int end = n-1;

        while(start <= end) {
            int mid = (start+end)/2;

            if(start == end)
                return arr[start];

            if(end==start+1 && arr[start]>=arr[end])
                return arr[start];

            if(end==start+1 && arr[start]<arr[end])
                return arr[end];

            if(arr[mid]>arr[mid+1] && arr[mid]>arr[mid-1])
                return arr[mid];

            if(arr[mid]>arr[mid+1] && arr[mid]<arr[mid-1])
                end = mid-1;
            else
                start=mid+1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int n = 11;
        int[] arr = new int[] {1,2,3,4,5,6,5,4,3,2,1};
        System.out.println(getHighestNo(n, arr));
    }
}