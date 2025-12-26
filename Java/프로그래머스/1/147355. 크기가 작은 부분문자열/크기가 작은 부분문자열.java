class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        Long pp = Long.parseLong(p);  //Long 사용하지 않으면 P의 길이는 최대 18 이므로 Integer의 범위를 벗어납니다.
        for(int i =0; i<=t.length()-p.length(); i++){ //종결 조건 그냥 i<t.length() 면 범위 넘어감 주의
            String a = t.substring(i,i+p.length());
            Long aa = Long.parseLong(a);
            if(aa <=  pp){
                answer ++;
            }
        }
        return answer;
    }
}