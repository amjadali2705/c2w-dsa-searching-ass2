class MagicalNo {
    static int getMagicalNo(int[] arr) {
        int start = 0;
        int end = arr.length-1;

        while(start <= end) {
            int mid = (start+end)/2;
            
            if(arr[mid] == mid)
                return mid;
            else if(arr[mid] > mid)
                end = mid-1;
            else
                start = mid+1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = new int[] {-10,-1,0,3,10,11,30,50,100,150};
        System.out.println(getMagicalNo(arr));
    }
}