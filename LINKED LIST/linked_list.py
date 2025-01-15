class node:
    def __init__(self,data,next):
        self.data=data
        self.next=next
class LinkedList:
    def __init__(self):
        self.head=None
def insert_at_beginning(self,data):
        new_node=node(data,self.head)
        self.head=new_node
    def Print(self):
        if self.head is None:
            print("Linked list is empty")
            return
        itr=self.head
        llist=""
        while itr:
            llist+=str(itr.data)+"--->"
            itr =itr.next
        llist += "Null"
        print(llist)


if __name__=="__main__":
    saai=LinkedList()
    print("initial head of llist-->",saai.head)
    s=[4,3,5,435,"afaf","fasf"]

    for i in s:
        saai.insert_at_beginning(i)

    
    saai.Print()