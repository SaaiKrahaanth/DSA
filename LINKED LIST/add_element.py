class node:
    def __init__(self,new_data):
        self.data=new_data
        self.next=None
    def print_llist(self):
    
        curr=self.head
        while curr is not None:
            print(curr.data,"--->")
            curr=curr.next
        print("None")
'''def add_element(head):
    head.next='''
if __name__=="__main__":
    head=node(5)
    head.next=node(6)
    head.next.next=node(7)
    head.print_llist(5)