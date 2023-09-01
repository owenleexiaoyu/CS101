package life.lixiaoyu.helloalgorithm.comic

import java.util.*

/**
 * 《漫画-小灰的算法之旅》
 * 第 5 章 面试中的算法
 *
 * 如何创建一个最小栈，可以返回某个栈中当前最小的元素
 */
class MinStack {

    private val mainStack = Stack<Int>()
    private val minStack = Stack<Int>()

    fun push(element: Int) {
        mainStack.push(element)
        // 如果辅助栈为空，或者新元素小于或等于辅助栈栈顶元素，则将新元素压入辅助栈
        if (minStack.empty() || element <= minStack.peek()) {
            minStack.push(element)
        }
    }

    fun pop(): Int {
        // 如果出栈元素和辅助栈栈顶元素值相等，辅助栈出栈
        val element = mainStack.pop()
        if (element == minStack.peek()) {
            minStack.pop()
        }
        return element
    }

    fun getMinOrNull(): Int? {
        if (mainStack.empty()) {
            return null
        }
        return minStack.peek()
    }
}

fun main() {
    val stack = MinStack()
    stack.push(4)
    stack.push(9)
    stack.push(7)
    stack.push(3)
    stack.push(8)
    stack.push(5)
    println("Current min value in the stack is: ${stack.getMinOrNull()}")
    stack.pop()
    stack.pop()
    stack.pop()
    println("Current min value in the stack is: ${stack.getMinOrNull()}")
}