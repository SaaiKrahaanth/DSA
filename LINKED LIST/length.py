class node:
    def __init__(self,new_data):
        self.data=new_data
        self.next=None
    def length(self,head):
        curr=head
        count=0
        while curr is not None:
            count+=1
            curr=curr.next

        return count
def recursion_len(head):
        if head is None:
            return 0
        return 1 + recursion_len(head.next)
if __name__=="__main__":
    head=node(5)
    head.next=node(6)
    head.next.next=node(7)
    print("sfasd")
    print(length(head))
    print(recursion_len(head))

