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
class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];
        for(int i = num_list.length-1, j =0; i>=0; i--,j++) {
            answer[j] = num_list[i];
        }
        return answer;
    }
}
```

## 재욱
```javascript
function solution(num_list) {
    var answer = [];
    for(let i=num_list.length-1;i>=0;i--){
        answer.push(num_list[i])
    }
    return answer;
}
```
