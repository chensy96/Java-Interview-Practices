package review;

import java.util.List;

//array = [1 2 32 243 2546 567546], x = 242, return 3
      //  ^
public class findClosest{
	
}
public int findClosest(List<Float> arr, float x) {
int low = 0; 
int high = arr.length -1;
float closestSoFar = 100000000;
int index = -1;

if(arr.length < 1){
index = -1;
}
if(arr.length == 1){
index = 0;
}

while(low <=high){
int mid = (low+high)/2;
if(arr[mid] >= x){
high = mid-1;
float diff = arr[mid] - x;
if(diff <= closestSoFar){
if(mid < index){  
index = mid;
}
}	
} else if (arr[mid] < x){
low = mid + 1;
float diff = x - arr[mid];
if(diff <= closestSoFar){
if(mid < index){  
index = mid;
}	}
} 
return index;

}
}







