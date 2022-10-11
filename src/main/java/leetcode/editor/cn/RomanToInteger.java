package leetcode.editor.cn;

import java.util.HashMap;
import java.util.Map;

/**
 * @author mijiahao
 * 2022-09-26 21:02:07
 */
public class RomanToInteger {
    public static void main(String[] args) {
        Solution solution = new RomanToInteger().new Solution();
        String s = "MCMXCIV";
        System.out.println("结果："+solution.romanToInt(s));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int romanToInt(String s) {
            Map<String, Integer> map = new HashMap<>();
            int result = 0;
            map.put("I", 1);
            map.put("V", 5);
            map.put("X", 10);
            map.put("L", 50);
            map.put("C", 100);
            map.put("D", 500);
            map.put("M", 1000);
            map.put("IV", 4);
            map.put("IX", 9);
            map.put("XL", 40);
            map.put("XC", 90);
            map.put("CD", 400);
            map.put("CM", 900);
            //滑动窗口法
            int q = 0;
            int p = 1;
            String tempStr = s;
            while (p < s.length()) {
                String nearStr = s.substring(q, p+1);
                if (map.containsKey(nearStr)) {
                    result = result + map.get(nearStr);
                    tempStr = tempStr.replace(nearStr, "");
                }
                q++;
                p++;
            }
            while (tempStr.length() > 0) {
                String str = tempStr.substring(0,1);
                result = result + map.get(str);
                //去掉该字符
                tempStr = tempStr.substring(1);
                q++;
            }
            return result;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
