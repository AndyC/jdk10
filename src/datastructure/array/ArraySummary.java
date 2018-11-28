package datastructure.array;

/**
 * @author AndyCui
 * @date 2018/10/8 上午10:13
 * @description 数组的相关总结
 */
public class ArraySummary {
    /**
     * 定义：数组是一种线性表数据结构，它用一组连续的内存空间，来存储一组具有相同类型的数据。
     * 关键字：（1）线性 每个线性表上的数据最多只有前和后两个方向。数组、链表、队列和栈都是线性表结构。
     * 和线性表对立的是非线性表，比如二叉树、堆、图等。在非线性表中，数据之间不是简单的前后关系 。
     * （2）连续的内存空间和相同类型的数据。这两个限制使得数组的随机访问非常高效，数组的随机访问时间
     * 复杂度为O（1） （根据下标直接计算偏移量来访问内存），这两个限制也使得数组的很多操作非常低效，
     * 比如要想在数组中插入、删除一个数据，为了保证数据完整性，就需要做大量的数据搬移工作。
     * 关于数组的正确表述：数组适合查找操作，但是查找的时间复杂度并不是O（1），即便是排好序的数组，用二分查找
     * 时间复杂度也是O（logN），所以正确的表述是，数组支持随机访问，根据下标随机访问的时间复杂度是O（1）。
     *
     * 低效的插入和删除：
     * 插入操作：假设数组的长度为n，为如果将一个数据插入到数组中的第K个位置，就需要把k~n这部分的元素都顺序地往后挪一位。
     * 如果在数组的末尾插入元素，就不需要移动数据，那么时间复杂度为O（1），在开头插入元素，时间复杂度为O（n），
     * 平均时间复杂度为O（n）。
     * 改进方法：如果数组中的数据是有序的，我们在某一个位置插入一个新的元素时，就必须按照刚才的方法搬移K之后的数据，但是
     * 如果数组中存储的数据并没有任何规律，数组只是一个存储数据的集合，在这种情况下，为了避免大规模的数据迁移，我们可以直接
     * 将第K为的数据搬移到数组元素的最后，把新的元素直接放到第K个位置即可。利用这个处理技巧，在特定场景下，在第K个位置插入
     * 一个元素的时间复杂度就会降为O（1）。
     *
     * 删除操作：如果我们要删除第K个位置的数据，为了内存的连续性，也需要搬移数据。和插入操作类似，删除操作的最好时间复杂度为O（1），
     * 最坏情况时间复杂度为O(N)，平均时间复杂度为O（N）。
     */
}
