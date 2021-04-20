# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def addTwoNumbers(self, l1, l2):
        """
        :type l1: ListNode
        :type l2: ListNode
        :rtype: ListNode
        """
        l1_values = [l1.val]
        l2_values = [l2.val]
          
        while l1.next:
            l1 = l1.next
            l1_values.append(l1.val)
            
        while l2.next:
            l2 = l2.next
            l2_values.append(l2.val)
        
        val_l1 = sum([10**(idx)*value for idx, value in enumerate(l1_values)])
        val_l2 = sum([10**(idx)*value for idx, value in enumerate(l2_values)])
        
        sum_value = val_l1 + val_l2
        
        header = None
        linked_list = None
        
        for i in str(sum_value)[::-1]:
            if header is None:
                header = ListNode(int(i))
                linked_list = header
            else:
                linked_list.next = ListNode(int(i))
                linked_list = linked_list.next
                
        return header