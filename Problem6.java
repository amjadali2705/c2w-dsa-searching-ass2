class ClosestElem {
    static int getClosestElem(int n, int[] arr, int target) {
        int start = 0;
        int end = n-1;

        while(start <= end) {
            int mid = (start+end)/2;

            if(arr[mid] == target)
                return arr[mid];

            else if(arr[mid] < target)
                start = mid+1;

            else
                end = mid-1;
        }
        if(Math.abs(arr[end]-target) < Math.abs(arr[start]-target))
            return arr[end];
        else
            return arr[start];
    }

    public static void main(String[] args) {
        int n = 5;
        int[] arr = new int[] {1,3,6,7};
        int target = 4;

        System.out.println(getClosestElem(n, arr, target));
    }
}