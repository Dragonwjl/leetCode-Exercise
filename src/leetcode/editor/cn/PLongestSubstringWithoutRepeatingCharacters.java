//给定一个字符串 s ，请你找出其中不含有重复字符的 最长子串 的长度。
//
//
//
// 示例 1:
//
//
//输入: s = "abcabcbb"
//输出: 3
//解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
//
//
// 示例 2:
//
//
//输入: s = "bbbbb"
//输出: 1
//解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
//
//
// 示例 3:
//
//
//输入: s = "pwwkew"
//输出: 3
//解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
//     请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
//
//
// 示例 4:
//
//
//输入: s = ""
//输出: 0
//
//
//
//
// 提示：
//
//
// 0 <= s.length <= 5 * 104
// s 由英文字母、数字、符号和空格组成
//
// Related Topics 哈希表 字符串 滑动窗口
// 👍 6341 👎 0

package leetcode.editor.cn;

import sun.text.resources.cldr.ti.FormatData_ti;

//Java：无重复字符的最长子串
public class PLongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        Solution solution = new PLongestSubstringWithoutRepeatingCharacters().new Solution();
        // TO TEST
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int lengthOfLongestSubstring(String s) {
            int subString = 0;
            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < s.length(); i++) {
                String ss = String.valueOf(s.charAt(i));

                if (sb.indexOf(ss) >= 0) {
                    sb.delete(0, sb.indexOf(ss) + 1);
                }
                sb.append(ss);
                subString = Math.max(sb.length(), subString);
            }
            return subString;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}



