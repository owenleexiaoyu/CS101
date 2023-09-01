package life.lixiaoyu.helloalgorithm.comic

/**
 * 《漫画-小灰的算法之旅》
 * 第 5 章 面试中的算法
 *
 * 如何判断一个链表有环
 */

// 链表的节点
class Node(val data: Int, var next: Node? = null)

/**
 * 判断链表中是否有环
 */
fun hasRing(head: Node): Boolean {
    var p1: Node? = head
    var p2: Node? = head
    while(p2?.next != null) {
        p1 = p1?.next
        p2 = p2.next?.next
        if (p1 == p2) {
            return true
        }
    }
    return false
}

/**
 * 判断链表中是否有环，如果有环，返回环的长度，如果没有环，返回 0
 */
fun getRingLength(head: Node): Int {
    return 0
}

fun main() {
    // 构建链表

    //                 1 <- 8
    //                 ↓    ↑
    //  5 -> 3 -> 7 -> 2 -> 6
    val node1 = Node(5)
    val node2 = Node(3)
    val node3 = Node(7)
    val node4 = Node(2)
    val node5 = Node(6)
    val node6 = Node(8)
    val node7 = Node(1)
    node1.next = node2
    node2.next = node3
    node3.next = node4
    node4.next = node5
    node5.next = node6
    node6.next = node7
    node7.next = node4

    // 判断是否有环
    val result = hasRing(node1)
    println("node1 has ring: $result")
}

