class SortedArraySearch {
    static int searchElem(int[] arr, int target) {
        int left = 0;
        int right = arr.length-1;

        while(left <= right) {
            int mid = (left+right)/2;

            if(arr[mid] == target)
                return mid;

            if(arr[left] <= arr[mid]) {
                if(arr[left]<=target && target<arr[mid]) 
                    right = mid-1;
                else
                    left = mid+1;
            } else {
                if(arr[mid]<target && target<=arr[right])
                    left=mid+1;
                else
                    right=mid-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = new int[] {4,5,6,7,0,1,2};
        int target = 1;

        int index = searchElem(arr, target);

        if(index == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element present at index "+ index);
    }
}