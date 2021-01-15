package Jan13;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @author Baller_Xiao
 * @Description
 * @create_time 2021-01-13 19:53
 * @return
 * @Version
 *
 */
public class leetcode84
{
    //栈中存放的是索引

        public int largestRectangleArea(int[] heights) {
            int len = heights.length;
            if (len == 0) {
                return 0;
            }
            if (len == 1) {
                return heights[0];
            }

            int res = 0;
            Deque<Integer> stack = new ArrayDeque<>(len);
            for (int i = 0; i < len; i++) {
                // 这个 while 很关键，因为有可能不止一个柱形的最大宽度可以被计算出来
                while (!stack.isEmpty() && heights[i] < heights[stack.peekLast()]) {//如果栈不为空切遍历到的元素小于栈顶元素
                    int curHeight = heights[stack.pollLast()];//存储当前栈顶的值
                    while (!stack.isEmpty() && heights[stack.peekLast()] == curHeight) {
                        stack.pollLast();
                    }

                    int curWidth;
                    if (stack.isEmpty()) {
                        curWidth = i;//计算宽度
                    } else {
                        curWidth = i - stack.peekLast() - 1;
                    }

                    // System.out.println("curIndex = " + curIndex + " " + curHeight * curWidth);
                    res = Math.max(res, curHeight * curWidth);
                }
                stack.addLast(i);//把下边入栈，为了计算宽度
            }

            while (!stack.isEmpty()) {
                int curHeight = heights[stack.pollLast()];
                while (!stack.isEmpty() && heights[stack.peekLast()] == curHeight) {
                    stack.pollLast();
                }
                int curWidth;
                if (stack.isEmpty()) {
                    curWidth = len;
                } else {
                    curWidth = len - stack.peekLast() - 1;
                }
                res = Math.max(res, curHeight * curWidth);
            }
            return res;
        }
    }

