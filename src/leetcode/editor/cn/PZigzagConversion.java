//将一个给定字符串 s 根据给定的行数 numRows ，以从上往下、从左到右进行 Z 字形排列。
//
// 比如输入字符串为 "PAYPALISHIRING" 行数为 3 时，排列如下：
//123456789
//1   5   9
//2 4 6 8 10
//3   7   11
//
//1 3  5  7
//2 4  6  8
//
//P   A   H   N
//A P L S I I G
//Y   I   R
//
// 之后，你的输出需要从左往右逐行读取，产生出一个新的字符串，比如："PAHNAPLSIIGYIR"。
//
// 请你实现这个将字符串进行指定行数变换的函数：
//
//
//string convert(string s, int numRows);
//
//
//
// 示例 1：
//
//
//输入：s = "PAYPALISHIRING", numRows = 3
//输出："PAHNAPLSIIGYIR"
//
//示例 2：
//
//
//输入：s = "PAYPALISHIRING", numRows = 4
//输出："PINALSIGYAHRPI"
//解释：
//P     I    N
//A   L S  I G
//Y A   H R
//P     I
//
//
// 示例 3：
//
//
//输入：s = "A", numRows = 1
//输出："A"
//
//
//
//
// 提示：
//
//
// 1 <= s.length <= 1000
// s 由英文字母（小写和大写）、',' 和 '.' 组成
// 1 <= numRows <= 1000
//
// Related Topics 字符串
// 👍 1336 👎 0

package leetcode.editor.cn;

//Java：Z 字形变换
public class PZigzagConversion {
    public static void main(String[] args) {
        Solution solution = new PZigzagConversion().new Solution();
        // TO TEST
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public String convert(String s, int numRows) {
            StringBuffer sb = new StringBuffer();
            for (int i = 0; i <s.length() ; i++) {

            }

            return null;

        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}



