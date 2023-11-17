import java.util.ArrayList;

class TargetElemRange {
    static int getFirstOccur(int n, int[] arr, int target) {
        int start = 0;
        int end = n-1;

        while(start <= end) {
            int mid = (start+end)/2;

            if((mid==0 || target>arr[mid-1]) && arr[mid] == target) 
                return mid;
            else if(arr[mid] < target)
                start = mid+1;
            else
                end = mid-1;
        }
        return -1;
    }

    static int getLastOccur(int n, int[] arr, int target) {
        int start = 0;
        int end = n-1;

        while(start <= end) {
            int mid = (start+end)/2;

            if((mid==n-1 || target<arr[mid+1]) && arr[mid] == target)
                return mid;
            else if(arr[mid] < target)
                start = mid+1;
            else
                end = mid-1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int n = 6;
        int[] arr = new int[] {5,7,7,8,8,10};
        int target = 8;
        
        int startIdx = getFirstOccur(n, arr, target);
        int endIdx = getLastOccur(n, arr, target);

        ArrayList<Integer> res = new ArrayList<>();
        res.add(startIdx);
        res.add(endIdx);
        System.out.println(res); 

        //System.out.println("First and last Index of "+ target+" is "+startIdx+" and "+endIdx);
    }
}