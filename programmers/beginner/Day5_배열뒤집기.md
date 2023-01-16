## 성우

```java
class Solution {
    public int[] solution(int[] num_list) {
        for (int i = 0; i < num_list.length / 2; i++) {
            int tmp = num_list[i];
            num_list[i] = num_list[num_list.length - (i+1)];
            num_list[num_list.length - (i+1)] = tmp;
        }
        
        return num_list;
    }
}
```

## 민재
```java
class Solution {
    public int[] solution(int[] arr) {
        int[] answer = new int[arr.length];
        int count = 0;
        for(int i = arr.length-1; i >= 0; i-- ){
            answer[count] = arr[i];
            count++;
        }
        return answer;
    }
}
```

## 윤서
```java
```

## 재욱
```javascript
```
