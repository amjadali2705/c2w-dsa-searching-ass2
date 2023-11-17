class FloorElem {
    static int getFloorElem(int[] arr, int k) {
        int start = 0;
        int end = arr.length-1;
        int floor = -1;

        while(start <= end) {
            int mid = (start+end)/2;

            if(arr[mid] == k)
                return arr[mid];
            else if(arr[mid] > k)
                end = mid-1;
            else {
                floor = arr[mid];
                start = mid+1;
            }
        }
        return floor;
    }

    public static void main(String[] args) {
        int[] arr = new int[] {2,3,6,9,10,11,14,18};
        int k = 4;
        System.out.println(getFloorElem(arr, k));
    }
}